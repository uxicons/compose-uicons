package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LaptopArrowDown: ImageVector? = null

val Icons.Ss.LaptopArrowDown: ImageVector
    get() = _LaptopArrowDown ?: UXIcon(name = "LaptopArrowDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.01f, 18f)
                lineToRelative(0.85f, -1f)
                horizontalLineToRelative(8.14f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                lineTo(3f, 21f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(8.14f)
                lineToRelative(0.85f, 1f)
                horizontalLineToRelative(6.02f)
                close()
                moveTo(13f, 3f)
                verticalLineToRelative(6.09f)
                lineToRelative(2.29f, -2.29f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-3.29f, 3.29f)
                curveToRelative(-0.39f, 0.39f, -0.9f, 0.58f, -1.41f, 0.58f)
                reflectiveCurveToRelative(-1.02f, -0.2f, -1.41f, -0.58f)
                lineToRelative(-3.29f, -3.29f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.29f, 2.29f)
                lineTo(11f, 3f)
                lineTo(2f, 3f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(7.08f)
                lineToRelative(0.85f, 1f)
                horizontalLineToRelative(4.16f)
                lineToRelative(0.85f, -1f)
                horizontalLineToRelative(7.07f)
                lineTo(22.0f, 3f)
                horizontalLineToRelative(-9f)
                close()
            }
        }.also { _LaptopArrowDown = it}
