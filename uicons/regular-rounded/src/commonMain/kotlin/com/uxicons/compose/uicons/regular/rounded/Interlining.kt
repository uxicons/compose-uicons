package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Interlining: ImageVector? = null

val Icons.Rr.Interlining: ImageVector
    get() = _Interlining ?: UXIcon(name = "Interlining") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 6f)
                horizontalLineTo(23f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                horizontalLineTo(10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 11f)
                horizontalLineTo(10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineTo(23f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 18f)
                horizontalLineTo(10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineTo(23f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.09f, 6f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.35f, -0.85f)
                lineTo(4f, 2.71f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.41f, 0f)
                lineTo(0.15f, 5.15f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.5f, 6f)
                horizontalLineTo(2.29f)
                verticalLineTo(18f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.35f, 0.85f)
                lineToRelative(2.44f, 2.44f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, 0f)
                lineTo(6.44f, 18.85f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.09f, 18f)
                horizontalLineTo(4.29f)
                verticalLineTo(6f)
                close()
            }
        }.also { _Interlining = it}
