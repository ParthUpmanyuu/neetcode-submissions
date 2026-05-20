class Solution {
    public boolean isValidSudoku(char[][] board) {
    //Rows //cols //squares

    // Set intialisation to store unique value character
    Set valid = new HashSet<>();

    // row loop
    for(int i =0;i<9;i++){
        //col loop
        for(int j =0;j<9;j++){
            // Intialisation of the square 
        char sudoku = board[i][j];
        // if no element in the cell move ahead 
      if (sudoku != '.') {
    // Create unique string keys for rows, columns, and blocks
    String rowKey = sudoku + " in row " + i;
    String colKey = sudoku + " in col " + j;
    String boxKey = sudoku + " in box " + (i / 3) + "-" + (j / 3);

    // .add() returns false if the element is already present in the set
    if (!valid.add(rowKey) || !valid.add(colKey) || !valid.add(boxKey)) {
        return false;
    }
}  
        }   
        }   

        return true;
    }
    
    }


