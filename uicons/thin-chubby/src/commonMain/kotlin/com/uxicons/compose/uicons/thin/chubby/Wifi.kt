package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Wifi: ImageVector? = null

val Icons.Tc.Wifi: ImageVector
    get() = _Wifi ?: UXIcon(name = "Wifi") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.86f, 7.81f)
                curveToRelative(-3.04f, -3.1f, -6.89f, -4.81f, -10.86f, -4.81f)
                reflectiveCurveToRelative(-7.82f, 1.71f, -10.86f, 4.81f)
                curveToRelative(-0.19f, 0.2f, -0.19f, 0.51f, 0.01f, 0.71f)
                curveToRelative(0.2f, 0.19f, 0.52f, 0.19f, 0.71f, -0.01f)
                curveToRelative(2.85f, -2.91f, 6.45f, -4.51f, 10.14f, -4.51f)
                reflectiveCurveToRelative(7.29f, 1.6f, 10.14f, 4.51f)
                curveToRelative(0.1f, 0.1f, 0.41f, 0.29f, 0.71f, 0.01f)
                curveToRelative(0.2f, -0.19f, 0.2f, -0.51f, 0.01f, -0.71f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 10.24f)
                curveToRelative(-2.41f, 0f, -4.71f, 1.05f, -6.66f, 3.04f)
                curveToRelative(-0.19f, 0.2f, -0.19f, 0.51f, 0.01f, 0.71f)
                curveToRelative(0.2f, 0.19f, 0.52f, 0.19f, 0.71f, -0.01f)
                curveToRelative(1.75f, -1.79f, 3.81f, -2.73f, 5.94f, -2.73f)
                reflectiveCurveToRelative(4.19f, 0.95f, 5.94f, 2.73f)
                curveToRelative(0.1f, 0.1f, 0.4f, 0.28f, 0.71f, 0.01f)
                curveToRelative(0.2f, -0.18f, 0.2f, -0.51f, 0.01f, -0.71f)
                curveToRelative(-1.95f, -1.99f, -4.25f, -3.04f, -6.66f, -3.04f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 16.8f)
                curveToRelative(-1.38f, 0f, -2.08f, 0.71f, -2.08f, 2.1f)
                reflectiveCurveToRelative(0.7f, 2.1f, 2.08f, 2.1f)
                reflectiveCurveToRelative(2.08f, -0.71f, 2.08f, -2.1f)
                reflectiveCurveToRelative(-0.7f, -2.1f, -2.08f, -2.1f)
                close()
                moveTo(12f, 20f)
                curveToRelative(-0.82f, 0f, -1.07f, -0.26f, -1.07f, -1.1f)
                curveToRelative(0f, -0.76f, 0.15f, -1.1f, 1.07f, -1.1f)
                curveToRelative(0.82f, 0f, 1.07f, 0.26f, 1.07f, 1.1f)
                curveToRelative(0f, 0.76f, -0.15f, 1.1f, -1.07f, 1.1f)
                close()
            }
        }.also { _Wifi = it}
