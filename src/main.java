public class main {

    public static void main(String[] args) {
        // write your code here
        Fellowship fellowship = new Fellowship();

        Traveller frodo = new Traveller("Frodo");
        fellowship.addMember(frodo);
        frodo.addItem("The One Ring", 0.05);

        Traveller sam = new Traveller("Sam");
        fellowship.addMember(sam);
        sam.addItem("Potatoes", 4);

        Traveller gandalf = new Traveller("Gandalf");
        fellowship.addMember(gandalf);
        gandalf.addItem("Grey Robes", 4.0);
        gandalf.addItem("Dope ass staff", 2.5);

        Traveller bilbo = new Traveller("Bilbo");
        bilbo.addItem("Sting", 2.0);
//        bilbo.addItem("Mithril", 0.5);

        System.out.println("Journey begins.");
        fellowship.printLoad();

//        bilbo.transferItem(frodo, "Sting");
//        bilbo.transferItem(frodo, "Mithril");
//        Some issue with transferring items not at 0 index
        System.out.println("");
        System.out.println("Rivendell");
        fellowship.printLoad();

        gandalf.addItem("White robes", 4.0);

        System.out.println("");
        System.out.println("Two Towers");
        fellowship.printLoad();

    }
}
