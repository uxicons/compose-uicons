package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CardHeart: ImageVector? = null

val Icons.Tr.CardHeart: ImageVector
    get() = _CardHeart ?: UXIcon(name = "CardHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.5f, 0f)
                lineTo(7.5f, 0f)
                curveTo(5.02f, 0f, 3f, 2.02f, 3f, 4.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(9f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(21f, 4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(20f, 19.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(7.5f, 23f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(4f, 4.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(9f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(15f)
                close()
                moveTo(13.86f, 9f)
                curveToRelative(-0.77f, 0f, -1.43f, 0.33f, -1.85f, 0.86f)
                curveToRelative(-0.42f, -0.53f, -1.09f, -0.86f, -1.86f, -0.86f)
                curveToRelative(-1.3f, 0f, -2.35f, 1.12f, -2.35f, 2.5f)
                curveToRelative(0f, 1.8f, 2.16f, 3.74f, 3.46f, 4.74f)
                curveToRelative(0.22f, 0.17f, 0.49f, 0.26f, 0.76f, 0.26f)
                reflectiveCurveToRelative(0.53f, -0.09f, 0.76f, -0.26f)
                curveToRelative(1.29f, -1.0f, 3.46f, -2.94f, 3.46f, -4.74f)
                curveToRelative(0f, -1.38f, -1.06f, -2.5f, -2.36f, -2.5f)
                close()
                moveTo(12.15f, 15.45f)
                curveToRelative(-0.09f, 0.07f, -0.21f, 0.07f, -0.29f, 0f)
                curveToRelative(-1.92f, -1.48f, -3.06f, -2.96f, -3.06f, -3.95f)
                curveToRelative(0f, -0.83f, 0.61f, -1.5f, 1.35f, -1.5f)
                curveToRelative(0.8f, 0f, 1.36f, 0.54f, 1.36f, 1.32f)
                curveToRelative(0f, 0.04f, 0.02f, 0.2f, 0.02f, 0.2f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                curveToRelative(0f, 0f, -0.0f, -0.31f, -0.01f, -0.34f)
                curveToRelative(0.07f, -0.7f, 0.6f, -1.18f, 1.35f, -1.18f)
                reflectiveCurveToRelative(1.36f, 0.68f, 1.36f, 1.5f)
                curveToRelative(0f, 0.99f, -1.15f, 2.46f, -3.06f, 3.94f)
                close()
            }
        }.also { _CardHeart = it}
