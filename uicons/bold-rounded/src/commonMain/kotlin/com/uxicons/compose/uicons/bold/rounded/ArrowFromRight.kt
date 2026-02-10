package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowFromRight: ImageVector? = null

val Icons.Br.ArrowFromRight: ImageVector
    get() = _ArrowFromRight ?: UXIcon(name = "ArrowFromRight") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(0.86f, 14.09f)
            lineToRelative(4.73f, 4.73f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.71f, 16.7f)
            lineTo(4.46f, 13.52f)
            horizontalLineTo(21f)
            verticalLineTo(17.75f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            verticalLineTo(6.28f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            verticalLineToRelative(4.24f)
            horizontalLineTo(4.53f)
            lineTo(7.71f, 7.33f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.59f, 5.21f)
            lineTo(0.86f, 9.94f)
            arcTo(2.94f, 2.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.86f, 14.09f)
            close()
        }
    }.also { _ArrowFromRight = it }
