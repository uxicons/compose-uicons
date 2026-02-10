package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Redo: ImageVector? = null

val Icons.Rr.Redo: ImageVector
    get() = _Redo ?: UXIcon(name = "Redo") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 23f)
                verticalLineTo(16f)
                arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 7f)
                horizontalLineToRelative(4.83f)
                verticalLineTo(5.41f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.24f, 4f)
                lineToRelative(5.88f, 5.88f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 4.24f)
                lineTo(17.24f, 20f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.41f, -1.41f)
                verticalLineTo(17f)
                horizontalLineTo(8f)
                arcToRelative(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6f, 6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                close()
                moveTo(15.83f, 8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                horizontalLineTo(9f)
                arcToRelative(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7f, 7f)
                verticalLineToRelative(1.71f)
                arcTo(7.98f, 7.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 15f)
                horizontalLineToRelative(6.83f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(2.59f)
                lineToRelative(5.88f, -5.88f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.41f)
                lineTo(15.83f, 5.41f)
                close()
            }
        }.also { _Redo = it}
