public class GradeBook
{
    public static void main(String[] args)
    {
        int[] week1 = {90, 87, 86, 56, 96};
        int[] week2 = {65, 76, 87, 84, 93};
        int[] week3 = {85, 56, 91, 90, 65};
        int[] week4 = {65, 56, 78, 31, 65};
        int[] week5 = {85, 56, 71, 80, 39};
        int[][] gradeBook = {week1, week2, week3, week4, week5};
        
        
        //alternative way to make a 2D array
        int [][] gradeBook2 = {{90, 87, 86, 56, 96},
                               {65, 76, 87, 84, 93},
                               {85, 56, 91, 90, 65},
                               {65, 56, 78, 31, 65},
                               {85, 56, 71, 80, 39}};
        
        String[] students = {"Alex", "Harry", "Ellen", "Sammy", "Pat"};
                               
        System.out.println("Alex  Harry  Ellen  Sammy  Pat");
        print2D(gradeBook);
        
        weeklyAverage(gradeBook);
        studentAverage(gradeBook,students);
        
    }
    
    
    //This is a method to print the 2D array.
    //We will learn more about this in the next lesson!
    public static void print2D(int[][] array)
    {
        /*for(int[] elem: array)
        {
            for(int num: elem)
            {
                System.out.print(num+ "     ");
            }
            System.out.println();
        }*/
        for(int i = 0; i<array[0].length;i++){
            System.out.println(array[0][i]);
        }
    }
    
    /**
     * Print the average for all quizzes for each week
     * 
     * 
     **/
    public static void weeklyAverage(int[][] array){
        
        for(int row = 0; row<array.length;row++){
            double weeklySum = 0.0;
            double average = 0.0;
            for(int col = 0; col<array[row].length; col++){
                weeklySum += array[row][col];
            }
            average = weeklySum/array[row].length;
            System.out.println("Week "+(row+1)+" average: "+average);
        }
    }
    
    public static void studentAverage(int[][] array, String[] students){
        
        for(int col = 0; col<array[0].length; col++){
            double studentAverage = 0.0;
            double studentSum = 0.0;
            for(int row = 0; row<array.length; row++){
                studentSum += array[row][col];
            }
            studentAverage = studentSum/array.length;
            System.out.println(students[col]+" average is "+studentAverage);
        }
    }
    
    
    
    
    
    
    
}
