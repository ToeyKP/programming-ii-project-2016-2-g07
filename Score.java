package projectjava;

public class Score{

    private double taste;
    private double clean;
    private double service;
    private double look;
    private double value;

    public Score() {
    }

    public Score(double taste, double clean, double service, double look, double value) {
        double max = 5.0, min = 0.0;
        if (taste > max || clean > max || service > max || look > max || value > max || taste < min || clean < min || service < min || look < min || value < min) {
        
            try {
                int a = 1 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Warning! : Score range is 0 to 5...");
            }
        } else {
            this.taste = taste;
            this.clean = clean;
            this.service = service;
            this.look = look;
            this.value = value;
        }
    }

 
    public double getAvg() {
        return (taste + clean + service + look + value) / 5;
    }

    @Override
    public String toString() {
        String result = "\n"
                + "             -คะแนน-"
                + "\nความอร่อย:" + taste + " | "
                + "ความสะอาด:" + clean + " | "
                + "การบริการ:" + service + " | "
                + "บรรยากาศร้าน:" + look + " | "
                + "ความคุ้มค่า: " + value + " | "
                + "คะแนนเฉลี่ย: " + getAvg()
                + "\n                อยู่ในเกณฑ์..." + par();
        return result;
    }

    public String par() {
        if (getAvg() >= 4.5) {
            return "ดีเยี่ยม";
        } else if (getAvg() >= 4) {
            return "ดีมาก";
        } else if (getAvg() >= 3.5) {
            return "ดี";
        } else if (getAvg() >= 3) {
            return "ค่อนข้างดี";
        } else if (getAvg() >= 2) {
            return "น่าพอใจ";
        } else if (getAvg() >= 1.5) {
            return "พอใช้";
        } else if (getAvg() >= 1) {
            return "ควรปรับปรุง";
        } else {
            return "ต่ำกว่าเกณฑ์ขั้นต่ำ";
        }

    }
}
