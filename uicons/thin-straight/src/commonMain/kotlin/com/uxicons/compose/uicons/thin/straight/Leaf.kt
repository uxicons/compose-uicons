package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Leaf: ImageVector? = null

val Icons.Ts.Leaf: ImageVector
    get() = _Leaf ?: UXIcon(name = "Leaf") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.46f, 0.05f)
                curveToRelative(-0.57f, 0.02f, -14.1f, 0.65f, -18.57f, 5.12f)
                curveToRelative(-3.73f, 3.73f, -3.84f, 9.72f, -0.34f, 13.59f)
                lineTo(0.01f, 23.29f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(4.54f, -4.54f)
                curveToRelative(1.87f, 1.69f, 4.24f, 2.54f, 6.61f, 2.54f)
                curveToRelative(2.52f, 0f, 5.05f, -0.96f, 6.97f, -2.88f)
                curveTo(23.4f, 14.55f, 23.96f, 1.13f, 23.98f, 0.56f)
                lineToRelative(0.02f, -0.54f)
                lineToRelative(-0.54f, 0.02f)
                close()
                moveTo(18.13f, 18.4f)
                curveToRelative(-3.34f, 3.34f, -8.69f, 3.45f, -12.17f, 0.34f)
                lineToRelative(10.39f, -10.39f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-10.39f, 10.39f)
                curveToRelative(-3.11f, -3.48f, -2.99f, -8.83f, 0.34f, -12.17f)
                curveTo(9.31f, 2.16f, 20.35f, 1.24f, 22.95f, 1.08f)
                curveToRelative(-0.16f, 2.58f, -1.03f, 13.54f, -4.82f, 17.33f)
                close()
            }
        }.also { _Leaf = it}
