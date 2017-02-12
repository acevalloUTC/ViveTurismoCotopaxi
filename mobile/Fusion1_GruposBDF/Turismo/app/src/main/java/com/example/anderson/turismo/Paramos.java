package com.example.anderson.turismo;

public class Paramos {
    private String nombre;
    private String descripcion;
    private int idDrawable;

    public Paramos(String nombre, int idDrawable,String Descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.idDrawable = idDrawable;
    }

    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }

    public int getIdDrawable() {
        return idDrawable;
    }

    public int getId() {
        return nombre.hashCode();
    }

    public static Paramos[] ITEMS = {
            new Paramos("APAHUA", R.drawable.foto1,"descripcion"),
            new Paramos("YANARUMI", R.drawable.foto2,"descripcion"),
            new Paramos("TICSIJUCHI", R.drawable.foto3,"descripcion"),
            new Paramos("TEJAR", R.drawable.foto4,"descripcion"),
            new Paramos("SAQUIHUA", R.drawable.foto5,"descripcion"),
            new Paramos("SAGUATOA", R.drawable.foto6,"descripcion"),
            new Paramos("PUTZALAHUA", R.drawable.foto7,"descripcion"),
            new Paramos("PEÑAS BLANCAS", R.drawable.foto8,"descripcion"),
            new Paramos("MULALO", R.drawable.foto9,"descripcion"),
            new Paramos("MORURCO", R.drawable.foto10,"descripcion"),
            new Paramos("JITIO", R.drawable.foto11,"descripcion"),
            new Paramos("EL CHIVO", R.drawable.foto12,"descripcion"),
            new Paramos("PUCARA", R.drawable.foto13,"descripcion"),
            new Paramos("CRUZ BLANCA", R.drawable.foto14,"descripcion"),

    };

    /**
     * Obtiene item basado en su identificador
     *
     * @param id identificador
     * @return Paramos
     */
    public static Paramos getItem(int id) {
        for (Paramos item : ITEMS) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }
}
