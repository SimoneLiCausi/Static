public class Tester {
    public static void main(String[] args) {
        //define a tester class where you:
        //create 2 new Employee objects
        //create their new 2 Badge
        //show to the user the 2 employees' badge details

        Employee employee1 = new Employee("Simone", "Li Causi", "R.Candida 27");
        Employee employee2 = new Employee("Tonio", "Cartonio", "Fantabosco 7");
        Badge employee1Badge = new Badge(employee1);
        Badge employee2Badge = new Badge(employee2);

        employee1Badge.showBadgeDetails();
        employee2Badge.showBadgeDetails();

    }
}
