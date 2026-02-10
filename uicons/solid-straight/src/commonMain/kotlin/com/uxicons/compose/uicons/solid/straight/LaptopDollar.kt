package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LaptopDollar: ImageVector? = null

val Icons.Ss.LaptopDollar: ImageVector
    get() = _LaptopDollar ?: UXIcon(name = "LaptopDollar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 9f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -0.38f, -0.27f, -0.7f, -0.64f, -0.76f)
                lineToRelative(-3.04f, -0.51f)
                curveToRelative(-1.34f, -0.22f, -2.31f, -1.37f, -2.31f, -2.73f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                curveToRelative(0f, 0.38f, 0.27f, 0.7f, 0.64f, 0.76f)
                lineToRelative(3.04f, 0.51f)
                curveToRelative(1.34f, 0.22f, 2.31f, 1.37f, 2.31f, 2.73f)
                close()
                moveTo(15.01f, 21f)
                horizontalLineToRelative(-6.02f)
                lineToRelative(-0.85f, -1f)
                horizontalLineToRelative(-8.14f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                horizontalLineToRelative(18f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-8.14f)
                lineToRelative(-0.85f, 1f)
                close()
                moveTo(9.93f, 19f)
                horizontalLineToRelative(4.16f)
                lineToRelative(0.85f, -1f)
                horizontalLineToRelative(7.07f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2.42f)
                curveToRelative(-1.76f, -0.77f, -3f, -2.53f, -3f, -4.58f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(7.08f)
                lineToRelative(0.85f, 1f)
                close()
            }
        }.also { _LaptopDollar = it}
