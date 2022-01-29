package br.com.treinamento.domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Database {

    private static List<Tenant> tenants = new ArrayList<>();
    private static Integer idGenerator = 1;

    static {
        Tenant tenant = new Tenant();
        tenant.setId(idGenerator++);
        tenant.setName("Empresa 01");
        tenant.setCnpj("00000000");

        Tenant tenant2 = new Tenant();
        tenant2.setId(idGenerator++);
        tenant2.setName("Empresa 02");
        tenant2.setCnpj("111111111");

        tenants.add(tenant); tenants.add(tenant2);
    }

    public void save(Tenant tenant) {
        tenant.setId(idGenerator++);
        tenants.add(tenant);
    }

    public List<Tenant> findAllTenants() {
        return Database.tenants;
    }

    public Tenant findById(Integer id) {
       for (Tenant tenant: tenants) {
           if (tenant.getId().equals(id)) {
               return tenant;
           }
       }
       return null;
    }

    public void delete(Integer id) {
        Iterator<Tenant> tenantIterator = tenants.iterator();
        while (tenantIterator.hasNext()) {
            if(tenantIterator.next().getId().equals(id)) {
                tenantIterator.remove();
            }
        }
    }
}
