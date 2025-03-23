/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Fadi
 */
import java.util.Scanner;

public class TestMatrix {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /* Create a refernce to a 2d arrayand its values to random double values
        between 0 and 50 excluded*/
        double[][] array1 = new double[3][4];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = Math.random() * 50;
            }
        }
        /* Create a refernce to a 2d arrayand its values to random double values
        between 0 and 50 excluded*/
        double[][] array2 = new double[4][4];
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = Math.random() * 50;
            }
        }
        /* Create a refernce to a 1d arrayand its values to random double values
        between 0 and 50 excluded*/
        double[] array3 = new double[4];
        for (int i = 0; i < array3.length; i++) {
            array3[i] = Math.random() * 50.0;
        }

        //Display the number of matrices stored in the memory
        System.out.println(Matrix.numOfMatrices + ((Matrix.numOfMatrices > 0)
                ? " matrices " : " matrix") + " in the memory.");
        System.out.println();

        //Instantiate a refernce for a Matrix object 
        Matrix m1 = new Matrix(array1);

        //Display the instantiated matrix
        System.out.println(m1.toString());

        //Display the number of matrices stored in the memory
        System.out.println(Matrix.numOfMatrices + ((Matrix.numOfMatrices > 1)
                ? " matrices " : " matrix") + " in the memory.");
        System.out.println();

        //Instantiate a refernce for a Matrix object 
        Matrix m2 = new Matrix(array2);

        //Display the instantiated matrix
        System.out.println(m2.toString());

        //Display the number of matrices stored in the memory
        System.out.println(Matrix.numOfMatrices + ((Matrix.numOfMatrices > 1)
                ? " matrices " : " matrix") + " in the memory.");
        System.out.println();

        //Instantiate a refernce for a Matrix object 
        Matrix m3 = new Matrix(array3);

        //Display the instantiated matrix
        System.out.println(m3.toString());

        //Display the number of matrices stored in the memory
        System.out.println(Matrix.numOfMatrices + ((Matrix.numOfMatrices > 1)
                ? " matrices " : " matrix") + " in the memory.");
        System.out.println();

        //Create a scanner object
        Scanner input = new Scanner(System.in);

        //declare a value of type double
        double value;

        //Ask the user to enter a double value
        System.out.print("Please enter a value: ");
        value = input.nextDouble();
        System.out.println();

        /*Adding matrix 1 and the double value and assigning the reuslt to a new
         reference for an object Matrix */
        Matrix m4 = m1.add(value);

        //Display the number of matrices stored in the memory
        System.out.println(Matrix.numOfMatrices + ((Matrix.numOfMatrices > 1)
                ? " matrices " : " matrix") + " in the memory.");

        //Display the opperation of adding a Matrix object with a double value
        m1.displayOp(value, '+', m4);
        System.out.println();

        /*Adding matrix 2 and matrix 3 value and assigning the reuslt to a new
         reference for an object Matrix */
        Matrix m5 = m2.add(m3);

        //Display the number of matrices stored in the memory
        System.out.println(Matrix.numOfMatrices + ((Matrix.numOfMatrices > 1)
                ? " matrices " : " matrix") + " in the memory.");

        if (m5 == null) {
            System.out.println("The additon couldn't take place," + "\n"
                    + "because the condition for adding two matrices is not satisfied."
                    + "(Condition: The two matrices should have same dimensions)");
            System.out.println();
        } else {
            //Display the opperation of adding two matrices
            m2.displayOp(m3, '+', m5);
            System.out.println();
        }

        /*Multiplying matrix 1 and the double value and assigning the reuslt to a new
         reference for an object Matrix */
        Matrix m6 = m1.multiply(value);

        //Display the number of matrices stored in the memory
        System.out.println(Matrix.numOfMatrices + ((Matrix.numOfMatrices > 1)
                ? " matrices " : " matrix") + " in the memory.");

        //Display the opperation of adding a Matrix object with a double value
        m1.displayOp(value, '*', m6);
        System.out.println();

        /*Multiplying matrix 1 and matrix 3 and assigning the reuslt to a new
         reference for an object Matrix */
        Matrix m7 = m1.multiply(m3);

        //Display the number of matrices stored in the memory
        System.out.println(Matrix.numOfMatrices + ((Matrix.numOfMatrices > 1)
                ? " matrices " : " matrix") + " in the memory.");

        if (m7 == null) {
            System.out.println("The multiplication couldn't take place, because" + "\n"
                    + " the condition for multiplying two matrices is not "
                    + "satisfied.(Condition:Number of columns in the first matrix,"
                    + "should be equal to the number of rows in the second matrix)");
            System.out.println();
        } else {
            //Display the opperation of multiplying two matrices
            m1.displayOp(m3, '*', m7);
            System.out.println();
        }

        //Transpose of matrix 1 and assigning the result to a new obhject Matrix
        Matrix m8 = m1.transpose();
        //Display the number of matrices stored in the memory
        System.out.println(Matrix.numOfMatrices + ((Matrix.numOfMatrices > 1)
                ? " matrices " : " matrix") + " in the memory.");
        System.out.println("The transpose of : ");

        //Display the instantiated matrix
        System.out.println(m1.toString());
        System.out.println("is: ");
        System.out.println();

        //Display the result of the transpose
        System.out.println(m8.toString());

    }
}
