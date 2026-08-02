class Solution {
    public int totalFruit(int[] fruits) 
    {
     int n=fruits.length;
    int lastfruit=-1;
    int secondlastfruit=-1;
    int lastcount=0;
    int currmax=0;
    int max=0;

    for(int i=0;i<n;i++)
    {
        int fruit=fruits[i];
    
    if(fruit==lastfruit || fruit==secondlastfruit)
    {
        currmax++;
    }
    else
    {
        currmax=lastcount +1;
    }
    if(fruit == lastfruit)
    {
        lastcount++;
    }
    else
    {
        lastcount=1;
        secondlastfruit=lastfruit;
        lastfruit=fruit;
    }
    max=Math.max(max,currmax);
    }
       
       return max;
    }
}