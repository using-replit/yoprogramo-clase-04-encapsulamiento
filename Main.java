

class Main {
  public static void main(String[] args) {
    

    Nota nota1 = new Nota(2);
    System.out.println(nota1.obtenerValor());
    System.out.println("aprobado? "+ nota1.aprobado());
    System.out.println("desaprobado? " + nota1.desaprobado());
  }
}