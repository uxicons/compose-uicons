package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Volume: ImageVector? = null

val Icons.Rr.Volume: ImageVector
    get() = _Volume ?: UXIcon(name = "Volume") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.81f, 4.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.42f, 1.42f)
                arcToRelative(8.91f, 8.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 12.59f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.42f, 1.42f)
                arcTo(10.92f, 10.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.81f, 4.29f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.1f, 7.29f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.68f, 8.71f)
                arcToRelative(4.66f, 4.66f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 6.59f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.1f, 16.71f)
                arcTo(6.67f, 6.67f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.1f, 7.29f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.82f, 0.2f)
                arcTo(12.05f, 12.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.27f, 5f)
                horizontalLineTo(5f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, 5f)
                verticalLineToRelative(4f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                horizontalLineTo(6.27f)
                arcTo(12.06f, 12.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.82f, 23.8f)
                arcToRelative(0.92f, 0.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.18f, 0.02f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                verticalLineTo(1.19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.82f, 0.2f)
                close()
                moveTo(13f, 21.54f)
                arcToRelative(10.08f, 10.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.37f, -4.08f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.79f, 17f)
                horizontalLineTo(5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                verticalLineTo(10f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 7f)
                horizontalLineToRelative(1.8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.84f, -0.45f)
                arcTo(10.08f, 10.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 2.46f)
                close()
            }
        }.also { _Volume = it}
