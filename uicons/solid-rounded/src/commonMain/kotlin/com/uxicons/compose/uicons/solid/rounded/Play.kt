package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Play: ImageVector? = null

val Icons.Sr.Play: ImageVector
    get() = _Play ?: UXIcon(name = "Play") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.49f, 7.97f)
                lineTo(10.95f, 0.97f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 5.0f)
                verticalLineTo(19f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.95f, 4.03f)
                lineToRelative(9.54f, -6.99f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -8.06f)
                close()
            }
        }.also { _Play = it}
