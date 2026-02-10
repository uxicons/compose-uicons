package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsToCircle: ImageVector? = null

val Icons.Rs.ArrowsToCircle: ImageVector
    get() = _ArrowsToCircle ?: UXIcon(name = "ArrowsToCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 12f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(3.0f, 8f)
                lineToRelative(0.01f, 2f)
                lineToRelative(5.01f, -0.01f)
                curveToRelative(1.1f, 0f, 1.99f, -0.89f, 1.99f, -1.99f)
                lineTo(10.0f, 3f)
                horizontalLineToRelative(-2f)
                lineToRelative(0.01f, 3.59f)
                lineTo(1.46f, 0.05f)
                lineTo(0.05f, 1.46f)
                lineTo(6.58f, 7.99f)
                lineToRelative(-3.58f, 0.01f)
                close()
                moveTo(16f, 10f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                lineToRelative(-3.59f, 0.01f)
                lineTo(23.95f, 1.46f)
                lineTo(22.54f, 0.05f)
                lineToRelative(-6.53f, 6.53f)
                lineToRelative(-0.01f, -3.58f)
                lineToRelative(-2f, 0.01f)
                lineToRelative(0.01f, 5.01f)
                curveToRelative(0f, 1.1f, 0.89f, 1.99f, 1.99f, 1.99f)
                close()
                moveTo(8.01f, 14.01f)
                lineToRelative(-5.01f, -0.01f)
                lineToRelative(-0.01f, 2f)
                horizontalLineToRelative(3.59f)
                lineTo(0.05f, 22.54f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(6.54f, -6.54f)
                verticalLineToRelative(3.59f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.1f, -0.89f, -1.99f, -1.99f, -1.99f)
                close()
                moveTo(21f, 16f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.1f, 0f, -1.99f, 0.89f, -1.99f, 1.99f)
                lineToRelative(-0.01f, 5.01f)
                lineToRelative(2f, 0.0f)
                verticalLineToRelative(-3.59f)
                lineToRelative(6.54f, 6.54f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-6.54f, -6.54f)
                horizontalLineToRelative(3.59f)
                close()
            }
        }.also { _ArrowsToCircle = it}
