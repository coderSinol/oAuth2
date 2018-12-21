package com.sinol.oauth.model;

import javax.persistence.*;

@Entity
@Table(name="user_authority", uniqueConstraints = @UniqueConstraint(columnNames = {"user_id", "authority_id"}, name="USER_AUTHORITY_UNIQUE_USER_ID_AND_AUTHORITY_ID"))
public class UserAuthority {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", columnDefinition = "bigint unsigned")
	private Integer id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "USER_ID", foreignKey = @ForeignKey(name = "FK_USER_AUTHORITY_USER_ID"))
	private User user;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "AUTHORITY_ID", foreignKey = @ForeignKey(name = "FK_USER_AUTHORITY_AUTHORITY_ID"))
	private Authority authority;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Authority getAuthority() {
		return authority;
	}

	public void setAuthority(Authority authority) {
		this.authority = authority;
	}

}

