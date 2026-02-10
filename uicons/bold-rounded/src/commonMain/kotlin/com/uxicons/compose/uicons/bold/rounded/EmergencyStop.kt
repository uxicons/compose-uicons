package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EmergencyStop: ImageVector? = null

val Icons.Br.EmergencyStop: ImageVector
    get() = _EmergencyStop ?: UXIcon(name = "EmergencyStop") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12f, 9f)
            curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
            reflectiveCurveToRelative(-2.02f, -4.5f, -4.5f, -4.5f)
            reflectiveCurveToRelative(-4.5f, 2.02f, -4.5f, 4.5f)
            reflectiveCurveToRelative(2.02f, 4.5f, 4.5f, 4.5f)
            close()
            moveTo(12f, 3f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            close()
            moveTo(23f, 22.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            curveToRelative(0f, -1.11f, -0.72f, -2.08f, -1.78f, -2.4f)
            lineToRelative(-4.72f, -1.3f)
            verticalLineToRelative(2.77f)
            curveToRelative(0f, 1.34f, -1.08f, 2.42f, -2.42f, 2.42f)
            horizontalLineToRelative(-0.76f)
            curveToRelative(-0.88f, 0f, -1.74f, -0.32f, -2.4f, -0.91f)
            lineToRelative(-1.68f, -1.48f)
            curveToRelative(-0.87f, -0.72f, -0.98f, -2.01f, -0.26f, -2.87f)
            reflectiveCurveToRelative(2.01f, -0.98f, 2.87f, -0.26f)
            lineToRelative(1.64f, 1.3f)
            verticalLineToRelative(-8.27f)
            curveToRelative(0f, -0.96f, 0.88f, -1.71f, 1.88f, -1.45f)
            curveToRelative(0.68f, 0.17f, 1.13f, 0.84f, 1.13f, 1.54f)
            verticalLineToRelative(4.1f)
            lineToRelative(5.55f, 1.52f)
            curveToRelative(2.38f, 0.71f, 3.95f, 2.83f, 3.95f, 5.28f)
            close()
            moveTo(6.3f, 5.05f)
            lineTo(4.16f, 7.5f)
            curveToRelative(-0.43f, 0.49f, -1.16f, 0.14f, -1.16f, -0.55f)
            verticalLineToRelative(-0.95f)
            horizontalLineToRelative(-1.5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(-0.95f)
            curveToRelative(0f, -0.69f, 0.73f, -1.04f, 1.16f, -0.55f)
            lineToRelative(2.14f, 2.45f)
            curveToRelative(0.27f, 0.3f, 0.27f, 0.79f, 0f, 1.1f)
            close()
            moveTo(24f, 4.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-1.5f)
            verticalLineToRelative(0.95f)
            curveToRelative(0f, 0.69f, -0.73f, 1.04f, -1.16f, 0.55f)
            lineToRelative(-2.14f, -2.45f)
            curveToRelative(-0.27f, -0.3f, -0.27f, -0.79f, 0f, -1.1f)
            lineToRelative(2.14f, -2.45f)
            curveToRelative(0.43f, -0.49f, 1.16f, -0.14f, 1.16f, 0.55f)
            verticalLineToRelative(0.95f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _EmergencyStop = it }
