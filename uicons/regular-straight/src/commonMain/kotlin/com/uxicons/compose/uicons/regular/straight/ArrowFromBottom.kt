package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowFromBottom: ImageVector? = null

val Icons.Rs.ArrowFromBottom: ImageVector
    get() = _ArrowFromBottom ?: UXIcon(name = "ArrowFromBottom") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 22f)
                verticalLineTo(2.82f)
                lineToRelative(4.3f, 4.3f)
                lineToRelative(1.41f, -1.41f)
                lineTo(13.77f, 0.76f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.54f, 0f)
                lineToRelative(-4.95f, 4.95f)
                lineTo(6.7f, 7.13f)
                lineToRelative(4.3f, -4.3f)
                verticalLineTo(22f)
                horizontalLineTo(5f)
                verticalLineToRelative(2f)
                horizontalLineTo(19f)
                verticalLineTo(22f)
                close()
            }
        }.also { _ArrowFromBottom = it}
