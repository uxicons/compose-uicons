package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Carrot: ImageVector? = null

val Icons.Sr.Carrot: ImageVector
    get() = _Carrot ?: UXIcon(name = "Carrot") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 5f)
                horizontalLineTo(20.41f)
                lineToRelative(2.29f, -2.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.41f, -1.41f)
                lineTo(19f, 3.59f)
                verticalLineTo(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineTo(5.46f)
                arcTo(10.14f, 10.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.15f, 3.33f)
                arcTo(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.76f, 4.34f)
                lineToRelative(2.95f, 2.95f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.41f, 1.41f)
                lineTo(8.52f, 5.94f)
                curveTo(7.38f, 7.61f, 5.86f, 10.2f, 4.33f, 12.92f)
                lineToRelative(2.37f, 2.37f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.41f, 1.41f)
                lineTo(3.32f, 14.74f)
                curveTo(2.21f, 16.74f, 1.16f, 18.71f, 0.3f, 20.32f)
                arcTo(2.51f, 2.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.68f, 23.7f)
                curveToRelative(2.83f, -1.5f, 6.76f, -3.63f, 10.05f, -5.55f)
                lineToRelative(-2.44f, -2.44f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.41f, -1.41f)
                lineTo(15.51f, 17.1f)
                arcToRelative(27.06f, 27.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.11f, -2.82f)
                arcToRelative(3.77f, 3.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.05f, -4.42f)
                arcTo(10.17f, 10.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.54f, 7f)
                horizontalLineTo(23f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 5f)
                close()
            }
        }.also { _Carrot = it}
