package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _YogaBall: ImageVector? = null

val Icons.Tr.YogaBall: ImageVector
    get() = _YogaBall ?: UXIcon(name = "YogaBall") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveToRelative(-6.62f, 0f, -12f, 5.38f, -12f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveToRelative(-5.38f, -12f, -12f, -12f)
                close()
                moveTo(20.03f, 19.5f)
                curveToRelative(-1.14f, 0.34f, -2.33f, 0.51f, -3.53f, 0.51f)
                curveToRelative(-6.89f, 0f, -12.5f, -5.61f, -12.5f, -12.5f)
                curveToRelative(0f, -1.17f, 0.16f, -2.33f, 0.48f, -3.44f)
                curveToRelative(0.01f, -0.02f, 0.0f, -0.04f, 0.01f, -0.07f)
                curveToRelative(1.15f, -1.08f, 2.54f, -1.92f, 4.07f, -2.43f)
                curveToRelative(-0.36f, 1.11f, -0.56f, 2.26f, -0.56f, 3.44f)
                curveToRelative(0f, 6.07f, 4.93f, 11f, 11f, 11f)
                curveToRelative(1.18f, 0f, 2.33f, -0.19f, 3.44f, -0.56f)
                curveToRelative(-0.51f, 1.53f, -1.34f, 2.9f, -2.41f, 4.05f)
                close()
                moveTo(22.52f, 8.79f)
                curveToRelative(-0.49f, 0.13f, -1.0f, 0.21f, -1.52f, 0.21f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                curveToRelative(0f, -0.52f, 0.08f, -1.02f, 0.21f, -1.52f)
                curveToRelative(3.49f, 1.07f, 6.24f, 3.82f, 7.31f, 7.31f)
                close()
                moveTo(14.25f, 1.23f)
                curveToRelative(-0.15f, 0.58f, -0.25f, 1.17f, -0.25f, 1.77f)
                curveToRelative(0f, 3.86f, 3.14f, 7f, 7f, 7f)
                curveToRelative(0.6f, 0f, 1.19f, -0.1f, 1.77f, -0.25f)
                curveToRelative(0.15f, 0.72f, 0.23f, 1.48f, 0.23f, 2.25f)
                curveToRelative(0f, 0.78f, -0.08f, 1.53f, -0.24f, 2.27f)
                curveToRelative(-1.19f, 0.49f, -2.46f, 0.73f, -3.76f, 0.73f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                curveToRelative(0f, -1.3f, 0.25f, -2.57f, 0.73f, -3.76f)
                curveToRelative(0.73f, -0.15f, 1.49f, -0.24f, 2.27f, -0.24f)
                curveToRelative(0.77f, 0f, 1.52f, 0.08f, 2.25f, 0.23f)
                close()
                moveTo(1f, 12f)
                curveToRelative(0f, -2.44f, 0.81f, -4.68f, 2.15f, -6.51f)
                curveToRelative(-0.1f, 0.66f, -0.15f, 1.33f, -0.15f, 2.01f)
                curveToRelative(0f, 7.44f, 6.06f, 13.5f, 13.5f, 13.5f)
                curveToRelative(0.67f, 0f, 1.34f, -0.05f, 2.01f, -0.15f)
                curveToRelative(-1.82f, 1.34f, -4.07f, 2.15f, -6.51f, 2.15f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                close()
            }
        }.also { _YogaBall = it}
