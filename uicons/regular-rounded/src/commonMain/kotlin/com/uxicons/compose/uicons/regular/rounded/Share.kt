package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Share: ImageVector? = null

val Icons.Rr.Share: ImageVector
    get() = _Share ?: UXIcon(name = "Share") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.33f, 14.67f)
                arcToRelative(4.66f, 4.66f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.84f, 2.02f)
                lineTo(8.98f, 13.75f)
                arcToRelative(4.57f, 4.57f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.01f, -3.49f)
                lineToRelative(6.5f, -2.95f)
                arcToRelative(4.66f, 4.66f, 0f, isMoreThanHalf = true, isPositiveArc = false, -0.83f, -2.64f)
                arcToRelative(4.63f, 4.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.08f, 0.79f)
                lineTo(7.83f, 8.59f)
                arcToRelative(4.67f, 4.67f, 0f, isMoreThanHalf = true, isPositiveArc = false, -0.01f, 6.83f)
                lineToRelative(6.93f, 3.13f)
                arcToRelative(4.74f, 4.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.08f, 0.79f)
                arcToRelative(4.67f, 4.67f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4.67f, -4.67f)
                close()
                moveTo(19.33f, 2f)
                arcToRelative(2.67f, 2.67f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2.67f, 2.67f)
                arcTo(2.67f, 2.67f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.33f, 2f)
                close()
                moveTo(4.67f, 14.67f)
                arcTo(2.67f, 2.67f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7.33f, 12f)
                arcTo(2.67f, 2.67f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.67f, 14.67f)
                close()
                moveTo(19.33f, 22f)
                arcTo(2.67f, 2.67f, 0f, isMoreThanHalf = true, isPositiveArc = true, 22f, 19.33f)
                arcTo(2.67f, 2.67f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.33f, 22f)
                close()
            }
        }.also { _Share = it}
