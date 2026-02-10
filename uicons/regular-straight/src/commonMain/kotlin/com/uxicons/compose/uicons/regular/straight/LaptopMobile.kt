package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LaptopMobile: ImageVector? = null

val Icons.Rs.LaptopMobile: ImageVector
    get() = _LaptopMobile ?: UXIcon(name = "LaptopMobile") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.91f, 13f)
                horizontalLineToRelative(2.09f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2.91f)
                lineToRelative(-1f, -1f)
                lineTo(2f, 14f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                lineTo(12f, 16f)
                verticalLineToRelative(2f)
                lineTo(3f, 18f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-3f)
                lineTo(2f, 12f)
                lineTo(2f, 0f)
                lineTo(22f, 0f)
                lineTo(22f, 7f)
                horizontalLineToRelative(-2f)
                lineTo(20f, 2f)
                lineTo(4f, 2f)
                lineTo(4f, 12f)
                horizontalLineToRelative(4.91f)
                lineToRelative(1f, 1f)
                close()
                moveTo(24f, 12f)
                verticalLineToRelative(12f)
                lineTo(14f, 24f)
                lineTo(14f, 12f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(4f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(22f, 12f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(6f)
                lineTo(22f, 12f)
                close()
            }
        }.also { _LaptopMobile = it}
