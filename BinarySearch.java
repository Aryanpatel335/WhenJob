public class BinarySearch{

    int binSearch(int arr[], int x){
        int l = 0;
        int r = arr.length - 1;
        
        while(l <= r){
            int mid = l + (r - l)/2;
            int n = arr[mid];

            if(n == x){
                return mid;

            }
            if(n < x){
                l = mid + 1;
            }
            else{
                r = mid - 1;

            }

        }

        return -1;
    }
    public static void main(String[] args){
        BinarySearch bin = new BinarySearch();
        int arr[] = {2, 3, 4, 10, 40};

        System.out.println(bin.binSearch(arr, 3));
    }

}
