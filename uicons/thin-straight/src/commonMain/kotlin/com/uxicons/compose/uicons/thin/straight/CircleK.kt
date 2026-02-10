package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleK: ImageVector? = null

val Icons.Ts.CircleK: ImageVector
    get() = _CircleK ?: UXIcon(name = "CircleK") {
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
                moveTo(17.3f, 6f)
                lineToRelative(-3.81f, 5.48f)
                lineToRelative(3.48f, 6.52f)
                horizontalLineToRelative(-1.24f)
                lineToRelative(-3.21f, -6f)
                horizontalLineToRelative(-4.51f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-1f)
                lineTo(7f, 6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(4.6f)
                lineToRelative(3.48f, -5f)
                horizontalLineToRelative(1.23f)
                close()
            }
        }.also { _CircleK = it}
