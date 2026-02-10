package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FootballTicket: ImageVector? = null

val Icons.Ss.FootballTicket: ImageVector
    get() = _FootballTicket ?: UXIcon(name = "FootballTicket") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 10f)
                curveToRelative(-3.86f, 0f, -7f, 3.14f, -7f, 7f)
                reflectiveCurveToRelative(3.14f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -3.14f, 7f, -7f)
                reflectiveCurveToRelative(-3.14f, -7f, -7f, -7f)
                close()
                moveTo(15.74f, 21.82f)
                lineTo(15.05f, 19.67f)
                horizontalLineToRelative(-2.26f)
                curveToRelative(-0.45f, -0.71f, -0.72f, -1.54f, -0.76f, -2.43f)
                lineToRelative(1.82f, -1.28f)
                lineToRelative(-0.66f, -2.15f)
                curveToRelative(0.54f, -0.64f, 1.22f, -1.15f, 2.01f, -1.46f)
                lineToRelative(1.81f, 1.32f)
                lineToRelative(1.81f, -1.32f)
                curveToRelative(0.79f, 0.31f, 1.47f, 0.82f, 2.01f, 1.46f)
                lineToRelative(-0.66f, 2.15f)
                lineToRelative(1.82f, 1.28f)
                curveToRelative(-0.04f, 0.89f, -0.31f, 1.72f, -0.76f, 2.43f)
                horizontalLineToRelative(-2.26f)
                reflectiveCurveToRelative(-0.69f, 2.15f, -0.69f, 2.15f)
                curveToRelative(-0.41f, 0.11f, -0.82f, 0.18f, -1.26f, 0.18f)
                reflectiveCurveToRelative(-0.86f, -0.07f, -1.26f, -0.18f)
                close()
                moveTo(18.95f, 19.67f)
                horizontalLineToRelative(-3.9f)
                lineToRelative(-1.21f, -3.71f)
                lineToRelative(3.16f, -2.29f)
                lineToRelative(3.16f, 2.29f)
                lineToRelative(-1.21f, 3.71f)
                close()
                moveTo(8.06f, 18f)
                horizontalLineToRelative(-5.06f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                verticalLineToRelative(-4f)
                lineToRelative(1.1f, 0.0f)
                curveToRelative(1.1f, -0.03f, 1.99f, -0.85f, 1.99f, -1.96f)
                reflectiveCurveToRelative(-0.88f, -2.01f, -1.98f, -2.04f)
                lineToRelative(-1.1f, 0.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                horizontalLineToRelative(18f)
                curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-0.89f)
                curveToRelative(-1.0f, 0f, -1.92f, 0.68f, -2.08f, 1.66f)
                curveToRelative(-0.02f, 0.1f, -0.01f, 0.19f, -0.01f, 0.29f)
                curveToRelative(-1.21f, -0.6f, -2.57f, -0.95f, -4.01f, -0.95f)
                curveToRelative(-4.97f, 0f, -9f, 4.03f, -9f, 9f)
                curveToRelative(0f, 0.34f, 0.02f, 0.67f, 0.06f, 1f)
                close()
            }
        }.also { _FootballTicket = it}
