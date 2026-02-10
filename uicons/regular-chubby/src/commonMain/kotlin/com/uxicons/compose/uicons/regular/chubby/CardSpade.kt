package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CardSpade: ImageVector? = null

val Icons.Rc.CardSpade: ImageVector
    get() = _CardSpade ?: UXIcon(name = "CardSpade") {
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
                reflectiveCurveToRelative(-5.19f, -0.62f, -6.23f, -0.93f)
                curveToRelative(-0.24f, -1.2f, -0.77f, -4.27f, -0.77f, -8.07f)
                curveToRelative(0f, -3.77f, 0.53f, -6.86f, 0.78f, -8.07f)
                curveToRelative(1.04f, -0.31f, 3.5f, -0.93f, 6.22f, -0.93f)
                reflectiveCurveToRelative(5.19f, 0.62f, 6.23f, 0.93f)
                curveToRelative(0.24f, 1.2f, 0.77f, 4.27f, 0.77f, 8.07f)
                curveToRelative(0f, 3.77f, -0.53f, 6.86f, -0.78f, 8.07f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.53f, 7.89f)
                curveToRelative(-0.95f, -0.53f, -2.1f, -0.53f, -3.05f, 0f)
                curveToRelative(-0.41f, 0.23f, -2.47f, 1.44f, -2.47f, 3.38f)
                curveToRelative(0f, 0.98f, 0.48f, 1.79f, 0.95f, 2.21f)
                curveToRelative(0.5f, 0.46f, 1.12f, 0.68f, 1.72f, 0.68f)
                curveToRelative(0.07f, 0f, 0.13f, -0.0f, 0.19f, -0.01f)
                curveToRelative(-0.02f, 0.14f, -0.05f, 0.25f, -0.08f, 0.33f)
                horizontalLineToRelative(-0.07f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2.57f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-0.09f)
                curveToRelative(-0.03f, -0.09f, -0.06f, -0.2f, -0.08f, -0.34f)
                curveToRelative(0.67f, 0.06f, 1.37f, -0.16f, 1.93f, -0.67f)
                curveToRelative(0.48f, -0.44f, 0.95f, -1.27f, 0.95f, -2.29f)
                curveToRelative(0f, -2.11f, -2.46f, -3.3f, -2.47f, -3.31f)
                close()
            }
        }.also { _CardSpade = it}
