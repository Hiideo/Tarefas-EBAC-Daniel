package br.com.dhideo.dao;

import br.com.dhideo.domain.Catalogo;
import br.com.dhideo.domain.Marca;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;

public class CatalogoDao implements ICatalogoDao{
    @Override
    public Catalogo cadastrar(Catalogo cat) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("ExemploJPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(cat);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
        return cat;
    }

    @Override
    public Catalogo buscarPorCodigoMarca(String codigoMarca) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("ExemploJPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        StringBuilder sb = new StringBuilder();
        sb.append("SELECT m FROM Catalogo m ");
        sb.append("INNER JOIN Marca c on c = m.marca ");
        sb.append("WHERE c.codigo = :codigoMarca");

        entityManager.getTransaction().begin();
        TypedQuery<Catalogo> query =
                entityManager.createQuery(sb.toString(), Catalogo.class);
        query.setParameter("codigoMarca", codigoMarca);
        Catalogo catalogo = query.getSingleResult();

        entityManager.close();
        entityManagerFactory.close();

        return catalogo;
    }

    @Override
    public Catalogo buscarPorMarca(Marca marca) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("ExemploJPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        StringBuilder sb = new StringBuilder();
        sb.append("SELECT m FROM Catalogo m ");
        sb.append("INNER JOIN Marca c on c = m.marca ");
        sb.append("WHERE c = :marca");

        entityManager.getTransaction().begin();
        TypedQuery<Catalogo> query =
                entityManager.createQuery(sb.toString(), Catalogo.class);
        query.setParameter("marca", marca);
        Catalogo catalogo = query.getSingleResult();

        entityManager.close();
        entityManagerFactory.close();

        return catalogo;
    }

    @Override
    public Catalogo buscarPorCodigoMarcaCriteria(String codigoMarca) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("ExemploJPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();


        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Catalogo> query = builder.createQuery(Catalogo.class);
        Root<Catalogo> root = query.from(Catalogo.class);
        Join<Object, Object> join = root.join("marca", JoinType.INNER);
        query.select(root).where(builder.equal(join.get("codigo"), codigoMarca));

        TypedQuery<Catalogo> tpQuery =
                entityManager.createQuery(query);
        Catalogo catalogo = tpQuery.getSingleResult();

        entityManager.close();
        entityManagerFactory.close();

        return catalogo;
    }

    @Override
    public Catalogo buscarPorMarcaCriteria(Marca marca) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("ExemploJPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();


        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Catalogo> query = builder.createQuery(Catalogo.class);
        Root<Catalogo> root = query.from(Catalogo.class);
        Join<Object, Object> join = root.join("marca", JoinType.INNER);
        query.select(root).where(builder.equal(join, marca));

        TypedQuery<Catalogo> tpQuery =
                entityManager.createQuery(query);
        Catalogo catalogo = tpQuery.getSingleResult();

        entityManager.close();
        entityManagerFactory.close();

        return catalogo;
}
