class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> rad = new LinkedList<>(),dire = new LinkedList<>();
        int n=senate.length();
        for(int i=0;i<n;i++){
            if(senate.charAt(i)=='R'){
                rad.add(i);
            }else{
                dire.add(i);
            }
        }
        while(!rad.isEmpty() && !dire.isEmpty()){
            if(rad.element()<dire.element()){
                rad.add(n++);
            }else{
                dire.add(n++);
            }
            rad.remove();
            dire.remove();
        }
        return (rad.isEmpty())?"Dire":"Radiant";
    }
}
