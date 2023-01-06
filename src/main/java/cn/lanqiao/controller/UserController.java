package cn.lanqiao.controller;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.lanqiao.entity.Bill;
import cn.lanqiao.entity.GoodTableImg;
import cn.lanqiao.entity.Pager;
import cn.lanqiao.entity.Profit;
import cn.lanqiao.entity.User;
import cn.lanqiao.entity.applicationFrom;
@RestController//返回的数据都是json
@RequestMapping("/api/user")
@CrossOrigin
public class UserController {
	@Autowired
	private  cn.lanqiao.service.UserService  userService;
	
	

	//登录;
	 @PostMapping("/login")
	 public Map<String,Object> login
	 (@RequestParam(name="uloginid",required = true) String 
	 uloginid,@RequestParam(name="upassword",required = true)
	 String upassword){
		System.out.println(uloginid+upassword);
		 Map<String,Object> map = new HashMap<String,Object>();
		 User user = userService.login(uloginid, upassword);
		 if(user!=null) {
			 map.put("status", 200);
			 map.put("msg","登录成功");
			 map.put("data", user);
		 }else {
			 map.put("status", 0);
			 map.put("msg","登录失败");
			 map.put("data", user);
		 }
		 return map;
	 }
	 
	

	@GetMapping("/list")
	public Pager<User> userPager(int pageindex,int offset){
		
		userService.insertintobill();
		return userService.pager(pageindex, offset);
	}
	
	//工资预发放待处理的表格
	@GetMapping("/paylist")
	public Pager<applicationFrom> paylistPager(int pageindex,int offset){
		return userService.applicationFromPager(pageindex, offset);
	}
	

	//账簿表格
	@GetMapping("/bilList")
	public Pager<Bill> bilListPager(int pageindex,int offset,String searchKey){
		System.out.println(searchKey);
		return userService.BillPager(pageindex, offset,searchKey);
	}
	
	//利润表格
		@GetMapping("/profitList")
		public Pager<Profit> ProfitPager(int pageindex,int offset){
			return userService.ProfitPager(pageindex, offset);
		}
		//添加bill员工数据
		@RequestMapping("/addProfitDate")
		public  Map<String,Object> addProfitDate( Profit profit){
			System.out.println(profit);
			Map<String,Object> map=new HashMap<String,Object>();
			
			int affter=userService.profitdate(profit);
			if(affter>0) {
				map.put("status", 200);
				map.put("msg", "添加成功");
			}else {
				map.put("status", 0);
				map.put("msg", "添加失败");
			}
		return map;
		}
		
	
	@GetMapping("/delete/{uid}")
	public  Map<String,Object> remove(@PathVariable(name="uid")int uid){
		Map<String,Object> map=new HashMap<String,Object>();
			int affter=userService.removeUser(uid);
			if(affter>0) {
				map.put("status", 200);
				map.put("msg", "删除成功");
			}else {
				map.put("status", 0);
				map.put("msg", "删除失败");
			}
		return map;
	}
	

	@GetMapping("/deleteBill/{uid}")
	public  Map<String,Object> deleteBill(@PathVariable(name="uid")int uid){
		Map<String,Object> map=new HashMap<String,Object>();
			int affter=userService.deletebill(uid);
			if(affter>0) {
				map.put("status", 200);
				map.put("msg", "删除成功");
			}else {
				map.put("status", 10);
				map.put("msg", "删除失败");
			}
		return map;
	}
	
	@GetMapping("/deleteApprove/{uid}")
	public  Map<String,Object> removeApprove(@PathVariable(name="uid")int uid){
		Map<String,Object> map=new HashMap<String,Object>();
			int affter=userService.removeApprove(uid);
			if(affter>0) {
				map.put("status", 200);
				map.put("msg", "审批成功");
			}else {
				map.put("status", 0);
				map.put("msg", "审批失败");
			}
		return map;
	}
	

	
	
	@RequestMapping("/update")
	public  Map<String,Object> update( User user){
		Map<String,Object> map=new HashMap<String,Object>();
		int affter=userService.updateUser(user);
		if(affter>0) {
			map.put("status", 200);
			map.put("msg", "修改成功");
		}else {
			map.put("status", 0);
			map.put("msg", "修改失败");
		}
	return map;
	}
	
	@RequestMapping("/updateBill")
	public  Map<String,Object> updateBill( Bill bill){
		System.out.println(bill);
		Map<String,Object> map=new HashMap<String,Object>();
		int affter=userService.updateBillDate(bill);
		if(affter>0) {
			map.put("status", 200);
			map.put("msg", "修改成功");
		}else {
			map.put("status", 0);
			map.put("msg", "修改失败");
		}
	return map;
	}
	
	@RequestMapping("/updateStatus/{uid}")
	public  Map<String,Object> updateStatus(@PathVariable(name="uid")int uid){
		Map<String,Object> map=new HashMap<String,Object>();
	   int price=20000;//设置账号初始金额
	   Bill bill=userService.getbillbyuid(uid);//取出用户的薪资
	   int balance=Integer.parseInt(bill.getUmoney());
	   if((price-balance)>=0) {
		   int affter=userService.updateBill(uid);
			System.out.println(affter);
			map.put("status", 200);
			map.put("msg", "发放成功");
	   }else {
			map.put("status", 0);
			map.put("msg", "余额不足,发放失败.....");
		}
	return map;
	}
	
	@PostMapping("/addApplicationFrom")
	public  Map<String,Object> addApplicationFrom(applicationFrom applicationfrom){
	
		Map<String,Object> map=new HashMap<String,Object>();
		int affter=userService.addApplicationFrom(applicationfrom);
		if(affter>0) {
			map.put("status", 200);
			map.put("msg", "申请成功");
		}else {
			map.put("status", 0);
			map.put("msg", "申请失败");
		}
	return map;
	}
	
	@RequestMapping("/dateArray")
	public  List<String> dateArray(){
		List<String> array1=new ArrayList<String>();
		List<Bill> array=new ArrayList<Bill>();
		Bill bill=new Bill();
		Map<String,Integer> map=new HashMap<String,Integer>();
		for(int index=2;index<=8;index++) {
			map.put("month", index);
			array=userService.allBill(map);
			int price=0;
			int count=0;
				for(int i=0;i<array.size();i++) {
					bill=array.get(i);
						if(bill.getUduty().equals("管理员")) {
							 price+=Integer.parseInt(bill.getUmoney());
							 count=count+1;
					}	
				 }	
				String level=String.valueOf(price/count);
				array1.add(level);
		}	
	return array1;
	}
	
	@RequestMapping("/dateTeachar")
	public  List<String> dateTeachar(){
		List<String> array1=new ArrayList<String>();
		List<Bill> array=new ArrayList<Bill>();
		Bill bill=new Bill();
		Map<String,Integer> map=new HashMap<String,Integer>();
		for(int index=2;index<=8;index++) {
			map.put("month", index);
			array=userService.allBill(map);
			int price=0;
			int count=0;
				for(int i=0;i<array.size();i++) {
					bill=array.get(i);
						if(bill.getUduty().equals("老师")) {
							 price+=Integer.parseInt(bill.getUmoney());
							 count=count+1;
					}	
				 }	
				String level=String.valueOf(price/count);
				array1.add(level);
		}	
	return array1;
	}
	
	@RequestMapping("/datemarket")
	public  List<String> datemarket(){
		List<String> array1=new ArrayList<String>();
		List<Bill> array=new ArrayList<Bill>();
		Bill bill=new Bill();
		Map<String,Integer> map=new HashMap<String,Integer>();
		for(int index=2;index<=8;index++) {
			map.put("month", index);
			array=userService.allBill(map);
			int price=0;
			int count=0;
				for(int i=0;i<array.size();i++) {
					bill=array.get(i);
						if(bill.getUduty().equals("经理销售")) {
							 price+=Integer.parseInt(bill.getUmoney());
							 count=count+1;
					}	
				 }	
				String level=String.valueOf(price/count);
				array1.add(level);
		}	
	return array1;
	}
	
	//添加bill员工数据
	@RequestMapping("/addDate")
	public  Map<String,Object> addDate( Bill bill){
		Map<String,Object> map=new HashMap<String,Object>();
		bill.setUstatus("未发放");
		System.out.println(bill);
		int affter=userService.addDateBillFrom(bill);
		if(affter>0) {
			map.put("status", 200);
			map.put("msg", "添加成功");
		}else {
			map.put("status", 0);
			map.put("msg", "添加失败");
		}
	return map;
	}
	

	
	//删除t_profit数据
	@RequestMapping("/deleteProfit/{project}")
	public  Map<String,Object> deleteProfit(@PathVariable(name="project")String  project){
		Map<String,Object> map=new HashMap<String,Object>();
		int affter=userService.deleteProfit(project);
		if(affter>0) {
			map.put("status", 200);
			map.put("msg", "添加成功");
		}else {
			map.put("status", 0);
			map.put("msg", "添加失败");
		}
	return map;
	}
	
	//利润表格
			@GetMapping("/getProfitAcountNow")
			public List<String> getProfitAcountNow(){
				Profit profit=new Profit();
				List<String> array=new ArrayList<String>();
				List<Profit> list=userService.selectProfit();
				System.out.println(list.size());
				for(int i=0;i<list.size();i++) {
					profit=list.get(i);
					String date=profit.getAmountNow();//今年数据
				    System.out.println(date);
				    array.add(date);
				}
				return array;
			}
			@GetMapping("/getProfitAccountLast")
			public List<String> getProfitAccountLast(){
				Profit profit=new Profit();
				List<String> array=new ArrayList<String>();
				List<Profit> list=userService.selectProfit();
				System.out.println(list.size());
				for(int i=0;i<list.size();i++) {
					profit=list.get(i);
					String date=profit.getAmountLast();//去年数据
				    System.out.println(date);
				    array.add(date);
				}
				return array;
			}
			
			
			
			@RequestMapping("/updateProfit")
			public  Map<String,Object> updateProfit( Profit profit){
				System.out.println(profit);
				int affter=userService.updateProfitImg(profit);
				Map<String,Object> map=new HashMap<String,Object>();
				if(affter>0) {
					map.put("status", 200);
					map.put("msg", "修改成功");
				}else {
					map.put("status", 0);
					map.put("msg", "修改失败");
				}
			return map;
			}
	
			
			//商品注册
			@RequestMapping("/addGoodTableImg")
			public  Map<String,Object> addGoodTableImg( GoodTableImg goodtableimg){
				System.out.println(goodtableimg);		
				int affter=userService.addGoodTableImg(goodtableimg);
				Map<String,Object> map=new HashMap<String,Object>();
				if(affter>0) {
					map.put("status", 200);
					map.put("msg", "添加成功");
				}else {
					map.put("status", 0);
					map.put("msg", "修改失败");
				}
			return map;
			}
			
			//商品信息表格展示
			@GetMapping("/goodtableimgList")
			public Pager<GoodTableImg> goodtableimgList(int pageindex,int offset,String searchKey){
				return userService.GoodTableImgPager(pageindex, offset, searchKey);
			}
			

			//删除商品数据
			@RequestMapping("/deleteGoodTableImg/{good_id}")
			public  Map<String,Object> deleteGoodTableImg(@PathVariable(name="good_id")String  good_id){//根据good_id删除
				System.out.println(good_id);
				Map<String,Object> map=new HashMap<String,Object>();
				int affter=userService.deleteGoodTableImg(good_id);
				if(affter>0) {
					map.put("status", 200);
					map.put("msg", "添加成功");
				}else {
					map.put("status", 0);
					map.put("msg", "添加失败");
				}
			return map;
			}
			
			
			//商品信息表格展示
			@GetMapping("/getGoodTableImg")
			public List<GoodTableImg> getGoodTableImg(){
				 List<GoodTableImg>  arraygoodtableimg=new ArrayList<GoodTableImg>();
				 arraygoodtableimg=userService.getGoodTableImg();
				return arraygoodtableimg;
			}
}
