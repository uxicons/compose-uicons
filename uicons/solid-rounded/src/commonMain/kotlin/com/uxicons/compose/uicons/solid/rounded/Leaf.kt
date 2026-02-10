package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Leaf: ImageVector? = null

val Icons.Sr.Leaf: ImageVector
    get() = _Leaf ?: UXIcon(name = "Leaf") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.12f, 0.87f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.71f, 0.01f)
                curveTo(17.92f, 0.28f, 8.53f, 1.45f, 4.9f, 5.07f)
                arcToRelative(9.93f, 9.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.67f, 13.28f)
                lineToRelative(11.06f, -11.06f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.41f, 1.41f)
                lineTo(5.65f, 19.77f)
                arcTo(9.93f, 9.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.93f, 19.1f)
                curveToRelative(3.68f, -3.68f, 4.8f, -13.04f, 5.06f, -15.82f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.12f, 0.87f)
                close()
                moveTo(4.9f, 19.1f)
                quadToRelative(0.36f, 0.36f, 0.74f, 0.67f)
                lineToRelative(-3.94f, 3.94f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.29f, 22.29f)
                lineToRelative(3.94f, -3.94f)
                quadTo(4.55f, 18.74f, 4.9f, 19.1f)
                close()
            }
        }.also { _Leaf = it}
