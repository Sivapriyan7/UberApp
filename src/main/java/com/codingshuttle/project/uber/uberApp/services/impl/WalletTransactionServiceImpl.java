package com.codingshuttle.project.uber.uberApp.services.impl;

import com.codingshuttle.project.uber.uberApp.dto.WalletTransactionDto;
import com.codingshuttle.project.uber.uberApp.entities.WalletTransaction;
import com.codingshuttle.project.uber.uberApp.repositories.WalletTransactionRepository;
import com.codingshuttle.project.uber.uberApp.services.WalletTransactionService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class WalletTransactionServiceImpl implements WalletTransactionService {

    private final WalletTransactionRepository walletTransactionRepository;
    private final ModelMapper modelMapper;


    @Override
    public void createNewWalletTransaction(WalletTransactionDto walletTransactionDto) {
        WalletTransaction walletTransaction = modelMapper.map(walletTransactionDto, WalletTransaction.class);
        walletTransactionRepository.save(walletTransaction);


    }
}
