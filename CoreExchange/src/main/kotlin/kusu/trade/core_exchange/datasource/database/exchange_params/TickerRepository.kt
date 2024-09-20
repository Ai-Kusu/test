package kusu.trade.core_exchange.datasource.database.exchange_params

import kusu.trade.core_exchange.datamodels.bibit.exchange_params.ticker.Ticker
import org.springframework.data.jpa.repository.JpaRepository

interface TickerRepository: JpaRepository<kusu.trade.core_exchange.datamodels.bibit.exchange_params.ticker.Ticker, Long> {
}