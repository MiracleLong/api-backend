package com.hui.api.utils;

import org.apache.commons.lang3.StringUtils;

/**
 * @author dargon
 * @create 2023-07-03
 * sql 工具
 */
public class SqlUtils {

    /**
     * 校验排序字段是否合法（防止 SQL 注入）
     *
     * @param sortField
     * @return
     */
    public static boolean validSortField(String sortField) {
        if (StringUtils.isBlank(sortField)) {
            return false;
        }
        return !StringUtils.containsAny(sortField, "=", "(", ")", " ");
    }
}
