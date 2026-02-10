package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MonitorWater: ImageVector? = null

val Icons.Br.MonitorWater: ImageVector
    get() = _MonitorWater ?: UXIcon(name = "MonitorWater") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 13.5f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            horizontalLineToRelative(-5f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(2.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-8f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(2.5f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(-5f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            verticalLineToRelative(-6f)
            curveToRelative(0f, -3.03f, 2.47f, -5.5f, 5.5f, -5.5f)
            horizontalLineToRelative(5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-5f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(15.46f, 9.52f)
            curveToRelative(-1.94f, -1.96f, -1.94f, -5.14f, 0f, -7.1f)
            lineToRelative(1.69f, -1.67f)
            curveToRelative(1.02f, -1.0f, 2.67f, -1.0f, 3.69f, 0f)
            lineToRelative(1.68f, 1.66f)
            curveToRelative(1.96f, 1.97f, 1.96f, 5.16f, 0.01f, 7.11f)
            curveToRelative(-0.94f, 0.95f, -2.2f, 1.48f, -3.54f, 1.48f)
            reflectiveCurveToRelative(-2.6f, -0.52f, -3.54f, -1.48f)
            close()
            moveTo(17.59f, 7.41f)
            curveToRelative(0.76f, 0.76f, 2.07f, 0.76f, 2.82f, 0f)
            reflectiveQuadToRelative(0f, 0f)
            curveToRelative(0.79f, -0.79f, 0.79f, -2.08f, 0f, -2.87f)
            lineToRelative(-1.41f, -1.39f)
            lineToRelative(-1.42f, 1.4f)
            curveToRelative(-0.77f, 0.78f, -0.77f, 2.07f, 0.01f, 2.86f)
            close()
        }
    }.also { _MonitorWater = it }
