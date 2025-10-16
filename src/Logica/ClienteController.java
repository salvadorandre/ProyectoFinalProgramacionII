
package Logica;

import Modelos.Cliente;
import jakarta.persistence.*; 
import java.util.List;
public class ClienteController {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("AlquilerPU"); 
    
    
    public void create(Cliente cliente) { 
        EntityManager em = emf.createEntityManager(); 
        em.getTransaction().begin();
        em.persist(cliente);
        em.getTransaction().commit();
        em.close();
       
    }
    
    public void edit(Cliente cliente) { 
        EntityManager em = emf.createEntityManager(); 
        em.getTransaction().begin();
        em.merge(cliente); 
        em.getTransaction().commit();
        em.close();
    }
    
    public void delete(long id) { 
        EntityManager em  = emf.createEntityManager(); 
        Cliente cliente = em.find(Cliente.class, id); 
        em.getTransaction().begin();
        em.remove(cliente); 
        em.getTransaction().commit(); 
        em.close();
    }
    
    public Cliente findById(long id) { 
        EntityManager em = emf.createEntityManager(); 
        Cliente cliente = em.find(Cliente.class, id); 
        em.close();
        return cliente; 
    }
    public List<Cliente> all() { 
        EntityManager em = emf.createEntityManager(); 
        TypedQuery<Cliente> query = em.createQuery("SELECT e FROM Cliente e", Cliente.class); 
        List<Cliente> clientes = query.getResultList(); 
        em.close();
        return clientes; 
    }
    
}
