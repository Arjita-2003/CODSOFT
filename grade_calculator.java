import java.util.*;
public class grade_calculator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("<<<--- STUDENT GRADE CALCULATOR --->>>");
        System.out.println();
        
        int[] marks = new int[5];
        System.out.println("Enter Your Marks (Out of 100)");
        System.out.println();
        System.out.print("Compiler Design: ");
        marks[0] = sc.nextInt();
        System.out.print("Machine Learning: ");
        marks[1] = sc.nextInt();
        System.out.print("Computer Networks: ");
        marks[2] = sc.nextInt();
        System.out.print("Project Management: ");
        marks[3] = sc.nextInt();
        System.out.print("Database Management: ");
        marks[4] = sc.nextInt();

        int total = 0;
        for(int ele : marks){
            total += ele;
        }

        float avg = (float) (total/5);
        String g = "";
        String k = "";
        if(avg >= 95){
            g += "A+";
            k = "PASS";
        }
        else if(avg > 90 && avg < 95){
            g += 'A';
            k = "PASS";
        }
        else if(avg > 80 && avg <= 90){
            g += "B+";
            k = "PASS";
        }
        else if(avg > 70 && avg <= 80){
            g += "B";
            k = "PASS";
        }
        else if(avg > 60 && avg <= 70){
            g += "C+";
            k = "PASS";
        }
        else if(avg > 50 && avg <= 60){
            g += "C";
            k = "PASS";
        }
        else if(avg > 32 && avg <= 50){
            g += "D";
            k = "PASS";
        }
        else{
            g += "F";
            k = "FAIL";
        }
        
        System.out.println();
        System.out.println("***YOUR RESULT***");
        System.out.println();
        System.out.println("Total Marks:" +" "+ total);
        System.out.println("Average Percentage:" +" "+ avg + "%");
        System.out.println("Grade:" +" "+ g +"   "+ "Status:" +" "+ k);
        System.out.println();

    }
}
