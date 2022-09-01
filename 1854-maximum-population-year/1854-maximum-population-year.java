class Solution {
    public int maximumPopulation(int[][] logs) {
        
        
        int arr[] = new int[101];
        int minYear = 1950;
        
        for(int timeSpan[] : logs){
            
            for(int year = timeSpan[0]-minYear; year < timeSpan[1]-minYear; year++ ){
                
                arr[year] += 1;  
            }
            
        }
        
        int earlierYear =0;
        int maxPopulation=0;
        
        
        for(int i=0; i < arr.length; i++){
            
            if(arr[i] > maxPopulation) {
                
                earlierYear= i;
                maxPopulation = arr[i];
            }
            
        }
        
        return earlierYear+minYear;
        
        
    }
}