package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EmergencyCall: ImageVector? = null

val Icons.Sr.EmergencyCall: ImageVector
    get() = _EmergencyCall ?: UXIcon(name = "EmergencyCall") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.14f, 0.0f)
                curveToRelative(-3.41f, -0.08f, -6.14f, 2.85f, -6.14f, 6.26f)
                verticalLineToRelative(3.24f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(3.24f)
                curveToRelative(3.41f, 0f, 6.34f, -2.73f, 6.26f, -6.14f)
                curveTo(23.92f, 2.66f, 21.34f, 0.08f, 18.14f, 0.0f)
                close()
                moveTo(20.5f, 7f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(20.66f, 14.86f)
                curveToRelative(-1.2f, -1.14f, -3.09f, -1.14f, -4.28f, 0.01f)
                lineToRelative(-1.91f, 1.61f)
                curveToRelative(-3.2f, -1.36f, -5.47f, -3.64f, -6.93f, -6.95f)
                lineToRelative(1.6f, -1.9f)
                curveToRelative(1.15f, -1.19f, 1.15f, -3.08f, 0.01f, -4.28f)
                curveToRelative(0f, 0f, -1.85f, -2.41f, -1.88f, -2.44f)
                curveToRelative(-1.21f, -1.21f, -3.17f, -1.21f, -4.33f, -0.05f)
                lineTo(1.78f, 1.86f)
                curveTo(0.63f, 3.01f, 0f, 4.57f, 0f, 6.24f)
                curveToRelative(0f, 7.64f, 10.13f, 17.76f, 17.76f, 17.76f)
                curveToRelative(1.67f, 0f, 3.23f, -0.63f, 4.42f, -1.83f)
                lineToRelative(0.91f, -1.05f)
                curveToRelative(1.21f, -1.21f, 1.21f, -3.17f, 0f, -4.38f)
                curveToRelative(-0.03f, -0.03f, -2.44f, -1.88f, -2.44f, -1.88f)
                close()
            }
        }.also { _EmergencyCall = it}
