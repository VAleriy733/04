// произвольный массив чисел с плавающей точкой отсортироваННЫЙ по убыванию.
public class Main {
    public static void main(String[] args) {
        int st = 4; // количество строк в масиве
        float[] array = new float[st];
        for (int i = 0; i < st; i++) {
            //=========================================
            float a = (int) (Math.random() * (60));
            float z = a / ++a * 10 + a; //  случайное число с плавоющей точкой для заполнения масива через цыкл
            //=========================================
            array[i] = z;
        }
        // функцыя вывода масива на экран
        for (int e = 0; e < array.length; e++) {
            // функцыя переборки масива по убыванию
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    float c = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = c;
                }
            }
            System.out.println(array[e]);
        }
    }
}