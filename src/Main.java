import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Certificado;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.Projeto;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição do curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso collections java");
        curso2.setDescricao("Descrição do curso collections java");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descrição da mentoria java");
        mentoria.setData(LocalDate.now());

        Projeto projeto = new Projeto();
        projeto.setTitulo("Projeto de Java");
        projeto.setDescricao("Descrição do projeto de Java"); 

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(projeto);

        Dev dev1 = new Dev();
        dev1.setNome("Daniele Soares");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos por " + dev1.getNome() + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        dev1.avaliarConteudo(curso1, 5, "Ótimo curso!");
        System.out.println("-");
        System.out.println("Conteúdos Concluídos por " + dev1.getNome() + dev1.getConteudosConcluidos());
        System.out.println("XP:" + dev1.calcularTotalXp());

        Certificado certificadoDev1 = dev1.emitirCertificado(bootcamp);
        if (certificadoDev1 != null) {
            System.out.println(certificadoDev1);
        }

        System.out.println("--------------------------------------------------------------------------------------");

        Dev dev2 = new Dev();
        dev2.setNome("Robson Altmann");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos por " + dev2.getNome() + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        dev2.progredir(); 
        dev2.avaliarConteudo(curso2, 10, "Bom curso, mas poderia ser mais detalhado.");
        dev2.avaliarConteudo(mentoria, 10, "Mentoria excelente!");
        dev2.avaliarConteudo(projeto, 10, "Projeto desafiador e enriquecedor.");
        System.out.println("-");
        System.out.println("Conteúdos Concluídos por " + dev2.getNome() + dev2.getConteudosConcluidos());
        System.out.println("XP:" + dev2.calcularTotalXp());

        Certificado certificadoDev2 = dev2.emitirCertificado(bootcamp);
        if (certificadoDev2 != null) {
            System.out.println(certificadoDev2);
        }
    }
}
