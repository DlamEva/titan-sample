package com.sequarius.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * project titan
 *
 * @author Sequarius *
 * @since 12/01/2020
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Page {
    private Integer start;
    private Integer length;
}
