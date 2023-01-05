package com.example.stock.service;

import com.example.stock.domain.Stock;
import com.example.stock.repository.StockRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author : nakgyeom
 * @date : 2023-01-05 오전 8:26
 */
@RequiredArgsConstructor
@Service
public class OptimisticLockStockService {

    private StockRepository repository;

    @Transactional
    public void decrease (Long id, Long quantity) {
        Stock stock = repository.findByIdWithOptimisticLock(id);
        stock.decrease(quantity);

        repository.saveAndFlush(stock);
    }
}
