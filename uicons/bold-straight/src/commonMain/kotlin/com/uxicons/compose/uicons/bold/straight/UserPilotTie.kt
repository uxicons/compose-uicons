package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserPilotTie: ImageVector? = null

val Icons.Bs.UserPilotTie: ImageVector
    get() = _UserPilotTie ?: UXIcon(name = "UserPilotTie") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 9f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                verticalLineToRelative(-2.98f)
                lineToRelative(2f, -1f)
                verticalLineToRelative(-3f)
                lineTo(13.7f, 0.22f)
                curveToRelative(-0.56f, -0.14f, -1.13f, -0.21f, -1.7f, -0.21f)
                reflectiveCurveToRelative(-1.14f, 0.07f, -1.7f, 0.21f)
                lineToRelative(-6.3f, 1.79f)
                verticalLineToRelative(3f)
                lineToRelative(2f, 1f)
                verticalLineToRelative(2.98f)
                close()
                moveTo(15f, 9f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-1.2f)
                curveToRelative(0.83f, 0.12f, 1.82f, 0.21f, 3f, 0.21f)
                reflectiveCurveToRelative(2.17f, -0.09f, 3f, -0.21f)
                verticalLineToRelative(1.2f)
                close()
                moveTo(10.02f, 2.16f)
                lineToRelative(1.99f, 1.19f)
                lineToRelative(1.99f, -1.19f)
                lineToRelative(1.03f, 1.72f)
                lineToRelative(-3.02f, 1.81f)
                lineToRelative(-3.02f, -1.81f)
                lineToRelative(1.03f, -1.72f)
                close()
                moveTo(21f, 21.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-1.5f)
                lineToRelative(-1.5f, 1.5f)
                lineToRelative(2f, 3.5f)
                horizontalLineToRelative(-5f)
                lineToRelative(2f, -3.5f)
                lineToRelative(-1.5f, -1.5f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -3.03f, 2.47f, -5.5f, 5.5f, -5.5f)
                horizontalLineToRelative(7f)
                curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
                close()
            }
        }.also { _UserPilotTie = it}
