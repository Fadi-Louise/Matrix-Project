/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Matrix.java
 * Date : March 20,2022
 * The class Matrix provides the implementation of matrices and
 * some of their operations
 *
 * @author Fadi
 * @version Public constructor that takes a reference to a 2D array of double
 * values
 *
 * Public constructor that takes a reference to a 1D array of double values
 *
 * Public copy constructor that takes a reference to a Matrix object and returns
 * a copy of this object
 *
 * Public method setMatrix that takes a 2D array of doubles and assigns its
 * values to the elements of the matrix of this object
 *
 * Public method setMatrix that takes a 1D array of doubles and assigns its
 * values to the elements of diagonal of the matrix of this object
 *
 * Public method add that aims for the addition of two Matrix objects
 *
 * Public method add that aims for the addition of one matrix with a double
 * value
 *
 * Public method subtract that aims for the subtraction of two Matrix objects
 *
 * Public method subtract that aims for the subtraction of a double value from a
 * Matrix object
 *
 * Public method multiply that aims for the multiplication of two Matrix objects
 *
 * Public method multiply that aims for the multiplication of a Matrix object
 * with a double value
 *
 * Public method transpose that aims for the transpose of a Matrix object
 *
 * Public void method displayOp that aims for the display of one of the
 * operations done on two Matrix objects
 *
 * Public void method diplayOp that aims for the display of one of the
 * operations done on a Matrix object and double value
 *
 * Public method toString that aims for the representation of the Matrix object
 * as a String
 */
public class Matrix {

    private double[][] matrix; //private reference for an array of type double
    static int numOfMatrices = 0; //counter that increments by one once a reference for a Matrix object is instantiated

    /**
     * This public constructor creates the 2d array of the object(by calling the
     * setMatrix method) referenced by the data field matrix, with the same
     * dimensions as its parameter array, it also assigns the values of
     * parameter array to the elements of the array matrix
     *
     * Precondition : The parameter reference to an 2d array should be of type
     * double
     *
     * Post condition : The method invokes the setMatrix defined method
     *
     * @param m Reference for an 2d array of type double
     *
     */
    public Matrix(double[][] m) {
        setMatrix(m);
    }

    /**
     * This public constructor creates the 2d array of the object(by calling the
     * setMatrix method) referenced by the data field matrix, with the both
     * dimensions equal to the length of the 1d parameter array. It also assigns
     * the values of parameter array to the elements of the array matrix, other
     * elements are equal to 0
     *
     * Precondition : The parameter reference to an 1d array should be of type
     * double
     *
     * Post condition : The method invokes the setMatrix defined method
     *
     * @param a Reference for an 1d array of type double
     */
    public Matrix(double[] a) {
        setMatrix(a);
    }

    /**
     * This public constructor creates a copy of the object Matrix
     *
     * Precondition : The parameter reference should be of type Matrix
     *
     * Post condition : The this object Matrix will reference a 2d array that is
     * a copy of the 2d array referenced by the object Matrix parameter
     *
     * @param m Reference for a Matrix object
     */
    public Matrix(Matrix m) {
        this(m.matrix);
    }

    /**
     * This void method setMatrix takes a 2D array of doubles and assigns its
     * values to the elements of the matrix of this object.
     *
     * Precondition : The parameter reference to an 2d array should be of type
     * double
     *
     * Post condition : After this method ends, a 2d array of the object will be
     * created, referenced by the data field matrix and the number of references
     * for Matrix objects will be incremented by one
     *
     * @param m Reference for an 2d array of type double
     */
    public void setMatrix(double[][] m) {
        this.matrix = new double[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) { //initial value of i is 0
            for (int j = 0; j < m[i].length; j++) { //initial value of j is 0
                matrix[i][j] = m[i][j];
            }
        }
        numOfMatrices++;
    }

    /**
     * This void method setMatrix takes a 1D array of doubles and assigns its
     * values to the elements of diagonal of the matrix of this object. Other
     * elements are equal to 0.
     *
     * Precondition : The parameter reference to an 2d array should be of type
     * double
     *
     * Post condition : After this method ends, a 2d array of the object will be
     * created, referenced by the data field matrix and the number of references
     * for Matrix objects will be incremented by one
     *
     * @param a Reference for an 1d array of type double
     */
    public void setMatrix(double[] a) {
        this.matrix = new double[a.length][a.length];
        for (int i = 0; i < a.length; i++) {//initial value of i is 0
            matrix[i][i] = a[i];
        }
        numOfMatrices++;
    }

    /**
     * This public method add takes a parameter of type Matrix and returns a
     * Matrix object that results of the addition of this object and the
     * parameter object
     *
     * Precondition : The this Matrix object's data field 2d array and the
     * parameter Matrix object's data field 2d array should be of equal
     * dimensions
     *
     * Post condition : If the precondition is satisfied (if not returns null)
     * this public method returns a new reference for an Matrix object that its
     * data field 2d array have the same dimension as the this Matrix object's
     * data field 2d array and the Matrix object parameter's data field 2d array
     *
     * @param rightHandSide Reference for a Matrix object
     *
     * @return This public method returns a new reference for an Matrix object
     */
    public Matrix add(Matrix rightHandSide) {
        if (matrix.length != rightHandSide.matrix.length
                || matrix[0].length != rightHandSide.matrix[0].length) {
            return null;
        }

        Matrix resultOfAddition = new Matrix(new double[matrix.length][rightHandSide.matrix[0].length]);

        for (int i = 0; i < resultOfAddition.matrix.length; i++) { //initial value of i is 0
            for (int j = 0; j < resultOfAddition.matrix[i].length; j++) { //initial value of j is 0
                resultOfAddition.matrix[i][j] = matrix[i][j] + rightHandSide.matrix[i][j];
            }
        }
        return resultOfAddition;
    }

    /**
     * This public method add takes a parameter of type double and returns a
     * Matrix object that results of the addition of this object and the
     * parameter double (addition of each element of the matrix of this object
     * to the double parameter)
     *
     * Precondition : The righHandSide parameter should be of type double or a
     * type that can be implicitly casted to double
     *
     * Post condition : This public method returns a new reference for an Matrix
     * object that its data field 2d array have the same dimension as the this
     * Matrix object's data field 2d array
     *
     * @param rightHandSide Reference for a Matrix object
     *
     * @return This public method returns a new reference for an Matrix object
     */
    public Matrix add(double rightHandSide) {
        Matrix resultOfAddition = new Matrix(new double[matrix.length][matrix[0].length]);
        for (int i = 0; i < resultOfAddition.matrix.length; i++) {//initial value of i is 0
            for (int j = 0; j < resultOfAddition.matrix[i].length; j++) {//initial value of j is 0
                resultOfAddition.matrix[i][j] = matrix[i][j] + rightHandSide;
            }
        }
        return resultOfAddition;
    }

    /**
     * This public method subtract takes a parameter of type Matrix and returns
     * a Matrix object that results of the addition of this object and the
     * parameter object
     *
     * Precondition : The this Matrix object's data field 2d array and the
     * parameter Matrix object's data field 2d array should be of equal
     * dimensions
     *
     * Post condition : If the precondition is satisfied (if not returns null)
     * this public method returns a new reference for an Matrix object that its
     * data field 2d array have the same dimension as the this Matrix object's
     * data field 2d array and the Matrix object parameter's data field 2d array
     *
     * @param rightHandSide Reference for a Matrix object
     *
     * @return This public method returns a new reference for an Matrix object
     */
    public Matrix subtract(Matrix rightHandSide) {
        if (matrix.length != rightHandSide.matrix.length
                || matrix[0].length != rightHandSide.matrix[0].length) {
            return null;
        }

        Matrix resultOfSubtraction = new Matrix(new double[matrix.length][rightHandSide.matrix[0].length]);

        for (int i = 0; i < resultOfSubtraction.matrix.length; i++) { //initial value of i is 0
            for (int j = 0; j < resultOfSubtraction.matrix[i].length; j++) { //initial value of j is 0
                resultOfSubtraction.matrix[i][j] = matrix[i][j] - rightHandSide.matrix[i][j];
            }
        }
        return resultOfSubtraction;
    }

    /**
     * This public method subtract takes a parameter of type double and returns
     * a Matrix object that results of the subtraction of this object and the
     * parameter double (subtraction of each element of the matrix of this
     * object to the double parameter)
     *
     * Precondition : The righHandSide parameter should be of type double or a
     * type that can be implicitly casted to double
     *
     * Post condition : This public method returns a new reference for an Matrix
     * object that its data field 2d array have the same dimension as the this
     * Matrix object's data field 2d array
     *
     * @param rightHandSide Reference for a Matrix object
     *
     * @return This public method returns a new reference for an Matrix object
     */
    public Matrix subtarct(double rightHandSide) {
        Matrix resultOfSubtraction = new Matrix(new double[matrix.length][matrix[0].length]);
        for (int i = 0; i < resultOfSubtraction.matrix.length; i++) {//initial value of i is 0
            for (int j = 0; j < resultOfSubtraction.matrix[i].length; j++) {//initial value of j is 0
                resultOfSubtraction.matrix[i][j] = matrix[i][j] - rightHandSide;
            }
        }
        return resultOfSubtraction;
    }

    /**
     * This public method multiply takes a parameter of type Matrix and returns
     * a Matrix object that results of the multiplication of this object and the
     * parameter object
     *
     * Precondition : The this Matrix object's data field 2d array number of
     * rows should be equal to the parameter Matrix object's data field 2d array
     * number of rows
     *
     * Post condition : If the precondition is satisfied (if not returns null)
     * this public method returns a new reference for an Matrix object that its
     * data field 2d array dimension number of rows and number of columns are
     * respectively equal to the this Matrix object's data field 2d array number
     * of rows and the Matrix object parameter's data field 2d array number of
     * columns
     *
     * @param rightHandSide Reference for a Matrix object
     *
     * @return This public method returns a new reference for an Matrix object
     */
    public Matrix multiply(Matrix rightHandSide) {
        Matrix resultOfMultiplication;
        if (matrix[0].length == rightHandSide.matrix.length) {
            resultOfMultiplication = new Matrix(new double[matrix.length][rightHandSide.matrix[0].length]);
            for (int i = 0; i < matrix.length; i++) { //initial value of i is 0
                for (int j = 0; j < rightHandSide.matrix[i].length; j++) { //initial value of j is 0
                    for (int k = 0; k < matrix[i].length; k++) { //initial value of k is 0
                        resultOfMultiplication.matrix[i][j] += matrix[i][k] * rightHandSide.matrix[k][j];
                    }
                }
            }
            return resultOfMultiplication;
        }
        return null;
    }

    /**
     * This public method multiply takes a parameter of type double and returns
     * a Matrix object that results of the multiplication of this object and the
     * parameter double (multiplication of each element of the matrix of this
     * object to the double parameter)
     *
     * Precondition : The righHandSide parameter should be of type double or a
     * type that can be implicitly casted to double
     *
     * Post condition : If the precondition is satisfied this public method
     * returns a new reference for an Matrix object that its data field 2d array
     * have the same dimension as the this Matrix object's data field 2d array
     *
     * @param rightHandSide Reference for a Matrix object
     *
     * @return This public method returns a new reference for an Matrix object
     */
    public Matrix multiply(double rightHandSide) {
        Matrix resultOfMultiplication = new Matrix(new double[matrix.length][matrix[0].length]);
        for (int i = 0; i < resultOfMultiplication.matrix.length; i++) { //initial value of i is 0
            for (int j = 0; j < resultOfMultiplication.matrix[i].length; j++) { //initial value of j is 0
                resultOfMultiplication.matrix[i][j] = matrix[i][j] * rightHandSide;
            }
        }
        return resultOfMultiplication;
    }

    /**
     * This public method transpose the this object and returns the result of
     * operation as a new Matrix object
     *
     * Precondition : none
     *
     * Post condition : This public method returns a new reference for an Matrix
     * object that its data field 2d array dimension number of rows and number
     * of columns are respectively equal to the this Matrix object's data field
     * 2d array number of columns and number of rows
     *
     * @return This public method returns a new reference for an Matrix object
     */
    public Matrix transpose() {
        Matrix resultOfTranspose = new Matrix(new double[matrix[0].length][matrix.length]);
        for (int i = 0; i < matrix.length; i++) { //initial value of i is 0
            for (int j = 0; j < matrix[i].length; j++) { //initial value of i is 0
                resultOfTranspose.matrix[j][i] = matrix[i][j];
            }
        }
        return resultOfTranspose;
    }

    /**
     * This public method displayOp that displays the this and the parameter
     * Matrix objects and the operation (+, -, *) and the resulted Matrix object
     *
     * Precondition : The parameters should be in the same order
     *
     * Post condition : none
     *
     * @param rightHandSide Reference to a Matrix object
     * @param op The operator of the operation
     * @param result Reference for a Matrix object
     */
    public void displayOp(Matrix rightHandSide, char op, Matrix result) {
        //finding the maximum number of rows between the three matrices
        int maxOfRows = Math.max(Math.max(matrix.length, rightHandSide.matrix.length), result.matrix.length);
        //finding the minimum number of rows between the three matrices
        int minOfRows = Math.min(Math.min(matrix.length, rightHandSide.matrix.length), result.matrix.length);
        for (int i = 0; i < minOfRows; i++) { //initial value of i is 0 till the minimum number of rows
            for (int j = 0; j < matrix[0].length; j++) { //initial value of j is 0
                /*printing each element in the matrix on 7 spaces with 4 digits in the decimal part
                 followed by the floating point and two digits in the floating part followed by one space*/
                System.out.printf("%-7.2f%-1s", matrix[i][j], " ");
            }
            // if i is equal to the half of minimum number of rows we should print the operator(* - +)
            //else print spaces then the next row for the remaining matrices
            if (i == minOfRows / 2) {
                System.out.printf("%-2s%-1c%-2s", " ", op, " ");
            } else {
                System.out.printf("%-5s", " ");
            }
            for (int j = 0; j < rightHandSide.matrix[0].length; j++) {//initial value of j is 0 till the last column in the matrix
                /*printing each element in the matrix on 7 spaces with 4 digits in the decimal part
                 followed by the floating point and two digits in the floating part*/
                System.out.printf("%-7.2f%-1s", rightHandSide.matrix[i][j], " ");
            }
            // if i is equal to the half of minimum number of rows we should print the assignment operator(=)
            //else print spaces then the next row for the remaining matrix
            if (i == minOfRows / 2) {
                System.out.printf("%-2s%-1c%-2s", " ", '=', " ");
            } else {
                System.out.printf("%-5s", " ");
            }
            //printing the rows in the resulted matrix
            for (int j = 0; j < result.matrix[0].length; j++) { //initial value of j is 0 till the last column in the matrix
                /*printing each element in the matrix on 7 spaces with 4 digits in the decimal part
                 followed by the floating point and two digits in the floating part*/
                System.out.printf("%-7.2f%-1s", result.matrix[i][j], " ");
            }
            System.out.println();
        }

        for (int i = minOfRows; i < maxOfRows; i++) { //initial value of i is the minimum number of rows till the maximum number of rows
            /*if the number of rows in a certain matrix is bigger than the minimum number of rows
            print the remaining rows*/
            if (matrix.length > minOfRows) {
                for (int j = 0; j < matrix[0].length; j++) {//initial value of j is 0 till the last column in the matrix
                    System.out.printf("%-7.2f%-1s", matrix[i][j], " ");
                }
                // if i is equal to the half of minimum number of rows we should print the operator(* - +)
                //else print spaces then the next row for the remaining matrices
                if (i == minOfRows / 2) {
                    System.out.printf("%-2s%-1c%-2s", " ", op, " ");
                } else {
                    System.out.printf("%-5s", " ");
                }
                System.out.println();
            }
            /*if the number of rows in a certain matrix is bigger than the minimum number of rows
            print the remaining rows*/
            if (rightHandSide.matrix.length > minOfRows) {
                /*printing the spaces before attending the second matrix by multiplying the 7 sapces
                taken by each element in the matrix plus the space after it so we have 8 spaces by 
                the number of columns of the first matrix then we add the 5 spaces, two before the 
                operator and two after it*/
                for (int space = 0; space < 8 * matrix[0].length + 5; space++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < rightHandSide.matrix[0].length; j++) {//initial value of j is 0 till the last column in the matrix
                    System.out.printf("%-7.2f%-1s", rightHandSide.matrix[i][j], " ");
                }
                // if i is equal to the half of minimum number of rows we should print the operator(* - +)
                //else print spaces then the next row for the remaining matrices
                if (i == minOfRows / 2) {
                    System.out.printf("%-2s%-1c%-2s", " ", '=', " ");
                } else {
                    System.out.printf("%-5s", " ");
                }
                System.out.println();
            }
            if (result.matrix.length > minOfRows) {
                for (int j = 0; j < result.matrix[0].length; j++) {//initial value of j is 0 till the last column in the matrix
                    System.out.printf("%-7.2f%-1s", result.matrix[i][j], " ");
                }
                System.out.println();
            }
        }

    }

    /**
     * This The public method displayOp that displays this Matrix object and the
     * double value and the operation (+, -, *) and the resulted Matrix object
     *
     * Precondition : The parameters should be in the same order
     *
     * Post condition : none
     *
     * @param rightHandSide Reference to a Matrix object
     * @param op The operator of the operation
     * @param result Reference for a Matrix object
     *
     */
    public void displayOp(double rightHandSide, char op, Matrix result) {
        for (int i = 0; i < matrix.length; i++) {//initial value of i is 0 till the last row in the matrix
            for (int j = 0; j < matrix[0].length; j++) {//initial value of j is 0 till the last column in the matrix
                System.out.printf("%-6.2f%-1s", matrix[i][j], " ");
            }

            /* if i is equal to the half of minimum number of rows we should print the operator(* - +)
             followed by the rightHandSide then the asignement operator*/
            //else print spaces then the next row for the remaining matrices
            if (i == matrix.length / 2) {
                System.out.printf("%-2s%-1c%-2s%-7.2f%-1c%-2s", " ", op, " ", rightHandSide, '=', " ");
            } else {
                System.out.printf("%-14s", " ");
            }
            for (int j = 0; j < result.matrix.length; j++) {//initial value of j is 0 till the last column in the matrix
                System.out.printf("%-6.2f%-1s", result.matrix[i][j], " ");
            }
            System.out.println();
        }
    }

    /**
     * This public method toString returns the Matrix object as a string
     *
     * Precondition : none
     *
     * Post condition : none
     *
     * @return This method returns a reference for a string object
     */
    @Override
    public String toString() {
        String matrixString = "";
        for (double[] matrix1 : matrix) {
            for (int j = 0; j < matrix1.length; j++) {//initial value of j is 0 till the last column in the matrix
                matrixString += String.format("%-6.2f%-1s", matrix1[j], " ");
            }
            matrixString += "\n";
        }
        return matrixString;
    }
}
