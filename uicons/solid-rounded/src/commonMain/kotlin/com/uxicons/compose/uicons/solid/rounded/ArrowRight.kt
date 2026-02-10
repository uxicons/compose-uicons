package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowRight: ImageVector? = null

val Icons.Sr.ArrowRight: ImageVector
    get() = _ArrowRight ?: UXIcon(name = "ArrowRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.12f, 18.39f)
                lineToRelative(3.92f, -3.92f)
                arcToRelative(3.58f, 3.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4.95f)
                lineTo(19.12f, 5.61f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 7.73f)
                lineToRelative(2.78f, 2.78f)
                lineToRelative(-18.25f, 0.02f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 1.5f)
                verticalLineToRelative(0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 1.5f)
                lineToRelative(18.23f, -0.02f)
                lineTo(17f, 16.27f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, 2.12f)
                close()
            }
        }.also { _ArrowRight = it}
