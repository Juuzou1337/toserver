package com.example.user.to.server.repository;

import com.example.user.to.server.entity.Reports;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ReportsRepository extends JpaRepository<Reports,Long> {

    @Query("select u from Reports u where u.id_personal = :id_personal")
    Reports getReportsByIdPersonal(@Param("id_personal") int id_personal);
}
