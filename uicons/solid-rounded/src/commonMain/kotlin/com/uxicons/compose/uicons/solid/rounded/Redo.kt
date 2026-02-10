package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Redo: ImageVector? = null

val Icons.Sr.Redo: ImageVector
    get() = _Redo ?: UXIcon(name = "Redo") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.24f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.83f, 5.41f)
                verticalLineTo(7f)
                horizontalLineTo(9f)
                arcToRelative(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9f, 9f)
                verticalLineToRelative(7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                arcToRelative(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, -6f)
                horizontalLineToRelative(5.83f)
                verticalLineToRelative(1.59f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.24f, 20f)
                lineToRelative(5.88f, -5.88f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4.24f)
                close()
            }
        }.also { _Redo = it}
