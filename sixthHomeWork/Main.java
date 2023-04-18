/**
 * Стартовый класс.
 */
public class Main {

    /**
     * Пример входной строки.
     */
    public static final String INPUT_STRING = "Невежество есть мать промышленности, как и суеверий." +
            " Сила размышления и воображения подвержена ошибкам; но привычка двигать рукой или ногой" +
            " не зависит ни от того, ни от другого. Поэтому мануфактуры лучше всего процветают там, где" +
            " наиболее подавлена духовная жизнь, так что мастерская может рассматриваться как машина," +
            " части которой составляют люди.";

    /**
     * Шаблон поиска символов в строке.
     */
    public static final String TEMPLATE = " ";

    /**
     * Точка входа в приложение.
     *
     * @param args аргументы командной строки.
     */
    public static void main(String[] args) {

        long current = System.currentTimeMillis();

        int sum = 0;

        /*
         * Изменил ограничение для i и сделал так, чтобы проверялось за раз сразу два символа.
         */
        for (int i = 0; i < INPUT_STRING.length()-1; i+=2) {
            if (Matcher.match(INPUT_STRING.charAt(i) + String.valueOf(INPUT_STRING.charAt(i+1)), TEMPLATE)) {
                sum++;
            }
        }
        System.out.println("Count of space: " + sum);

        System.out.println("Time: " + (System.currentTimeMillis() - current) / 1000 + " c.");

    }
}
