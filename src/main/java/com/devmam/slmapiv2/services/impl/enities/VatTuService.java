package com.devmam.slmapiv2.services.impl.enities;

import com.devmam.slmapiv2.entities.VatTu;
import com.devmam.slmapiv2.services.impl.BaseServiceImpl;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class VatTuService extends BaseServiceImpl<VatTu, Integer> {

    @Autowired
    private EntityManager entityManager;

    public VatTuService(JpaRepository<VatTu, Integer> repository) {
        super(repository);
    }

    @Override
    public EntityManager getEntityManager() {
        return null;
    }
}
