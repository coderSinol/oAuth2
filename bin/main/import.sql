delete from `authority`;
delete from `user`;
delete from `user_authority`;

insert ignore into `oauth_client_details`(`client_id`,`resource_ids`,`client_secret`,`scope`,`authorized_grant_types`,`web_server_redirect_uri`,`authorities`,`access_token_validity`,`refresh_token_validity`,`additional_information`,`autoapprove`) values ('spring-security-oauth2-read-client','resource-server-rest-api','$2a$04$WGq2P9egiOYoOFemBRfsiO9qTcyJtNRnPKNBl5tokP7IP.eZn93km','read','password,authorization_code,refresh_token,client_credentials,implicit','http://localhost:8090/client-callback','USER',10800,2592000,null,null);
insert ignore into `authority`(`name`) values ('ADMIN');
insert ignore into `user`(`account_expired`,`account_locked`,`credentials_expired`,`enabled`,`password`,`user_name`) values (0,0,0,1,'$2a$08$qvrzQZ7jJ7oy2p/msL4M0.l83Cd0jNsX6AJUitbgRXGzge4j035ha','admin');
insert ignore into `user_authority`(`authority_id`,`user_id`) values (1,1);