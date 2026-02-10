package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserPilotTie: ImageVector? = null

val Icons.Ss.UserPilotTie: ImageVector
    get() = _UserPilotTie ?: UXIcon(name = "UserPilotTie") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.7f, 0.21f)
                curveToRelative(-1.11f, -0.28f, -2.28f, -0.28f, -3.4f, 0f)
                lineToRelative(-6.3f, 1.79f)
                verticalLineToRelative(3f)
                lineToRelative(2f, 1f)
                verticalLineToRelative(1f)
                reflectiveCurveToRelative(2f, 1f, 6f, 1f)
                reflectiveCurveToRelative(6f, -1f, 6f, -1f)
                verticalLineToRelative(-1f)
                lineToRelative(2f, -1f)
                verticalLineToRelative(-3f)
                lineTo(13.7f, 0.21f)
                close()
                moveTo(12.0f, 6f)
                lineToRelative(-3.02f, -1.81f)
                lineToRelative(1.03f, -1.72f)
                lineToRelative(1.99f, 1.19f)
                lineToRelative(1.99f, -1.19f)
                lineToRelative(1.03f, 1.72f)
                lineToRelative(-3.02f, 1.81f)
                close()
                moveTo(12.0f, 10f)
                curveToRelative(-2.93f, 0f, -4.93f, -0.49f, -6.0f, -0.85f)
                curveToRelative(0.08f, 3.24f, 2.74f, 5.85f, 6.0f, 5.85f)
                reflectiveCurveToRelative(5.92f, -2.61f, 6.0f, -5.85f)
                curveToRelative(-1.07f, 0.36f, -3.07f, 0.85f, -6.0f, 0.85f)
                close()
                moveTo(21f, 21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-7f)
                lineToRelative(-1.5f, -5.5f)
                lineToRelative(2f, -2.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(11.5f, 18.5f)
                lineToRelative(-1.49f, 5.5f)
                lineTo(3f, 24f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(1.5f)
                lineToRelative(2f, 2.5f)
                close()
            }
        }.also { _UserPilotTie = it}
