public class MarksWrapper {
    public static void main(String[] args) {
        String[] input = { "78", "84", "91" };
        Integer total = 0;
        for (String mark : input) total += Integer.valueOf(mark);
        Double average = total / (double) input.length;
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
}
