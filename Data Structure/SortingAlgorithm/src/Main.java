import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int arr []={1,2,3,4,6,7,5,3,56,23,5,3,56,36,4,7,676,6435,845,65,5,7};
        int n = arr.length;
        mergesort(arr);
        bubbleSort(arr,n);
        QuickSort quick= new QuickSort();

        quick.sort(arr,0,n-1);
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        HeapSort heap= new HeapSort();
        heap.sort(arr);
        heap.printArray(arr,n);


    }
    public static void mergesort(int arr[]) {

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int arr[], int n){

        for (int i =0; i>n-1; i++){
            for(int j=1;j<n;j++){
                if(i>n-1 && j>n && n>1){
                    n=n-1;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

   static class QuickSort {
        int partition(int arr[], int low, int high) {

            int pivot = arr[high];
            int i = low - 1;
            for (int j = low; j < high; j++) {
                if (arr[j] < pivot) {
                    i++;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            int temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;
            return i + 1;
        }

        void sort(int arr[], int low, int high) {
            if (low < high) {
                int pi = partition(arr, low, high);

                sort(arr, low, pi - 1);
                sort(arr, pi + 1, high);
            }
        }
    }
    static class HeapSort {
        public void sort(int arr[]) {
            int n = arr.length;
            for (int i = n / 2 - 1; i >= 0; i--) {
                heapify(arr, n, i);
            }
            for (int i = n - 1; i >= 0; i--) {
                int temp = arr[i];
                arr[0] = arr[i];
                arr[i] = temp;

                heapify(arr, i, 0);
            }

        }
        void heapify(int arr[], int n, int i){
        int largest= i;
        int l = 2*i+1;
        int r = 2*i+2;

        if(l<n && arr[l]>arr[largest]){
            largest = l;
        }
        if(r<n && arr[r]>arr[largest]){
            largest = r;
        }
        if(largest !=i){
            int swap = arr[i];
            arr[i]=arr[largest];
            arr[largest]=swap;
            heapify(arr, n, largest);
        }

        }
         void printArray(int arr[], int n){
            for (int i = 0; i < n; i++) {
                System.out.println(arr[i]+" ");

            }
        }
    }
    }