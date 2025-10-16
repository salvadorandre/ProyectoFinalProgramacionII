
package Logica;

import Modelos.Libro;
import jakarta.persistence.*; 
import java.util.List;
public class LibroController {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("AlquilerPU"); 
    
    public void create(Libro libro) { 
        EntityManager em = emf.createEntityManager(); 
        em.getTransaction().begin();
        em.persist(libro);
        em.getTransaction().commit();
        em.close();
    }
    
    
    public void edit(Libro libro) {
        EntityManager em = emf.createEntityManager(); 
        em.getTransaction().begin();
        em.merge(libro); 
        em.getTransaction().commit();
        em.close();
    }
    
    public void delete(long id) { 
        EntityManager em = emf.createEntityManager(); 
        Libro libro = em.find(Libro.class, id); 
        
        em.getTransaction().begin();
        em.remove(libro);
        em.getTransaction().commit();
        em.close();
    }
    
    public Libro findById(long id) { 
        Libro libro = null; 
        EntityManager em = emf.createEntityManager(); 
        libro = em.find(Libro.class, id); 
        em.close();  
        return libro;
    }
    
    public List<Libro> all() { 
        EntityManager em = emf.createEntityManager(); 
        TypedQuery<Libro> query = em.createQuery("SELECT e FROM Libro e", Libro.class); 
        List<Libro> libros = query.getResultList(); 
        em.close();
        return libros; 
    }
     
    public List<Libro> findByName(String titulo) { 
        
        EntityManager em = emf.createEntityManager(); 
        TypedQuery<Libro> query = em.createQuery("select e from Libro w where e.titulo = :titulo", Libro.class);
        List<Libro> libros = query.getResultList(); 
        
        return libros; 
    } 
        
    
}
