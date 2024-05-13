class SeparateDigits {
    public int[] separateDigits(int[] nums) {
        List<Integer> temp = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            String s = "" + nums[i];
            if(s.length() == 1){
                temp.add(nums[i]);
            }else{
                for(int j=0; j<s.length(); j++){
                    char ch = s.charAt(j);
                    String str = ch + "";
                    temp.add(Integer.parseInt(str));
                }
            }
        }
        int[] out = new int[temp.size()];
        for(int i=0; i<out.length; i++){
            out[i] = temp.get(i);
        }
        return out;
    }
}
