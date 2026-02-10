package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockDesk: ImageVector? = null

val Icons.Sr.ClockDesk: ImageVector
    get() = _ClockDesk ?: UXIcon(name = "ClockDesk") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 20f)
                curveToRelative(5.51f, 0f, 10f, -4.49f, 10f, -10f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.26f, -5.28f, -4.64f, -9.5f, -9.99f, -9.5f)
                reflectiveCurveTo(2.27f, 4.22f, 2.01f, 9.5f)
                horizontalLineToRelative(-0.01f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 5.51f, 4.49f, 10f, 10f, 10f)
                close()
                moveTo(11f, 9.45f)
                verticalLineToRelative(-3.45f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.34f, -0.18f, 0.67f, -0.47f, 0.85f)
                lineToRelative(-3.15f, 1.97f)
                curveToRelative(-0.47f, 0.29f, -1.08f, 0.15f, -1.38f, -0.32f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.29f, -0.47f, -0.15f, -1.09f, 0.32f, -1.38f)
                lineToRelative(2.68f, -1.68f)
                close()
                moveTo(22f, 16.63f)
                verticalLineToRelative(3.38f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                lineTo(6f, 24.0f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                verticalLineToRelative(-3.38f)
                curveToRelative(2.15f, 3.24f, 5.83f, 5.38f, 10f, 5.38f)
                reflectiveCurveToRelative(7.85f, -2.14f, 10f, -5.38f)
                close()
            }
        }.also { _ClockDesk = it}
