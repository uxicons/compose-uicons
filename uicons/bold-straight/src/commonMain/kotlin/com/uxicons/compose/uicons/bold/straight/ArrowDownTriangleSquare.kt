package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowDownTriangleSquare: ImageVector? = null

val Icons.Bs.ArrowDownTriangleSquare: ImageVector
    get() = _ArrowDownTriangleSquare ?: UXIcon(name = "ArrowDownTriangleSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 14f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(9f)
                horizontalLineTo(14f)
                verticalLineTo(14f)
                close()
                moveTo(18.5f, 0.7f)
                lineToRelative(-5f, 9.3f)
                horizontalLineToRelative(10f)
                lineTo(18.5f, 0.7f)
                close()
                moveTo(8f, 19.29f)
                verticalLineTo(0f)
                horizontalLineToRelative(-3f)
                verticalLineTo(19.33f)
                lineToRelative(-2.45f, -2.4f)
                lineTo(0.45f, 19.07f)
                lineToRelative(4.28f, 4.2f)
                curveToRelative(0.49f, 0.49f, 1.13f, 0.73f, 1.77f, 0.73f)
                reflectiveCurveToRelative(1.28f, -0.24f, 1.77f, -0.73f)
                lineToRelative(4.25f, -4.25f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(-2.4f, 2.4f)
                close()
            }
        }.also { _ArrowDownTriangleSquare = it}
