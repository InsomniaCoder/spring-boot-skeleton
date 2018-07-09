import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table
//@Data => @Getter, @Setter, @ToString, @EqualsAndHashCode and @RequiredArgsConstructor annotations on the class (except that no constructor will be generated if any explicitly written constructor exists).
@Data
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