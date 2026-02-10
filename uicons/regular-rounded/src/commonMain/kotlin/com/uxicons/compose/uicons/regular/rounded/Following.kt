package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Following: ImageVector? = null

val Icons.Rr.Following: ImageVector
    get() = _Following ?: UXIcon(name = "Following") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 12f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3f, 6f)
                arcTo(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 12f)
                close()
                moveTo(9f, 2f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, 6f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 14f)
                arcToRelative(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9f, 9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 14f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 7.88f)
                arcToRelative(2.11f, 2.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2.2f)
                arcToRelative(2.11f, 2.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2.2f)
                arcToRelative(2.11f, 2.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2.2f)
                curveToRelative(0f, 1.73f, 2.26f, 3.76f, 3.38f, 4.66f)
                arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.24f, 0f)
                curveToRelative(1.12f, -0.9f, 3.38f, -2.93f, 3.38f, -4.66f)
                arcTo(2.11f, 2.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 7.88f)
                close()
            }
        }.also { _Following = it}
