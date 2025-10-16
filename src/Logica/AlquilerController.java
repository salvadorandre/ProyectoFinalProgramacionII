
package Logica;
import Modelos.Alquiler;
import jakarta.persistence.*; 
import java.util.List;
public class AlquilerController {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("AlquilerPU"); 

    public void create(Alquiler alquiler) { 
       EntityManager em = emf.createEntityManager(); 
       
       em.getTransaction().begin();
       em.persist(alquiler);
       em.getTransaction().commit();
       em.close();
    }
    
    public void update(Alquiler alquiler) { 
        EntityManager em = emf.createEntityManager(); 
        em.getTransaction().begin();
        em.merge(alquiler); 
        em.getTransaction().commit();
        em.close();
    }
    
    public void delete(long id) { 
        EntityManager em = emf.createEntityManager(); 
        Alquiler alquiler = em.find(Alquiler.class, id); 
        
        em.getTransaction().begin();
        em.remove(alquiler);
        em.getTransaction().commit();
        em.close();
    }
    
    public Alquiler findById(long id) { 
        EntityManager em = emf.createEntityManager(); 
        Alquiler alquiler = em.find(Alquiler.class,id); 
        em.close();
        return alquiler; 
    }
    
    
    public List<Alquiler> all() { 
       EntityManager em = emf.createEntityManager(); 
       TypedQuery<Alquiler> query = em.createQuery("SELECT e FROM Alquiler e", Alquiler.class); 
       List<Alquiler> alquileres = query.getResultList(); 
       em.close();
      
       return alquileres; 
    }
    
    public List<Alquiler> findByTitle(String title) { 
        EntityManager em = emf.createEntityManager(); 
        
        TypedQuery<Alquiler> query = em.createQuery("SELECT e FROM Alquiler e WHERE e.lib.titulo= :title", Alquiler.class);
        query.setParameter("title", title); 
        List<Alquiler> alquileres = query.getResultList(); 
        em.close();
        return alquileres; 
    }
    
    public List<Alquiler> findByGenero(String genero) { 
        EntityManager em = emf.createEntityManager(); 
        TypedQuery<Alquiler> query = em.createQuery("SELECT e FROM Alquiler e WHERE e.lib.genero = :genero", Alquiler.class); 
        query.setParameter("genero", genero); 
        
        List<Alquiler> alquileres = query.getResultList(); 
        em.close();
        return alquileres; 
    }
    
    public List<Alquiler> findByClient(String client) { 
        
        EntityManager em = emf.createEntityManager(); 
        TypedQuery<Alquiler> query = em.createQuery("SELECT e FROM Alquiler e WHERE e.client.nombre = :client", Alquiler.class); 
        query.setParameter("client", client); 
        List<Alquiler> alquileres = query.getResultList(); 
        em.close();
        return alquileres; 
    }
}
