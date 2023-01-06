package cn.lanqiao.mapper;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import cn.lanqiao.entity.Bill;
import cn.lanqiao.entity.GoodTableImg;
import cn.lanqiao.entity.Profit;
import cn.lanqiao.entity.User;
import cn.lanqiao.entity.applicationFrom;
@Repository
public interface UserMapper {
	


	//删除bill
	public int deleteBill(int uid);
	
	//删除t_project表内容
	public  int  deleteProfit(String project);
	
	//拿出t_profit的所有数据
	public  List<Profit> selectProfit();
	
	//修改bill数据
	public int updateBillDate(Bill bill);

	//预发薪资信息存储
	public int addApplicationFrom(applicationFrom applicationfrom);
	//取出存在id的用户
	public User getuseruloginid(String uloginid);
	//取出存在t_bill的id所有信息
	public Bill getBillByUid(int uid);
	
	//账单
	 public List<Bill> allBill(Map<String,Integer> map);
	
	//取出所有用户数据
	public List<Profit> ProfitPager(Map<String,Integer> map);
	
	public int addProfitDate(Profit profit);
	
	//取出所有用户数据
	public List<User> userpager(Map<String,Integer> map);
	
	//取出所有申请薪资表数据
	public List<applicationFrom> applicationFromPager(Map<String,Integer> map);
	
	//账单分页
	public List<Bill> BillPager(Map<String,Object> map);
	//根据uid处理申请薪资的列表数据
	public int deleteApprove(int uid);
	//用户表的总数
	public int count();
	//申请表的总数
	public int countApplication();
	//账单表总数
	public int countBill(String searchKey);
	
	//profit表的总数
	public int countprofit();
	
	//根据bill的uid删除用户
	public int removeBillByUid(int uid);
	
	//统计每月账单条数
	public int countMonth(int month);
	//取出所有月数据数据
	public  List<Bill> dateMonth(int month);
	
	//添加bill表单员工数据
	public int addDateBill(Bill bill);
	
	//根据id删除用户
	public int deleteUser(int uid);
	
	public int userRegister(User user);
	
	public int updateUser(User user);
	
	public int updateBill(int uid);
	
	public int insertintobill();
	
	//修改profit
	public int updateProfit(Profit profit);
	
	//商品注册添加
	public int addGoodTableImg(GoodTableImg goodtableimg);
	
	//商品列表分页
	public List<GoodTableImg> GoodTableImgPager(Map<String,Object> map);
	
	//商品列表总数
	public int countGoodTableImg(String searchKey);
	
	//删除商品表商品
	public  int  deleteGoodTableImg(String good_id);
	
	//获取GoodTableImg信息
	public List<GoodTableImg> getGoodTableImg();
}
