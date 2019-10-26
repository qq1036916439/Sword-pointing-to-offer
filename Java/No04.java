/**
 * 请实现一个函数，把字符串中的每个空格替换成"%20"。
 * 例如输入"We are happy"，则输出"We%20are%20happy"
 */

public class No04 {

    public static void main(String[] args) {
        String str = "We are happy";
        char[] charArray = str.toCharArray();
        System.out.println(change1(charArray));
    }

    private static String change(char[] charArray) {
        int n = charArray.length;
        //进行
        int count = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ' ') {
                count++;
            }
        }
        if (count == 0) {
            return null;
        }
        char[] temp = new char[n + 2 * count];
        int j = n + 2 * count - 1;
        int i = n - 1;
        while (i >= 0) {
            if (charArray[i] == ' ') {
                temp[j] = '0';
                temp[j - 1] = '2';
                temp[j - 2] = '%';
                j = j - 3;
            } else {
                temp[j] = charArray[i];
                j--;
            }
            i--;
        }
        return new String(temp);
    }

    public static String change1(char[] chars) {
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                count++;
            }
        }
        int k = 0;
        char[] chars1 = new char[chars.length + (count * 3)];
        for (int j = 0; j < chars.length; j++) {
            if (chars[j] == ' ') {
                chars1[k] = '0';
                chars1[k+1] = '2';
                chars1[k+2] = '%';
                k+=3;
            } else {
                chars1[k] = chars[j];
                k++;
            }
        }
        return new String(chars1);
    }
}
