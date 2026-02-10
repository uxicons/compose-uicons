package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LaptopMobile: ImageVector? = null

val Icons.Ss.LaptopMobile: ImageVector
    get() = _LaptopMobile ?: UXIcon(name = "LaptopMobile") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 18f)
                lineTo(3f, 18f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                verticalLineToRelative(-1f)
                lineTo(8.15f, 14f)
                lineToRelative(0.85f, 1f)
                horizontalLineToRelative(3.01f)
                verticalLineToRelative(3f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(10f)
                lineTo(24f, 12f)
                close()
                moveTo(12f, 12f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(4f)
                curveToRelative(0.34f, 0f, 0.68f, 0.04f, 1f, 0.1f)
                lineTo(22f, 0f)
                lineTo(2f, 0f)
                lineTo(2f, 12f)
                horizontalLineToRelative(7.08f)
                lineToRelative(0.85f, 1f)
                horizontalLineToRelative(2.07f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _LaptopMobile = it}
