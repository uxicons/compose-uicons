package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LaptopSignal: ImageVector? = null

val Icons.Ts.LaptopSignal: ImageVector
    get() = _LaptopSignal ?: UXIcon(name = "LaptopSignal") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 0f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-9f)
                close()
                moveTo(23f, 8f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(1f)
                close()
                moveTo(20f, 2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(3f)
                close()
                moveTo(19f, 8f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(1f)
                close()
                moveTo(16f, 4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(3f)
                close()
                moveTo(15f, 8f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1f)
                close()
                moveTo(22f, 11f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-5.71f)
                lineToRelative(-1f, 1f)
                horizontalLineToRelative(-4.59f)
                lineToRelative(-1f, -1f)
                horizontalLineToRelative(-5.71f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(19f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(23f, 21.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-19f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(7.29f)
                lineToRelative(1f, 1f)
                horizontalLineToRelative(5.41f)
                lineToRelative(1f, -1f)
                horizontalLineToRelative(7.29f)
                close()
            }
        }.also { _LaptopSignal = it}
