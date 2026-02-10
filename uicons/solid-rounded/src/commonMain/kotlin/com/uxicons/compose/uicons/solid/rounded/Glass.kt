package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Glass: ImageVector? = null

val Icons.Sr.Glass: ImageVector
    get() = _Glass ?: UXIcon(name = "Glass") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.47f, 1.03f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.21f, 0f)
                horizontalLineTo(4.79f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.82f, 3.4f)
                lineTo(2.31f, 7f)
                horizontalLineTo(16.1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                horizontalLineTo(2.58f)
                lineTo(4.04f, 19.68f)
                arcTo(5.02f, 5.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.99f, 24f)
                horizontalLineToRelative(6.02f)
                arcToRelative(5.02f, 5.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.95f, -4.32f)
                lineTo(22.18f, 3.4f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.47f, 1.03f)
                close()
            }
        }.also { _Glass = it}
