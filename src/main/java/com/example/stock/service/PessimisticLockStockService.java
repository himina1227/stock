package com.example.stock.service;

import com.example.stock.domain.Stock;
import com.example.stock.repository.StockRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author : nakgyeom
 * @date : 2023-01-05 오전 9:19
 */
@RequiredArgsConstructor
@Service
public class PessimisticLockStockService {

    private StockRepository repository;

    @Transactional
    public Long decrease(Long id, Long quantity) {
        Stock stock = repository.findByIdWithPessimisticLock(id);
        stock.decrease(quantity);
        repository.saveAndFlush(stock);

        return stock.getQuantity();
    }
}
