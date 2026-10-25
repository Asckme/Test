package exercise.nine_forteen;


import java.util.Scanner;

public class Demo {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("First:");
        testOne();

        System.out.println("Second");
        testTwo();

        System.out.println("Third");
        testThree();

    }

    public static void testOne(){
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] >= 'a'&& chars[i] <= 'z'){
                chars[i]-= 'a'-'A';
            }
            else if(chars[i] >= 'A' && chars[i]<= 'Z'){
                chars[i]+= 'a'-'A';
            }
        }
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
    }

    public static void testTwo(){
        String str = scanner.nextLine();
        System.out.println(str.matches("^(?=.*[a-z])(?=.*[0-9])(?=.*[~!@#$*])[A-Z][a-zA-Z0-9~!@#$*]{7,15}$"));
    }

    public static void testThree(){
        String str = scanner.nextLine();
        if (str.length()>16)return ;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]>='A'&&chars[i]<='Z'){
                chars[i] = (char)((chars[i]-'A'+5)%26+'A');
            }//% 取模：求余数。数字 % 26 的结果一定落在 0 ~ 25 之间。
//            没有超界：5 % 26 = 5，不变
//            超界的 ：30 % 26 = 4，余数是 4。也就是 30 号等价于 4 号。
            //+ 'A' → 把 0~25 的序号，转回 ASCII 字符
            else if(chars[i]>='a'&&chars[i]<='z'){
                chars[i] = (char)((chars[i]-'a'+5)%26+'a');
            }
            else if(chars[i]>='0'&&chars[i]<='9'){
                chars[i] = (char)((chars[i]-'0'+5)%10+'0');
            }
        }
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
    }

}
