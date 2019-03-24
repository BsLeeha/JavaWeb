package beans;

public class TrapezoidBean {
    private double topLine;
    private double baseLine;
    private double height;
    private double area;
    private String message;

    public TrapezoidBean() {

    }

    public double getTopLine() {
        return topLine;
    }

    public double getBaseLine() {
        return baseLine;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return area;
    }

    public String getMessage() {
        return message;
    }

    public void setTopLine(double topLine) {
        this.topLine = topLine;
    }

    public void setBaseLine(double baseLine) {
        this.baseLine = baseLine;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
