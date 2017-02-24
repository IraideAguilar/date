package datak;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main_data {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat eus_formatua = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat gazt_formatua = new SimpleDateFormat("dd/MM/yyyy");

		Date f1 = eus_formatua.parse("2017/02/28");//date objetua sortu
		Date f2 = gazt_formatua.parse("01/03/2017");

		System.out.println(f1.toString()  + "   "+ f2.toString());
		
		if (f1.before(f2)) {
			System.out.println("f1 lehenago");
		} else {
			System.out.println("f2 lehenago");
		}

		System.out.println("f1 'yyyy/MM/dd' formatuan: " + eus_formatua.format(f1));

		
		GregorianCalendar gc2 = new GregorianCalendar();
		gc2.setTime(f2);	
		System.out.println("f2 'dd/MM/yyyy' formatuan: " + gazt_formatua.format(gc2.getTime()));
		
		GregorianCalendar gc1 = new GregorianCalendar();
		gc1.setTime(f1);
		
		System.out.println("Eragiketak datekin");
		int dias=(int) ((f2.getTime()- f1.getTime())/(1000*24*60*60));
		System.out.println("f2 -f1 : " + dias);
	
		
		SimpleDateFormat sdf_osoa = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		System.out.print("Horaingo data: " + sdf_osoa.format(new Date()));
		
		
		
		
		
	}

}
