package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlayCircle: ImageVector? = null

val Icons.Ts.PlayCircle: ImageVector
    get() = _PlayCircle ?: UXIcon(name = "PlayCircle") {
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
                moveTo(8f, 17.36f)
                lineToRelative(9.52f, -5.36f)
                lineToRelative(-9.52f, -5.36f)
                verticalLineToRelative(10.71f)
                close()
                moveTo(9f, 8.36f)
                lineToRelative(6.48f, 3.65f)
                lineToRelative(-6.48f, 3.65f)
                verticalLineToRelative(-7.29f)
                close()
            }
        }.also { _PlayCircle = it}
