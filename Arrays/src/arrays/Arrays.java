package arrays;

public class Arrays {

    public static void main(String[] args) {
        
        //creates new array and allocates memory for 12 integers
        System.out.println("Single-dimensional array");
        int month_days[] = new int[12]; 
        month_days[0] = 31;
        month_days[1] = 28;
        month_days[2] = 31;
        month_days[3] = 30;
        month_days[4] = 31;
        month_days[5] = 30;
        month_days[6] = 31;
        month_days[7] = 31;
        month_days[8] = 30;
        month_days[9] = 31;
        month_days[10] = 30;
        month_days[11] = 31;        
        System.out.println("The month of April has " + month_days[3] + " days");
        
        //Create and initialize array in one statement
        System.out.println();
        System.out.println("Pre-intialized array");
        int x = 0;
        String days[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        for (x = 0; x < 7; x++)
            System.out.println("Day of week is: " + days[x]);
        System.out.println("The 3rd day of the week is " + days[2]);
        
        //Two dimensional array
        System.out.println();
        System.out.println("Multi-dimensional array");
        int twoDim [][] = new int[4][5]; //left number is row, right number is column--so 4 rows and 5 columns
        int i, j, k = 0;
        
        for (i=0; i<4; i++)
            for (j=0; j<5; j++){
                twoDim[i][j] = k;
                k++;
            }
        
        for(i=0; i<4;i++) {
            for(j=0; j<5; j++)
                System.out.print(twoDim[i][j] + " ");
            System.out.println();
        }
                
    }
    
}
