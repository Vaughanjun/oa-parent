package cn.rybob.oa.auth.model;

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
public class Authorization {
    Long id;
    Long employeeId;
    Long roleId;
}
