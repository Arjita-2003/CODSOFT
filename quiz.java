import java.util.*;
public class quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Timer t = new Timer();
        System.out.println("**********WELCOME**********");
        System.out.println();
        System.out.println("<<<-----Take A QUIZ----->>>");
        System.out.println();
        System.out.println("Rules:");
        System.out.println("-> You can take quiz on any one subject");
        System.out.println("-> You will have 10 seconds to answer each question.");
        System.out.println("-> Each question has one correct option and carries 2 mark for correct answer and negative one marking for wrong answer.");
        System.out.println();
        System.out.println();
        System.out.println("Choose a number to take the quiz:");
        System.out.println("1. DBMS\n2. DSA\n3. GK");
        System.out.println();

        int q = sc.nextInt();
        int ans = 0;
        if(q==1){
            char[] correct = {'b','d','d','d','c'};
            char[] user = new char[5];
            System.out.println("Q1. Who created the first DBMS?" + "\na) Edgar Frank Codd\n" + 
                        "b) Charles Bachman\n" + "c) Charles Babbage\n" + "d) Sharon B. Codd\n");
            char ch1 = sc.next().charAt(0);
            user[0] = ch1;
            if(ch1 == 'b'){
                ans += 2;
                System.out.println("Correct Answer.");
            }
            else{
                ans -= 1;
                System.out.println("Wrong Answer.");
                System.out.println("Correct Answer: " + 'b');
            } 
            System.out.println();
            System.out.println("Q2. Which type of data can be stored in the database?\n" + "a) Image oriented data\n" +
                        "b) Text, files containing data\n" + "c) Data in the form of audio or video\n" + "d) All of the above\n");
            char ch2 = sc.next().charAt(0);
            user[1] = ch2;
            if(ch2 == 'd'){
                ans += 2;
                System.out.println("Correct Answer.");
            }
            else{
                ans -= 1;
                System.out.println("Wrong Answer.");
                System.out.println("Correct Answer: " + 'd');
            } 
            System.out.println();
            System.out.println("Q3. Which of the following is not a type of database?\n" +"a) Hierarchical\n" + "b) Network\n" +
                    "c) Distributed\n" + "d) Decentralized\n"); 
            char ch3 = sc.next().charAt(0);
            user[2] = ch3;
            if(ch3 == 'd'){
                ans += 2;
                System.out.println("Correct Answer.");
            }
            else{
                ans -= 1;
                System.out.println("Wrong Answer.");
                System.out.println("Correct Answer: " + 'd');
            }
            System.out.println();
            System.out.println("Q4. Which of the following is not a function of the database?\n" +"a) Managing stored data\n" + 
                    "b) Manipulating data\n" + "c) Security for stored data\n" + "d) Analysing code\n");                                                                                           
            char ch4 = sc.next().charAt(0);
            user[3] = ch4;
            if(ch4 == 'd'){
                ans += 2;
                System.out.println("Correct Answer.");
            }
            else{
                ans -= 1;
                System.out.println("Wrong Answer.");
                System.out.println("Correct Answer: " + 'd');
            }
            System.out.println();
            System.out.println("Q5.Which of the following is known as a set of entities of the same type that share same properties, or attributes?\r\n"
                     +"a) Relation set\n" + "b) Tuples\n" + "c) Entity Set\n" + "d) Entity Relation Model\n");                                                                                           
            char ch5 = sc.next().charAt(0);
            user[4] = ch5;
            if(ch5 == 'c'){
                ans += 2;
                System.out.println("Correct Answer.");
            }
            else{
                ans -= 1;
                System.out.println("Wrong Answer.");
                System.out.println("Correct Answer: " + 'c');
            }

            System.out.println("Your Score: " + ans);
            System.out.println();
            System.out.println("***Summary***");
            System.out.println("Your Answer: ");
            for(int i=0;i<5;i++){
                System.out.print(user[i] + " ");
            }
            System.out.println();
            System.out.println("Correct Answers: ");
            for(int j=0;j<5;j++){
                System.out.print(correct[j] + " ");
            }
        }


        else if(q == 2){
            char[] correct = {'a','a','a','c','b'};
            char[] user = new char[5];
            System.out.println("Q1. Which of these is a divide and conquer algorithm?\n" + "a) Merge Sort\n" + 
                        "b) Insertion Sort\n" + "c) Selection Sort\n" + "d) Bubble Sort\n");
            char ch1 = sc.next().charAt(0);
            user[0] = ch1;
            if(ch1 == 'a'){
                ans += 2;
                System.out.println("Correct Answer.");
            }
            else{
                ans -= 1;
                System.out.println("Wrong Answer.");
                System.out.println("Correct Answer: " + 'a');
            }
            System.out.println();
            System.out.println("Q2. What algorithm is used to find the shortest path in a graph?\n" + "a) Dijkstra's\n" +
                        "b) Depth First Search\n" + "c) Linear Search\n" + "d) Binary Search\n");
            char ch2 = sc.next().charAt(0);
            user[1] = ch2;
            if(ch2 == 'a'){
                ans += 2;
                System.out.println("Correct Answer.");
            }
            else {
                ans -= 1;
                System.out.println("Wrong Answer.");
                System.out.println("Correct Answer: " + 'a');
            }
            System.out.println();
            System.out.println("Q3. What makes a tree 'binary'?\n" +"a) Each node can have at most two child nodes\n" + 
                        "b) Each node has two parent nodes\n" + "c) Each edge is bi-directional\n" + 
                        "d) The tree has two root nodes\n"); 
            char ch3 = sc.next().charAt(0);
            user[2] = ch3;
            if(ch3 == 'a'){
                ans += 2;
                System.out.println("Correct Answer.");
            }
            else{
                ans -= 1;
                System.out.println("Wrong Answer.");
                System.out.println("Correct Answer: " + 'a');
            }
            System.out.println();
            System.out.println("Q4. Radix sort must use a ____ algorithm to sort the values correctly.\n" +"a) higher order\n" + 
                    "b) inverse\n" + "c) stable\n" + "d) cubic\n");                                                                                           
            char ch4 = sc.next().charAt(0);
            user[3] = ch4;
            if(ch4 == 'c'){
                ans += 2;
                System.out.println("Correct Answer.");
            }
            else{
                ans -= 1;
                System.out.println("Wrong Answer.");
                System.out.println("Correct Answer: " + 'c');
            }
            System.out.println();
            System.out.println("Q5.For counting sort to work, the values must be in a limited range, they must be non negative, and what else?\n"
                     +"a) fibonacci\n" + "b) integers\n" + "c) odd\n" + "d) prime\n");                                                                                           
            char ch5 = sc.next().charAt(0);
            user[4] = ch5;
            if(ch5 == 'b'){
                ans += 2;
                System.out.println("Correct Answer.");
            }
            else {
                ans -= 1;
                System.out.println("Wrong Answer.");
                System.out.println("Correct Answer: " + 'b');
            }

            System.out.println("Your Score: " + ans);
            System.out.println();
            System.out.println("***Summary***");
            System.out.println("Your Answer: ");
            for(int i=0;i<5;i++){
                System.out.print(user[i] + " ");
            }
            System.out.println();
            System.out.println("Correct Answers: ");
            for(int j=0;j<5;j++){
                System.out.print(correct[j] + " ");
            }
        }

        else if(q == 3){
            char[] correct = {'a','d','d','b','d'};
            char[] user = new char[5];
            System.out.println("Q1. CPU scheduling is the basis of ___________\n" + "a) multiprogramming operating systems\n" + 
                            "b) larger memory sized systems\n" + "c) multiprocessor systems\n" + "d) none of the mentioned\n");
            char ch1 = sc.next().charAt(0);
            user[0] = ch1;
            if(ch1 == 'a'){
                ans += 2;
                System.out.println("Correct Answer.");
            }
            else{
                ans -= 1;
                System.out.println("Wrong Answer.");
                System.out.println("Correct Answer: " + 'a');
            }

            System.out.println("Q2. In Operating Systems, which of the following is/are CPU scheduling algorithms?\n" + "a) Priority\n" + 
                            "b) Round Robin\n" + "c) Shortest Job First\n" + "d) All of the mentioned\n");
            char ch2 = sc.next().charAt(0);
            user[1] = ch2;
            if(ch2 == 'd'){
                ans += 2;
                System.out.println("Correct Answer.");
            }
            else{
                ans -= 1;
                System.out.println("Wrong Answer.");
                System.out.println("Correct Answer: " + 'd');
            }
            System.out.println();
            System.out.println("Q3. Which one of the following errors will be handle by the operating system?\n" +"a) lack of paper in printer\n" +
                        "b) connection failure in the network\n" + "c) power failure\n" + "d) all of the mentioned\n"); 
            char ch3 = sc.next().charAt(0);
            user[2] = ch3;
            if(ch3 == 'd'){
                ans += 2;
                System.out.println("Correct Answer.");
            }
            else {
                ans -= 1;
                System.out.println("Wrong Answer.");
                System.out.println("Correct Answer: " + 'd');
            }
            System.out.println();
            System.out.println("Q4. Which one of the following is not a real time operating system?\n" +"a) RTLinux\n" +
                        "b) Palm OS\n" + "c) QNX\n" + "d) VxWorks\n");                                                                                           
            char ch4 = sc.next().charAt(0);
            user[3] = ch4;
            if(ch4 == 'b'){
                ans += 2;
                System.out.println("Correct Answer.");
            }
            else{
                ans -= 1;
                System.out.println("Wrong Answer.");
                System.out.println("Correct Answer: " + 'b');
            }
            System.out.println();
            System.out.println("Q5.When a process is in a “Blocked” state waiting for some I/O service. When the service is completed, it goes to the\n"
                    + "a) Terminated state\n" + "b) Suspended state\n" + "c) Running state\n" + "d) Ready state\n");                                                                                           
            char ch5 = sc.next().charAt(0);
            user[4] = ch5;
            if(ch5 == 'd'){
                ans += 2;
                System.out.println("Correct Answer.");
            }
            else{
                ans -= 1;
                System.out.println("Wrong Answer.");
                System.out.println("Correct Answer: " + 'd');
            }
            System.out.println();
            System.out.println("Your Score: " + ans);
            System.out.println();
            System.out.println("***Summary***");
            System.out.println("Your Answer: ");
            for(int i=0;i<5;i++){
                System.out.print(user[i] + " ");
            }
            System.out.println();
            System.out.println("Correct Answers: ");
            for(int j=0;j<5;j++){
                System.out.print(correct[j] + " ");
            }
        }

        else{
            System.out.println("Invalid Input.");
        }
    }
}
