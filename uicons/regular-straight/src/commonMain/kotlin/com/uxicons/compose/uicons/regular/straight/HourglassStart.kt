package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HourglassStart: ImageVector? = null

val Icons.Rs.HourglassStart: ImageVector
    get() = _HourglassStart ?: UXIcon(name = "HourglassStart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.57f, 12.03f)
                curveToRelative(2.19f, -1.99f, 4.42f, -5.0f, 4.42f, -9f)
                curveTo(21f, 1.37f, 19.65f, 0.03f, 18f, 0.03f)
                lineTo(6f, 0.03f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                curveToRelative(0f, 4.01f, 2.24f, 7.01f, 4.44f, 9f)
                curveToRelative(-2.2f, 1.99f, -4.44f, 5.0f, -4.44f, 9f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -4.0f, -2.23f, -7.01f, -4.42f, -9f)
                close()
                moveTo(19f, 22.02f)
                lineTo(5f, 22.02f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -3.77f, 2.51f, -6.55f, 4.61f, -8.22f)
                lineToRelative(0.99f, -0.78f)
                lineToRelative(-0.99f, -0.78f)
                curveToRelative(-2.1f, -1.67f, -4.61f, -4.44f, -4.61f, -8.21f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(12f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                curveToRelative(0f, 3.77f, -2.5f, 6.55f, -4.59f, 8.22f)
                lineToRelative(-0.98f, 0.78f)
                lineToRelative(0.98f, 0.78f)
                curveToRelative(2.1f, 1.67f, 4.59f, 4.44f, 4.59f, 8.22f)
                verticalLineToRelative(1f)
                close()
                moveTo(16.92f, 4.03f)
                lineTo(7.08f, 4.03f)
                curveToRelative(0.51f, 3.16f, 3.3f, 5.41f, 4.93f, 6.49f)
                curveToRelative(1.62f, -1.06f, 4.41f, -3.3f, 4.91f, -6.49f)
                close()
                moveTo(12.02f, 8.04f)
                curveToRelative(-0.64f, -0.52f, -1.37f, -1.21f, -1.95f, -2.02f)
                horizontalLineToRelative(3.89f)
                curveToRelative(-0.56f, 0.8f, -1.27f, 1.48f, -1.94f, 2.02f)
                close()
            }
        }.also { _HourglassStart = it}
