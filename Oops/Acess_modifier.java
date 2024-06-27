public class Acess_modifier {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        b1.name = "dtd";
        b1.setPass("satyam");
    }

    static class Bank {
        public String name;
        private String password;

        void setPass(String newPass) {
            password = newPass;
        }
    }
}
