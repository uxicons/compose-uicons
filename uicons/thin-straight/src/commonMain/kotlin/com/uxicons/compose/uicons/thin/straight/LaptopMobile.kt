package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LaptopMobile: ImageVector? = null

val Icons.Ts.LaptopMobile: ImageVector
    get() = _LaptopMobile ?: UXIcon(name = "LaptopMobile") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.71f, 14f)
                horizontalLineToRelative(2.29f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2.71f)
                lineToRelative(-1f, -1f)
                lineTo(1f, 14f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                lineTo(12f, 17f)
                verticalLineToRelative(1f)
                lineTo(2.5f, 18f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-2.5f)
                lineTo(2f, 13f)
                lineTo(2f, 0f)
                lineTo(22f, 0f)
                lineTo(22f, 7f)
                horizontalLineToRelative(-1f)
                lineTo(21f, 1f)
                lineTo(3f, 1f)
                lineTo(3f, 13f)
                horizontalLineToRelative(5.71f)
                lineToRelative(1f, 1f)
                close()
                moveTo(24f, 11.5f)
                verticalLineToRelative(12.5f)
                lineTo(14f, 24f)
                lineTo(14f, 11.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(23f, 11.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(11.5f)
                horizontalLineToRelative(8f)
                lineTo(23f, 11.5f)
                close()
            }
        }.also { _LaptopMobile = it}
