package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpSquareTriangle: ImageVector? = null

val Icons.Bs.ArrowUpSquareTriangle: ImageVector
    get() = _ArrowUpSquareTriangle ?: UXIcon(name = "ArrowUpSquareTriangle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 10f)
                lineTo(14f, 10f)
                lineTo(14f, 1f)
                horizontalLineToRelative(9f)
                lineTo(23f, 10f)
                close()
                moveTo(18.5f, 14f)
                lineToRelative(-5.5f, 9f)
                horizontalLineToRelative(11f)
                lineToRelative(-5.5f, -9f)
                close()
                moveTo(10.91f, 7.6f)
                lineToRelative(-2.9f, -2.9f)
                lineTo(8.02f, 24f)
                horizontalLineToRelative(-3f)
                lineTo(5.02f, 4.71f)
                lineToRelative(-2.9f, 2.9f)
                lineTo(0f, 5.48f)
                lineTo(4.75f, 0.73f)
                curveToRelative(0.49f, -0.49f, 1.13f, -0.73f, 1.77f, -0.73f)
                reflectiveCurveToRelative(1.28f, 0.24f, 1.77f, 0.73f)
                lineToRelative(4.75f, 4.75f)
                lineToRelative(-2.12f, 2.12f)
                verticalLineToRelative(0.0f)
                close()
            }
        }.also { _ArrowUpSquareTriangle = it}
