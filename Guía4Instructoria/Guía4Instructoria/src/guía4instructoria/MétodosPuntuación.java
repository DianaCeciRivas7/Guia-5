package guía4instructoria;

public class MétodosPuntuación {

    /*
    POO: la programacion orientada a objetos es una programacion con objetos, jajajajaja xD
    la cosa es que  su principal idea es reciclar codigo repetitivo, es decir codigo que ocupas varias veces se
    debe hacer aparte en un metodo y ocuparlo cuando quieras.
    En este caso la utilizamos para hacer metodos getter propios de puntuaciones por ciertos criterios.
    En fin, la POO en este caso no es codigo repetitivo sino hacer metodos propios para resolver el problema planteado.
    los parametros no son en si una variable, sino mas bien valores que no existen hasta al ejecutarse y pasarle
    un valor por medio del parameto al escribir el metodo.
    La POO hace plantillas de metodos que podemos ocupar.
     */
    public int refDeMarca(String marca) {
        if (marca.equals("NEXUS") || marca.equals("LENOVO") || marca.equals("HUAWEI") || marca.equals("SONY") || marca.equals("APPLE")) {
            PuntajeMarca = 4;
        } else if (marca.equals("SAMSUNG") || marca.equals("ALCATEL") || marca.equals("LG")) {
            PuntajeMarca = 3;
        } else {
            PuntajeMarca = 2;
        }
        return PuntajeMarca;
        /*
        La cosa aca es que segun la marca se debe dar un puntaje.
        Este metodo devuelve o retorna el puntaje segun la marca.
        Lo puedes ocupar diciendo que una variable de tipo int es igual a esto en otra clase;
        Ej.:
            int pancho = refDeMarca(marca);
        En el parametro debes pasarle un string que tenga guardado el valor que eligio el usuario de la marca
        Un cmb funciona como un vector y si no me equivoco hay un metodo llamado, getSelectedIndex() el cual te devuelve
        el elemento seleccionado.
        Si te devuelve 0 seria el primero elemento, si te devuelve 1 seria el segundo y asi sucesivamente,
        digo esto para que sepas obtener un valor de un cmb.
         */
    }

    public int rangoPrecio(Double precio) {
        if (precio < 100) {
            PuntajePrecio = 2;
        } else if (precio >= 100 && precio <= 350) {
            PuntajePrecio = 3;
        } else {
            //Aca no hago un if porque en este punto solo podria ser un dato mayor que 350
            PuntajePrecio = 4;
        }
        return PuntajePrecio;
        /*
        Aca es un poco mas de la misma historia, solo que ahora paso de parametro el precio.
        Puedes ocupar este metodo en distintas ocasiones como el anterior.
         */
    }

    public int garantia(int garantia) {
        /*
        Practicamente es hacer un monton de metodos para validar las cosas anteriores de l guia 3
         */
        if (garantia <= 3) {
            PuntajeGarantia = 1;
        } else if (garantia > 3 && garantia <= 6) {
            PuntajeGarantia = 2;
        } else {
            PuntajeGarantia = 4;
        }
        return PuntajeGarantia;
    }

    public int pixelaje(double PixelCamaraPrincipal, double PixelCamaraFrontal, boolean TieneFlash) {
        //La frontal la tomo como la secundaria.
        /*
        Aca voy a reconstruir lo que dice en texto la guia pero en codigo.
         */
        if (PixelCamaraPrincipal <= 5) {
            //Pondre <= 2 porque sino en ambos if no tomaria el 2.
            if (PixelCamaraFrontal <= 2) {
                PuntajePixelaje = 1;
            } else {
                PuntajePixelaje = 2;
            }
        } else if (PixelCamaraPrincipal > 5 && PixelCamaraPrincipal <= 8) {
            //Hay un error en la guia al escribir.
            //Dice dos condiciones que no tendrian logica, en lugar de 1 es 2 en la segunda.
            if (PixelCamaraFrontal <= 2) {
                PuntajePixelaje = 1;
            } else if (PixelCamaraFrontal > 2 && PixelCamaraFrontal < 3) {
                PuntajePixelaje = 2;
            } else {
                PuntajePixelaje = 3;
            }
        } else {
            //De nuevo hay condiciones donde no se tomarian valores en cuenta en la guia.
            if (PixelCamaraFrontal <= 2) {
                PuntajePixelaje = 1;
            } else if (PixelCamaraFrontal > 2 && PixelCamaraFrontal <= 5) {
                PuntajePixelaje = 2;
            } else {
                PuntajePixelaje = 3;
            }
        }

        /*
        Con esto evaluo si tiene flash o no, es decir si tieneFlash es distinto de true significa que nel, no hay flash
        y le quitare un punto de puntaje.
        Ese parametro de tieneFlash es mas bien un estado, en la otra clase deberias hacer lo siguiente.
        Si la checkBox del flash esta seleccionada vuelves una variable boolean en true o caso contrario en false.
        Luego la pasas como parametro a este metodo.
        Creo que el metodo para saber si esta seleccionada una checkBox es nombre.isSelected();
        Que ruido hace
        Un hombre que se quiebra en soledad
        Esa cancion es hermosa :,v
         */
        if (TieneFlash != true) {
            PuntajePixelaje = PuntajePixelaje - 1;
        }
        return PuntajePixelaje;
    }

    /*
    El metodo de Cpu lo iba a hacer pero el cpu no esta validado como lo amerita ese metodo
    tendria que solo admitir pares y los rangos de validaciones deberian ser distintos.
     */
    public int Ram(Double Ram) {
        if (Ram <= 1) {
            PuntajeRam = 0;
        } else if (Ram > 1 && Ram <= 2) {
            PuntajeRam = 2;
        } else if (Ram > 2 && Ram <= 4) {
            PuntajeRam = 4;
        } else {
            PuntajeRam = 6;
        }
        return PuntajeRam;
    }

    /*
    Este metodo sumara los puntajes
     */
    public void CalcularPuntaje() {
        puntaje = PuntajeMarca + PuntajePrecio + PuntajeGarantia + PuntajePixelaje + PuntajeRam;
    }

    public String Inversion() {
        //Aca ejecuto el metodo de calcularPuntaje para solo ejecutar este a la hora de mostrarle al usuario si su inversion es bueno o no
        String impresion;
        CalcularPuntaje();
        if (puntaje <= 7) {
            impresion = "No es buena inversion";
        } else if (puntaje > 7 && puntaje <= 14) {
            impresion = "Inversión de riesgo";
        } else if (puntaje >= 15 && puntaje <= 21) {
            impresion = "Inversion viable";
        } else {
            impresion = "Buena inversion";
        }
        /*
        Como es un metodo de tipo String debo devolver un string
        En este caso es la impresion que quiero que vea el usuario.
        Este metodo lo debes ocupar asi
        JOptionPane.showMessageDialog(null,Inversion());
        Asi muestras lo que retorne esto
         */
        return "Puntaje obtenido:" + puntaje + "\n" + impresion;
    }

    //Privatizo variables porque solo aca las utilizare, si te da error quitale la privatizacion como ella lo hizo conmigo :,v
    private int PuntajeMarca, PuntajePrecio, PuntajeGarantia, PuntajePixelaje, PuntajeRam;
    private double puntaje;
}
