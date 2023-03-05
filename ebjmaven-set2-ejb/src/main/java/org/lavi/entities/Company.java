package org.lavi.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "company")
//LOMBOK
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company implements Serializable {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)  => ID added by user, not generated
    @Column(name = "company_id")
    private String companyId;

    @Column(name = "company_name")
    private String companyName;

    //    FetchType.LAZY chỉ lấy dữ liệu từ database khi thực sự cần thiết
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "companies")
    private List<Employee> employees;

    // constructors, getters and setters
}
