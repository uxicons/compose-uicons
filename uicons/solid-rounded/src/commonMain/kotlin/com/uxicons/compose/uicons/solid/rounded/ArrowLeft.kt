package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowLeft: ImageVector? = null

val Icons.Sr.ArrowLeft: ImageVector
    get() = _ArrowLeft ?: UXIcon(name = "ArrowLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.94f, 5.61f)
                lineTo(1.02f, 9.53f)
                arcToRelative(3.58f, 3.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4.95f)
                lineToRelative(3.92f, 3.92f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.12f, -2.12f)
                lineTo(4.29f, 13.49f)
                lineToRelative(18.25f, -0.02f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, -1.5f)
                verticalLineToRelative(0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, -1.5f)
                lineTo(4.3f, 10.49f)
                lineTo(7.06f, 7.73f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.94f, 5.61f)
                close()
            }
        }.also { _ArrowLeft = it}
