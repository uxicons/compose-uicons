package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bug: ImageVector? = null

val Icons.Ss.Bug: ImageVector
    get() = _Bug ?: UXIcon(name = "Bug") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 7f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2f)
                verticalLineTo(0f)
                horizontalLineTo(22f)
                verticalLineTo(5f)
                horizontalLineTo(17.96f)
                arcTo(6.44f, 6.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.04f, 5f)
                horizontalLineTo(2f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 7f)
                horizontalLineTo(5.49f)
                lineTo(4.47f, 11f)
                horizontalLineTo(0f)
                verticalLineToRelative(2f)
                horizontalLineTo(3.96f)
                lineToRelative(-0.14f, 0.57f)
                lineTo(3.8f, 13.7f)
                arcToRelative(8.37f, 8.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.07f, 1.03f)
                arcTo(8.24f, 8.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.04f, 17f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2f)
                verticalLineToRelative(5f)
                horizontalLineTo(2f)
                verticalLineTo(19f)
                horizontalLineTo(4.92f)
                arcToRelative(8.27f, 8.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.16f, 0f)
                horizontalLineTo(22f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                verticalLineTo(19f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2f)
                horizontalLineTo(19.95f)
                arcToRelative(8.24f, 8.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.32f, -2.27f)
                arcTo(8.37f, 8.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.2f, 13.7f)
                lineToRelative(-0.17f, -0.7f)
                horizontalLineTo(24f)
                verticalLineTo(11f)
                horizontalLineTo(19.52f)
                lineTo(18.51f, 7f)
                close()
            }
        }.also { _Bug = it}
