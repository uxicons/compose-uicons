package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Leaf: ImageVector? = null

val Icons.Rs.Leaf: ImageVector
    get() = _Leaf ?: UXIcon(name = "Leaf") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.91f, 0.05f)
                curveTo(22.36f, 0.07f, 9.26f, 0.72f, 4.86f, 5.12f)
                arcTo(9.93f, 9.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.19f, 18.4f)
                lineTo(0f, 22.59f)
                lineTo(1.42f, 24f)
                lineToRelative(4.19f, -4.18f)
                arcToRelative(9.93f, 9.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.28f, -0.67f)
                curveToRelative(4.49f, -4.49f, 5.05f, -17.5f, 5.07f, -18.06f)
                lineTo(24f, 0f)
                close()
                moveTo(17.47f, 17.73f)
                arcToRelative(7.93f, 7.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, -10.44f, 0.66f)
                lineToRelative(9.64f, -9.64f)
                lineTo(15.25f, 7.34f)
                lineTo(5.61f, 16.98f)
                arcTo(7.93f, 7.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.28f, 6.53f)
                curveTo(9.46f, 3.35f, 18.68f, 2.37f, 21.89f, 2.12f)
                curveTo(21.66f, 5.32f, 20.72f, 14.49f, 17.47f, 17.73f)
                close()
            }
        }.also { _Leaf = it}
