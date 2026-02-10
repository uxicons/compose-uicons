package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlaneClock: ImageVector? = null

val Icons.Bs.PlaneClock: ImageVector
    get() = _PlaneClock ?: UXIcon(name = "PlaneClock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 11.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-4.94f)
                curveToRelative(-0.41f, -1.16f, -1.09f, -2.18f, -1.98f, -3f)
                horizontalLineToRelative(3.91f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-4.11f)
                lineToRelative(-4.68f, -7.68f)
                curveToRelative(-0.12f, -0.22f, -0.29f, -0.32f, -0.47f, -0.32f)
                horizontalLineToRelative(-0.67f)
                lineToRelative(2.75f, 8f)
                horizontalLineToRelative(-7.35f)
                lineToRelative(-2.75f, -2.22f)
                lineToRelative(2.19f, 4.22f)
                horizontalLineToRelative(1.51f)
                curveToRelative(-0.88f, 0.82f, -1.57f, 1.84f, -1.98f, 3f)
                horizontalLineToRelative(-1.36f)
                reflectiveCurveToRelative(-3.31f, -6.41f, -3.34f, -6.51f)
                curveToRelative(-0.34f, -0.83f, -0.31f, -1.75f, 0.15f, -2.55f)
                curveToRelative(0.53f, -0.91f, 1.46f, -1.45f, 2.51f, -1.45f)
                curveToRelative(0.74f, 0f, 1.45f, 0.28f, 1.99f, 0.79f)
                lineToRelative(2.13f, 1.72f)
                horizontalLineToRelative(2.09f)
                lineToRelative(-2.75f, -8f)
                horizontalLineToRelative(4.88f)
                curveToRelative(1.28f, 0f, 2.46f, 0.7f, 3.07f, 1.82f)
                lineToRelative(3.77f, 6.18f)
                horizontalLineToRelative(2.42f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(17.5f, 18.5f)
                curveToRelative(0f, 3.04f, -2.46f, 5.5f, -5.5f, 5.5f)
                reflectiveCurveToRelative(-5.5f, -2.46f, -5.5f, -5.5f)
                reflectiveCurveToRelative(2.46f, -5.5f, 5.5f, -5.5f)
                reflectiveCurveToRelative(5.5f, 2.46f, 5.5f, 5.5f)
                close()
                moveTo(15.21f, 20.29f)
                lineTo(13f, 18.09f)
                verticalLineToRelative(-3.09f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3.91f)
                lineToRelative(2.79f, 2.79f)
                close()
            }
        }.also { _PlaneClock = it}
