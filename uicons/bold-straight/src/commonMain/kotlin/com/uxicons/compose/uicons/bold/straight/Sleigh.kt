package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sleigh: ImageVector? = null

val Icons.Bs.Sleigh: ImageVector
    get() = _Sleigh ?: UXIcon(name = "Sleigh") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.5f, 17f)
                arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 11.5f)
                verticalLineTo(6f)
                horizontalLineTo(17f)
                verticalLineTo(8.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.5f, 0.5f)
                horizontalLineTo(11.69f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.49f, -0.38f)
                lineToRelative(-0.86f, -3.46f)
                arcTo(5.49f, 5.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 1f)
                horizontalLineTo(0f)
                verticalLineTo(11.5f)
                arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5.48f)
                verticalLineTo(20f)
                horizontalLineTo(0f)
                verticalLineToRelative(3f)
                horizontalLineTo(19.5f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 18.5f)
                verticalLineTo(18f)
                horizontalLineTo(21f)
                verticalLineToRelative(0.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.5f, 20f)
                horizontalLineTo(17f)
                verticalLineTo(17f)
                close()
                moveTo(3f, 11.5f)
                verticalLineTo(4f)
                horizontalLineTo(5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.43f, 5.89f)
                lineToRelative(0.86f, 3.46f)
                arcTo(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.69f, 12f)
                horizontalLineTo(16.5f)
                arcToRelative(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.46f, -3f)
                horizontalLineTo(21f)
                verticalLineToRelative(2.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 14f)
                horizontalLineTo(5.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 11.5f)
                close()
                moveTo(14f, 20f)
                horizontalLineTo(8f)
                verticalLineTo(17f)
                horizontalLineToRelative(6f)
                close()
            }
        }.also { _Sleigh = it}
