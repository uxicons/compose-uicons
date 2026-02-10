package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowFromBottom: ImageVector? = null

val Icons.Bs.ArrowFromBottom: ImageVector
    get() = _ArrowFromBottom ?: UXIcon(name = "ArrowFromBottom") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.5f, 4.5f)
                lineToRelative(3.45f, 3.45f)
                lineToRelative(2.12f, -2.12f)
                lineTo(14.12f, 0.88f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.24f, 0f)
                lineTo(4.93f, 5.83f)
                lineTo(7.05f, 7.95f)
                lineTo(10.5f, 4.5f)
                verticalLineTo(21f)
                horizontalLineTo(5f)
                verticalLineToRelative(3f)
                horizontalLineTo(19f)
                verticalLineTo(21f)
                horizontalLineTo(13.5f)
                close()
            }
        }.also { _ArrowFromBottom = it}
