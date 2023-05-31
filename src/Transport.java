class Transport {
    private String name;
    private int seatCount;

    public Transport() {
        System.out.println("Creating a new Transport object");
    }

    public void move() {
        System.out.println("Transport is moving");
    }

    public void options() {
        System.out.println("I can move back and forward");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }
}