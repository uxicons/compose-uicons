package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Leaf: ImageVector? = null

val Icons.Tr.Leaf: ImageVector
    get() = _Leaf ?: UXIcon(name = "Leaf") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.97f, 1.02f)
                curveToRelative(-0.76f, -0.76f, -1.8f, -1.11f, -2.87f, -1.0f)
                curveTo(14.88f, 0.6f, 7.76f, 2.29f, 4.89f, 5.16f)
                curveToRelative(-3.73f, 3.73f, -3.83f, 9.71f, -0.34f, 13.58f)
                lineTo(0.15f, 23.15f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.26f, -0.05f, 0.35f, -0.15f)
                lineToRelative(4.41f, -4.41f)
                curveToRelative(1.87f, 1.69f, 4.23f, 2.55f, 6.6f, 2.55f)
                curveToRelative(2.52f, 0f, 5.05f, -0.96f, 6.97f, -2.88f)
                curveToRelative(3.72f, -3.72f, 4.94f, -13.34f, 5.14f, -15.22f)
                curveToRelative(0.12f, -1.06f, -0.25f, -2.11f, -1.01f, -2.86f)
                close()
                moveTo(18.13f, 18.4f)
                curveToRelative(-3.34f, 3.34f, -8.69f, 3.44f, -12.16f, 0.34f)
                lineToRelative(9.89f, -9.89f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                reflectiveCurveToRelative(-0.51f, -0.2f, -0.71f, 0f)
                lineToRelative(-9.89f, 9.89f)
                curveToRelative(-3.11f, -3.48f, -3.0f, -8.83f, 0.34f, -12.16f)
                curveToRelative(2.88f, -2.88f, 10.82f, -4.42f, 14.9f, -4.87f)
                curveToRelative(0.66f, 0f, 1.29f, 0.26f, 1.77f, 0.73f)
                curveToRelative(0.54f, 0.54f, 0.8f, 1.28f, 0.72f, 2.05f)
                curveToRelative(-0.55f, 5.06f, -2.15f, 11.92f, -4.86f, 14.63f)
                close()
            }
        }.also { _Leaf = it}
