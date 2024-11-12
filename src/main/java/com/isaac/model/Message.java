package com.isaac.model;

import java.time.LocalDateTime;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "messages")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "fromFKUID", nullable = false)
    private User fromUser;

    @ManyToOne
    @JoinColumn(name = "toFKUID", nullable = false)
    private User toUser;

    @Column(name = "sentDate", columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime sentDate;

    @Column(name = "readStatus", nullable = false, columnDefinition = "TINYINT(1) DEFAULT 0")
    private boolean readStatus;

    @Column(name = "messageText", nullable = false, length = 200)
    private String messageText;
}