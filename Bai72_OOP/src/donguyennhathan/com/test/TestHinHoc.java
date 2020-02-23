package donguyennhathan.com.test;

import donguyennhathan.com.model.HinhChuNhat;
import donguyennhathan.com.model.HinhHoc;
import donguyennhathan.com.model.HinhVuong;

public class TestHinHoc {

	public static void main(String[] args) {
		HinhHoc h ;
		h= new HinhChuNhat(4, 5);
		System.out.println("Chu vi= "+ h.tinhChuVi());
		System.out.println("Diện tích= "+h.tinhDienTich());
		h= new HinhVuong(5);
		System.out.println("---------------------");
		System.out.println("Chu vi= "+ h.tinhChuVi());
		System.out.println("Diện tích= "+h.tinhDienTich());
		HinhChuNhat hv1= new HinhVuong(9);
		System.out.println("---------------------");
		System.out.println("Chu vi= "+ hv1.tinhChuVi());
		System.out.println("Diện tích= "+hv1.tinhDienTich());
	}

}
