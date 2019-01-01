public class SmsAdapter implements Format {

    Sms sms;

    SmsAdapter(FormatType formatType) {
        if(formatType.equals(FormatType.FORMAT1))
        this.sms = new SmsFormat1();
        else
            this.sms = new SmsFormat2();
    }

    @Override
    public void format() {
        if (sms.getFormatType().getFormat().equals(FormatType.FORMAT1.getFormat())) {
            sms.format1();
        } else if (sms.getFormatType().getFormat().equals(FormatType.FORMAT2.getFormat())) {
            sms.format2();
        }
    }

}
