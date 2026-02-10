package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseFlag: ImageVector? = null

val Icons.Bs.HouseFlag: ImageVector
    get() = _HouseFlag ?: UXIcon(name = "HouseFlag") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 10.16f)
                verticalLineToRelative(1.94f)
                lineTo(12.31f, 3.12f)
                curveToRelative(-0.18f, -0.14f, -0.43f, -0.14f, -0.61f, 0f)
                lineTo(3.19f, 9.77f)
                curveToRelative(-0.12f, 0.1f, -0.19f, 0.24f, -0.19f, 0.39f)
                verticalLineToRelative(10.82f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(3f)
                lineTo(0f, 23.99f)
                verticalLineToRelative(-13.82f)
                curveToRelative(0f, -1.08f, 0.49f, -2.09f, 1.34f, -2.76f)
                lineTo(9.84f, 0.76f)
                curveToRelative(1.27f, -0.99f, 3.04f, -0.99f, 4.31f, 0f)
                lineToRelative(8.5f, 6.65f)
                horizontalLineToRelative(0f)
                curveToRelative(0.85f, 0.67f, 1.34f, 1.67f, 1.34f, 2.76f)
                close()
                moveTo(21f, 23.99f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-7.25f)
                lineToRelative(-3f, 1.52f)
                verticalLineToRelative(5.73f)
                close()
                moveTo(16f, 11.53f)
                verticalLineToRelative(12.47f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-6.97f)
                lineToRelative(5f, -2.53f)
                lineToRelative(-6f, -4.36f)
                curveToRelative(-0.67f, -0.33f, -2f, -0.13f, -2f, 1.39f)
                close()
            }
        }.also { _HouseFlag = it}
