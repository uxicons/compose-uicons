package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Arrows: ImageVector? = null

val Icons.Bs.Arrows: ImageVector
    get() = _Arrows ?: UXIcon(name = "Arrows") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.27f, 10.23f)
                lineToRelative(-3.75f, -3.75f)
                lineTo(17.4f, 8.6f)
                lineToRelative(1.94f, 1.94f)
                horizontalLineTo(13.5f)
                verticalLineTo(4.71f)
                lineToRelative(1.9f, 1.9f)
                lineToRelative(2.12f, -2.12f)
                lineTo(13.77f, 0.73f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.54f, 0f)
                lineToRelative(-3.75f, 3.75f)
                lineTo(8.6f, 6.6f)
                lineToRelative(1.9f, -1.9f)
                verticalLineToRelative(5.84f)
                horizontalLineTo(4.71f)
                lineToRelative(1.9f, -1.9f)
                lineTo(4.48f, 6.53f)
                lineTo(0.73f, 10.27f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3.54f)
                lineToRelative(3.75f, 3.75f)
                lineTo(6.6f, 15.44f)
                lineToRelative(-1.9f, -1.9f)
                horizontalLineTo(10.5f)
                verticalLineToRelative(5.75f)
                lineTo(8.6f, 17.4f)
                lineTo(6.48f, 19.52f)
                lineToRelative(3.75f, 3.75f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.54f, 0f)
                lineToRelative(3.75f, -3.75f)
                lineTo(15.4f, 17.4f)
                lineToRelative(-1.9f, 1.9f)
                verticalLineToRelative(-5.75f)
                horizontalLineToRelative(5.75f)
                lineTo(17.4f, 15.4f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(3.75f, -3.75f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.27f, 10.23f)
                close()
            }
        }.also { _Arrows = it}
