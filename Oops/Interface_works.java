

class Inteface_works{
    public static void main(String[] args) {
        Rook r1 = new Rook();
        r1.moves();
    }
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("Can moves all direction");
    }
}

class King implements ChessPlayer{
   public void moves(){
        System.out.println("Can move all direction but only one step at a time");
    }
}

class Rook implements ChessPlayer{
   public void moves(){
        System.out.println("Can move all direction ");
    }
}