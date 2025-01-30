package com.codingshuttle.project.uber.uberApp.services;

import com.codingshuttle.project.uber.uberApp.entities.User;
import com.codingshuttle.project.uber.uberApp.entities.Wallet;

public interface WalletService {

    Wallet addMoneyToWallet(User user, Double amount);

    void WithdrawAllMyMoneyFromWallet();

    Wallet findWalletById(Long walletId);

    Wallet createNewWallet(User user);
}
