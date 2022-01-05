package com.foodappAccountService.java.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodappAccountService.java.dto.AccountRequestDto;
import com.foodappAccountService.java.dto.AccountResponseProjection;
import com.foodappAccountService.java.entity.Account;
import com.foodappAccountService.java.repository.AccountRepository;
import com.foodappAccountService.java.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountRepository accountRepo;
	
	/*
	 * @Override public List<AccountResponseProjection> getDetails(AccountRequestDto
	 * accountRequestDto) { List<AccountResponseProjection>
	 * accountList=accountRepo.findByAccountId(accountRequestDto.getAccountId());
	 * return accountList; }
	 */
	
	@Override
	public List<AccountResponseProjection> getDetails(AccountRequestDto accountRequestDto) {
		List<AccountResponseProjection> accountList=accountRepo.findByAccountId(accountRequestDto.getAccountId());
		return accountList;
	}

}
