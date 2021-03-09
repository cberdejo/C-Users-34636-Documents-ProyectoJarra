public Jarra (){

    private int capacidad;
    private int cantidad;

    public Jarra(){
        capacidad =0;
        cantidad=0;
        }

        public Jarra (int c, int n){

        capacidad = c;
        cantidad =n;
        }

        public int cantidad();
        public int capacidad();
        public boolean llena();
        public boolean vacia();
        public void llenaDesde (Jarra j);
        public toString();

}