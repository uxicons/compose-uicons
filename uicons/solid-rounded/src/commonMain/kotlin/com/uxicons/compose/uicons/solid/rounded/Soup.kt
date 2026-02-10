package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Soup: ImageVector? = null

val Icons.Sr.Soup: ImageVector
    get() = _Soup ?: UXIcon(name = "Soup") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.86f, 24f)
                horizontalLineTo(10.14f)
                arcToRelative(8.92f, 8.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.27f, -2.53f)
                arcTo(14.76f, 14.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.16f, 15.15f)
                arcTo(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 10f)
                horizontalLineTo(20f)
                arcToRelative(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.84f, 5.15f)
                arcToRelative(14.74f, 14.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.71f, 6.32f)
                arcTo(8.92f, 8.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.86f, 24f)
                close()
                moveTo(16f, 6f)
                arcToRelative(4.38f, 4.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.29f, -3.12f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 1.17f)
                verticalLineTo(1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 1f)
                verticalLineToRelative(0.17f)
                arcToRelative(4.38f, 4.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.29f, 3.12f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                close()
                moveTo(12f, 7f)
                verticalLineTo(6.69f)
                arcToRelative(4.39f, 4.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.29f, -3.12f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 1.86f)
                verticalLineTo(1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 1f)
                verticalLineToRelative(0.86f)
                arcTo(4.39f, 4.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.29f, 4.99f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 6.69f)
                verticalLineTo(7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                close()
            }
        }.also { _Soup = it}
