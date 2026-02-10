package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stats: ImageVector? = null

val Icons.Rr.Stats: ImageVector
    get() = _Stats ?: UXIcon(name = "Stats") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 22f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                verticalLineTo(1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1f)
                verticalLineTo(21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineTo(23f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                verticalLineTo(12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineToRelative(7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 20f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                verticalLineTo(12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineToRelative(7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 20f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                verticalLineTo(7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineTo(19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 20f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                verticalLineTo(7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineTo(19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 20f)
                close()
            }
        }.also { _Stats = it}
