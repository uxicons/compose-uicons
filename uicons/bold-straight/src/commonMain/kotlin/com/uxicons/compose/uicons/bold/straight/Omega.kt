package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Omega: ImageVector? = null

val Icons.Bs.Omega: ImageVector
    get() = _Omega ?: UXIcon(name = "Omega") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 21f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(-5.41f)
                lineToRelative(0.91f, -0.39f)
                curveToRelative(3.09f, -1.33f, 5.09f, -4.16f, 5.09f, -7.2f)
                curveToRelative(0f, -4.41f, -4.04f, -8f, -9f, -8f)
                reflectiveCurveTo(3f, 6.59f, 3f, 11f)
                curveToRelative(0f, 3.04f, 2.0f, 5.86f, 5.09f, 7.2f)
                lineToRelative(0.91f, 0.39f)
                verticalLineToRelative(5.41f)
                horizontalLineTo(0f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-0.48f)
                curveTo(2.33f, 18.56f, 0f, 14.93f, 0f, 11f)
                curveTo(0f, 4.93f, 5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 4.93f, 12f, 11f)
                curveToRelative(0f, 3.92f, -2.32f, 7.56f, -6f, 9.52f)
                verticalLineToRelative(0.48f)
                close()
            }
        }.also { _Omega = it}
