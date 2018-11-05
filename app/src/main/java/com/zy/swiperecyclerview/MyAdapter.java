package cc.sachsen.fingertest;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;


/**
 * @author Z.Yun
 */
public class MyAdapter extends BaseQuickAdapter<String, BaseViewHolder> {


    public MyAdapter(@Nullable List<String> data) {
        super(R.layout.list_text, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {

        helper.setText(R.id.tv_text, item);
    }

}
