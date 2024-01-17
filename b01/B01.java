class B01 {
    public static void main(String[] args) {
        int i = 99;
        while (true) {
            if (i == 1) {
                System.out.println("1 bottle of beer on the wall, 1 bottle of beer");
                System.out.println("Take one down and pass it around, no more bottles of beer on the wall.");
                System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
                i += 98;
                System.out.println("Go to the store and buy some more, " + i + " bottles of beer on the wall.");
                break;
            } else {
                System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.");
                if (i - 1 == 1) {
                    System.out.println("Take one down and pass it around, 1 bottle of beer on the wall.");
                } else {
                    System.out
                            .println("Take one down and pass it around, " + (i - 1) + " bottles of beer on the wall.");
                }
                i--;
            }
        }
    }
}
