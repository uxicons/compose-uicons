package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CaretRight: ImageVector? = null

val Icons.Sr.CaretRight: ImageVector
    get() = _CaretRight ?: UXIcon(name = "CaretRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 17.88f)
                verticalLineTo(6.71f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.71f, 6f)
                lineToRelative(5.59f, 5.59f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.41f)
                lineToRelative(-5.59f, 5.59f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 17.88f)
                close()
            }
        }.also { _CaretRight = it}
