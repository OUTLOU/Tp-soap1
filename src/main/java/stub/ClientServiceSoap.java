package stub;

import java.util.List;

public class ClientServiceSoap {

    public class clientServiceSoap {
        public static void main(String[] args) {
            EtudiantWService wsdl = new ServiceWeb().getEtudiantWServicePort();
            List<Eleve> liste = wsdl.listStudents();
            liste.forEach(elm -> {
                System.out.println(elm.getNom()
                        + "----" + elm.getPrenom());
            });
        }
    }
}

