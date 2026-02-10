package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Banner: ImageVector? = null

val Icons.Ss.Banner: ImageVector
    get() = _Banner ?: UXIcon(name = "Banner") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.7f, 18.05f)
                lineToRelative(-2.34f, -0.32f)
                curveToRelative(-2.0f, -0.27f, -5.89f, -0.73f, -9.36f, -0.73f)
                reflectiveCurveToRelative(-7.35f, 0.46f, -9.36f, 0.73f)
                lineToRelative(-2.34f, 0.32f)
                lineToRelative(4.36f, -5.93f)
                lineTo(0.08f, 7.14f)
                lineToRelative(1.88f, -0.27f)
                curveToRelative(2.76f, -0.4f, 6.74f, -0.87f, 10.04f, -0.87f)
                reflectiveCurveToRelative(7.28f, 0.47f, 10.04f, 0.87f)
                lineToRelative(1.88f, 0.27f)
                lineToRelative(-4.58f, 4.98f)
                lineToRelative(4.36f, 5.93f)
                close()
            }
        }.also { _Banner = it}
