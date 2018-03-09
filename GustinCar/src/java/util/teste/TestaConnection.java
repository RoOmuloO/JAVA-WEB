/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.teste;

import Models.Usuario;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author aluno
 */
public class TestaConnection {
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("connectionPU");
        
        EntityManager em = emf.createEntityManager();
        
        Usuario u = new Usuario("ze", "123", "ze@ze", "nome", 1, new Date(), true);
        
        em.getTransaction().begin();
        em.persist(u);
        em.getTransaction().commit();
        
        System.out.println( "==>"+em.getMetamodel());
    }
}
