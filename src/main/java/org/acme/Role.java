package org.acme;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "quarkus_role")
public class Role extends PanacheEntityBase {

    @NotNull
    @Size(max = 50)
    @Id
    @Column(length = 50)
    public String name;
}
