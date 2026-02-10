package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FlipHorizontal: ImageVector? = null

val Icons.Sr.FlipHorizontal: ImageVector
    get() = _FlipHorizontal ?: UXIcon(name = "FlipHorizontal") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.21f, 0.07f)
                horizontalLineTo(10.2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.07f, 0.63f)
                lineTo(0.38f, 19.76f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.11f, 24f)
                horizontalLineTo(10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                verticalLineTo(1.05f)
                arcTo(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.21f, 0.07f)
                close()
                moveTo(9f, 22f)
                horizontalLineTo(3.11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.91f, -1.41f)
                lineTo(9f, 5.62f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.62f, 19.76f)
                lineTo(14.93f, 0.63f)
                arcTo(1.02f, 1.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.78f, 0.07f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 1.05f)
                verticalLineTo(23f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                horizontalLineToRelative(6.89f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.73f, -4.24f)
                close()
            }
        }.also { _FlipHorizontal = it}
