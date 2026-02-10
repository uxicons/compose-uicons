package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowLeft: ImageVector? = null

val Icons.Rr.ArrowLeft: ImageVector
    get() = _ArrowLeft ?: UXIcon(name = "ArrowLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0.88f, 14.09f)
                lineTo(4.75f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.42f, 0f)
                horizontalLineToRelative(0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.42f)
                lineTo(2.61f, 13f)
                horizontalLineTo(23f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                horizontalLineToRelative(0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                horizontalLineTo(2.55f)
                lineTo(6.17f, 7.38f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.17f, 6f)
                horizontalLineToRelative(0f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.75f, 6f)
                lineTo(0.88f, 9.85f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.88f, 14.09f)
                close()
            }
        }.also { _ArrowLeft = it}
