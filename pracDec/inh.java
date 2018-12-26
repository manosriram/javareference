//----- Hierarical -----
class Processor {
    Processor() {
        System.out.println("Base class called!!");
    }
}

class GenOne extends Processor {
    GenOne() {
        System.out.println("Gen one derived from Base con called!!");
    }
}
// ----- Hierarical -----

class GenTwo extends Processor {
    GenTwo() {
        System.out.println("Gen two derived from Base con called!!");
    }
}

class inh {
    public static void main(String args[]) {
        GenTwo o = new GenTwo();
    }
}