package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleY: ImageVector? = null

val Icons.Ts.CircleY: ImageVector
    get() = _CircleY ?: UXIcon(name = "CircleY") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                close()
                moveTo(17.1f, 6.25f)
                lineToRelative(-4.6f, 6.37f)
                verticalLineToRelative(5.38f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-5.38f)
                lineToRelative(-4.6f, -6.37f)
                horizontalLineToRelative(1.24f)
                lineToRelative(3.86f, 5.36f)
                lineToRelative(3.86f, -5.36f)
                horizontalLineToRelative(1.24f)
                close()
            }
        }.also { _CircleY = it}
