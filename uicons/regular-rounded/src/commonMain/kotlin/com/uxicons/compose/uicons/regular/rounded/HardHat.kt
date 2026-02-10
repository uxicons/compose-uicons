package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HardHat: ImageVector? = null

val Icons.Rr.HardHat: ImageVector
    get() = _HardHat ?: UXIcon(name = "HardHat") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 16f)
                verticalLineToRelative(-3.08f)
                curveToRelative(0f, -4.73f, -3.18f, -8.92f, -7.78f, -10.29f)
                curveToRelative(-0.73f, -0.99f, -1.9f, -1.63f, -3.22f, -1.63f)
                reflectiveCurveToRelative(-2.49f, 0.64f, -3.22f, 1.63f)
                curveTo(4.18f, 4.0f, 1f, 8.19f, 1f, 12.92f)
                verticalLineToRelative(3.08f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(0.47f)
                curveToRelative(1.0f, 1.35f, 4.29f, 5f, 10.53f, 5f)
                reflectiveCurveToRelative(9.52f, -3.65f, 10.53f, -5f)
                horizontalLineToRelative(0.47f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(21f, 12.92f)
                verticalLineToRelative(3.08f)
                horizontalLineToRelative(-5f)
                lineTo(16f, 5.07f)
                curveToRelative(3.01f, 1.46f, 5f, 4.48f, 5f, 7.85f)
                close()
                moveTo(12f, 3f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 1.99f)
                verticalLineToRelative(11.01f)
                horizontalLineToRelative(-4f)
                lineTo(10f, 4.99f)
                curveToRelative(0f, -1.1f, 0.9f, -1.99f, 2f, -1.99f)
                close()
                moveTo(8f, 5.07f)
                verticalLineToRelative(10.93f)
                lineTo(3f, 16f)
                verticalLineToRelative(-3.08f)
                curveToRelative(0f, -3.37f, 1.99f, -6.39f, 5f, -7.85f)
                close()
                moveTo(4.14f, 18f)
                horizontalLineToRelative(15.7f)
                curveToRelative(-1.39f, 1.31f, -3.94f, 3f, -7.84f, 3f)
                curveToRelative(-3.94f, 0f, -6.48f, -1.69f, -7.86f, -3f)
                close()
            }
        }.also { _HardHat = it}
