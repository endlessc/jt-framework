package io.github.hylexus.jt808.boot.props.exception.handler.scan;

import com.google.common.collect.Sets;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;

import java.util.Set;

/**
 * @author hylexus
 * Created At 2020-02-09 3:16 下午
 */
@Getter
@Setter
@ToString
@Slf4j
@Validated
public class Jt808ExceptionHandlerScanProps {
    private boolean enabled = true;
    private Set<String> basePackages = Sets.newHashSet("${jt808.handler-scan.base-packages:}");
    private boolean registerBuiltinExceptionHandlers = true;
}
