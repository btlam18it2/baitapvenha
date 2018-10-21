package Phone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Phones {
	String tendt;
	String hangdt;
	String hedieuhanh;
	String ngayramat;
	String ngaynh;
	float soluong;
	float gia;

	public String getTendt() {
		return tendt;
	}

	public void setTendt(String tendt) {
		this.tendt = tendt;
	}

	public String getHangdt() {
		return hangdt;
	}

	public void setHangdt(String hangdt) {
		this.hangdt = hangdt;
	}

	public String getHedieuhanh() {
		return hedieuhanh;
	}

	public void setHedieuhanh(String hedieuhanh) {
		this.hedieuhanh = hedieuhanh;
	}

	public String getNgayramat() {
		return ngayramat;
	}

	public void setNgayramat(String ngayramat) {
		this.ngayramat = ngayramat;
	}

	public String getNgaynh() {
		return ngaynh;
	}

	public void setNgaynh(String ngaynh) {
		this.ngaynh = ngaynh;
	}

	public float getSoluong() {
		return soluong;
	}

	public void setSoluong(float soluong) {
		this.soluong = soluong;
	}

	public float getGia() {
		return gia;
	}

	public void setGia(float gia) {
		this.gia = gia;
	}

	public Phones(String tendt,String hangdt, String hedieuhanh,String ngayramat,String ngaynh ,float soluong, float gia)
	{
		this.tendt = tendt;
		this.hangdt = hangdt;
		this.hedieuhanh = hedieuhanh;
		this.ngayramat = ngayramat;
		this.ngaynh = ngaynh;
		this.soluong = soluong;
		this.gia = gia;
	}
}
