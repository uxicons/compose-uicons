package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlaneDeparture: ImageVector? = null

val Icons.Ts.PlaneDeparture: ImageVector
    get() = _PlaneDeparture ?: UXIcon(name = "PlaneDeparture") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0.81f, 14.57f)
                lineToRelative(5.05f, 3.86f)
                lineTo(23.8f, 9.88f)
                lineToRelative(-1.09f, -2.35f)
                curveToRelative(-0.6f, -1.3f, -2.14f, -1.86f, -3.44f, -1.26f)
                lineToRelative(-3.45f, 1.66f)
                lineTo(8.68f, 3.51f)
                curveToRelative(-0.76f, -0.56f, -1.77f, -0.67f, -2.63f, -0.27f)
                lineToRelative(-2.94f, 1.38f)
                lineToRelative(6.9f, 6.11f)
                lineToRelative(-3.94f, 1.9f)
                lineToRelative(-3.41f, -1.49f)
                curveToRelative(-0.49f, -0.18f, -1.03f, -0.16f, -1.5f, 0.06f)
                curveTo(0.5f, 11.49f, 0.07f, 12.09f, 0.01f, 12.8f)
                curveToRelative(-0.07f, 0.71f, 0.24f, 1.37f, 0.81f, 1.77f)
                close()
                moveTo(4.9f, 4.88f)
                lineToRelative(1.56f, -0.73f)
                curveToRelative(0.53f, -0.25f, 1.15f, -0.18f, 1.65f, 0.19f)
                lineToRelative(6.64f, 4.1f)
                lineToRelative(-3.78f, 1.82f)
                lineTo(4.9f, 4.88f)
                close()
                moveTo(1.0f, 12.89f)
                curveToRelative(0.03f, -0.35f, 0.24f, -0.64f, 0.56f, -0.79f)
                curveToRelative(0.13f, -0.06f, 0.28f, -0.09f, 0.41f, -0.09f)
                curveToRelative(0.1f, 0f, 0.21f, 0.02f, 0.3f, 0.05f)
                lineToRelative(3.81f, 1.67f)
                lineToRelative(13.62f, -6.55f)
                curveToRelative(0.39f, -0.18f, 0.82f, -0.19f, 1.22f, -0.05f)
                reflectiveCurveToRelative(0.72f, 0.44f, 0.9f, 0.82f)
                lineToRelative(0.67f, 1.45f)
                lineTo(5.99f, 17.27f)
                lineTo(1.41f, 13.77f)
                curveToRelative(-0.28f, -0.2f, -0.43f, -0.53f, -0.4f, -0.88f)
                close()
                moveTo(24f, 23f)
                verticalLineToRelative(1f)
                lineTo(0f, 24f)
                verticalLineToRelative(-1f)
                lineTo(24f, 23f)
                close()
            }
        }.also { _PlaneDeparture = it}
