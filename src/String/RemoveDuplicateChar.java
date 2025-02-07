package String;

public class RemoveDuplicateChar {
    public static void main(String[] args) {
        String str = "Programming";
        StringBuilder sb = new StringBuilder();
        for(int i =0;i< str.length();i++) {
            char ch = str.charAt(i);
            int indx = str.indexOf(ch,i+1);
            if(indx == -1){
                sb.append(ch);
            }


        }
        System.out.println(sb);
    }
}
