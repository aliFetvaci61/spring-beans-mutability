package com.alifetvaci.springbeansmutability;

import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Profile("prototype")
@Scope("prototype")
public class JobPrototype extends Job {
}
