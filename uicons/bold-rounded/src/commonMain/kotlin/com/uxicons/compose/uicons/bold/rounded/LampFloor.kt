package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LampFloor: ImageVector? = null

val Icons.Br.LampFloor: ImageVector
    get() = _LampFloor ?: UXIcon(name = "LampFloor") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(16.45f, 11f)
            curveToRelative(1.03f, 0f, 2.0f, -0.45f, 2.67f, -1.24f)
            curveToRelative(0.67f, -0.79f, 0.95f, -1.82f, 0.78f, -2.84f)
            lineToRelative(-0.67f, -4.0f)
            curveToRelative(-0.28f, -1.7f, -1.73f, -2.93f, -3.45f, -2.93f)
            horizontalLineToRelative(-7.57f)
            curveToRelative(-1.72f, 0f, -3.17f, 1.23f, -3.45f, 2.92f)
            lineToRelative(-0.67f, 4f)
            curveToRelative(-0.17f, 1.02f, 0.12f, 2.05f, 0.78f, 2.84f)
            reflectiveCurveToRelative(1.64f, 1.24f, 2.67f, 1.24f)
            horizontalLineToRelative(2.95f)
            verticalLineToRelative(10f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(9f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(-10f)
            horizontalLineToRelative(2.95f)
            close()
            moveTo(7.17f, 7.82f)
            curveToRelative(-0.06f, -0.07f, -0.14f, -0.21f, -0.11f, -0.41f)
            lineToRelative(0.67f, -4f)
            curveToRelative(0.04f, -0.24f, 0.25f, -0.42f, 0.49f, -0.42f)
            horizontalLineToRelative(7.57f)
            curveToRelative(0.24f, 0f, 0.45f, 0.17f, 0.49f, 0.42f)
            lineToRelative(0.67f, 4f)
            curveToRelative(0.03f, 0.2f, -0.06f, 0.34f, -0.11f, 0.41f)
            curveToRelative(-0.06f, 0.07f, -0.18f, 0.18f, -0.38f, 0.18f)
            lineTo(7.55f, 8f)
            curveToRelative(-0.2f, 0f, -0.33f, -0.11f, -0.38f, -0.18f)
            close()
        }
    }.also { _LampFloor = it }
