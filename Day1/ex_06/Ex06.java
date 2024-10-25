public class Ex06 {
    public static void sequence(int nbr) {
        if (nbr < 0) {
            return;
        }

        String current = "1";
        System.out.println(current);

        for (int i = 0; i < nbr; i++) {
            current = nextSequence(current);
            System.out.println(current);
        }
    }

    public static String nextSequence(String sequence) {
        StringBuilder nextSequence = new StringBuilder();

        int count = 1;
        char currentChar = sequence.charAt(0);

        for (int i = 1; i < sequence.length(); i++) {
            if (sequence.charAt(i) == currentChar) {
                count++;
            }
            else {
                nextSequence.append(count).append(currentChar);
                count = 1;
                currentChar = sequence.charAt(i);
            }
        }

        nextSequence.append(count).append(currentChar);
        return nextSequence.toString();
    }
}
