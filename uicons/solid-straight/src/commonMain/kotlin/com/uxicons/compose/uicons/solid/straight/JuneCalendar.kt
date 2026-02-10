package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _JuneCalendar: ImageVector? = null

val Icons.Ss.JuneCalendar: ImageVector
    get() = _JuneCalendar ?: UXIcon(name = "JuneCalendar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 16f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-1.6f)
                lineToRelative(-1.8f, -4.05f)
                verticalLineToRelative(4.05f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(0.01f)
                lineToRelative(1.8f, 4.05f)
                verticalLineToRelative(-4.06f)
                close()
                moveTo(10.4f, 16f)
                verticalLineToRelative(5.7f)
                curveToRelative(0f, 0.39f, -0.31f, 0.7f, -0.7f, 0.7f)
                reflectiveCurveToRelative(-0.7f, -0.31f, -0.7f, -0.7f)
                verticalLineToRelative(-0.7f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(0.7f)
                curveToRelative(0f, 1.27f, 1.03f, 2.3f, 2.3f, 2.3f)
                reflectiveCurveToRelative(2.3f, -1.03f, 2.3f, -2.3f)
                verticalLineToRelative(-5.7f)
                close()
                moveTo(16.2f, 16f)
                verticalLineToRelative(5.7f)
                curveToRelative(0f, 0.39f, -0.31f, 0.7f, -0.7f, 0.7f)
                reflectiveCurveToRelative(-0.7f, -0.31f, -0.7f, -0.7f)
                verticalLineToRelative(-5.7f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(5.7f)
                curveToRelative(0f, 1.27f, 1.03f, 2.3f, 2.3f, 2.3f)
                reflectiveCurveToRelative(2.3f, -1.03f, 2.3f, -2.3f)
                verticalLineToRelative(-5.7f)
                close()
                moveTo(24f, 5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                close()
                moveTo(0f, 10f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-15.5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                curveToRelative(0.05f, 0.73f, 0.28f, 1.41f, 0.66f, 2f)
                horizontalLineToRelative(-6.16f)
                close()
            }
        }.also { _JuneCalendar = it}
