class Main {
    public static void main(String[] args) {
        System.out.println("Это добавлено в ветке main");
        greetInDifferentLanguages();
        int sum = addNumbers(5, 10);
        System.out.println("Сумма чисел: " + sum);
    }

    public static void greetInDifferentLanguages() {
        System.out.println("\nПриветствие на разных языках:");
        System.out.println("English: Hello!");
        System.out.println("Español: ¡Hola!");
        System.out.println("Français: Bonjour!");
    }

    public static int addNumbers(int a, int b) {
        return a + b;
    }
}