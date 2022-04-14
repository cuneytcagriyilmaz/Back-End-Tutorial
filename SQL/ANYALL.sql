-- Film tablosunda film uzunluğu length sütununda gösterilmektedir. Uzunluğu ortalama film uzunluğundan fazla kaç tane film vardır?
SELECT COUNT(*) FROM film
WHERE length > ANY
(
	SELECT AVG(length) FROM film
);

--film tablosunda en yüksek rental_rate değerine sahip kaç tane film vardır?
SELECT COUNT(*) from film
WHERE rental_rate= 
(
	SELECT MAX(rental_rate) FROM film
);

-- film tablosunda en düşük rental_rate ve en düşük replacement_cost değerlerine sahip filmleri sıralayınız.
SELECT rental_rate, replacement_cost FROM film
WHERE rental_rate = 
(
	SELECT MIN(rental_rate) FROM film
)
AND replacement_cost =
(
	SELECT MIN(replacement_cost) FROM film
)
ORDER BY title;

-- payment tablosunda en fazla sayıda alışveriş yapan müşterileri(customer) sıralayınız.

SELECT COUNT(payment_id),customer.first_name, customer.last_name, customer.customer_id FROM payment
INNER JOIN customer ON customer.customer_id = payment.customer_id
GROUP BY customer.customer_id
ORDER BY COUNT(payment_id) DESC;






