package Rectangle;

public class Bai5V1 {
        private int rollNo;
        private String name;
        private static String college = "BBDIT";
        //constructor to initialize the variable
        public Bai5V1(int r, String n) {
            rollNo = r;
            name = n;
        }
        //static method to change the value of static variable
        public static void change() {
            college = "RIKKEI ACADEMY";
        }
        //method to display values
        public void display() {
            System.out.println(rollNo + " " + name + " " + college);
        }

    }
