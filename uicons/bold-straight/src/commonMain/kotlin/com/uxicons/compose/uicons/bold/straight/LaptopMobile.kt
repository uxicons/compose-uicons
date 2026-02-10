package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LaptopMobile: ImageVector? = null

val Icons.Bs.LaptopMobile: ImageVector
    get() = _LaptopMobile ?: UXIcon(name = "LaptopMobile") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 9f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(11.5f)
                horizontalLineToRelative(10f)
                lineTo(24f, 12.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21f, 21f)
                horizontalLineToRelative(-4f)
                lineTo(17f, 12.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(8.5f)
                close()
                moveTo(9.23f, 14f)
                horizontalLineToRelative(2.77f)
                verticalLineToRelative(4f)
                lineTo(3f, 18f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                verticalLineToRelative(-2f)
                lineTo(2f, 13f)
                lineTo(2f, 0f)
                lineTo(22f, 0f)
                lineTo(22f, 7f)
                horizontalLineToRelative(-3f)
                lineTo(19f, 3f)
                lineTo(5f, 3f)
                lineTo(5f, 13f)
                horizontalLineToRelative(3.31f)
                lineToRelative(0.92f, 1f)
                close()
            }
        }.also { _LaptopMobile = it}
