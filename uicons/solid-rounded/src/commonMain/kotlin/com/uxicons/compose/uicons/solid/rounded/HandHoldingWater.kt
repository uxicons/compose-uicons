package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandHoldingWater: ImageVector? = null

val Icons.Sr.HandHoldingWater: ImageVector
    get() = _HandHoldingWater ?: UXIcon(name = "HandHoldingWater") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.5f, 8.0f)
                curveToRelative(-0.94f, 0f, -1.81f, -0.36f, -2.48f, -1.02f)
                curveToRelative(-1.36f, -1.36f, -1.36f, -3.59f, 0f, -4.95f)
                lineTo(7.8f, 0.28f)
                curveToRelative(0.39f, -0.38f, 1.01f, -0.38f, 1.4f, 0f)
                lineToRelative(1.77f, 1.73f)
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
                lineToRelative(-4.25f, 0.6f)
                curveToRelative(-0.55f, 0.08f, -1.05f, -0.3f, -1.13f, -0.85f)
                curveToRelative(-0.08f, -0.55f, 0.3f, -1.05f, 0.85f, -1.13f)
                lineToRelative(4.16f, -0.58f)
                curveToRelative(0.94f, -0.13f, 1.75f, -0.81f, 1.94f, -1.73f)
                curveToRelative(0.3f, -1.43f, -0.79f, -2.69f, -2.16f, -2.69f)
                lineTo(4.0f, 11f)
                curveTo(1.79f, 11f, 0.0f, 12.79f, 0.0f, 15f)
                verticalLineToRelative(5f)
                curveTo(0.0f, 22.21f, 1.79f, 24f, 4.0f, 24f)
                horizontalLineToRelative(4.26f)
                curveToRelative(2.81f, 0f, 5.48f, -1.18f, 7.37f, -3.25f)
                lineToRelative(7.7f, -8.41f)
                curveToRelative(0.95f, -1.06f, 0.86f, -2.71f, -0.19f, -3.67f)
                close()
            }
        }.also { _HandHoldingWater = it}
