package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserPilotTie: ImageVector? = null

val Icons.Rs.UserPilotTie: ImageVector
    get() = _UserPilotTie ?: UXIcon(name = "UserPilotTie") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 9.04f)
                verticalLineToRelative(-3f)
                lineToRelative(2f, -1f)
                verticalLineToRelative(-3f)
                lineTo(13.7f, 0.25f)
                curveTo(12.58f, -0.03f, 11.42f, -0.03f, 10.3f, 0.25f)
                lineToRelative(-6.3f, 1.79f)
                verticalLineToRelative(3f)
                lineToRelative(2f, 1f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                close()
                moveTo(10.02f, 2.52f)
                lineToRelative(1.99f, 1.19f)
                lineToRelative(1.99f, -1.19f)
                lineToRelative(1.03f, 1.72f)
                lineToRelative(-3.02f, 1.81f)
                lineToRelative(-3.02f, -1.81f)
                lineToRelative(1.03f, -1.72f)
                close()
                moveTo(12f, 13.04f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                verticalLineToRelative(-1.39f)
                curveToRelative(0.98f, 0.21f, 2.31f, 0.39f, 4f, 0.39f)
                reflectiveCurveToRelative(3.02f, -0.18f, 4f, -0.39f)
                verticalLineToRelative(1.39f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                close()
                moveTo(9.5f, 16f)
                lineToRelative(2f, 2.5f)
                lineToRelative(-1.49f, 5.5f)
                lineToRelative(-2.81f, -5.44f)
                curveToRelative(-1.04f, 0.14f, -2.21f, 1.12f, -2.21f, 2.94f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -3.03f, 2.47f, -5.5f, 5.5f, -5.5f)
                horizontalLineToRelative(1f)
                close()
                moveTo(21f, 21.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -1.82f, -1.17f, -2.8f, -2.07f, -3.17f)
                lineToRelative(-2.93f, 5.67f)
                lineToRelative(-1.5f, -5.5f)
                lineToRelative(2f, -2.5f)
                horizontalLineToRelative(1f)
                curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
                close()
            }
        }.also { _UserPilotTie = it}
