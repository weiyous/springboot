package cn.lanqiao.serviceimpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.lanqiao.entity.Bill;
import cn.lanqiao.entity.GoodTableImg;
import cn.lanqiao.entity.Pager;
import cn.lanqiao.entity.Profit;
import cn.lanqiao.entity.User;
import cn.lanqiao.entity.applicationFrom;
import cn.lanqiao.service.UserService;


@Service
public class UserServiceImpl  implements UserService{


	@Autowired
	private cn.lanqiao.mapper.UserMapper userMapper;

	
	@Override
	public User getUserByuloginid(String uloginid) {
		return  userMapper.getuseruloginid(uloginid);
	}

	@Override
	public User login(String uloginid, String upassword) {
		System.out.println(uloginid+upassword);
	     User user=userMapper.getuseruloginid(uloginid);
	    System.out.println(user);
	   if(user!=null) {
		   if(user.getUpassword().equals(upassword)){
			return user;
		}
	}
		return null;
	}
	
	@Override
	public int count() {
		return userMapper.count();
	}
	
	@Override
	public int countBill(String searchKey) {
		return userMapper.countBill(searchKey);
	}
	@Override
	public Pager<User> pager(int pageindex , int pagesize) {
		Pager<User> pager = new Pager<User>();
		pager.setPageindex(pageindex);
		pager.setPagesize(pagesize);
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("startindex", (pageindex-1)*pagesize);
		map.put("offset", pagesize);
		List<User> data = userMapper.userpager(map);
		pager.setData(data);
		int c = userMapper.count();
		int pages = c % pagesize == 0 ? c / pagesize : c / pagesize + 1;
		pager.setTotals(c);
		pager.setPages(pages);
		return pager;
	}
	

	@Override
	public Pager<applicationFrom>  applicationFromPager(int pageindex , int pagesize) {
		Pager<applicationFrom> pager = new Pager<applicationFrom>();
		pager.setPageindex(pageindex);
		pager.setPagesize(pagesize);
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("startindex", (pageindex-1)*pagesize);
		map.put("offset", pagesize);
		List<applicationFrom>  data = userMapper.applicationFromPager(map);
		pager.setData(data);
		int c = userMapper.countApplication();
		int pages = c % pagesize == 0 ? c / pagesize : c / pagesize + 1;
		pager.setTotals(c);
		pager.setPages(pages);
		return pager;
	}
	@Override
	public Pager<Bill> BillPager(int pageindex, int offset,String searchKey) {
		
		Pager<Bill> pager = new Pager<Bill>();
		pager.setPageindex(pageindex);
		pager.setPagesize(offset);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("startindex", (pageindex-1)*offset);
		map.put("offset", offset);
		map.put("searchKey", searchKey);
		List<Bill>  data = userMapper.BillPager(map);
		pager.setData(data);
		pager.setPageindex(pageindex);
		pager.setPagesize(offset);
		int totals  = userMapper.countBill(searchKey);//得到总记录数;
		int pages = totals  % offset == 0 ? totals  / offset : totals  / offset + 1;
		pager.setTotals(totals );
		pager.setPages(pages);
		return pager;
	}
	
	@Override
	public Pager<Profit> ProfitPager(int pageindex, int offset) {
		Pager<Profit> pager = new Pager<Profit>();
		pager.setPageindex(pageindex);
		pager.setPagesize(offset);
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("startindex", (pageindex-1)*offset);
		map.put("offset", offset);
		List<Profit>  data = userMapper.ProfitPager(map);
		pager.setData(data);
		int c = userMapper.countprofit();
		int pages = c % offset == 0 ? c / offset : c / offset + 1;
		pager.setTotals(c);
		pager.setPages(pages);
		return pager;
	}
	
	@Override
	public int removeUser(int uid) {
		return userMapper.deleteUser(uid);
	}
	
	@Override
	public int userRegister(User user) {
		return userMapper.userRegister(user);
	}

	@Override
	public int updateUser(User user) {
		return userMapper.updateUser(user);
	}
	@Override
	public int updateBill(int  uid) {
		return userMapper.updateBill(uid);
	}

	//预发薪资信息存储
	@Override
	public int addApplicationFrom(applicationFrom applicationfrom) {
		 String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	     Random random=new Random();
	     StringBuffer sb=new StringBuffer();
	     for(int i=0;i<18;i++){
	       int number=random.nextInt(62);
	       sb.append(str.charAt(number));
	     }
	     String ulistnumber=sb.toString().toLowerCase();
	     System.out.println(ulistnumber);
	     applicationfrom.setUlistnumber(ulistnumber);
		return userMapper.addApplicationFrom(applicationfrom);
	}
	
	

	@Override
	public int removeApprove(int uid) {
		return userMapper.deleteApprove(uid);
	}

	@Override
	public int insertintobill() {
		return userMapper.insertintobill();
	}

	@Override
	public List<Bill> allBill(Map<String,Integer> map) {
		return userMapper.allBill(map);
	}

	@Override
	public int addDateBillFrom(Bill bill) {
		return userMapper.addDateBill(bill);
	}

	@Override
	public int removebillbyuid(int uid) {	
		return userMapper.removeBillByUid(uid);
	}

	@Override
	public int profitdate(Profit profit) {
		return userMapper.addProfitDate(profit);
	}

	@Override
	public int updateBillDate(Bill bill) {
		return userMapper.updateBillDate(bill);
	}

	@Override
	public int deleteProfit(String project) {
		// TODO Auto-generated method stub
		return userMapper.deleteProfit(project);
	}

	@Override
	public List<Profit> selectProfit() {
		
		return userMapper.selectProfit();
	}

	@Override
	public int updateProfitImg(Profit profit) {
		System.out.println(profit);
		return userMapper.updateProfit(profit);
	}

	@Override
	public Bill getbillbyuid(int uid) {
		return userMapper.getBillByUid(uid);
	}

	@Override
	public int deletebill(int uid) {
		return userMapper.deleteBill(uid);
	}

	//商品注册添加
	@Override
	public int addGoodTableImg(GoodTableImg goodtableimg) {
		
		return userMapper.addGoodTableImg(goodtableimg);
	}

	//商品列表分页
	@Override
	public Pager<GoodTableImg> GoodTableImgPager(int pageindex, int offset, String searchKey) {
		Pager<GoodTableImg> pager = new Pager<GoodTableImg>();
		pager.setPageindex(pageindex);
		pager.setPagesize(offset);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("startindex", (pageindex-1)*offset);
		map.put("offset", offset);
		map.put("searchKey", searchKey);
		List<GoodTableImg>  data = userMapper.GoodTableImgPager(map);
		pager.setData(data);
		pager.setPageindex(pageindex);
		pager.setPagesize(offset);
		int totals  = userMapper.countGoodTableImg(searchKey);//得到总记录数;
		int pages = totals  % offset == 0 ? totals  / offset : totals  / offset + 1;
		pager.setTotals(totals );
		pager.setPages(pages);
		return pager;
	}

	//商品删除
	@Override
	public int deleteGoodTableImg(String good_id) {
		return userMapper.deleteGoodTableImg(good_id);
	}
	
	
	//获取GoodTableImg信息
	@Override
	public List<GoodTableImg> getGoodTableImg() {
		return userMapper.getGoodTableImg();
	}
	
}
