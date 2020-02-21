function graficar(Signal, I)
offset = 0.2;
vector = (offset:offset:I*offset);
pl = bsxfun(@plus,Signal',vector);
plot(pl);
end