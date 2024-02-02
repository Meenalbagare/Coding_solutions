//LINEAR SEARCH

public class arrays{
    public static int search(int num[],int key){
        for(int i=0;i<num.length;i++){
            if (num[i]==key){
                return key;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={1,2,3};
        System.out.print(search(arr,20));
    }
}