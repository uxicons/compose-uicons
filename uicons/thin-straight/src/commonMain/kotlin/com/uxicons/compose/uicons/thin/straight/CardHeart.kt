package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CardHeart: ImageVector? = null

val Icons.Ts.CardHeart: ImageVector
    get() = _CardHeart ?: UXIcon(name = "CardHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.5f, 0f)
                lineTo(5.5f, 0f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(18f)
                lineTo(21f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(20f, 23f)
                lineTo(4f, 23f)
                lineTo(4f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(13f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(20.5f)
                close()
                moveTo(13.75f, 9f)
                curveToRelative(-0.72f, 0f, -1.34f, 0.3f, -1.75f, 0.79f)
                curveToRelative(-0.41f, -0.49f, -1.03f, -0.79f, -1.75f, -0.79f)
                curveToRelative(-1.24f, 0f, -2.25f, 1.07f, -2.25f, 2.39f)
                curveToRelative(0f, 2.18f, 3.33f, 4.56f, 3.71f, 4.82f)
                lineToRelative(0.28f, 0.2f)
                lineToRelative(0.28f, -0.2f)
                curveToRelative(0.38f, -0.26f, 3.71f, -2.64f, 3.71f, -4.82f)
                curveToRelative(0f, -1.32f, -1.01f, -2.39f, -2.25f, -2.39f)
                close()
                moveTo(12f, 15.18f)
                curveToRelative(-1.04f, -0.78f, -3f, -2.51f, -3f, -3.79f)
                curveToRelative(0f, -0.77f, 0.56f, -1.39f, 1.25f, -1.39f)
                curveToRelative(0.74f, 0f, 1.25f, 0.5f, 1.25f, 1.22f)
                horizontalLineToRelative(0.01f)
                verticalLineToRelative(0.05f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-0.21f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(0.07f, -0.63f, 0.56f, -1.06f, 1.24f, -1.06f)
                curveToRelative(0.69f, 0f, 1.25f, 0.62f, 1.25f, 1.39f)
                curveToRelative(0f, 1.28f, -1.96f, 3.01f, -3f, 3.79f)
                close()
            }
        }.also { _CardHeart = it}
