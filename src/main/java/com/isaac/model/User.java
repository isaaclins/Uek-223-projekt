package com.isaac.model;

import java.util.Set;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true, length = 32)
    private String username;

    @Column(nullable = false, length = 255)
    private String password;

    @Column(nullable = false, unique = true, length = 255)
    private String email;

    @OneToMany(mappedBy = "fromUser", fetch = FetchType.LAZY)
    @JsonIgnoreProperties("fromUser")
    private Set<Message> sentMessages;

    @OneToMany(mappedBy = "toUser", fetch = FetchType.LAZY)
    @JsonIgnoreProperties("toUser")
    private Set<Message> receivedMessages;
}