package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Play: ImageVector? = null

val Icons.Rr.Play: ImageVector
    get() = _Play ?: UXIcon(name = "Play") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.49f, 7.97f)
                lineToRelative(-9.54f, -7f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 5f)
                lineTo(3f, 19f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.96f, 4.03f)
                lineToRelative(9.54f, -7f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -8.06f)
                close()
                moveTo(19.31f, 14.42f)
                lineTo(9.77f, 21.42f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 19f)
                lineTo(5f, 5f)
                arcTo(2.95f, 2.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.64f, 2.33f)
                arcTo(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.01f, 2f)
                arcToRelative(2.97f, 2.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.76f, 0.59f)
                lineToRelative(9.54f, 7f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 4.84f)
                close()
            }
        }.also { _Play = it}
