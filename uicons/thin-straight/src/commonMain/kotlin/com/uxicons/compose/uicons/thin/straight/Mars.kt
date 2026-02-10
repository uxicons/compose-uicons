package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mars: ImageVector? = null

val Icons.Ts.Mars: ImageVector
    get() = _Mars ?: UXIcon(name = "Mars") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.5f, 0f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(6.29f)
                lineToRelative(-8.15f, 8.15f)
                curveToRelative(-1.5f, -1.34f, -3.48f, -2.15f, -5.64f, -2.15f)
                curveTo(3.81f, 7f, 0f, 10.81f, 0f, 15.5f)
                reflectiveCurveToRelative(3.81f, 8.5f, 8.5f, 8.5f)
                reflectiveCurveToRelative(8.5f, -3.81f, 8.5f, -8.5f)
                curveToRelative(0f, -2.16f, -0.81f, -4.14f, -2.15f, -5.64f)
                lineTo(23f, 1.71f)
                verticalLineToRelative(6.29f)
                horizontalLineToRelative(1f)
                lineTo(24f, 1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(8.5f, 23f)
                curveToRelative(-4.14f, 0f, -7.5f, -3.36f, -7.5f, -7.5f)
                reflectiveCurveToRelative(3.36f, -7.5f, 7.5f, -7.5f)
                reflectiveCurveToRelative(7.5f, 3.36f, 7.5f, 7.5f)
                reflectiveCurveToRelative(-3.36f, 7.5f, -7.5f, 7.5f)
                close()
            }
        }.also { _Mars = it}
