public class SummesionOfArrays {  
    public static void main(String[] args) {  
        //Initialize array  
        int [] arr1 = new int [] {1, 2, 3, 4, 5,6,7,8,9,10}; 
        int [] arr2 = new int [] {11, 12, 13, 14, 15,16,17,18,19,20}; 
        int [] arr3 = new int [10];
        //summesion using for loop           
        for(int i=0;i<arr1.length;i++)
        {
            arr3[i]=arr1[i]+arr2[i];
            System.out.print(arr3[i] + " ");

        }
    }
}