import java.util.ArrayList;

public class BalancingBrackets {
    public static void main(String[] args) {
        System.out.println(isBalanced("a = [(b + c) * 8] / (d - 2)"));
    }
    public static boolean isBalanced(String s) {
        ArrayList<Character> list = new ArrayList<>();
        if(s.length()<100000 && s.length()>=1) {
            char[] array = s.toCharArray();
            for (char c : array) {
                switch (c) {
                    case '(':
                    case ')':
                    case ']':
                    case '[':
                    case '}':
                    case '{':
                        list.add(c);
                        continue;
                    default:
                        break;
                }
            }
            if(list.size()%2==0){
                return true;
            }
        }
        return false;
    }
    public boolean aaa(ArrayList<Character> list){
        for (int i = 1; i < list.size()/2; i++) {
            switch(list.get(i-1)){
                case '(':
                    if (list.get(list.size()-i)!=')') return false;
                    break;
                case '{':
                    if (list.get(list.size()-i)!='}') return false;
                    break;
                case '[':
                    if (list.get(list.size()-i)!=']') return false;
                    break;
            }
        }
        return true;
    }
}