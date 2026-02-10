package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Camera: ImageVector? = null

val Icons.Rs.Camera: ImageVector
    get() = _Camera ?: UXIcon(name = "Camera") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 4f)
                horizontalLineTo(18.49f)
                lineTo(15.41f, 0f)
                horizontalLineTo(8.59f)
                lineTo(5.51f, 4f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 7f)
                verticalLineTo(24f)
                horizontalLineTo(24f)
                verticalLineTo(7f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 4f)
                close()
                moveTo(9.58f, 2f)
                horizontalLineToRelative(4.85f)
                lineToRelative(1.54f, 2f)
                horizontalLineTo(8.03f)
                close()
                moveTo(22f, 22f)
                horizontalLineTo(2f)
                verticalLineTo(7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 6f)
                horizontalLineTo(21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 8f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = false, 6f, 6f)
                arcTo(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 8f)
                close()
                moveTo(12f, 18f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, -4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 18f)
                close()
            }
        }.also { _Camera = it}
