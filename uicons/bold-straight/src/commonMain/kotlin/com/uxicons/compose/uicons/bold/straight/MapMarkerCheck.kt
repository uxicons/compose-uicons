package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerCheck: ImageVector? = null

val Icons.Bs.MapMarkerCheck: ImageVector
    get() = _MapMarkerCheck ?: UXIcon(name = "MapMarkerCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.5f, 14f)
                curveToRelative(-0.64f, 0f, -1.28f, -0.24f, -1.77f, -0.73f)
                lineToRelative(-2.27f, -2.19f)
                lineToRelative(2.08f, -2.16f)
                lineToRelative(1.96f, 1.88f)
                lineToRelative(4.45f, -4.37f)
                lineToRelative(2.1f, 2.14f)
                lineToRelative(-4.79f, 4.71f)
                curveToRelative(-0.48f, 0.48f, -1.12f, 0.72f, -1.75f, 0.72f)
                close()
                moveTo(12f, 23.99f)
                lineToRelative(-7.06f, -6.9f)
                curveToRelative(-3.91f, -3.91f, -3.91f, -10.25f, -0.01f, -14.15f)
                curveTo(6.82f, 1.04f, 9.33f, 0f, 12f, 0f)
                reflectiveCurveToRelative(5.18f, 1.04f, 7.07f, 2.93f)
                horizontalLineToRelative(0f)
                curveToRelative(1.89f, 1.89f, 2.93f, 4.4f, 2.93f, 7.07f)
                reflectiveCurveToRelative(-1.04f, 5.18f, -2.93f, 7.07f)
                lineToRelative(-7.07f, 6.92f)
                close()
                moveTo(12f, 3f)
                curveToRelative(-1.87f, 0f, -3.63f, 0.73f, -4.95f, 2.05f)
                curveToRelative(-2.73f, 2.73f, -2.73f, 7.17f, 0f, 9.9f)
                lineToRelative(4.95f, 4.84f)
                lineToRelative(4.96f, -4.85f)
                curveToRelative(1.31f, -1.31f, 2.04f, -3.07f, 2.04f, -4.94f)
                reflectiveCurveToRelative(-0.73f, -3.63f, -2.05f, -4.95f)
                horizontalLineToRelative(0f)
                curveToRelative(-1.32f, -1.32f, -3.08f, -2.05f, -4.95f, -2.05f)
                close()
            }
        }.also { _MapMarkerCheck = it}
