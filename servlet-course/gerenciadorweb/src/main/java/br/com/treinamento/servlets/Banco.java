package br.com.treinamento.servlets;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private static List<Tenant> list = new ArrayList<>();
    
    static {
    	Tenant tenant = new Tenant();
    	tenant.setId(1);
    	tenant.setName("empresa 01");
    	Tenant tenant2 = new Tenant();
    	tenant2.setId(2);
    	tenant2.setName("empresa 022");
    	list.add(tenant); list.add(tenant2);
    }

    public void save(Tenant tenant) {
        list.add(tenant);
    }

    public List<Tenant> getTenants() {
        return Banco.list;
    }

}
