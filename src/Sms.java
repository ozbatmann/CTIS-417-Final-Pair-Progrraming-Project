public abstract class Sms implements IFormat {

    private FormatType formatType;
    private static String content;

    public FormatType getFormatType() {
        return this.formatType;
    }

    public void setFormatType(FormatType formatType) {
       this.formatType = formatType;
    }

    public static void setContent(Process p){
       content = p.getProcessMessage();
    }

    public static String getContent(){
        return content;
    }
}
