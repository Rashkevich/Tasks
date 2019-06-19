package examples;

import java.io.UnsupportedEncodingException;

public class StringCodes {

	public static void main(String[] args) {
		String st="что я увижу";
		String str="привет мир";
		try {
			System.out.println(new String(st.getBytes(),"UTF-8"));
			byte[] b=str.getBytes();
			String strInOtherCode=new String(b,"UTF-8");
			System.out.println(strInOtherCode);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
