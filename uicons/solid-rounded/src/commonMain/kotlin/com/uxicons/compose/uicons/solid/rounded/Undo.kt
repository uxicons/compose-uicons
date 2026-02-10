package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Undo: ImageVector? = null

val Icons.Sr.Undo: ImageVector
    get() = _Undo ?: UXIcon(name = "Undo") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 7f)
                horizontalLineTo(10.17f)
                verticalLineTo(5.41f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.76f, 4f)
                lineTo(0.88f, 9.88f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4.24f)
                lineTo(6.76f, 20f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.41f, -1.41f)
                verticalLineTo(17f)
                horizontalLineTo(16f)
                arcToRelative(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineTo(16f)
                arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 7f)
                close()
            }
        }.also { _Undo = it}
