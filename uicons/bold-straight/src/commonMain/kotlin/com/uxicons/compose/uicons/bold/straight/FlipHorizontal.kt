package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FlipHorizontal: ImageVector? = null

val Icons.Bs.FlipHorizontal: ImageVector
    get() = _FlipHorizontal ?: UXIcon(name = "FlipHorizontal") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.62f, 19.76f)
                lineTo(14.93f, 0.63f)
                lineTo(14.63f, 0f)
                horizontalLineTo(13f)
                verticalLineTo(24f)
                horizontalLineToRelative(7.89f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.73f, -4.24f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 3.99f)
                verticalLineTo(0f)
                horizontalLineTo(9.52f)
                lineTo(0.8f, 19.18f)
                arcTo(3.41f, 3.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.91f, 24f)
                horizontalLineTo(11f)
                verticalLineTo(21f)
                horizontalLineTo(3.91f)
                arcToRelative(0.41f, 0.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.38f, -0.58f)
                close()
            }
        }.also { _FlipHorizontal = it}
