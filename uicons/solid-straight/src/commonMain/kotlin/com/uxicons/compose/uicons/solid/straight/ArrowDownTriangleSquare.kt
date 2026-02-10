package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowDownTriangleSquare: ImageVector? = null

val Icons.Ss.ArrowDownTriangleSquare: ImageVector
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
                moveTo(14f, 23f)
                horizontalLineToRelative(9f)
                lineTo(23f, 14f)
                lineTo(14f, 14f)
                verticalLineToRelative(9f)
                close()
                moveTo(18.52f, 0.98f)
                lineToRelative(-5.52f, 10.02f)
                horizontalLineToRelative(10.99f)
                lineTo(18.52f, 0.98f)
                close()
            }
        }.also { _ArrowDownTriangleSquare = it}
