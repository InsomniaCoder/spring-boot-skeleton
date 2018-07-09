package com.insomniacoder.springfeatures.entities;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table
@Data
//@Data => @Getter, @Setter, @ToString, @EqualsAndHashCode and @RequiredArgsConstructor annotations on the class (except that no constructor will be generated if any explicitly written constructor exists).
public class TestEntity {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @Column
    private String name;

    @Transient
    private String fieldThatWillNotBeInDatabase;


}