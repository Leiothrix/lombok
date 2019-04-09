import lombok.*;
/**
 * Created by adam on 2019/4/9 at 16:03.
 * PS: You may say that I'm a dreamer.But I'm not the only one.
 * @Getter
 * @Setter
 * @ToString
 * @EqualsAndHashCode
 */

@Data
@AllArgsConstructor
public class LombokTest {

    public String name;
    public String age;
    public String gender;

    public static void main(String[] args){
        LombokTest lombokTest = new LombokTest("Achan", "24", "female");
        System.out.println(lombokTest);
    }
}
