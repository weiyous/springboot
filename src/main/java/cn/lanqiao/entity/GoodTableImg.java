package cn.lanqiao.entity;

public class GoodTableImg {
		private String good_id;//商品编号
		private String pk_goodtype;//商品种类
		private String good_name;//商品名字
		private String good_area;//产地
		private String supplier_name;//供应商名称
		private String supplier_address;//供应商地址
		private String supplier_contact;//供应商联系方式
		private String good_price;//商品价格
		private String putaway_date;//上架日期
		private String good_introduce;//商品介绍
		
		public GoodTableImg() {
			super();
		}
		
		public GoodTableImg(String good_id, String pk_goodtype, String good_name, String good_area,
				String supplier_name, String supplier_address, String supplier_contact, String good_price,
				String putaway_date, String good_introduce) {
			super();
			this.good_id = good_id;
			this.pk_goodtype = pk_goodtype;
			this.good_name = good_name;
			this.good_area = good_area;
			this.supplier_name = supplier_name;
			this.supplier_address = supplier_address;
			this.supplier_contact = supplier_contact;
			this.good_price = good_price;
			this.putaway_date = putaway_date;
			this.good_introduce = good_introduce;
		}
	
		@Override
		public String toString() {
			return "GoodTableImg [good_id=" + good_id + ", pk_goodtype=" + pk_goodtype + ", good_name=" + good_name
					+ ", good_area=" + good_area + ", supplier_name=" + supplier_name + ", supplier_address="
					+ supplier_address + ", supplier_contact=" + supplier_contact + ", good_price=" + good_price
					+ ", putaway_date=" + putaway_date + ", good_introduce=" + good_introduce + "]";
		}
		public String getGood_id() {
			return good_id;
		}
		public void setGood_id(String good_id) {
			this.good_id = good_id;
		}
		public String getPk_goodtype() {
			return pk_goodtype;
		}
		public void setPk_goodtype(String pk_goodtype) {
			this.pk_goodtype = pk_goodtype;
		}
		public String getGood_name() {
			return good_name;
		}
		public void setGood_name(String good_name) {
			this.good_name = good_name;
		}
		public String getGood_area() {
			return good_area;
		}
		public void setGood_area(String good_area) {
			this.good_area = good_area;
		}
		public String getSupplier_name() {
			return supplier_name;
		}
		public void setSupplier_name(String supplier_name) {
			this.supplier_name = supplier_name;
		}
		public String getSupplier_address() {
			return supplier_address;
		}
		public void setSupplier_address(String supplier_address) {
			this.supplier_address = supplier_address;
		}
		public String getSupplier_contact() {
			return supplier_contact;
		}
		public void setSupplier_contact(String supplier_contact) {
			this.supplier_contact = supplier_contact;
		}
		public String getGood_price() {
			return good_price;
		}
		public void setGood_price(String good_price) {
			this.good_price = good_price;
		}
		public String getPutaway_date() {
			return putaway_date;
		}
		public void setPutaway_date(String putaway_date) {
			this.putaway_date = putaway_date;
		}
		public String getGood_introduce() {
			return good_introduce;
		}
		public void setGood_introduce(String good_introduce) {
			this.good_introduce = good_introduce;
		}
	
}
