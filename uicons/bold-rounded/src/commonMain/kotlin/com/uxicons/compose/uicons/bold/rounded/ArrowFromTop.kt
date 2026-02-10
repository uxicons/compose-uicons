package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowFromTop: ImageVector? = null

val Icons.Br.ArrowFromTop: ImageVector
    get() = _ArrowFromTop ?: UXIcon(name = "ArrowFromTop") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.07f, 23.16f)
            lineToRelative(4.73f, -4.73f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 16.68f, 16.3f)
            lineTo(13.5f, 19.55f)
            verticalLineTo(3.02f)
            horizontalLineToRelative(4.24f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            horizontalLineTo(6.26f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineTo(10.5f)
            verticalLineTo(19.49f)
            lineTo(7.31f, 16.3f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.12f, 2.12f)
            lineToRelative(4.73f, 4.73f)
            arcTo(2.94f, 2.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.07f, 23.16f)
            close()
        }
    }.also { _ArrowFromTop = it }
