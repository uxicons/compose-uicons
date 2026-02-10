package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CardDiamond: ImageVector? = null

val Icons.Rc.CardDiamond: ImageVector
    get() = _CardDiamond ?: UXIcon(name = "CardDiamond") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.18f, 9.66f)
                curveToRelative(-0.75f, -0.91f, -1.59f, -1.47f, -1.62f, -1.5f)
                curveToRelative(-0.33f, -0.22f, -0.76f, -0.23f, -1.1f, -0.01f)
                curveToRelative(-0.08f, 0.06f, -0.85f, 0.56f, -1.64f, 1.51f)
                curveToRelative(-0.8f, 0.96f, -1.22f, 1.89f, -1.23f, 1.93f)
                curveToRelative(-0.12f, 0.27f, -0.11f, 0.57f, 0.01f, 0.83f)
                curveToRelative(0.02f, 0.04f, 0.48f, 1.01f, 1.23f, 1.91f)
                curveToRelative(0.75f, 0.91f, 1.59f, 1.47f, 1.62f, 1.5f)
                curveToRelative(0.17f, 0.11f, 0.36f, 0.17f, 0.56f, 0.17f)
                curveToRelative(0.19f, 0f, 0.38f, -0.05f, 0.54f, -0.16f)
                curveToRelative(0.08f, -0.06f, 0.85f, -0.56f, 1.64f, -1.51f)
                curveToRelative(0.8f, -0.96f, 1.22f, -1.89f, 1.23f, -1.93f)
                curveToRelative(0.12f, -0.27f, 0.11f, -0.57f, -0.01f, -0.83f)
                curveToRelative(-0.02f, -0.04f, -0.48f, -1.01f, -1.23f, -1.91f)
                close()
            }
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
                moveTo(18.22f, 20.07f)
                curveToRelative(-1.04f, 0.3f, -3.51f, 0.93f, -6.22f, 0.93f)
                reflectiveCurveToRelative(-5.18f, -0.62f, -6.22f, -0.93f)
                curveToRelative(-0.24f, -1.2f, -0.78f, -4.27f, -0.78f, -8.07f)
                curveToRelative(0f, -3.77f, 0.53f, -6.86f, 0.78f, -8.07f)
                curveToRelative(1.04f, -0.3f, 3.51f, -0.93f, 6.22f, -0.93f)
                reflectiveCurveToRelative(5.18f, 0.62f, 6.22f, 0.93f)
                curveToRelative(0.24f, 1.2f, 0.78f, 4.27f, 0.78f, 8.07f)
                curveToRelative(0f, 3.77f, -0.53f, 6.86f, -0.78f, 8.07f)
                close()
            }
        }.also { _CardDiamond = it}
