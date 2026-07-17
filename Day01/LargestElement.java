public class LargestElement{
    public static void main(String []args){
        int arr []= {11,10,20,15,25,58,10};
        int largest,i;
        largest=arr[0];
        for(i=0;i<arr.length;i++){
        if(arr[i]>largest)
        {
            largest =arr [i];
        }
    }
    System.out.println("largest number is="+largest);
}
}
