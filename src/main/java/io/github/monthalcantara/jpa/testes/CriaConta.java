package io.github.monthalcantara.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import io.github.monthalcantara.jpa.modelo.Conta;

public class CriaConta {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
	EntityManager em = emf.createEntityManager();
	
	Conta conta = new Conta();
	conta.setTitular("Junior");
	conta.setAgencia(1234);
	conta.setNumero(4321);
	
	em.getTransaction().begin();
	em.persist(conta);
	em.getTransaction().commit();
	
}
}
