public enum FormatType {


    FORMAT1("FORMAT-1"),
    FORMAT2("FORMAT-2");


    private String format;

    FormatType(String format) {
        this.format = format;
    }

    public String getFormat() {
        return this.format;
    }
}
