package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CheeseAlt: ImageVector? = null

val Icons.Sc.CheeseAlt: ImageVector
    get() = _CheeseAlt ?: UXIcon(name = "CheeseAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 23f)
                curveToRelative(-3.38f, 0f, -5.97f, -0.31f, -7.55f, -0.58f)
                curveToRelative(-1.78f, -0.29f, -3.16f, -1.76f, -3.33f, -3.55f)
                curveToRelative(-0.15f, -1.47f, -0.15f, -3.27f, 0f, -4.74f)
                curveToRelative(0.18f, -1.8f, 1.55f, -3.26f, 3.34f, -3.55f)
                curveToRelative(1.59f, -0.26f, 4.18f, -0.58f, 7.55f, -0.58f)
                curveToRelative(6.07f, 0f, 9.63f, 1.0f, 9.77f, 1.04f)
                curveToRelative(0.32f, 0.09f, 0.57f, 0.33f, 0.67f, 0.65f)
                curveToRelative(0.02f, 0.07f, 0.55f, 1.69f, 0.55f, 4.82f)
                reflectiveCurveToRelative(-0.53f, 4.75f, -0.55f, 4.82f)
                curveToRelative(-0.1f, 0.31f, -0.36f, 0.56f, -0.67f, 0.65f)
                curveToRelative(-0.15f, 0.04f, -3.7f, 1.04f, -9.77f, 1.04f)
                close()
                moveTo(4.12f, 8.6f)
                curveToRelative(1.66f, -0.28f, 4.37f, -0.6f, 7.88f, -0.6f)
                curveToRelative(4.94f, 0f, 8.27f, 0.62f, 9.64f, 0.94f)
                curveToRelative(-1.46f, -1.99f, -5.09f, -6.28f, -10.34f, -7.9f)
                curveToRelative(-0.17f, -0.05f, -0.35f, -0.06f, -0.53f, -0.02f)
                curveToRelative(-4.42f, 1.07f, -7.82f, 4.4f, -9.13f, 8.61f)
                curveToRelative(0.72f, -0.51f, 1.56f, -0.88f, 2.47f, -1.03f)
                close()
            }
        }.also { _CheeseAlt = it}
