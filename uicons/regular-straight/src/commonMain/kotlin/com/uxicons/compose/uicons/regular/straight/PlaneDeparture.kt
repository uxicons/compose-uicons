package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlaneDeparture: ImageVector? = null

val Icons.Rs.PlaneDeparture: ImageVector
    get() = _PlaneDeparture ?: UXIcon(name = "PlaneDeparture") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1.01f, 15.37f)
                lineToRelative(5.08f, 3.61f)
                lineTo(23.97f, 10.45f)
                lineToRelative(-1.26f, -2.71f)
                curveToRelative(-0.69f, -1.5f, -2.48f, -2.16f, -3.98f, -1.46f)
                lineToRelative(-2.82f, 1.36f)
                lineTo(9.36f, 3.59f)
                curveToRelative(-0.88f, -0.66f, -2.05f, -0.78f, -3.05f, -0.31f)
                lineToRelative(-3.53f, 1.66f)
                lineToRelative(6.6f, 5.84f)
                lineToRelative(-3.1f, 1.49f)
                lineToRelative(-3.04f, -1.11f)
                curveToRelative(-0.6f, -0.22f, -1.25f, -0.2f, -1.84f, 0.07f)
                curveTo(0.61f, 11.6f, 0.09f, 12.33f, 0.01f, 13.19f)
                reflectiveCurveToRelative(0.29f, 1.68f, 1f, 2.18f)
                close()
                moveTo(6.38f, 5.46f)
                lineToRelative(0.78f, -0.36f)
                curveToRelative(0.33f, -0.15f, 0.72f, -0.11f, 1.08f, 0.15f)
                lineToRelative(5.53f, 3.42f)
                lineToRelative(-2.44f, 1.18f)
                lineTo(6.38f, 5.46f)
                close()
                moveTo(2.0f, 13.38f)
                curveToRelative(0.01f, -0.09f, 0.08f, -0.37f, 0.4f, -0.37f)
                curveToRelative(0.05f, 0f, 0.09f, 0.01f, 0.14f, 0.02f)
                lineToRelative(3.83f, 1.41f)
                lineToRelative(13.2f, -6.35f)
                curveToRelative(0.5f, -0.23f, 1.09f, -0.01f, 1.32f, 0.49f)
                lineToRelative(0.42f, 0.92f)
                lineToRelative(-15.03f, 7.17f)
                lineToRelative(-4.12f, -2.93f)
                curveToRelative(-0.17f, -0.12f, -0.18f, -0.28f, -0.17f, -0.36f)
                close()
                moveTo(24f, 22f)
                verticalLineToRelative(2f)
                lineTo(0f, 24f)
                verticalLineToRelative(-2f)
                lineTo(24f, 22f)
                close()
            }
        }.also { _PlaneDeparture = it}
