# RecyclerViewInfiniteCacheV2

```java
public static class MyHolder extends RecyclerView.ViewHolder {
    public ParamItemBinding itemBinding;

    public MyHolder(@NonNull ParamItemBinding itemView) {
        super(itemView.getRoot());
        itemBinding = itemView;
    }

    public void bind(ParamsModel data, BaseCallBackAdapter<ParamsModel> callBack) {
        itemBinding.edAngka2.addTextChangedListener(new SimpleTextWatcher(s -> {
            if (s.length()>0){
                int angka1 = Integer.parseInt(itemBinding.edAngka1.getText().toString());
                int angka2 = Integer.parseInt(s.toString());
                int hasil = angka1+angka2;

                itemBinding.edHasil.setText(hasil+"");

                data.setAngka1(angka1+"");
                data.getResult().setAngka2(angka2+"");
                data.getResult().setHasil(hasil+"");
            }
        }));
        if (callBack != null) {

        }
        putLastData(data);
    }

    private void putLastData(ParamsModel data) {
        itemBinding.edAngka1.setText(data.getAngka1());
        itemBinding.edAngka2.setText(data.getResult().getAngka2());
        itemBinding.edHasil.setText(data.getResult().getHasil());
    }
}
```


---

```
Copyright 2022 M. Fadli Zein
```