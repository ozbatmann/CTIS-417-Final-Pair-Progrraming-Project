public class SmsFormat2 extends Sms implements IFormat{


    SmsFormat2(){
        super.setFormatType(FormatType.FORMAT2);
    }

    @Override
    public void format1(){
    }
    @Override
    public void format2(){
        System.out.println("Sms sent with format2 type.\nContent: "+getContent());
    }

}
