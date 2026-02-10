package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Volume: ImageVector? = null

val Icons.Sr.Volume: ImageVector
    get() = _Volume ?: UXIcon(name = "Volume") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.8f, 4.29f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.39f, 5.71f)
                arcToRelative(8.91f, 8.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 12.59f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 20.8f, 19.71f)
                arcTo(10.91f, 10.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.8f, 4.29f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.09f, 7.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.41f, 1.41f)
                arcToRelative(4.66f, 4.66f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 6.59f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.41f, 1.41f)
                arcTo(6.67f, 6.67f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.09f, 7.29f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.82f, 0.21f)
                arcTo(12.05f, 12.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.27f, 5f)
                horizontalLineTo(5f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, 5f)
                verticalLineToRelative(4f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                horizontalLineTo(6.27f)
                arcToRelative(12.05f, 12.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.55f, 4.79f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 22.81f)
                verticalLineTo(1.19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.82f, 0.21f)
                close()
            }
        }.also { _Volume = it}
