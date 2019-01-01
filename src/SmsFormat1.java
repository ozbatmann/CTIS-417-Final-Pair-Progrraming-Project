public class SmsFormat1 extends Sms implements IFormat{

    SmsFormat1(){
        super.setFormatType(FormatType.FORMAT1);
    }

    public void format1(){
        System.out.println("Sms sent with format1 type.\nContent: "+getContent());
    }

    public void format2(){
    }

}
