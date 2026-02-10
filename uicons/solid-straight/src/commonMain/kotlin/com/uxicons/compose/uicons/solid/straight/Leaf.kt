package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Leaf: ImageVector? = null

val Icons.Ss.Leaf: ImageVector
    get() = _Leaf ?: UXIcon(name = "Leaf") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24.04f, -0.05f)
                lineTo(24f, 1.04f)
                curveToRelative(-0.02f, 0.55f, -0.58f, 13.57f, -5.07f, 18.06f)
                arcToRelative(9.93f, 9.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, -13.28f, 0.67f)
                lineToRelative(11.06f, -11.06f)
                lineTo(15.29f, 7.29f)
                lineTo(4.23f, 18.35f)
                arcTo(9.93f, 9.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.9f, 5.07f)
                curveTo(9.3f, 0.67f, 22.4f, 0.03f, 22.95f, 0f)
                close()
                moveTo(4.23f, 18.35f)
                lineToRelative(-4.19f, 4.19f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(4.19f, -4.19f)
                arcTo(9.95f, 9.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.23f, 18.35f)
                close()
            }
        }.also { _Leaf = it}
