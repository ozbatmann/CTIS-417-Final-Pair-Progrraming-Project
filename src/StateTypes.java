public enum StateTypes {

    ACTIVE("Active"),
    PASSIVE("Passive");


    private String state;

    StateTypes(String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }

}
