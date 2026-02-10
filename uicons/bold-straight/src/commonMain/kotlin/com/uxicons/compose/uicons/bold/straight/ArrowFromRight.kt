package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowFromRight: ImageVector? = null

val Icons.Bs.ArrowFromRight: ImageVector
    get() = _ArrowFromRight ?: UXIcon(name = "ArrowFromRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 5f)
                verticalLineToRelative(5.5f)
                horizontalLineTo(4.5f)
                lineTo(7.95f, 7.05f)
                lineTo(5.83f, 4.93f)
                lineTo(0.88f, 9.88f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4.24f)
                lineToRelative(4.95f, 4.95f)
                lineTo(7.95f, 16.95f)
                lineTo(4.5f, 13.5f)
                horizontalLineTo(21f)
                verticalLineTo(19f)
                horizontalLineToRelative(3f)
                verticalLineTo(5f)
                close()
            }
        }.also { _ArrowFromRight = it}
