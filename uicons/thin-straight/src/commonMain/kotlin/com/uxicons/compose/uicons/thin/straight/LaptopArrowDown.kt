package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LaptopArrowDown: ImageVector? = null

val Icons.Ts.LaptopArrowDown: ImageVector
    get() = _LaptopArrowDown ?: UXIcon(name = "LaptopArrowDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 16f)
                lineTo(22f, 3f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-5.71f)
                lineToRelative(-1f, 1f)
                horizontalLineToRelative(-4.59f)
                lineToRelative(-1f, -1f)
                lineTo(3f, 16f)
                lineTo(3f, 4f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-1f)
                lineTo(2f, 3f)
                verticalLineToRelative(13f)
                lineTo(0f, 16f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(19f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(23f, 18.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                lineTo(2.5f, 20f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(7.29f)
                lineToRelative(1f, 1f)
                horizontalLineToRelative(5.41f)
                lineToRelative(1f, -1f)
                horizontalLineToRelative(7.29f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(11.5f, 10.79f)
                lineTo(11.5f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(10.79f)
                lineToRelative(3.15f, -3.15f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-3.29f, 3.29f)
                curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
                reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
                lineToRelative(-3.29f, -3.29f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(3.15f, 3.15f)
                close()
            }
        }.also { _LaptopArrowDown = it}
