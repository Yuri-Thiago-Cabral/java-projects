package br.com.treinamento.domain;

import java.util.Date;

public class Tenant {

    private Integer id;
    private String name;
    private String cnpj;
    private Date date = new Date();

    public Integer getId() {
            return id;
        }

    public void setId(Integer id) {
            this.id = id;
        }

    public String getName() {
            return name;
        }

    public void setName(String name) {
            this.name = name;
        }

    public String getCnpj() {
            return cnpj;
        }

    public void setCnpj(String cnpj) {
            this.cnpj = cnpj;
        }

    public Date getDate() {
            return date;
        }

    public void setDate(Date date) {
            this.date = date;
        }

}

