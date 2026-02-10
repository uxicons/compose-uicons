package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FootballTicket: ImageVector? = null

val Icons.Sr.FootballTicket: ImageVector
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
                moveTo(24f, 5f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                curveToRelative(-1.09f, 0f, -1.97f, 0.87f, -2.0f, 1.95f)
                curveToRelative(-1.21f, -0.6f, -2.56f, -0.95f, -4.0f, -0.95f)
                curveToRelative(-4.97f, 0f, -9f, 4.03f, -9f, 9f)
                curveToRelative(0f, 0.34f, 0.02f, 0.67f, 0.06f, 1f)
                horizontalLineToRelative(-3.06f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-0.92f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                curveToRelative(0.02f, 0f, 0.05f, 0.0f, 0.08f, 0.0f)
                curveToRelative(1.11f, -0.02f, 2f, -0.93f, 2f, -2.04f)
                reflectiveCurveToRelative(-0.89f, -2.02f, -2f, -2.04f)
                curveToRelative(-0.03f, 0.0f, -0.06f, 0.0f, -0.08f, 0.0f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1.0f)
                curveToRelative(-0.0f, -2.76f, 2.24f, -5.0f, 5.0f, -5.0f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
            }
        }.also { _FootballTicket = it}
