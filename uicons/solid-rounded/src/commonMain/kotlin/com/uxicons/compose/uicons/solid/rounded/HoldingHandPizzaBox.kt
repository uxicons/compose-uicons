package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HoldingHandPizzaBox: ImageVector? = null

val Icons.Sr.HoldingHandPizzaBox: ImageVector
    get() = _HoldingHandPizzaBox ?: UXIcon(name = "HoldingHandPizzaBox") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 7f)
                horizontalLineToRelative(-9f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(16f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                close()
                moveTo(24f, 4f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                horizontalLineToRelative(-5f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                horizontalLineToRelative(-5f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(24f)
                close()
                moveTo(24f, 22f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-9.04f)
                curveToRelative(-1.9f, 0.01f, -3.76f, -0.52f, -5.37f, -1.53f)
                lineToRelative(-6.65f, -4.76f)
                curveToRelative(-0.93f, -0.58f, -1.22f, -1.81f, -0.65f, -2.75f)
                curveToRelative(0.58f, -0.95f, 1.82f, -1.25f, 2.77f, -0.66f)
                lineToRelative(5.89f, 4.26f)
                curveToRelative(0.73f, 0.87f, 1.82f, 1.44f, 3.05f, 1.44f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-3.89f)
                curveToRelative(-1.0f, 0f, -1.92f, -0.68f, -2.08f, -1.66f)
                curveToRelative(-0.2f, -1.25f, 0.76f, -2.34f, 1.97f, -2.34f)
                horizontalLineToRelative(4f)
                curveToRelative(4.42f, 0f, 8f, 3.58f, 8f, 8f)
                close()
            }
        }.also { _HoldingHandPizzaBox = it}
