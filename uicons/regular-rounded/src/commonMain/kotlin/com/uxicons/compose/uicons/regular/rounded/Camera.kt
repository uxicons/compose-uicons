package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Camera: ImageVector? = null

val Icons.Rr.Camera: ImageVector
    get() = _Camera ?: UXIcon(name = "Camera") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 4f)
                horizontalLineToRelative(-0.51f)
                lineTo(16.31f, 1.17f)
                arcTo(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.93f, 0f)
                horizontalLineTo(10.07f)
                arcTo(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.69f, 1.17f)
                lineTo(5.51f, 4f)
                horizontalLineTo(5f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 9f)
                verticalLineTo(19f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                horizontalLineTo(19f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                verticalLineTo(9f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 4f)
                close()
                moveTo(9.28f, 2.39f)
                arcTo(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.07f, 2f)
                horizontalLineToRelative(3.86f)
                arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.79f, 0.39f)
                lineTo(15.97f, 4f)
                horizontalLineTo(8.03f)
                close()
                moveTo(22f, 19f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                horizontalLineTo(5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                verticalLineTo(9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 6f)
                horizontalLineTo(19f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
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
