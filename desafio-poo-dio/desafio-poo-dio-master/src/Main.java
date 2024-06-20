import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        EmpresaDeEnsino empresaDeEnsino = new EmpresaDeEnsino();

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

        System.out.println("-------");
        Bootcamp bootcamp2 = new Bootcamp();
        bootcamp2.setNome("Bootcamp QA");
        bootcamp2.setDescricao("Descrição Bootcamp QA");
        bootcamp2.getConteudos().add(curso1);
        bootcamp2.getConteudos().add(curso2);
        bootcamp2.getConteudos().add(mentoria);

        Dev devElksandro = new Dev();
        devElksandro.setNome("Elksandro");
        devElksandro.inscreverBootcamp(bootcamp2);
        System.out.println("Conteúdos Inscritos Elksandro:" + devElksandro.getConteudosInscritos());
        devElksandro.progredir();
        devElksandro.progredir();
        devElksandro.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Elksandro:" + devElksandro.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Elksandro:" + devElksandro.getConteudosConcluidos());
        System.out.println("XP:" + devElksandro.calcularTotalXp());

        System.out.println("\n" + empresaDeEnsino);
        System.out.println("Quantidade de bootcamp: " + empresaDeEnsino.quantidadeDeBootcamp());

    }

}
