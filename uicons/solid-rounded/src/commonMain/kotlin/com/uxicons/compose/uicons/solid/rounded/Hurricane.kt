package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hurricane: ImageVector? = null

val Icons.Sr.Hurricane: ImageVector
    get() = _Hurricane ?: UXIcon(name = "Hurricane") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.45f, 16.34f)
                arcTo(11.47f, 11.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.43f, 24f)
                horizontalLineTo(6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                arcToRelative(6.44f, 6.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.82f, -1.24f)
                arcToRelative(10.04f, 10.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.27f, -13.1f)
                arcTo(11.47f, 11.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.57f, 0f)
                horizontalLineTo(18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                arcToRelative(6.44f, 6.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.82f, 1.24f)
                arcToRelative(10.04f, 10.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.27f, 13.1f)
                close()
                moveTo(15f, 12f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6f, 0f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 12f)
                close()
            }
        }.also { _Hurricane = it}
