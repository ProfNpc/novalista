package com.cit.novalista.model;

import java.util.Arrays;
import java.util.List;

public class ItemLista {
	
	public enum TipoItemLista {
		Lc116,
		Barueri
	}
	
	private Long id;
	
	private String[] codigo;
	
	private String descricao;
	
	private List<ItemLista> itemAssociado;
	
	private TipoItemLista tipo;
	
	private String dado;
	
	public ItemLista() {
		super();
	}

	public ItemLista(Long id, String[] codigo, String descricao, List<ItemLista> itemAssociado, TipoItemLista tipo,
			String dado) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.descricao = descricao;
		this.itemAssociado = itemAssociado;
		this.tipo = tipo;
		this.dado = dado;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String[] getCodigo() {
		return codigo;
	}

	public void setCodigo(String[] codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<ItemLista> getItemAssociado() {
		return itemAssociado;
	}

	public void setItemAssociado(List<ItemLista> itemAssociado) {
		this.itemAssociado = itemAssociado;
	}

	public TipoItemLista getTipo() {
		return tipo;
	}

	public void setTipo(TipoItemLista tipo) {
		this.tipo = tipo;
	}

	public String getDado() {
		return dado;
	}

	public void setDado(String dado) {
		this.dado = dado;
	}

	@Override
	public String toString() {
		return "ItemLista [id=" + id + ", codigo=" + Arrays.toString(codigo) + ", descricao=" + descricao
				+ ", itemAssociado=" + itemAssociado + ", tipo=" + tipo + ", dado=" + dado + "]";
	}
}
