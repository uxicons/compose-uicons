package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowFromBottom: ImageVector? = null

val Icons.Ss.ArrowFromBottom: ImageVector
    get() = _ArrowFromBottom ?: UXIcon(name = "ArrowFromBottom") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 21.98f)
                verticalLineTo(2.8f)
                lineToRelative(4.3f, 4.3f)
                lineToRelative(1.41f, -1.42f)
                lineTo(13.77f, 0.74f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.54f, 0f)
                lineTo(5.28f, 5.69f)
                lineTo(6.7f, 7.1f)
                lineTo(11f, 2.8f)
                verticalLineTo(21.98f)
                horizontalLineTo(5f)
                verticalLineToRelative(2f)
                horizontalLineTo(19f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _ArrowFromBottom = it}
