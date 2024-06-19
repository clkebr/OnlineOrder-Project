package com.onlineorder.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, updatable = false)
	@CreatedDate
	private LocalDateTime insertDateTime;

	@Column(nullable = false, updatable = false)
	@CreatedBy
	private Long insertUserId;

	@Column(nullable = false)
	@LastModifiedDate
	private LocalDateTime lastUpdateDateTime;

	@Column(nullable = false)
	@LastModifiedBy
	private Long lastUpdateUserId;

	private Boolean isDeleted = false;
}
