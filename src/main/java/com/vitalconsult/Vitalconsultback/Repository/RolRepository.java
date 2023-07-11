package com.vitalconsult.Vitalconsultback.Repository;



import com.vitalconsult.Vitalconsultback.Entity.RolEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<RolEntity,Integer> {
}
