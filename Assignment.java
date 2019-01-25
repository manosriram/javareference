import java.io.*;
import java.util.Scanner;

interface Cart {
    public void additems();
}

interface Categories {
    public void list();
}

class noEr extends Exception {
    noEr(String s) {
        System.out.println(s);
    }
}

class Shopping {
    Scanner in = new Scanner(System.in);
    int t, i;
    static int sum = 0;
    static int index = 0;
    String Cart[] = new String[30];
    int PriceCart[] = new int[30];
    String Categories[] = { "Electronics", "Furniture", "Appliances" };

    String Electronics[] = { "Mobiles", "TV", "Monitors" };
    String Mobiles[] = { "AppleTV", "Samsung", "MI" };
    int MobilePrice[] = { 75000, 25000, 15000 };
    String TV[] = { "Samsung", "Bravia", "MiTV" };
    int TvPrice[] = { 150000, 200000, 75000 };
    String Monitors[] = { "hp", "Samsung", "Dell" };
    int MonitorPrice[] = { 25000, 40000, 10000 };

    String Furniture[] = { "Sofa-Set", "Dinner Table" };
    int FurnPrices[] = { 90000, 140000 };

    String Appliances[] = { "Microwave Oven", "Iron Box", "UPS" };
    int AppliancePrices[] = { 9000, 8000, 13000 };

    public void additems() {
        System.out.println();
        for (t = 0; t < index; t++) {
            System.out.println(Cart[t] + " - " + PriceCart[t]);
        }
        System.out.println("---------------------------------------------------------");
        System.out.println("Total : " + sum);
        System.out.println("---------------------------------------------------------");
        System.out.println();
    }

    void displayList() {
        System.out.println();
        for (t = 0; t < index; t++) {
            System.out.println("Item " + (t + 1) + " : " + Cart[t]);
        }
        System.out.println();
    }

    void displayPrice() {
        System.out.println();
        for (t = 0; t < index; t++) {
            System.out.println("Item " + (t + 1) + " : " + PriceCart[t]);
        }
        System.out.println();
    }

    public void list() {
        int op, op2, r = 0;
        while (r == 0) {
            try {
                System.out.println();
                System.out.println(
                        "1.Electronics\n2.Furniture\n3.Appliances\n4.Show Cart\n5.Display Item Prices in the Cart.\n6.Show Bill and EXIT");
                System.out.println();
                int option = in.nextInt();
                if (option > 6)
                    throw new noEr("Please Enter within the given options...");
                switch (option) {
                case 1:
                    for (t = 0; t < Electronics.length; t++) {
                        System.out.println(Electronics[t]);
                    }
                    op = in.nextInt();
                    if (op == 1) {
                        for (t = 0; t < Mobiles.length; t++) {
                            System.out.println(Mobiles[t]);
                        }
                        op2 = in.nextInt();
                        if (op2 == 1) {
                            Cart[index] = Mobiles[0];
                            PriceCart[index] = MobilePrice[0];
                            index++;
                            System.out.println("Added to Cart!");
                        } else if (op2 == 2) {
                            Cart[index] = Mobiles[1];
                            PriceCart[index] = MobilePrice[1];
                            index++;
                            System.out.println("Added to Cart!");
                        } else if (op2 == 3) {
                            Cart[index] = Mobiles[2];
                            PriceCart[index] = MobilePrice[2];
                            index++;
                            System.out.println("Added to Cart!");
                        } else
                            throw new noEr("Please Enter within the given options...");
                    } else if (op == 2) {
                        for (t = 0; t < TV.length; t++) {
                            System.out.println(TV[t]);
                        }
                        op2 = in.nextInt();
                        if (op2 == 1) {
                            Cart[index] = TV[0];
                            PriceCart[index] = TvPrice[0];
                            index++;
                            System.out.println("Added to Cart!");
                        } else if (op2 == 2) {
                            Cart[index] = TV[1];
                            PriceCart[index] = TvPrice[1];
                            index++;
                            System.out.println("Added to Cart!");
                        } else if (op2 == 3) {
                            Cart[index] = TV[2];
                            PriceCart[index] = TvPrice[2];
                            index++;
                            System.out.println("Added to Cart!");
                        } else
                            throw new noEr("Please Enter within the given options...");
                    } else if (op == 3) {
                        for (t = 0; t < Monitors.length; t++) {
                            System.out.println(Monitors[t]);
                        }
                        op2 = in.nextInt();
                        if (op2 == 1) {
                            Cart[index] = Monitors[0];
                            PriceCart[index] = MonitorPrice[0];
                            index++;
                            System.out.println("Added to Cart!");
                        } else if (op2 == 2) {
                            Cart[index] = Monitors[1];
                            PriceCart[index] = MonitorPrice[1];
                            index++;
                            System.out.println("Added to Cart!");
                        } else if (op2 == 3) {
                            Cart[index] = Monitors[2];
                            PriceCart[index] = MonitorPrice[2];
                            index++;
                            System.out.println("Added to Cart!");
                        } else
                            throw new noEr("Please Enter within the given options...");
                    }
                    break;
                case 2:
                    for (t = 0; t < Furniture.length; t++) {
                        System.out.println(Furniture[t]);
                    }
                    op = in.nextInt();
                    if (op == 1) {
                        Cart[index] = Furniture[0];
                        PriceCart[index] = FurnPrices[0];
                        index++;
                        System.out.println("Added to Cart!");
                    } else if (op == 2) {
                        Cart[index] = Furniture[1];
                        PriceCart[index] = FurnPrices[1];
                        index++;
                        System.out.println("Added to Cart!");
                    }
                    break;
                case 3:
                    for (t = 0; t < Appliances.length; t++) {
                        System.out.println(Appliances[t]);
                    }
                    op = in.nextInt();
                    if (op == 1) {
                        Cart[index] = Appliances[0];
                        PriceCart[index] = AppliancePrices[0];
                        index++;
                        System.out.println("Added to Cart!");
                    } else if (op == 2) {
                        Cart[index] = Appliances[1];
                        PriceCart[index] = AppliancePrices[1];
                        index++;
                        System.out.println("Added to Cart!");
                    } else if (op == 3) {
                        Cart[index] = Appliances[2];
                        PriceCart[index] = AppliancePrices[2];
                        index++;
                        System.out.println("Added to Cart!");
                    } else
                        throw new noEr("Please Enter within the given options...");
                    break;

                case 4:
                    displayList();
                    break;

                case 5:
                    displayPrice();
                    break;

                case 6:
                    for (t = 0; t < index; t++) {
                        sum += PriceCart[t];
                    }
                    additems();
                    r = 1;
                    break;
                default:
                    System.out.println("Please Select within the Given Options...");
                }
                // System.out.println("Added to Cart!");
            } catch (noEr e) {
                System.out.println("");
            }
        }
    }
}

class Assignment {
    public static void main(String args[]) {
        Shopping o = new Shopping();
        o.list();
    }
}