public class ReverseWordsWithSameVowelCount {
    public static void main(String[] args) {
        String str = "book is nice";
        ReverseWordsWithSameVowelCount rw = new ReverseWordsWithSameVowelCount();
        String res=rw.reverseWords(str);
        System.out.println(res);
    }

    public String reverseWords(String str) {
        String sArr[] = str.toLowerCase().split(" ");

        int count = 0;
        String s1 = sArr[0];

        String result="";
        result+=sArr[0];

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o' || s1.charAt(i) == 'u') {
                count++;
            }
        }

        for (int i = 1; i < sArr.length; i++) {
            String temp = sArr[i];
            int tempCount = 0;
            for (int j = 0; j < temp.length(); j++) {
                if (temp.charAt(j) == 'a' || temp.charAt(j) == 'e' || temp.charAt(j) == 'i' || temp.charAt(j) == 'o' || temp.charAt(j) == 'u') {
                    tempCount++;
                }
            }

            if(count==tempCount){
                result+=" ";
                for(int k=temp.length()-1;k>=0;k--){
                    result+=temp.charAt(k);
                }
            }else{
                result+=" "+temp;
            }
        }

        return result;

    }
}
