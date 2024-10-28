public class Proj05Runner {
    // runA method: Accepts a String and appends the student's name
    public static String runA(String strA) {
        return strA + "Brian Rotich"; // Your name is added here
    }

    // runB method: Accepts a StringBuffer and appends the student's name
    public static StringBuffer runB(StringBuffer strBufA) {
        strBufA.append(" Brian Rotich"); // Your name is added here
        return strBufA; // Return the same StringBuffer object
    }
}
