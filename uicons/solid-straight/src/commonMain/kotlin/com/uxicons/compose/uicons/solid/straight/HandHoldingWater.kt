package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandHoldingWater: ImageVector? = null

val Icons.Ss.HandHoldingWater: ImageVector
    get() = _HandHoldingWater ?: UXIcon(name = "HandHoldingWater") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.5f, 9.0f)
                curveToRelative(-0.94f, 0f, -1.81f, -0.36f, -2.48f, -1.02f)
                curveToRelative(-1.36f, -1.36f, -1.36f, -3.59f, 0f, -4.95f)
                lineTo(8.5f, 0.6f)
                lineToRelative(2.47f, 2.41f)
                curveToRelative(1.37f, 1.37f, 1.37f, 3.59f, 0.01f, 4.96f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.66f, 0.66f, -1.54f, 1.02f, -2.48f, 1.02f)
                close()
                moveTo(23.15f, 8.68f)
                curveToRelative(-0.52f, -0.47f, -1.19f, -0.71f, -1.88f, -0.68f)
                curveToRelative(-0.7f, 0.03f, -1.34f, 0.33f, -1.79f, 0.83f)
                lineToRelative(-3.54f, 3.74f)
                curveToRelative(0.03f, 0.21f, 0.07f, 0.42f, 0.07f, 0.64f)
                curveToRelative(0f, 2.08f, -1.55f, 3.88f, -3.62f, 4.17f)
                lineToRelative(-4.24f, 0.61f)
                lineToRelative(-0.28f, -1.98f)
                lineToRelative(4.24f, -0.61f)
                curveToRelative(1.08f, -0.15f, 1.9f, -1.1f, 1.9f, -2.19f)
                curveToRelative(0f, -1.22f, -0.99f, -2.21f, -2.21f, -2.21f)
                lineTo(3.0f, 11f)
                curveTo(1.35f, 11f, 0.0f, 12.35f, 0.0f, 14f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                lineTo(12.67f, 24f)
                lineToRelative(10.67f, -11.65f)
                curveToRelative(0.95f, -1.06f, 0.86f, -2.71f, -0.19f, -3.67f)
                close()
            }
        }.also { _HandHoldingWater = it}
