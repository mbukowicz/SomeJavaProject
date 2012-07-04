package model;

import java.math.BigDecimal;

public class Money {
	
	private final BigDecimal amount;

	public BigDecimal getAmount() {
		return amount;
	}
	
	public Money(int amont) {
		this.amount = BigDecimal.valueOf(amont);
	}

	public Money(BigDecimal amount) {
		this.amount = amount;
	}
	
	public Money add(Money other) {
		return new Money(this.amount.add(other.amount));
	}
	
	public Money multiply(int multiplier) {
		BigDecimal bcMultiplier = BigDecimal.valueOf(multiplier);
		return new Money(this.amount.multiply(bcMultiplier));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((amount == null) ? 0 : amount.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Money other = (Money) obj;
		if (amount == null) {
			if (other.amount != null)
				return false;
		} else if (!amount.equals(other.amount))
			return false;
		return true;
	}
}
