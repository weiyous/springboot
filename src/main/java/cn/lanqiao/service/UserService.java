package cn.lanqiao.service;
import java.util.List;
import java.util.Map;
import cn.lanqiao.entity.Bill;
import cn.lanqiao.entity.GoodTableImg;
import cn.lanqiao.entity.Pager;
import cn.lanqiao.entity.Profit;
import cn.lanqiao.entity.User;
import cn.lanqiao.entity.applicationFrom;

public interface UserService {
	
	public int deletebill(int uid);
	
	public  int  deleteProfit(String project);
	
	
	public Bill getbillbyuid(int uid);
	//拿出t_profit所有数据
	public List<Profit>  selectProfit();

	////预发薪资信息存储
	public int addApplicationFrom(applicationFrom applicationfrom);
	//bill添加员工
	public int addDateBillFrom(Bill bill);
	//修改bill数据
	public int updateBillDate(Bill bill);
	public User getUserByuloginid(String uloginid);
	public User login(String uloginid,String upassword);
	
	//取出所有bill
	public List<Bill>  allBill(Map<String,Integer> map);
	
	//取出所有用户数据
	public Pager<User> pager(int pageindex,int offset);
	
	//取出所有申请薪资表数据
	public Pager<applicationFrom> applicationFromPager(int pageindex,int offset);
	
	public Pager<Profit> ProfitPager(int pageindex,int offset);
	
	public int profitdate(Profit profit);
	
	//账单分页
	public Pager<Bill> BillPager(int pageindex,int offset,String searchKey);
	
	public int count();
	public int countBill(String searchKey);
	
	//删除用户
	public int removeUser(int uid);
	
	
	//根据uid处理申请薪资的列表数据
	public int removeApprove(int uid);
	
	
	public int removebillbyuid(int uid);
	public int userRegister(User user);
	public int updateUser(User user);
	public int updateBill(int  uid);
	public int insertintobill();
	public int updateProfitImg(Profit profit);
	
	
	//注册添加商品
	public  int addGoodTableImg(GoodTableImg goodtableimg);
	
	//商品列表分页
	public Pager<GoodTableImg> GoodTableImgPager(int pageindex,int offset,String searchKey);
	
	//删除商品数据
	public  int  deleteGoodTableImg(String good_id);

	//获取GoodTableImg信息
	public List<GoodTableImg> getGoodTableImg();
	
}



