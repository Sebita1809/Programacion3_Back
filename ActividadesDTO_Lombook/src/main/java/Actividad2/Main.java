package Actividad2;

public class Main {
    public static void main(String[]args){

        Usuario usuario = Usuario.builder()
                .id(1)
                .nombre("Martin")
                .email("martin@gmail.com").build();

        Usuario usuario1 = Usuario.builder()
                .id(2)
                .nombre("José")
                .email("jose@gmail.com")
                .build();

        System.out.println(usuario);
        System.out.println(usuario1);
    }
}
