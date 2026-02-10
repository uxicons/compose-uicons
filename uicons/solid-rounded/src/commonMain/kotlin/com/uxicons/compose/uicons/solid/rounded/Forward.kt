package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Forward: ImageVector? = null

val Icons.Sr.Forward: ImageVector
    get() = _Forward ?: UXIcon(name = "Forward") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.79f, 20.66f)
                arcTo(3.79f, 3.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16.87f)
                verticalLineTo(7.13f)
                arcTo(3.78f, 3.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.02f, 4.08f)
                lineTo(9.8f, 6.85f)
                arcToRelative(3.78f, 3.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.01f, -2.77f)
                lineToRelative(6.64f, 4.87f)
                arcToRelative(3.78f, 3.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 6.1f)
                lineToRelative(-6.64f, 4.87f)
                arcTo(3.78f, 3.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.8f, 17.15f)
                lineTo(6.02f, 19.92f)
                arcTo(3.77f, 3.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.79f, 20.66f)
                close()
            }
        }.also { _Forward = it}
