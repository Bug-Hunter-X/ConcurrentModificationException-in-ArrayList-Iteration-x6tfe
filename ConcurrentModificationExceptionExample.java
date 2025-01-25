public class ConcurrentModificationExceptionExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("apple", "banana", "cherry"));

        for (String item : list) {
            if (item.equals("banana")) {
                list.remove(item);
            }
        }
        System.out.println(list);
    }
}