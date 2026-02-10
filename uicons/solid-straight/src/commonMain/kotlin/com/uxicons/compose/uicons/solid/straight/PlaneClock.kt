package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlaneClock: ImageVector? = null

val Icons.Ss.PlaneClock: ImageVector
    get() = _PlaneClock ?: UXIcon(name = "PlaneClock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 13f)
                curveToRelative(-3.04f, 0f, -5.5f, 2.46f, -5.5f, 5.5f)
                reflectiveCurveToRelative(2.46f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -2.46f, 5.5f, -5.5f)
                reflectiveCurveToRelative(-2.46f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(13.79f, 21.71f)
                lineTo(11f, 18.91f)
                verticalLineToRelative(-3.91f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3.09f)
                lineToRelative(2.21f, 2.21f)
                close()
                moveTo(24f, 12f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6.01f)
                curveToRelative(-1.37f, -1.82f, -3.54f, -3f, -5.99f, -3f)
                reflectiveCurveToRelative(-4.62f, 1.18f, -5.99f, 3f)
                horizontalLineToRelative(-2.6f)
                lineToRelative(-3.22f, -5.9f)
                curveToRelative(-0.54f, -0.94f, 0.14f, -2.1f, 1.22f, -2.1f)
                curveToRelative(0.37f, 0f, 0.73f, 0.15f, 0.99f, 0.41f)
                lineToRelative(2.59f, 2.59f)
                horizontalLineToRelative(5.17f)
                lineToRelative(-2.52f, -9f)
                horizontalLineToRelative(2.75f)
                curveToRelative(1.1f, 0f, 2.11f, 0.6f, 2.63f, 1.56f)
                lineToRelative(3.77f, 7.44f)
                horizontalLineToRelative(4.2f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
            }
        }.also { _PlaneClock = it}
