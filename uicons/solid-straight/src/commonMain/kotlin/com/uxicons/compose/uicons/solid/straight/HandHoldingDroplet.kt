package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandHoldingDroplet: ImageVector? = null

val Icons.Ss.HandHoldingDroplet: ImageVector
    get() = _HandHoldingDroplet ?: UXIcon(name = "HandHoldingDroplet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 5.63f)
                curveToRelative(0f, 1.86f, -1.57f, 3.37f, -3.5f, 3.37f)
                reflectiveCurveToRelative(-3.5f, -1.51f, -3.5f, -3.37f)
                curveTo(5f, 3.39f, 8.5f, 0.14f, 8.5f, 0.14f)
                curveToRelative(0f, 0f, 3.5f, 3.25f, 3.5f, 5.5f)
                close()
                moveTo(23.34f, 12.35f)
                lineToRelative(-10.67f, 11.65f)
                lineTo(3f, 24f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(8.79f)
                curveToRelative(1.22f, 0f, 2.21f, 0.99f, 2.21f, 2.21f)
                curveToRelative(0f, 1.09f, -0.82f, 2.04f, -1.9f, 2.19f)
                lineToRelative(-4.24f, 0.61f)
                lineToRelative(0.28f, 1.98f)
                lineToRelative(4.24f, -0.61f)
                curveToRelative(2.06f, -0.29f, 3.62f, -2.09f, 3.62f, -4.17f)
                curveToRelative(0f, -0.22f, -0.03f, -0.43f, -0.07f, -0.64f)
                lineToRelative(3.54f, -3.74f)
                curveToRelative(0.46f, -0.5f, 1.1f, -0.8f, 1.79f, -0.83f)
                curveToRelative(0.69f, -0.03f, 1.36f, 0.21f, 1.88f, 0.68f)
                curveToRelative(1.05f, 0.96f, 1.14f, 2.6f, 0.19f, 3.67f)
                close()
            }
        }.also { _HandHoldingDroplet = it}
