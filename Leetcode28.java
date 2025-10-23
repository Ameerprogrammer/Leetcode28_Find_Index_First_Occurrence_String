class Solution {
    public int strStr(String haystack, String needle) {
        
        //two pointers needed
        int i = 0;
        int j = 0;

        //make the pointers loop over the string
        while(i < haystack.length() && j < needle.length()) {

            //bookmark where we start checking this potential match
            int start = i;

            //move both pointers forward as long as the letters match
            while(i < haystack.length() && j < needle.length() && haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            }

            //if we finished the small string successfully, we found it, return where we started
            if(j == needle.length()) {
                return start;
            }
            
            i = start + 1; //try next spot in haystack
            j = 0;  //start needle from beginning
        }

        return -1;
    }
}