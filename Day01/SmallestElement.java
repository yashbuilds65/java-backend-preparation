public class SmallestElement{
    public static void main(String []args){
        int arr []= {11,10,20,15,25,58,10};
        int smallest,i;
        smallest=arr[0];
        for(i=0;i<arr.length;i++){
        if(arr[i]<smallest)
        {
            smallest =arr [i];
        }
    }
    System.out.println("smallest number is="+smallest);
}
}
