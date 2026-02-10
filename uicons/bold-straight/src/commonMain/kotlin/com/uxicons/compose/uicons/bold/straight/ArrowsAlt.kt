package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsAlt: ImageVector? = null

val Icons.Bs.ArrowsAlt: ImageVector
    get() = _ArrowsAlt ?: UXIcon(name = "ArrowsAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.63f, 11.11f)
                lineTo(19f, 6.87f)
                verticalLineToRelative(3.62f)
                horizontalLineTo(13.49f)
                verticalLineTo(5f)
                horizontalLineToRelative(3.58f)
                lineTo(12.83f, 0.37f)
                arcToRelative(1.11f, 1.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.66f, 0f)
                lineTo(6.93f, 5f)
                horizontalLineToRelative(3.55f)
                verticalLineToRelative(5.49f)
                horizontalLineTo(5f)
                verticalLineTo(6.87f)
                lineTo(0.37f, 11.11f)
                arcToRelative(1.11f, 1.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.66f)
                lineTo(5f, 17f)
                verticalLineTo(13.49f)
                horizontalLineToRelative(5.49f)
                verticalLineTo(19f)
                horizontalLineTo(6.93f)
                lineToRelative(4.24f, 4.63f)
                arcToRelative(1.11f, 1.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.66f, 0f)
                lineTo(17.07f, 19f)
                horizontalLineTo(13.49f)
                verticalLineTo(13.49f)
                horizontalLineTo(19f)
                verticalLineTo(17f)
                lineToRelative(4.63f, -4.24f)
                arcTo(1.11f, 1.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.63f, 11.11f)
                close()
            }
        }.also { _ArrowsAlt = it}
