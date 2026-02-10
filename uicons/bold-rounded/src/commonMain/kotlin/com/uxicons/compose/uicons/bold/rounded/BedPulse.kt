package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BedPulse: ImageVector? = null

val Icons.Br.BedPulse: ImageVector
    get() = _BedPulse ?: UXIcon(name = "BedPulse") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 13.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-1.5f)
            lineTo(3f, 21f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            lineTo(0f, 5.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(10.5f)
            horizontalLineToRelative(7f)
            verticalLineToRelative(-2.5f)
            curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(2.5f)
            horizontalLineToRelative(8f)
            verticalLineToRelative(-2.5f)
            curveToRelative(0f, -0.64f, -0.4f, -1.2f, -1f, -1.42f)
            curveToRelative(-0.78f, -0.28f, -1.19f, -1.13f, -0.91f, -1.91f)
            curveToRelative(0.28f, -0.78f, 1.13f, -1.19f, 1.91f, -0.91f)
            curveToRelative(1.79f, 0.64f, 3f, 2.34f, 3f, 4.24f)
            close()
            moveTo(9f, 13.5f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
            reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
            reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
            close()
            moveTo(9.5f, 5.75f)
            horizontalLineToRelative(3.08f)
            curveToRelative(0.49f, 0f, 0.95f, -0.24f, 1.23f, -0.64f)
            lineToRelative(0.57f, -0.82f)
            lineToRelative(2.08f, 3.48f)
            curveToRelative(0.52f, 0.93f, 1.97f, 0.97f, 2.54f, 0.06f)
            lineToRelative(1.39f, -2.08f)
            horizontalLineToRelative(2.12f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-2.92f)
            curveToRelative(-0.5f, 0f, -0.97f, 0.25f, -1.25f, 0.67f)
            lineToRelative(-0.52f, 0.78f)
            lineTo(15.77f, 0.77f)
            curveToRelative(-0.51f, -0.92f, -1.95f, -0.98f, -2.52f, -0.09f)
            lineToRelative(-1.45f, 2.07f)
            horizontalLineToRelative(-2.3f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            close()
        }
    }.also { _BedPulse = it }
