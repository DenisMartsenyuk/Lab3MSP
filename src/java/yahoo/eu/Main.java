package yahoo.eu;

/**
 * Fuckup counter: 100500
 */
public class Main {

    /**
     * Ну это просто мейн, ничего интересного.
     * {@code Чё смотришь то, ничего интересного тут нет. Сказано же было...}
     * @param args Аргументы, ну тут типа надо просто. Не трогать - без этого ломается
     */
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.getCodePhrase());
    }

    /**
     * Приветствие гопников из Купчино.
     * @return Фраза, которой полагается встречать гостей на великой станции метро "Купчино"
     */
    public String getCodePhrase() {
        return "Hello, epta";
    }
}
