package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AlarmClock: ImageVector? = null

val Icons.Tr.AlarmClock: ImageVector
    get() = _AlarmClock ?: UXIcon(name = "AlarmClock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.5f, 2.02f)
                lineTo(12.5f, 0.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(1.52f)
                curveTo(5.67f, 2.29f, 1f, 7.1f, 1f, 13f)
                curveToRelative(0f, 2.9f, 1.14f, 5.54f, 2.98f, 7.5f)
                curveToRelative(-1.06f, 0.45f, -1.98f, 1.39f, -1.98f, 3.0f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                curveToRelative(0f, -1.55f, 1.12f, -2.06f, 1.78f, -2.22f)
                curveToRelative(1.94f, 1.69f, 4.46f, 2.72f, 7.22f, 2.72f)
                reflectiveCurveToRelative(5.29f, -1.03f, 7.22f, -2.72f)
                curveToRelative(0.66f, 0.17f, 1.78f, 0.67f, 1.78f, 2.22f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                curveToRelative(0f, -1.61f, -0.92f, -2.55f, -1.98f, -3.0f)
                curveToRelative(1.84f, -1.97f, 2.98f, -4.6f, 2.98f, -7.5f)
                curveToRelative(0f, -5.9f, -4.67f, -10.71f, -10.5f, -10.97f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                reflectiveCurveTo(6.49f, 3f, 12f, 3f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                reflectiveCurveToRelative(-4.49f, 10f, -10f, 10f)
                close()
                moveTo(16.3f, 15.1f)
                curveToRelative(0.22f, 0.17f, 0.27f, 0.48f, 0.1f, 0.7f)
                curveToRelative(-0.1f, 0.13f, -0.25f, 0.2f, -0.4f, 0.2f)
                curveToRelative(-0.1f, 0f, -0.21f, -0.03f, -0.3f, -0.1f)
                lineToRelative(-4f, -3f)
                curveToRelative(-0.13f, -0.09f, -0.2f, -0.24f, -0.2f, -0.4f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(5.75f)
                lineToRelative(3.8f, 2.85f)
                close()
                moveTo(1f, 4.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                curveTo(0f, 2.0f, 1.98f, 0.04f, 4.5f, 0.04f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                curveToRelative(-2.27f, 0f, -3.5f, 1.78f, -3.5f, 3.46f)
                close()
                moveTo(24f, 4.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                curveToRelative(0f, -1.68f, -1.23f, -3.46f, -3.5f, -3.46f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                curveToRelative(2.52f, 0f, 4.5f, 1.96f, 4.5f, 4.46f)
                close()
            }
        }.also { _AlarmClock = it}
