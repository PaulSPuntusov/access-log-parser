public class CharToNum {
    public static int charToNum(char x){
        for (int i=48; i<59; i++){
            if (i==x) {
                return (i-48);
            }
        }
        System.out.println("Введен символ вне пределов '0-9' ");
        return -1;
    }
}
