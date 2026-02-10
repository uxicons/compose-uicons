package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandHoldingDroplet: ImageVector? = null

val Icons.Sr.HandHoldingDroplet: ImageVector
    get() = _HandHoldingDroplet ?: UXIcon(name = "HandHoldingDroplet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 8.96f)
                curveToRelative(-2.21f, 0f, -4f, -1.74f, -4f, -3.88f)
                curveToRelative(0f, -1.16f, 0.73f, -2.59f, 2.17f, -4.24f)
                curveToRelative(0.92f, -1.06f, 2.73f, -1.06f, 3.66f, 0f)
                curveToRelative(1.44f, 1.65f, 2.17f, 3.08f, 2.17f, 4.24f)
                curveToRelative(0f, 2.14f, -1.79f, 3.88f, -4f, 3.88f)
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
                horizontalLineToRelative(-7.79f)
                curveTo(1.79f, 11f, 0.0f, 12.79f, 0.0f, 15f)
                verticalLineToRelative(5f)
                curveTo(0.0f, 22.21f, 1.79f, 24f, 4.0f, 24f)
                horizontalLineToRelative(4.26f)
                curveToRelative(2.81f, 0f, 5.48f, -1.18f, 7.37f, -3.25f)
                lineToRelative(7.7f, -8.41f)
                curveToRelative(0.95f, -1.06f, 0.86f, -2.71f, -0.19f, -3.67f)
                close()
            }
        }.also { _HandHoldingDroplet = it}
