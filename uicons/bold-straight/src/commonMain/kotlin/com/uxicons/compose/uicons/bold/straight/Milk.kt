package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Milk: ImageVector? = null

val Icons.Bs.Milk: ImageVector
    get() = _Milk ?: UXIcon(name = "Milk") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.96f, 6.5f)
                horizontalLineToRelative(0.04f)
                lineTo(20f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(6.5f, 0f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(0.04f)
                lineToRelative(-3.04f, 3.59f)
                verticalLineToRelative(10.41f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-10.41f)
                lineToRelative(-3.04f, -3.59f)
                close()
                moveTo(12.07f, 10f)
                horizontalLineToRelative(-7.07f)
                lineToRelative(1.69f, -2f)
                horizontalLineToRelative(7.1f)
                lineToRelative(-1.72f, 2f)
                close()
                moveTo(17f, 3f)
                verticalLineToRelative(2f)
                lineTo(7f, 5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(10f)
                close()
                moveTo(4f, 20.5f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(7.5f)
                curveToRelative(0f, 0.17f, 0.03f, 0.34f, 0.05f, 0.5f)
                horizontalLineToRelative(-7.55f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                close()
                moveTo(20f, 20.5f)
                curveToRelative(0f, 0.28f, -0.23f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-9.3f)
                lineToRelative(2.53f, -2.93f)
                lineToRelative(2.47f, 2.92f)
                verticalLineToRelative(9.31f)
                close()
            }
        }.also { _Milk = it}
