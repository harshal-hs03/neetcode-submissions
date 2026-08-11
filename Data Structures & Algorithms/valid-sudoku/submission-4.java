class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, boolean[]> rows = new HashMap<>();
        Map<Integer, boolean[]> cols = new HashMap<>();
        Map<Integer, boolean[]> boxes = new HashMap<>();
        
        for(int i=0; i<9; i++){
            int boxPtr = -1;
            if(i > 5)
                boxPtr = 5;
            else if (i > 2)
                boxPtr = 2;

            for(int j=0; j<9; j++){
                if(j%3 == 0)
                    boxPtr++;

                if(board[i][j] == '.')
                    continue;
            
                int val = board[i][j] - '0';  // Converts the char to actual int value 

                boolean[] row = rows.getOrDefault(i, new boolean[9]);
                boolean[] col = cols.getOrDefault(j, new boolean[9]);
                boolean[] box = boxes.getOrDefault(boxPtr, new boolean[9]);

                
                if(col[val - 1] || row[val - 1] || box[val - 1]){
                    // System.out.println(i+" & "+j +",boxPtr = "+boxPtr+","+ col[val - 1] + ", " + row[val - 1] + ", " + box[val - 1]);
                    return false;
                }

                row[val - 1] = true;
                col[val - 1] = true;
                box[val - 1] = true;
                // System.out.println(
                //     // Arrays.toString(row) + ", " + Arrays.toString(col) + ", " +
                //      Arrays.toString(box) + "where " + i + "," + j + ",boxPtr = "+boxPtr);

                rows.put(i, row);
                cols.put(j, col);
                boxes.put(boxPtr, box);
            }
        }
        return true;
    }
}
