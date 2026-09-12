class MascotaVirtual{
    public String color;
    private Integer nombre;
    public String misiones;
    public String comer();
    public String jugar() ;
    public Integer energia;

    public MascotaVirtual(String nombreElegido){

        nombre=nombreElegido;
    energia=100;

    System.out.print ("Bienvenido al mundo");
    System.out.println(nombreElegido);

    }
    

    public void saltar(){
        System.out.printl(x:"la mascota esta saltando");
        energia= energia - 5;

        System.out.print (x:"El nivel de energia bajo a horas");
        System.out.println(energia);

}

 public void saltar(){
     System.out.printl(x:"la mascota esta corriendo");
     energia= energia - 9;
     System.out.print (x:"El nivel de energia bajo a horas");
     System.out.println(energia);

 }

  public void saltar(){
     System.out.printl(x:"la mascota esta durmiendo");
     energia= energia + 10;
     System.out.print (x:"El nivel de energia bajo a horas");
     System.out.println(energia);

  }

}
    


