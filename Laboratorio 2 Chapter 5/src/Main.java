import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int arr [][] = {{1,3,5},{7,9,11},{13,15,17}};
        int target=15;
        System.out.print(Arrays.toString(mat2D(arr, target)));

        }

        public static int[] mat2D(int arr[][],int target){
            for(int i=0;i<arr.length;i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j] == target) {
                        System.out.print("The target has been found in the matrix: ");
                        return new int[] {i,j};
                    }

                }
            }
            System.out.print("The target has not been found in the matrix: ");
            return new int[] {-1,-1};
        }
    }
