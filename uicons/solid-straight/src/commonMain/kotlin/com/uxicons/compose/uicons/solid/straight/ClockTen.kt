package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockTen: ImageVector? = null

val Icons.Ss.ClockTen: ImageVector
    get() = _ClockTen ?: UXIcon(name = "ClockTen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                reflectiveCurveToRelative(-5.38f, 12f, -12f, 12f)
                close()
                moveTo(13f, 5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5.26f)
                lineToRelative(-2.81f, -1.64f)
                lineToRelative(-1.01f, 1.73f)
                lineToRelative(5.82f, 3.4f)
                lineTo(13f, 5f)
                close()
            }
        }.also { _ClockTen = it}
