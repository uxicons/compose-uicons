package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HoldingHandPizzaBox: ImageVector? = null

val Icons.Ss.HoldingHandPizzaBox: ImageVector
    get() = _HoldingHandPizzaBox ?: UXIcon(name = "HoldingHandPizzaBox") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 7f)
                horizontalLineToRelative(-9f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(24f)
                close()
                moveTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-6.5f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                horizontalLineToRelative(-6.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(24f)
                close()
                moveTo(24f, 21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-11.04f)
                curveToRelative(-1.9f, 0.01f, -3.76f, -0.52f, -5.37f, -1.53f)
                lineToRelative(-6.65f, -4.76f)
                curveToRelative(-0.93f, -0.58f, -1.22f, -1.81f, -0.65f, -2.75f)
                curveToRelative(0.58f, -0.95f, 1.82f, -1.25f, 2.77f, -0.66f)
                lineToRelative(5.89f, 4.26f)
                curveToRelative(0.73f, 0.87f, 1.82f, 1.44f, 3.05f, 1.44f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(5f)
                curveToRelative(3.87f, 0f, 7f, 3.13f, 7f, 7f)
                close()
            }
        }.also { _HoldingHandPizzaBox = it}
