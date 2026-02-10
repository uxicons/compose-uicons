package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LaptopLock: ImageVector? = null

val Icons.Bs.LaptopLock: ImageVector
    get() = _LaptopLock ?: UXIcon(name = "LaptopLock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 6f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveToRelative(-4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(5f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-6f)
                close()
                moveTo(17f, 4.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(20f, 12f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                close()
                moveTo(22f, 19f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                horizontalLineToRelative(-18f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-13f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(3.31f)
                lineToRelative(0.92f, 1f)
                horizontalLineToRelative(5.54f)
                lineToRelative(0.92f, -1f)
                horizontalLineToRelative(3.31f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                close()
            }
        }.also { _LaptopLock = it}
