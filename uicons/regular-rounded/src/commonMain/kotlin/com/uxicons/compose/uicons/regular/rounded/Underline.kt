package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Underline: ImageVector? = null

val Icons.Rr.Underline: ImageVector
    get() = _Underline ?: UXIcon(name = "Underline") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 20f)
                arcToRelative(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                verticalLineTo(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineTo(12f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 12f)
                verticalLineTo(1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 1f)
                verticalLineTo(12f)
                arcTo(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 20f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 22f)
                horizontalLineTo(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineTo(23f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                close()
            }
        }.also { _Underline = it}
