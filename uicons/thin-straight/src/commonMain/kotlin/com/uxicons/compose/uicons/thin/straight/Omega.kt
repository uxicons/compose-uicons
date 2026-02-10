package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Omega: ImageVector? = null

val Icons.Ts.Omega: ImageVector
    get() = _Omega ?: UXIcon(name = "Omega") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 24f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(-3.37f)
                lineToRelative(0.36f, -0.1f)
                curveToRelative(4.57f, -1.33f, 7.64f, -5.16f, 7.64f, -9.52f)
                curveToRelative(0f, -5.51f, -4.93f, -10f, -11f, -10f)
                reflectiveCurveTo(1f, 5.49f, 1f, 11f)
                curveToRelative(0f, 4.36f, 3.07f, 8.19f, 7.64f, 9.52f)
                lineToRelative(0.36f, 0.1f)
                verticalLineToRelative(3.37f)
                horizontalLineTo(0f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-1.63f)
                curveTo(3.2f, 19.82f, 0f, 15.7f, 0f, 11f)
                curveTo(0f, 4.93f, 5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 4.93f, 12f, 11f)
                curveToRelative(0f, 4.69f, -3.2f, 8.82f, -8f, 10.37f)
                verticalLineToRelative(1.63f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(1f)
                close()
            }
        }.also { _Omega = it}
