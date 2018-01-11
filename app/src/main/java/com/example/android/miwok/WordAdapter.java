package com.example.android.miwok;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Criado por schreiber2011 em 1/2/18.
 * Adapter para as palavras, usa
 * * {@link WordAdapter} é uma extensão da classe {@link ArrayAdapter} que gera o layout
 * para cada listItem baseado na fonte de dadosque é uma lista de objetos {@link Word}.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    /**
     * Cria uma novo objeto {@link WordAdapter}.
     *
     * @param context    é o contexto atual (i.e. Activity) no qual o adaptador está sendo criado.
     * @param miwokWords is the list of {@link Word}s to be displayed.
     */
    WordAdapter(Activity context, ArrayList<Word> miwokWords, int backColor) {
        super(context, 0, miwokWords);
        mColorResourceId = backColor;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView defaultTextView = listItemView.findViewById(R.id.default_text_view);
        assert currentWord != null;
        defaultTextView.setText(currentWord.getmDefaultTranslation());

        TextView miwokTextView = listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getmMiwokTranslation());

        ImageView imageImageView = listItemView.findViewById(R.id.image_image_view);
        if (currentWord.hasImage()) {
            imageImageView.setImageResource(currentWord.getmImage());
            imageImageView.setVisibility(View.VISIBLE);
        } else {
            imageImageView.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.layout_texts);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
