public class App {

    static boolean iwillNotCheat = false;
    static boolean iWillWin = true;

    public static void main(String[] args) throws Exception {
        // Agreement
        // Preconditon

        assert iwillNotCheat == false : "i cheated ";

        enterCompetition();

        assert iWillWin == true : " because i cheated";
    }

    static void enterCompetition() {
        iWillWin = true;

    }
}
