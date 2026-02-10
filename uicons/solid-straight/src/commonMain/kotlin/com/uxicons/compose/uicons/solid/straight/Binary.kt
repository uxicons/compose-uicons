package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Binary: ImageVector? = null

val Icons.Ss.Binary: ImageVector
    get() = _Binary ?: UXIcon(name = "Binary") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 11f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                verticalLineToRelative(-3f)
                curveTo(4f, 1.79f, 5.79f, 0f, 8f, 0f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                close()
                moveTo(8f, 2f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(16f, 24f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                close()
                moveTo(16f, 15f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(19f, 0f)
                horizontalLineToRelative(-1.51f)
                lineToRelative(-3.51f, 3.6f)
                lineToRelative(1.43f, 1.4f)
                lineToRelative(1.58f, -1.63f)
                verticalLineToRelative(7.63f)
                horizontalLineToRelative(2f)
                lineTo(18.99f, 0f)
                close()
                moveTo(9f, 13f)
                horizontalLineToRelative(-1.51f)
                lineToRelative(-3.51f, 3.6f)
                lineToRelative(1.43f, 1.4f)
                lineToRelative(1.58f, -1.63f)
                verticalLineToRelative(7.63f)
                horizontalLineToRelative(2f)
                lineTo(8.99f, 13f)
                close()
            }
        }.also { _Binary = it}
