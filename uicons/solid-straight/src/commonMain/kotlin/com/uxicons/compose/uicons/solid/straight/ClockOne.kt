package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockOne: ImageVector? = null

val Icons.Ss.ClockOne: ImageVector
    get() = _ClockOne ?: UXIcon(name = "ClockOne") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                reflectiveCurveToRelative(-5.38f, 12f, -12f, 12f)
                close()
                moveTo(15.8f, 8.6f)
                lineToRelative(-1.6f, -1.2f)
                lineToRelative(-1.2f, 1.6f)
                lineTo(13f, 5f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 15f)
                lineToRelative(4.8f, -6.4f)
                close()
            }
        }.also { _ClockOne = it}
