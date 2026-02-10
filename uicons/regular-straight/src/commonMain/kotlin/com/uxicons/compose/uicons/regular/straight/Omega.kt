package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Omega: ImageVector? = null

val Icons.Rs.Omega: ImageVector
    get() = _Omega ?: UXIcon(name = "Omega") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 24f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(-4.44f)
                lineToRelative(0.67f, -0.23f)
                curveToRelative(3.85f, -1.36f, 6.33f, -4.63f, 6.33f, -8.32f)
                curveToRelative(0f, -4.96f, -4.49f, -9f, -10f, -9f)
                reflectiveCurveTo(2f, 6.04f, 2f, 11f)
                curveToRelative(0f, 3.69f, 2.49f, 6.96f, 6.33f, 8.32f)
                lineToRelative(0.67f, 0.23f)
                verticalLineToRelative(4.44f)
                horizontalLineTo(0f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-1.05f)
                curveTo(2.72f, 19.17f, 0f, 15.33f, 0f, 11f)
                curveTo(0f, 4.93f, 5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 4.93f, 12f, 11f)
                curveToRelative(0f, 4.33f, -2.72f, 8.17f, -7f, 9.95f)
                verticalLineToRelative(1.05f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _Omega = it}
