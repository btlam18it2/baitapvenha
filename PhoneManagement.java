package Phone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;
public class PhoneManagement {
	Vector list = new Vector();
	
	public PhoneManagement()
	{
		while (true) {
			System.out.println("QUAN LI DIEN THOAI SMARTPHONE");
			System.out.println("1.Nhap Dien Thoai: ");
			System.out.println("2.Xem Dien Thoai: ");
			System.out.println("3.Tim kiem: ");
			System.out.println("4.Thoat");
			int n;
			Scanner key = new Scanner(System.in);
			System.out.println("Moi ban chon chuc nang:");
			n = key.nextInt();
			switch(n) {
				case 1: NhapTT();
					break;
				case 2: InTT();
					break;
				case 3: Timkiem();
				break;
				case 4:
						System.out.println("---Chuong trinh ket thuc---");
				return;
			}
		}
	}

	public void NhapTT()
	{
		Scanner key = new Scanner(System.in);
		int n;
		System.out.println("Nhap so luong dien thoai: ");
		n =Integer.parseInt(key.nextLine());
		for(int i=0;i<n;i++) {
			System.out.println("Nhap ten dien thoai: ");
			String tendt = key.nextLine();
			System.out.println("Nhap ten hang dien thoai: ");
			String hangdt = key.nextLine();
			System.out.println("Nhap he dieu hanh: ");
			String hedieuhanh = key.nextLine();
			System.out.println("Nhap ngay ra mat");
			SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
			String ngayramat=key.nextLine();
			System.out.println("Ngay nhap hang");
			SimpleDateFormat dt = new SimpleDateFormat ("yyyy-MM-dd");
			String ngaynh=key.nextLine();
			System.out.println("Nhap so luong: ");
			float soluong=Float.parseFloat(key.nextLine());
			System.out.println("Nhap Gia: ");
			float gia=Float.parseFloat(key.nextLine());
			Phones P = new Phones(tendt,hangdt,hedieuhanh,ngayramat,ngaynh,soluong,gia);
			list.add(P);
	}
}
	public void InTT() 
	{
	Enumeration ePhone = list.elements();
	int i=1;
	while (ePhone.hasMoreElements()) {
		Phones phone = (Phones)ePhone.nextElement();
		System.out.println("Ten Dien Thoai: "+phone.getTendt()+" Ten Hang: "+phone.getHangdt()+" He Dieu Hanh:, "+phone.getHedieuhanh()+
				" Ngay ra mat: "+phone.getNgayramat()+" So luong: "+phone.getSoluong()+" Gia:, "+phone.getGia());
	}
	}
	public void Timkiem()
	{
		Scanner key = new Scanner(System.in);
		System.out.println("Nhap ten dien thoai can tim:");
		String tendt = key.nextLine();
		Enumeration ePhone = list.elements();
		System.out.println("\n--Thong tin tim kiem duoc--");
		while (ePhone.hasMoreElements())
		{
			Phones phone = (Phones)ePhone.nextElement();
			if (phone.getTendt().indexOf(tendt)!=-1)
			{
			System.out.println("Ten Dien Thoai: "+phone.getTendt()+"\nTen Hang: "+phone.getHangdt()+"\nHe Dieu Hanh: "+phone.getHedieuhanh()+"\nNgay Ra Mat: "+phone.getNgayramat()+ "\nSo luong: "+phone.getSoluong()+"\nGia: "+phone.getGia());
			
		}
		}
		System.out.println("\n------------\n");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 new PhoneManagement();
	}
}
