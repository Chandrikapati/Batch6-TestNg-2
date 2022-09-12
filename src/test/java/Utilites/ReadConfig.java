package Utilites;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	public  static   Properties  pro =new Properties();

    public static String ReadPropertiesData(String data) {
            File f = new File(FilePath.PropertiesPath);
        FileInputStream fil = null;
        try {
            fil = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            pro.load(fil);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String dATA = pro.getProperty(data);
            return dATA;
    }
	
    
    public static String UserName(){

        String bname = ReadPropertiesData("UserName");
        return bname;
     }
    public static String emailId(){

        String cname = ReadPropertiesData("emailId");
        return cname;
     }


     public static String PassWord(){

         String pwd = ReadPropertiesData("PassWord");
         return pwd;
     }

     public static String TestURL(){

         String url = ReadPropertiesData("TestURL");
         return url;
     }
     public static String phoneNumber(){

         String contact = ReadPropertiesData("contact");
         return contact;
     }
     public static String locality(){

         String loc = ReadPropertiesData("locality");
         return loc;
     }
     
     public static String firstName(){

         String frst = ReadPropertiesData("firstName");
         return frst;
     }
     
     public static String lastName(){

         String lst = ReadPropertiesData("lastName");
         return lst;
     }
     
     public static String address(){

         String add = ReadPropertiesData("address");
         return add;
     }
     public static String companyName(){
    	 

         String cmpny = ReadPropertiesData("companyName");
         return cmpny;
     }
 public static String city(){
    	 

         String city = ReadPropertiesData("city");
         return city;
     }
 public static String state(){
	 

     String state = ReadPropertiesData("state");
     return state;
 }
 public static String pinCode(){
	 

     String postcode = ReadPropertiesData("pincode");
     return postcode;
 }
   

}
