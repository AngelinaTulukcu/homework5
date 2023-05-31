class Figure {
    private double height;
    private double width;
    private double length;

    public Figure() {
    }

    public Figure(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public double calculateVolume() {
        return this.height * this.width * this.length;
    }

    public void calculateSurfaceArea() {
        double surfaceArea = 2 * (this.width * this.length + this.width * this.height + this.length * this.height);
        System.out.println("Surface area of the figure: " + surfaceArea);
    }
}
