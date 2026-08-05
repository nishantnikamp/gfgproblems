class Solution {
    // function should calculate and return the
    // average of all the non negative integers
    // from the arraylist provided in the
    // parameter
    public static double posAverage(ArrayList<Integer> list) {
        int i=0,sum =0,n=0;
        while(i< list.size()){
            if(list.get(i) >=0){
                sum+=list.get(i);
                n = n+1;
            }
            i++;
        }
         ;
        return (double) sum/n;
    }
}