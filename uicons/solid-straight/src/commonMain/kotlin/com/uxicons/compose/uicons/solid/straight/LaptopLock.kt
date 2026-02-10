package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LaptopLock: ImageVector? = null

val Icons.Ss.LaptopLock: ImageVector
    get() = _LaptopLock ?: UXIcon(name = "LaptopLock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(6f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-7f)
                close()
                moveTo(19f, 11f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(20f, 5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(15.01f, 21f)
                lineTo(15.86f, 20f)
                horizontalLineToRelative(8.14f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                horizontalLineToRelative(-18.0f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(8.14f)
                lineToRelative(0.85f, 1f)
                horizontalLineToRelative(6.02f)
                close()
                moveTo(22f, 16.9f)
                verticalLineToRelative(1.1f)
                horizontalLineToRelative(-7.07f)
                lineToRelative(-0.85f, 1f)
                horizontalLineToRelative(-4.16f)
                lineToRelative(-0.85f, -1f)
                horizontalLineToRelative(-7.08f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(6f)
                curveToRelative(0.34f, 0f, 0.68f, -0.04f, 1f, -0.1f)
                close()
            }
        }.also { _LaptopLock = it}
