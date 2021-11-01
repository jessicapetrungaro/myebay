package it.prova.myebay.service;

import java.util.List;

import it.prova.myebay.dao.AnnuncioDAO;
import it.prova.myebay.model.Annuncio;

public interface AnnuncioService {
	public List<Annuncio> listAll() throws Exception;

	public Annuncio caricaSingoloElemento(Long id) throws Exception;

	public void aggiorna(Annuncio annuncioInstance) throws Exception;

	public void inserisciNuovo(Annuncio annuncioInstance) throws Exception;

	public void rimuovi(Annuncio annuncioInstance) throws Exception;
	
	public List<Annuncio> findByExample(Annuncio example) throws Exception;
	
	public void inserisciAnnuncioConCategoria(Annuncio example, String[] categorieInstance) throws Exception;
	
	public List<Annuncio> findByExampleEager(Annuncio example) throws Exception;
	
	// per injection
	public void setAnnuncioDAO(AnnuncioDAO annuncioDAO);
}