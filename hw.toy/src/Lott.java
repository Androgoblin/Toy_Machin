public class Lott {
    public static void main(String[] args) {
        ToyStore store = new ToyStore();

        Toy toy_1 = new Toy(1, "Гарри Потер", 5, 10);
        Toy toy_2 = new Toy(2, "Лего", 20, 40);
        Toy toy_3 = new Toy(3, "Хулахуп", 15, 30);
        Toy toy_4 = new Toy(4, "Дюймовочка", 11, 22);
        Toy toy_5 = new Toy(5, "Монополия", 8, 16);
        Toy toy_6 = new Toy(6, "Лопата", 30, 60);
        Toy toy_7 = new Toy(7, "Барби", 17, 34);

        store.addToy(toy_1);
        store.addToy(toy_2);
        store.addToy(toy_3);
        store.addToy(toy_4);
        store.addToy(toy_5);
        store.addToy(toy_6);
        store.addToy(toy_7);

        store.changeToyFrequency(1, 30);
        store.startRaffle();

        Toy winning = store.getPrizeToy();
        if (winning != null) {
            System.out.println("Вы выйграли: " + winning.getName());
        }

    }
}