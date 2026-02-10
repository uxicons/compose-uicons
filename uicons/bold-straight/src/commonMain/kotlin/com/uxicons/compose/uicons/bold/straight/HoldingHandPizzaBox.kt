package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HoldingHandPizzaBox: ImageVector? = null

val Icons.Bs.HoldingHandPizzaBox: ImageVector
    get() = _HoldingHandPizzaBox ?: UXIcon(name = "HoldingHandPizzaBox") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 6f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(9f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(2f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                close()
                moveTo(21.5f, 0f)
                horizontalLineToRelative(-6.5f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                horizontalLineToRelative(-6.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(16.12f, 13.01f)
                lineTo(16.12f, 13f)
                horizontalLineToRelative(-3.77f)
                curveToRelative(-1.3f, 0f, -2.35f, 1.05f, -2.35f, 2.35f)
                curveToRelative(0f, 1.17f, 0.86f, 2.16f, 2.01f, 2.32f)
                lineToRelative(5.99f, 0.83f)
                lineToRelative(0.03f, -2.04f)
                curveToRelative(1.75f, 0.78f, 2.97f, 2.51f, 2.97f, 4.54f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -4.38f, -3.52f, -7.93f, -7.88f, -7.99f)
                close()
                moveTo(9.59f, 18.68f)
                curveToRelative(-0.95f, -0.78f, -1.55f, -1.95f, -1.58f, -3.24f)
                lineToRelative(-4.44f, -3.09f)
                curveToRelative(-1.1f, -0.68f, -2.55f, -0.33f, -3.23f, 0.78f)
                curveToRelative(-0.67f, 1.1f, -0.33f, 2.53f, 0.76f, 3.21f)
                lineToRelative(11.32f, 7.67f)
                horizontalLineToRelative(4.58f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3.81f)
                reflectiveCurveToRelative(-3.1f, -1.9f, -3.6f, -2.32f)
                close()
            }
        }.also { _HoldingHandPizzaBox = it}
