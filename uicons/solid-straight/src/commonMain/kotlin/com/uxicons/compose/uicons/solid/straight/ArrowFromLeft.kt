package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowFromLeft: ImageVector? = null

val Icons.Ss.ArrowFromLeft: ImageVector
    get() = _ArrowFromLeft ?: UXIcon(name = "ArrowFromLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.27f, 10.23f)
                lineToRelative(-4.95f, -4.95f)
                lineTo(16.9f, 6.7f)
                lineToRelative(4.3f, 4.3f)
                horizontalLineTo(2f)
                verticalLineTo(5f)
                horizontalLineTo(0f)
                verticalLineTo(19f)
                horizontalLineTo(2f)
                verticalLineTo(13f)
                horizontalLineTo(21.21f)
                lineToRelative(-4.3f, 4.3f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(4.95f, -4.95f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3.54f)
                close()
            }
        }.also { _ArrowFromLeft = it}
