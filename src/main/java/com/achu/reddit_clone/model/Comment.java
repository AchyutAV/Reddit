package com.achu.reddit_clone.model;

import lombok.*;

import javax.persistence.*;

@Entity
@RequiredArgsConstructor
@Getter @Setter
@NoArgsConstructor
public class Comment extends Auditable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private String body;

    //link
    @ManyToOne
    @NonNull
    private Link link;

}
