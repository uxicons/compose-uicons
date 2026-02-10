package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Memory: ImageVector? = null

val Icons.Bs.Memory: ImageVector
    get() = _Memory ?: UXIcon(name = "Memory") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 5.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(3.5f, 2f)
                curveTo(1.57f, 2f, 0f, 3.57f, 0f, 5.5f)
                lineTo(0f, 22f)
                lineTo(4f, 22f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4f)
                lineTo(24f, 5.5f)
                close()
                moveTo(3f, 16f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(2f, -0.58f, 2f, -2.5f)
                reflectiveCurveToRelative(-2f, -2.5f, -2f, -2.5f)
                horizontalLineToRelative(0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                lineTo(20.5f, 5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(2.5f)
                reflectiveCurveToRelative(-2f, 0.58f, -2f, 2.5f)
                reflectiveCurveToRelative(2f, 2.5f, 2f, 2.5f)
                verticalLineToRelative(3f)
                lineTo(3f, 16f)
                close()
                moveTo(7f, 7f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-3f)
                lineTo(7f, 7f)
                close()
                moveTo(14f, 7f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-3f)
                lineTo(14f, 7f)
                close()
            }
        }.also { _Memory = it}
