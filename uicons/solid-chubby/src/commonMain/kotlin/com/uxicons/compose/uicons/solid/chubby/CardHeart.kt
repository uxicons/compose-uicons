package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CardHeart: ImageVector? = null

val Icons.Sc.CardHeart: ImageVector
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
                moveTo(13.67f, 15.1f)
                curveToRelative(-0.52f, 0.26f, -1.1f, 0.4f, -1.67f, 0.4f)
                reflectiveCurveToRelative(-1.15f, -0.13f, -1.67f, -0.4f)
                curveToRelative(-0.12f, -0.06f, -2.83f, -1.35f, -2.83f, -3.51f)
                curveToRelative(0f, -1.08f, 0.53f, -1.95f, 1.08f, -2.42f)
                curveToRelative(1.0f, -0.84f, 2.44f, -0.89f, 3.41f, -0.17f)
                curveToRelative(0.95f, -0.72f, 2.4f, -0.67f, 3.42f, 0.17f)
                curveToRelative(0.53f, 0.45f, 1.09f, 1.3f, 1.09f, 2.34f)
                curveToRelative(0f, 2.08f, -2.36f, 3.35f, -2.83f, 3.58f)
                close()
            }
        }.also { _CardHeart = it}
