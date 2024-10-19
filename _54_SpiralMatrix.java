import java.util.ArrayList;
import java.util.List;

public class _54_SpiralMatrix {
    public static void main(String[] args) {
        
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();

        int count = 0;
        int rowLength = matrix.length;
        int colLength = matrix[0].length;
        int sizeOfMatrix = rowLength * colLength;
        int direction = 1;

        int r = 0;
        int c = -1;

        while (count < sizeOfMatrix) {
            for (int i = 0; i < colLength; i++) {
                c += direction;
                res.add(matrix[r][c]);
                count++;
            }

            rowLength--;

            
            for (int i = 0; i < rowLength; i++) {
                r += direction;
                res.add(matrix[r][c]);    
                count++;            
            }

            colLength--;

            direction *= -1;
            
        } 

        return res;
    }
}
