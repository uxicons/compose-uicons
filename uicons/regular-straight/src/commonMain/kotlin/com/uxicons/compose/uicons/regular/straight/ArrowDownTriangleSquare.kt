package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowDownTriangleSquare: ImageVector? = null

val Icons.Rs.ArrowDownTriangleSquare: ImageVector
    get() = _ArrowDownTriangleSquare ?: UXIcon(name = "ArrowDownTriangleSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.5f, 17.5f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-4.5f, 4.5f)
                curveToRelative(-0.39f, 0.39f, -0.9f, 0.58f, -1.41f, 0.58f)
                reflectiveCurveToRelative(-1.02f, -0.19f, -1.41f, -0.58f)
                lineTo(0.09f, 18.91f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(3.5f, 3.5f)
                lineTo(5f, 0f)
                horizontalLineToRelative(2f)
                lineTo(7f, 21f)
                lineToRelative(3.5f, -3.5f)
                close()
                moveTo(14f, 14f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(9f)
                lineTo(14f, 23f)
                lineTo(14f, 14f)
                close()
                moveTo(16f, 21f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(5f)
                close()
                moveTo(23.99f, 11f)
                lineTo(13f, 11f)
                lineTo(18.52f, 0.98f)
                lineToRelative(5.47f, 10.02f)
                close()
                moveTo(16.38f, 9f)
                horizontalLineToRelative(4.24f)
                lineToRelative(-2.11f, -3.86f)
                lineToRelative(-2.13f, 3.86f)
                close()
            }
        }.also { _ArrowDownTriangleSquare = it}
