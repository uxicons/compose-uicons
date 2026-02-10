package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowFromLeft: ImageVector? = null

val Icons.Bs.ArrowFromLeft: ImageVector
    get() = _ArrowFromLeft ?: UXIcon(name = "ArrowFromLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.12f, 9.88f)
                lineTo(18.17f, 4.93f)
                lineTo(16.05f, 7.05f)
                lineTo(19.5f, 10.5f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                horizontalLineTo(0f)
                verticalLineTo(19f)
                horizontalLineTo(3f)
                verticalLineTo(13.5f)
                horizontalLineTo(19.5f)
                lineToRelative(-3.45f, 3.45f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(4.95f, -4.95f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.12f, 9.88f)
                close()
            }
        }.also { _ArrowFromLeft = it}
