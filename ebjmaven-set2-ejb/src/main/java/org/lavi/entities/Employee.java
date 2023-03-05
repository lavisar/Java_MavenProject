package org.lavi.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "employee")
//LOMBOK
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee implements Serializable {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)  => ID added by user, not generated
    @Column(name = "employee_id")
    private String employeeId;

    @Column(name = "employee_name")
    private String employeeName;

//    FetchType.LAZY chỉ lấy dữ liệu từ database khi thực sự cần thiết
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "employee_company", joinColumns = {
            @JoinColumn(name = "employee_id", nullable = false, updatable = false) },
            inverseJoinColumns = { @JoinColumn(name = "company_id",
                    nullable = false, updatable = false) })
    private List<Company> companies;

    // constructors, getters and setters was created from Lombok
}


