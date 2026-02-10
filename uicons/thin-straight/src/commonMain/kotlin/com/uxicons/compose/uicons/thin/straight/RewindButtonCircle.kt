package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RewindButtonCircle: ImageVector? = null

val Icons.Ts.RewindButtonCircle: ImageVector
    get() = _RewindButtonCircle ?: UXIcon(name = "RewindButtonCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 6.48f)
                lineTo(3.59f, 12f)
                lineToRelative(8.41f, 5.52f)
                verticalLineToRelative(-3.94f)
                lineToRelative(6f, 3.94f)
                lineTo(18f, 6.48f)
                lineToRelative(-6f, 3.94f)
                verticalLineToRelative(-3.94f)
                close()
                moveTo(11f, 15.67f)
                lineToRelative(-5.59f, -3.67f)
                lineToRelative(5.59f, -3.67f)
                verticalLineToRelative(7.33f)
                close()
                moveTo(17f, 8.33f)
                verticalLineToRelative(7.33f)
                lineToRelative(-5.59f, -3.67f)
                lineToRelative(5.59f, -3.67f)
                close()
                moveTo(12f, 0f)
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
            }
        }.also { _RewindButtonCircle = it}
