package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RotateRight: ImageVector? = null

val Icons.Rr.RotateRight: ImageVector
    get() = _RotateRight ?: UXIcon(name = "RotateRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.96f, 12.88f)
                arcTo(10.03f, 10.03f, 0f, isMoreThanHalf = true, isPositiveArc = true, 19.12f, 5f)
                horizontalLineTo(16f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                horizontalLineToRelative(0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                horizontalLineToRelative(4.14f)
                arcTo(1.86f, 1.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 5.14f)
                verticalLineTo(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                horizontalLineToRelative(0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineTo(3.08f)
                arcTo(11.98f, 11.98f, 0f, isMoreThanHalf = true, isPositiveArc = false, 23.95f, 13.1f)
                arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1.1f)
                horizontalLineToRelative(0f)
                arcTo(0.98f, 0.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.96f, 12.88f)
                close()
            }
        }.also { _RotateRight = it}
