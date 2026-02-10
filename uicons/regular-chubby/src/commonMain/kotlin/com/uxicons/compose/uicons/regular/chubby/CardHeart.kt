package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CardHeart: ImageVector? = null

val Icons.Rc.CardHeart: ImageVector
    get() = _CardHeart ?: UXIcon(name = "CardHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.05f, 2.91f)
                curveToRelative(-0.08f, -0.33f, -0.32f, -0.59f, -0.64f, -0.71f)
                curveToRelative(-0.14f, -0.05f, -3.47f, -1.21f, -7.41f, -1.21f)
                reflectiveCurveToRelative(-7.27f, 1.16f, -7.41f, 1.21f)
                curveToRelative(-0.32f, 0.11f, -0.56f, 0.38f, -0.64f, 0.71f)
                curveToRelative(-0.04f, 0.16f, -0.95f, 3.98f, -0.95f, 9.08f)
                curveToRelative(0f, 5.15f, 0.91f, 8.93f, 0.95f, 9.09f)
                curveToRelative(0.08f, 0.33f, 0.32f, 0.59f, 0.64f, 0.71f)
                curveToRelative(0.14f, 0.05f, 3.47f, 1.21f, 7.41f, 1.21f)
                reflectiveCurveToRelative(7.27f, -1.16f, 7.41f, -1.21f)
                curveToRelative(0.32f, -0.11f, 0.56f, -0.38f, 0.64f, -0.71f)
                curveToRelative(0.04f, -0.16f, 0.95f, -3.98f, 0.95f, -9.08f)
                curveToRelative(0f, -5.15f, -0.91f, -8.93f, -0.95f, -9.09f)
                close()
                moveTo(18.23f, 20.07f)
                curveToRelative(-1.04f, 0.31f, -3.5f, 0.93f, -6.22f, 0.93f)
                reflectiveCurveToRelative(-5.18f, -0.62f, -6.22f, -0.93f)
                curveToRelative(-0.24f, -1.2f, -0.78f, -4.27f, -0.78f, -8.07f)
                curveToRelative(0f, -3.77f, 0.53f, -6.86f, 0.78f, -8.07f)
                curveToRelative(1.04f, -0.3f, 3.51f, -0.93f, 6.22f, -0.93f)
                reflectiveCurveToRelative(5.19f, 0.62f, 6.23f, 0.93f)
                curveToRelative(0.24f, 1.2f, 0.77f, 4.27f, 0.77f, 8.07f)
                curveToRelative(0f, 3.77f, -0.53f, 6.86f, -0.78f, 8.07f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.41f, 9.18f)
                curveToRelative(-1.01f, -0.85f, -2.47f, -0.89f, -3.42f, -0.17f)
                curveToRelative(-0.97f, -0.72f, -2.41f, -0.66f, -3.41f, 0.17f)
                curveToRelative(-0.55f, 0.46f, -1.08f, 1.34f, -1.08f, 2.42f)
                curveToRelative(0f, 2.16f, 2.71f, 3.45f, 2.83f, 3.51f)
                curveToRelative(0.52f, 0.26f, 1.1f, 0.4f, 1.67f, 0.4f)
                reflectiveCurveToRelative(1.15f, -0.13f, 1.67f, -0.4f)
                curveToRelative(0.47f, -0.24f, 2.83f, -1.51f, 2.83f, -3.58f)
                curveToRelative(0f, -1.05f, -0.55f, -1.9f, -1.09f, -2.34f)
                close()
            }
        }.also { _CardHeart = it}
