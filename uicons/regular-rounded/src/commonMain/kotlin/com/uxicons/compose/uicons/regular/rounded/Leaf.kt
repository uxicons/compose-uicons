package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Leaf: ImageVector? = null

val Icons.Rr.Leaf: ImageVector
    get() = _Leaf ?: UXIcon(name = "Leaf") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.12f, 0.87f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.71f, 0.01f)
                curveTo(17.92f, 0.28f, 8.53f, 1.45f, 4.9f, 5.07f)
                arcToRelative(9.93f, 9.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.67f, 13.28f)
                lineToRelative(-3.94f, 3.94f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, 1.41f)
                lineToRelative(3.94f, -3.94f)
                arcTo(9.93f, 9.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.93f, 19.1f)
                curveToRelative(3.68f, -3.68f, 4.8f, -13.04f, 5.06f, -15.82f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.12f, 0.87f)
                close()
                moveTo(17.52f, 17.68f)
                arcToRelative(7.92f, 7.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, -10.44f, 0.66f)
                lineToRelative(9.63f, -9.63f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.41f, -1.41f)
                lineTo(5.66f, 16.93f)
                arcTo(7.92f, 7.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.32f, 6.49f)
                curveTo(8.83f, 3.98f, 15.74f, 2.5f, 20.91f, 2.0f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 3.09f)
                curveTo(21.5f, 8.47f, 20.06f, 15.14f, 17.51f, 17.68f)
                close()
            }
        }.also { _Leaf = it}
