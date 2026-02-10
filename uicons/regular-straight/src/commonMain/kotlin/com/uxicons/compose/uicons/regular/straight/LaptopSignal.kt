package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LaptopSignal: ImageVector? = null

val Icons.Rs.LaptopSignal: ImageVector
    get() = _LaptopSignal ?: UXIcon(name = "LaptopSignal") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 0f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-9f)
                close()
                moveTo(20f, 2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(2f)
                close()
                moveTo(16f, 4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                close()
                moveTo(22f, 18f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-18f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(4.91f)
                lineToRelative(1f, 1f)
                horizontalLineToRelative(4.17f)
                lineToRelative(1f, -1f)
                horizontalLineToRelative(4.91f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(2f)
                close()
                moveTo(22f, 20f)
                horizontalLineToRelative(-6.09f)
                lineToRelative(-1f, 1f)
                horizontalLineToRelative(-5.83f)
                lineToRelative(-1f, -1f)
                horizontalLineToRelative(-6.09f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(18f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _LaptopSignal = it}
