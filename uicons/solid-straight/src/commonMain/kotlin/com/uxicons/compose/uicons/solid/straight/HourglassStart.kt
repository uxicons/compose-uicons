package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HourglassStart: ImageVector? = null

val Icons.Ss.HourglassStart: ImageVector
    get() = _HourglassStart ?: UXIcon(name = "HourglassStart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.38f, 5f)
                horizontalLineToRelative(7.24f)
                curveToRelative(-0.73f, 1.91f, -2.36f, 3.38f, -3.61f, 4.27f)
                curveToRelative(-1.25f, -0.9f, -2.9f, -2.37f, -3.63f, -4.27f)
                close()
                moveTo(21f, 21f)
                verticalLineToRelative(3f)
                lineTo(3f, 24f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -4.01f, 2.24f, -7.01f, 4.44f, -9f)
                curveToRelative(-2.2f, -1.99f, -4.44f, -4.99f, -4.44f, -9f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(12f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                curveToRelative(0f, 4.0f, -2.23f, 7.01f, -4.42f, 9f)
                curveToRelative(2.19f, 1.99f, 4.42f, 5.0f, 4.42f, 9f)
                close()
                moveTo(17.91f, 4.16f)
                lineToRelative(0.18f, -1.16f)
                lineTo(5.91f, 3f)
                lineToRelative(0.19f, 1.16f)
                curveToRelative(0.57f, 3.54f, 3.61f, 6.01f, 5.37f, 7.17f)
                lineToRelative(0.55f, 0.36f)
                lineToRelative(0.55f, -0.36f)
                curveToRelative(1.76f, -1.15f, 4.79f, -3.6f, 5.35f, -7.17f)
                close()
            }
        }.also { _HourglassStart = it}
