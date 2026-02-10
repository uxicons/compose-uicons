package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Leaf: ImageVector? = null

val Icons.Bs.Leaf: ImageVector
    get() = _Leaf ?: UXIcon(name = "Leaf") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.38f, 0.07f)
                curveTo(21.04f, 0.12f, 9.18f, 0.72f, 4.92f, 4.98f)
                arcTo(10.02f, 10.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.94f, 17.94f)
                lineTo(0.01f, 21.88f)
                lineTo(2.13f, 24f)
                lineTo(6.06f, 20.06f)
                arcToRelative(10.02f, 10.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.96f, -0.98f)
                curveToRelative(4.34f, -4.34f, 4.87f, -16.13f, 4.91f, -17.46f)
                lineTo(23.99f, 0f)
                close()
                moveTo(16.9f, 16.96f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.68f, 0.95f)
                lineToRelative(8.72f, -8.72f)
                lineTo(14.81f, 7.06f)
                lineTo(6.1f, 15.78f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.04f, 7.1f)
                curveToRelative(2.51f, -2.51f, 9.74f, -3.6f, 13.8f, -3.93f)
                curveTo(20.52f, 7.21f, 19.46f, 14.39f, 16.9f, 16.96f)
                close()
            }
        }.also { _Leaf = it}
