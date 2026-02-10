package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Laptop: ImageVector? = null

val Icons.Sr.Laptop: ImageVector
    get() = _Laptop ?: UXIcon(name = "Laptop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.85f, 16f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.53f, 0.71f)
                lineTo(14.07f, 17f)
                horizontalLineTo(9.93f)
                lineToRelative(-0.25f, -0.29f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.15f, 16f)
                horizontalLineTo(2.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 18.5f)
                horizontalLineTo(0f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.5f, 21f)
                horizontalLineToRelative(19f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 18.5f)
                horizontalLineToRelative(0f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.5f, 16f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 14f)
                horizontalLineTo(8.15f)
                arcTo(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.8f, 15f)
                horizontalLineToRelative(2.4f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.65f, -1f)
                horizontalLineTo(21f)
                arcToRelative(4.91f, 4.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 0.11f)
                verticalLineTo(8f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, -5f)
                horizontalLineTo(7f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 8f)
                verticalLineToRelative(6.11f)
                arcTo(4.91f, 4.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 14f)
                close()
            }
        }.also { _Laptop = it}
