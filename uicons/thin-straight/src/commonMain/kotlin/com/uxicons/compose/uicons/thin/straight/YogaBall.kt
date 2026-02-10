package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _YogaBall: ImageVector? = null

val Icons.Ts.YogaBall: ImageVector
    get() = _YogaBall ?: UXIcon(name = "YogaBall") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveToRelative(-6.62f, 0f, -12f, 5.38f, -12f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveToRelative(-5.38f, -12f, -12f, -12f)
                close()
                moveTo(22.5f, 8.72f)
                curveToRelative(-0.57f, 0.19f, -1.16f, 0.28f, -1.77f, 0.28f)
                curveToRelative(-3.16f, 0f, -5.73f, -2.57f, -5.73f, -5.72f)
                curveToRelative(0f, -0.61f, 0.1f, -1.21f, 0.28f, -1.77f)
                curveToRelative(3.43f, 1.07f, 6.14f, 3.79f, 7.22f, 7.22f)
                close()
                moveTo(14.31f, 1.25f)
                curveToRelative(-0.21f, 0.65f, -0.31f, 1.33f, -0.31f, 2.03f)
                curveToRelative(0f, 3.71f, 3.02f, 6.72f, 6.73f, 6.72f)
                curveToRelative(0.69f, 0f, 1.37f, -0.11f, 2.02f, -0.31f)
                curveToRelative(0.16f, 0.75f, 0.25f, 1.52f, 0.25f, 2.31f)
                curveToRelative(0f, 0.77f, -0.08f, 1.52f, -0.23f, 2.25f)
                curveToRelative(-1.2f, 0.49f, -2.46f, 0.75f, -3.77f, 0.75f)
                curveToRelative(-5.51f, 0f, -9.99f, -4.48f, -9.99f, -9.99f)
                curveToRelative(0f, -1.31f, 0.26f, -2.58f, 0.75f, -3.77f)
                curveToRelative(0.73f, -0.15f, 1.48f, -0.23f, 2.25f, -0.23f)
                curveToRelative(0.79f, 0f, 1.57f, 0.09f, 2.31f, 0.25f)
                close()
                moveTo(1f, 12f)
                curveToRelative(0f, -2.44f, 0.81f, -4.68f, 2.15f, -6.5f)
                curveToRelative(-0.1f, 0.66f, -0.15f, 1.33f, -0.15f, 2.01f)
                curveToRelative(0f, 7.44f, 6.05f, 13.49f, 13.49f, 13.49f)
                curveToRelative(0.68f, 0f, 1.35f, -0.05f, 2.01f, -0.15f)
                curveToRelative(-1.82f, 1.34f, -4.07f, 2.15f, -6.5f, 2.15f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                close()
                moveTo(20.04f, 19.49f)
                curveToRelative(-1.15f, 0.34f, -2.34f, 0.51f, -3.54f, 0.51f)
                curveToRelative(-6.89f, 0f, -12.49f, -5.6f, -12.49f, -12.49f)
                curveToRelative(0f, -1.21f, 0.18f, -2.4f, 0.51f, -3.54f)
                curveToRelative(1.15f, -1.07f, 2.52f, -1.9f, 4.04f, -2.4f)
                curveToRelative(-0.37f, 1.11f, -0.55f, 2.26f, -0.55f, 3.44f)
                curveToRelative(0f, 6.06f, 4.93f, 10.99f, 10.99f, 10.99f)
                curveToRelative(1.18f, 0f, 2.34f, -0.19f, 3.44f, -0.55f)
                curveToRelative(-0.5f, 1.52f, -1.33f, 2.89f, -2.4f, 4.04f)
                close()
            }
        }.also { _YogaBall = it}
