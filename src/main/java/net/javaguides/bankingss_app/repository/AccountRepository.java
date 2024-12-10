package net.javaguides.bankingss_app.repository;

import net.javaguides.bankingss_app.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {
}
