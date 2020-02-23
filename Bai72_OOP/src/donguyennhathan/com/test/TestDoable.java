package donguyennhathan.com.test;

import donguyennhathan.com.model.IDoable;
import donguyennhathan.com.model.NhanVien;
import donguyennhathan.com.model.SinhVien;

public class TestDoable {

	public static void main(String[] args) {
		IDoable x;
		x= new NhanVien();
		x.doSomeThing();
		x= new SinhVien();
		x.doSomeThing();
	}

}
