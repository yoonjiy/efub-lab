package com.efub.seminar03.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter //domain에 setter 사용 지양해야 함.
@NoArgsConstructor
public class User {
    private Long id;
    private String name;
}
