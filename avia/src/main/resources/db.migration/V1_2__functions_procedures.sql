create function public.find_most_expensive_ticket(id_p integer) returns numeric
    language plpgsql
as
$$
DECLARE
itemPrice numeric(10, 2);
begin
SELECT MAX(price)
INTO itemPrice
FROM tickets
WHERE id_pass = id_p;
RETURN itemPrice;
end;
$$;

alter function public.find_most_expensive_ticket(integer) owner to development;

create procedure public.sale(IN idticket bigint, IN discount real)
    language plpgsql
as
$$
begin
update tickets
set price = tickets.price - tickets.price * discount
where id_ticket = idTicket and id_ticket_class = 2;

commit;
end;
$$;

alter procedure public.sale(bigint, real) owner to development;

create function public.calculate_profit_airline(query bigint) returns numeric
    language plpgsql
as
$$
DECLARE
itemPrice numeric(10, 2);
begin
SELECT sum(price)
INTO itemPrice
FROM tickets
where id_airline = query;
RETURN itemPrice;
end;
$$;

alter function public.calculate_profit_airline(bigint) owner to development;

