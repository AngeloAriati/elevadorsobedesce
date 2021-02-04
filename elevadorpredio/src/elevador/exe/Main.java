package elevador.exe;

public class Main {
    public static void main(String[] args) {
        Elevador angelo = new Elevador(3, 9, 15, 14);
        angelo.subir();
        angelo.subir();
        angelo.subir();
        angelo.subir();
        angelo.sai();
        angelo.sai();
        angelo.sai();
        angelo.sai();
        angelo.sai();

        System.out.println(angelo.pessoas);
        System.out.println(angelo.andares);

    }
}
