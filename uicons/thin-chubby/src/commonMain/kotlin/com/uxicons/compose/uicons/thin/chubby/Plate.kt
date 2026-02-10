package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Plate: ImageVector? = null

val Icons.Tc.Plate: ImageVector
    get() = _Plate ?: UXIcon(name = "Plate") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                curveTo(6.57f, 1f, 1.03f, 2.31f, 1.03f, 12f)
                curveToRelative(0f, 7.5f, 3.49f, 11f, 10.97f, 11f)
                curveToRelative(5.11f, 0f, 10.97f, -1.25f, 10.97f, -11f)
                curveToRelative(0f, -7.71f, -3.28f, -11f, -10.97f, -11f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-6.99f, 0f, -9.97f, -2.99f, -9.97f, -10f)
                curveTo(2.03f, 3.21f, 6.82f, 2f, 12f, 2f)
                curveToRelative(7.08f, 0f, 9.97f, 2.9f, 9.97f, 10f)
                reflectiveCurveToRelative(-2.89f, 10f, -9.97f, 10f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.28f, 11.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                curveToRelative(0f, 5.04f, -1.3f, 5.8f, -5.78f, 5.8f)
                curveToRelative(-4.65f, 0f, -5.78f, -1.14f, -5.78f, -5.8f)
                curveToRelative(0f, -5.04f, 1.3f, -5.8f, 5.78f, -5.8f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                curveToRelative(-4.78f, 0f, -6.78f, 0.94f, -6.78f, 6.8f)
                curveToRelative(0f, 5.21f, 1.58f, 6.8f, 6.78f, 6.8f)
                curveToRelative(4.78f, 0f, 6.78f, -0.94f, 6.78f, -6.8f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                close()
            }
        }.also { _Plate = it}
