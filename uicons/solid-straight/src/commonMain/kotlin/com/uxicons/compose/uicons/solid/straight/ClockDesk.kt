package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockDesk: ImageVector? = null

val Icons.Ss.ClockDesk: ImageVector
    get() = _ClockDesk ?: UXIcon(name = "ClockDesk") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 20f)
                curveToRelative(5.51f, 0f, 10f, -4.49f, 10f, -10f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.26f, -5.28f, -4.64f, -9.5f, -9.99f, -9.5f)
                reflectiveCurveTo(2.27f, 4.22f, 2.01f, 9.5f)
                horizontalLineToRelative(-0.01f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 5.51f, 4.49f, 10f, 10f, 10f)
                close()
                moveTo(11f, 9.45f)
                verticalLineToRelative(-4.45f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5.55f)
                lineToRelative(-4.47f, 2.79f)
                lineToRelative(-1.06f, -1.7f)
                lineToRelative(3.53f, -2.21f)
                close()
                moveTo(22f, 16.63f)
                verticalLineToRelative(7.38f)
                lineTo(2f, 24.0f)
                verticalLineToRelative(-7.38f)
                curveToRelative(2.15f, 3.24f, 5.83f, 5.38f, 10f, 5.38f)
                reflectiveCurveToRelative(7.85f, -2.14f, 10f, -5.38f)
                close()
            }
        }.also { _ClockDesk = it}
