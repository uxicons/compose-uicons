package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowCircleLeft: ImageVector? = null

val Icons.Sr.ArrowCircleLeft: ImageVector
    get() = _ArrowCircleLeft ?: UXIcon(name = "ArrowCircleLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 24f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 12f)
                close()
                moveTo(9.46f, 17.71f)
                lineTo(5.88f, 14.12f)
                horizontalLineToRelative(0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -4.24f)
                lineTo(9.46f, 6.29f)
                lineToRelative(0.03f, -0.02f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.39f, 1.44f)
                lineTo(7.59f, 11f)
                lineTo(18f, 10.99f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                lineTo(7.59f, 13f)
                lineToRelative(3.29f, 3.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.41f, 1.41f)
                close()
            }
        }.also { _ArrowCircleLeft = it}
