package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowDownTriangleSquare: ImageVector? = null

val Icons.Ts.ArrowDownTriangleSquare: ImageVector
    get() = _ArrowDownTriangleSquare ?: UXIcon(name = "ArrowDownTriangleSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 23f)
                horizontalLineToRelative(9f)
                lineTo(23f, 14f)
                lineTo(14f, 14f)
                verticalLineToRelative(9f)
                close()
                moveTo(15f, 15f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-7f)
                close()
                moveTo(18.52f, 0.71f)
                lineToRelative(-5.12f, 9.29f)
                horizontalLineToRelative(10.19f)
                lineTo(18.52f, 0.71f)
                close()
                moveTo(18.52f, 2.79f)
                lineToRelative(3.39f, 6.21f)
                horizontalLineToRelative(-6.81f)
                lineToRelative(3.42f, -6.21f)
                close()
                moveTo(10.29f, 18.41f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-4.44f, 4.44f)
                curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
                reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
                lineTo(0.01f, 19.13f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(4.28f, 4.28f)
                lineTo(5f, 0f)
                horizontalLineToRelative(1f)
                lineTo(6f, 22.71f)
                lineToRelative(4.29f, -4.29f)
                close()
            }
        }.also { _ArrowDownTriangleSquare = it}
