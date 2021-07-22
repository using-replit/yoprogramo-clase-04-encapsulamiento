class Nota {
  private int valorNota;

  public Nota(int valorNota) {
    this.setValorNota(valorNota);
  }

  public int obtenerValor() {
    return this.valorNota;
  }

  public boolean aprobado() {
    return this.valorNota >= 4;
  }

  public boolean desaprobado() {
    return !this.aprobado();
  }

  public void recuperar(int nuevoValorNota) {
    if(nuevoValorNota > this.valorNota) {
      this.valorNota = nuevoValorNota;
    }
  }

  private void setValorNota(int valorNota) {
    if( esValorCorrecto(valorNota)) {
      this.valorNota = valorNota;
    } else {
      Error notaInvalida = new Error("Nota invalida");
      throw(notaInvalida);
    }
  } 
  private boolean esValorCorrecto(int valorNota) {
    return valorNota >=0 && valorNota<= 10;
  }
}