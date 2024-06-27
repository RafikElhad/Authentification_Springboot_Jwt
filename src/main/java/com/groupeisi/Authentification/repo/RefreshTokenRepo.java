package com.groupeisi.Authentification.repo;

import com.groupeisi.Authentification.entity.RefreshTokenEntity;
import com.nimbusds.jose.jwk.JWKSet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RefreshTokenRepo extends JpaRepository<RefreshTokenEntity, Long> {
    Optional<RefreshTokenEntity> findByRefreshToken(String refreshToken);
}
