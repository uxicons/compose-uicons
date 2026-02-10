package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Flushed: ImageVector? = null

val Icons.Tc.Flushed: ImageVector
    get() = _Flushed ?: UXIcon(name = "Flushed") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.45f, 12.47f)
                curveToRelative(1.34f, -0.01f, 2.16f, -0.83f, 2.19f, -2.21f)
                curveToRelative(-0.02f, -1.34f, -0.86f, -2.17f, -2.2f, -2.18f)
                curveToRelative(-1.35f, 0.01f, -2.17f, 0.83f, -2.19f, 2.21f)
                curveToRelative(0.02f, 1.38f, 0.82f, 2.17f, 2.19f, 2.19f)
                horizontalLineToRelative(0.01f)
                close()
                moveTo(7.25f, 10.28f)
                curveToRelative(0.01f, -0.82f, 0.39f, -1.21f, 1.19f, -1.21f)
                curveToRelative(0.79f, 0.01f, 1.19f, 0.4f, 1.2f, 1.18f)
                curveToRelative(-0.01f, 0.82f, -0.4f, 1.21f, -1.19f, 1.21f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-0.81f, -0.01f, -1.18f, -0.38f, -1.19f, -1.19f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.55f, 8.07f)
                curveToRelative(-1.35f, 0.01f, -2.17f, 0.83f, -2.19f, 2.21f)
                curveToRelative(0.03f, 1.38f, 0.82f, 2.17f, 2.19f, 2.18f)
                horizontalLineToRelative(0.01f)
                curveToRelative(1.35f, -0.01f, 2.16f, -0.83f, 2.19f, -2.21f)
                curveToRelative(-0.02f, -1.34f, -0.86f, -2.18f, -2.2f, -2.19f)
                close()
                moveTo(15.56f, 11.47f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-0.81f, -0.01f, -1.18f, -0.38f, -1.2f, -1.18f)
                curveToRelative(0.01f, -0.82f, 0.4f, -1.21f, 1.19f, -1.21f)
                curveToRelative(0.79f, 0.01f, 1.19f, 0.4f, 1.2f, 1.19f)
                curveToRelative(-0.01f, 0.82f, -0.4f, 1.21f, -1.19f, 1.21f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.56f, 16.21f)
                horizontalLineToRelative(-7.11f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(7.11f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.0f, 1f)
                curveTo(4.89f, 1f, 1f, 5.16f, 1f, 12.01f)
                curveToRelative(0f, 7.0f, 3.77f, 10.99f, 11.0f, 10.99f)
                curveToRelative(7.16f, 0f, 10.86f, -3.74f, 11.0f, -11.01f)
                curveToRelative(-0.12f, -7.04f, -4.03f, -10.99f, -11.0f, -10.99f)
                close()
                moveTo(12.0f, 22f)
                curveToRelative(-6.61f, -0.04f, -9.88f, -3.31f, -10.0f, -10f)
                curveToRelative(0.12f, -6.59f, 3.49f, -9.96f, 10.0f, -10f)
                curveToRelative(4.49f, 0.03f, 9.86f, 1.79f, 10.0f, 9.99f)
                curveToRelative(-0.12f, 6.7f, -3.4f, 9.97f, -10.0f, 10.01f)
                close()
            }
        }.also { _Flushed = it}
