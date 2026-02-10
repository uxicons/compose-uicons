package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pulse: ImageVector? = null

val Icons.Tr.Pulse: ImageVector
    get() = _Pulse ?: UXIcon(name = "Pulse") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 10.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-3.42f)
                curveToRelative(-0.18f, 0f, -0.34f, 0.1f, -0.43f, 0.25f)
                lineToRelative(-1.16f, 2.25f)
                curveToRelative(-0.22f, 0.33f, -0.62f, 0.51f, -0.98f, 0.51f)
                curveToRelative(-0.39f, -0.02f, -0.73f, -0.25f, -0.9f, -0.6f)
                lineToRelative(-2.06f, -5.4f)
                lineToRelative(-0.1f, -0.0f)
                lineToRelative(-1.21f, 2.22f)
                curveToRelative(-0.26f, 0.48f, -0.77f, 0.78f, -1.32f, 0.78f)
                horizontalLineToRelative(-3.4f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3.4f)
                curveToRelative(0.18f, 0f, 0.35f, -0.1f, 0.44f, -0.26f)
                lineToRelative(1.21f, -2.22f)
                curveToRelative(0.24f, -0.36f, 0.61f, -0.54f, 0.99f, -0.52f)
                curveToRelative(0.39f, 0.02f, 0.73f, 0.25f, 0.9f, 0.6f)
                lineToRelative(2.06f, 5.4f)
                lineToRelative(0.11f, -0.01f)
                lineToRelative(1.16f, -2.24f)
                curveToRelative(0.27f, -0.46f, 0.76f, -0.75f, 1.3f, -0.75f)
                horizontalLineToRelative(3.42f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(24f, 6.5f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(6.5f, 23f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-7f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                lineTo(0f, 6.5f)
                curveTo(0f, 4.02f, 2.02f, 2f, 4.5f, 2f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                close()
                moveTo(23f, 6.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(4.5f, 3f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                lineTo(23f, 6.5f)
                close()
            }
        }.also { _Pulse = it}
