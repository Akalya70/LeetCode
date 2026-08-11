class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long curr_mass=mass;
        for(int asteroid:asteroids){
            if(curr_mass < asteroid){
                return false;
            }
            curr_mass+=asteroid;


        }return true;
    }
}