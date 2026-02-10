package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bug: ImageVector? = null

val Icons.Sr.Bug: ImageVector
    get() = _Bug ?: UXIcon(name = "Bug") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 19f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineTo(19f)
                horizontalLineTo(4.93f)
                arcToRelative(8.25f, 8.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.14f, 0f)
                horizontalLineTo(22f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineTo(19f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2f)
                horizontalLineTo(19.95f)
                arcToRelative(8.2f, 8.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.33f, -2.27f)
                arcTo(8.37f, 8.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.2f, 13.7f)
                lineToRelative(-0.17f, -0.7f)
                horizontalLineTo(23f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                horizontalLineTo(19.52f)
                lineTo(18.51f, 7f)
                horizontalLineTo(22f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2f)
                verticalLineTo(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineTo(5f)
                horizontalLineTo(18f)
                curveToRelative(-0.02f, 0f, -0.03f, 0.01f, -0.05f, 0.01f)
                arcToRelative(6.41f, 6.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.89f, 0f)
                curveTo(6.04f, 5.01f, 6.02f, 5f, 6f, 5f)
                horizontalLineTo(2f)
                verticalLineTo(1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 7f)
                horizontalLineTo(5.49f)
                lineTo(4.47f, 11f)
                horizontalLineTo(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineTo(3.96f)
                lineToRelative(-0.14f, 0.57f)
                lineTo(3.8f, 13.7f)
                arcToRelative(8.37f, 8.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.07f, 1.03f)
                arcTo(8.2f, 8.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.05f, 17f)
                horizontalLineTo(2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 19f)
                close()
            }
        }.also { _Bug = it}
