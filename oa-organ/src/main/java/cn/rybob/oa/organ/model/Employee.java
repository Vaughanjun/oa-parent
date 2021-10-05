package cn.rybob.oa.organ.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 员工实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {
    int id;
    String name;
    int age;
}
