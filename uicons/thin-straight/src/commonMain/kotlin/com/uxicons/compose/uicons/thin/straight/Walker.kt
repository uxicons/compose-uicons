package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Walker: ImageVector? = null

val Icons.Ts.Walker: ImageVector
    get() = _Walker ?: UXIcon(name = "Walker") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 19.05f)
                lineTo(22f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-9.1f)
                curveToRelative(-1.05f, 0f, -1.99f, 0.66f, -2.35f, 1.64f)
                lineTo(0.03f, 23.63f)
                lineToRelative(0.94f, 0.34f)
                lineToRelative(4.73f, -12.97f)
                horizontalLineToRelative(15.3f)
                verticalLineToRelative(8.05f)
                curveToRelative(-1.14f, 0.23f, -2f, 1.24f, -2f, 2.45f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0f, -1.21f, -0.86f, -2.22f, -2f, -2.45f)
                close()
                moveTo(6.07f, 10f)
                lineTo(8.99f, 1.99f)
                curveToRelative(0.21f, -0.59f, 0.78f, -0.99f, 1.41f, -0.99f)
                horizontalLineToRelative(9.1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(7.5f)
                lineTo(6.07f, 10f)
                close()
                moveTo(21.5f, 23f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _Walker = it}
