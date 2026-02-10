package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlayingCards: ImageVector? = null

val Icons.Ts.PlayingCards: ImageVector
    get() = _PlayingCards ?: UXIcon(name = "PlayingCards") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.21f, 3.66f)
                lineTo(11.14f, 0.1f)
                curveToRelative(-1.32f, -0.39f, -2.71f, 0.38f, -3.1f, 1.7f)
                lineToRelative(-0.66f, 2.2f)
                lineTo(2.5f, 4f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-1.22f)
                lineToRelative(2.31f, 0.87f)
                lineToRelative(5.59f, -16.89f)
                curveToRelative(0.39f, -1.32f, -0.38f, -2.71f, -1.69f, -3.1f)
                close()
                moveTo(15f, 23f)
                lineTo(1f, 23f)
                lineTo(1f, 6.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(11f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(16.5f)
                close()
                moveTo(22.95f, 6.46f)
                lineToRelative(-5.26f, 15.89f)
                lineToRelative(-1.69f, -0.64f)
                lineTo(16f, 6.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-5.08f)
                lineToRelative(0.58f, -1.92f)
                curveToRelative(0.23f, -0.79f, 1.07f, -1.25f, 1.85f, -1.02f)
                lineToRelative(11.07f, 3.56f)
                curveToRelative(0.79f, 0.23f, 1.25f, 1.07f, 1.02f, 1.84f)
                close()
                moveTo(9.75f, 11f)
                curveToRelative(-0.71f, 0f, -1.34f, 0.39f, -1.75f, 0.88f)
                curveToRelative(-0.41f, -0.48f, -1.04f, -0.88f, -1.75f, -0.88f)
                curveToRelative(-1.24f, 0f, -2.25f, 1.01f, -2.25f, 2.25f)
                curveToRelative(0f, 2.24f, 3.34f, 4.54f, 3.72f, 4.79f)
                lineToRelative(0.28f, 0.18f)
                lineToRelative(0.28f, -0.18f)
                curveToRelative(0.38f, -0.25f, 3.72f, -2.55f, 3.72f, -4.79f)
                curveToRelative(0f, -1.24f, -1.01f, -2.25f, -2.25f, -2.25f)
                close()
                moveTo(8f, 17.02f)
                curveToRelative(-1.04f, -0.75f, -3f, -2.44f, -3f, -3.77f)
                curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
                curveToRelative(0.71f, 0f, 1.25f, 0.79f, 1.25f, 1f)
                horizontalLineToRelative(1f)
                curveToRelative(0.0f, -0.21f, 0.54f, -1f, 1.25f, -1f)
                curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
                curveToRelative(0f, 1.32f, -1.96f, 3.01f, -3f, 3.77f)
                close()
            }
        }.also { _PlayingCards = it}
