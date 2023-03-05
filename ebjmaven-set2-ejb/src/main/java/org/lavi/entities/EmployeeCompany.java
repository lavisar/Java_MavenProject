package org.lavi.entities;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "employee_company")
//LOMBOK
@Data  // use for setter and getter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeCompany implements Serializable {

    //    FetchType.LAZY chỉ lấy dữ liệu từ database khi thực sự cần thiết
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id", nullable = false)
    private Company company;

    // constructors, getters and setters was created from Lombok
}
