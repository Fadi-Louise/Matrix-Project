# Matrix Project

A Java implementation of a comprehensive Matrix class providing essential linear algebra operations with a focus on object-oriented design principles.

## Overview
This project implements a Matrix class in Java that offers fundamental matrix operations commonly used in linear algebra. The implementation emphasizes clean code practices, proper documentation, and efficient algorithms.

## Features

### Matrix Construction
- **From 2D arrays:** Initialize matrices using two-dimensional arrays.
- **From 1D arrays (diagonal matrices):** Create diagonal matrices from one-dimensional arrays.
- **Copy constructor:** Clone existing matrices.

### Mathematical Operations
- **Addition:** 
  - Matrix-matrix addition.
  - Matrix-scalar addition.
- **Subtraction:** 
  - Matrix-matrix subtraction.
  - Matrix-scalar subtraction.
- **Multiplication:** 
  - Matrix-matrix multiplication.
  - Matrix-scalar multiplication.
- **Transpose:** Transpose of a matrix.

### Display Functions
- **Formatted output of matrix operations:** Display results of operations in a readable format.
- **String representation of matrices:** Convert matrices to string format for easy visualization.

## Implementation Details
- **Proper parameter validation:** Ensure valid input for all mathematical operations.
- **Memory management tracking:** Use a static counter to track the number of matrix objects instantiated.
- **Comprehensive documentation:** Include preconditions and postconditions for all methods.
- **Method overloading:** Provide multiple methods for operations with different parameter types.

## How to Use

### Creating Matrices
```java
// From a 2D array
int[][] array2D = {{1, 2}, {3, 4}};
Matrix matrix1 = new Matrix(array2D);

// From a 1D array (diagonal matrix)
int[] array1D = {1, 2, 3};
Matrix diagonalMatrix = new Matrix(array1D);

// Copy constructor
Matrix matrixCopy = new Matrix(matrix1);
```

### Performing Operations
```java
Matrix resultAdd = matrix1.add(matrix2);       // Matrix-matrix addition
Matrix resultSub = matrix1.subtract(5);        // Matrix-scalar subtraction
Matrix resultMul = matrix1.multiply(matrix2);  // Matrix-matrix multiplication
Matrix transposed = matrix1.transpose();       // Transpose of a matrix
```

## Requirements
- Java 8 or higher

## Project Structure
- `Matrix.java` - The main class implementing matrix operations.
- `TestMatrix.java` - Test class demonstrating the functionality.

## Memory Management
The class includes a static counter (`numOfMatrices`) that tracks the number of matrix objects instantiated during program execution, helping with resource monitoring.

## Example
Here is an example of how to create and manipulate matrices:

```java
public class Main {
    public static void main(String[] args) {
        int[][] data1 = {{1, 2}, {3, 4}};
        int[][] data2 = {{5, 6}, {7, 8}};

        Matrix matrix1 = new Matrix(data1);
        Matrix matrix2 = new Matrix(data2);

        Matrix result = matrix1.add(matrix2);
        System.out.println("Addition Result:");
        System.out.println(result);

        Matrix transposed = matrix1.transpose();
        System.out.println("Transposed Matrix:");
        System.out.println(transposed);
    }
}
```

## Contributing
Contributions are welcome! Please feel free to submit a pull request or open an issue to improve the project.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
