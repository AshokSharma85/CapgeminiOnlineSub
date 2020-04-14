package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.entity.Product;

@Transactional
@Repository
public class ProductDaoImplement implements ProductDaoI{

	@PersistenceContext
	EntityManager em;
	@Override
	public void create(Product p) {
		em.persist(p);
	}

	@Override
	public List retrive() {
		Query q=em.createQuery("from Product p");
		return q.getResultList();
	}

	@Override
	public Product byId(int id) {

		return em.find(Product.class, id);
	}

	@Override
	public void delete(int id) {

		Product pd=em.find(Product.class, id);
		System.out.println(pd.getProductId()+" "+pd.getProductName() +" "+pd.getProductPrice());
		
		em.remove(pd);
	}

	
}
