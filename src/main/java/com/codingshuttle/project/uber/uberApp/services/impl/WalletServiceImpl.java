package com.codingshuttle.project.uber.uberApp.services.impl;

import ch.qos.logback.core.recovery.ResilientOutputStreamBase;
import com.codingshuttle.project.uber.uberApp.entities.User;
import com.codingshuttle.project.uber.uberApp.entities.Wallet;
import com.codingshuttle.project.uber.uberApp.exceptions.ResourceNotFoundException;
import com.codingshuttle.project.uber.uberApp.repositories.WalletRepository;
import com.codingshuttle.project.uber.uberApp.services.WalletService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WalletServiceImpl implements WalletService {

    private  final WalletRepository walletRepository;

    @Override
    public Wallet addMoneyToWallet(User user, Double amount) {
        Wallet wallet = walletRepository.findByUser(user)
                .orElseThrow(()-> new ResourceNotFoundException("wallet not found with id : "+user.getId()));

        wallet.setBalance(wallet.getBalance()+amount);
        return walletRepository.save(wallet);
    }

    @Override
    public void WithdrawAllMyMoneyFromWallet() {

    }

    @Override
    public Wallet findWalletById(Long walletId) {
        return walletRepository.findById(walletId).orElseThrow(
                ()-> new ResourceNotFoundException("Wallet not found with id : "+walletId));
    }

    @Override
    public Wallet createNewWallet(User user) {
        Wallet wallet = new Wallet();
        wallet.setUser(user);
        return walletRepository.save(wallet);
    }
}
