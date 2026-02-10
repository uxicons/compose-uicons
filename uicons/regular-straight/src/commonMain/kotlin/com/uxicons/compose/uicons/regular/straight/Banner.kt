package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Banner: ImageVector? = null

val Icons.Rs.Banner: ImageVector
    get() = _Banner ?: UXIcon(name = "Banner") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.92f, 7.14f)
                lineToRelative(-1.88f, -0.27f)
                curveToRelative(-2.76f, -0.4f, -6.74f, -0.87f, -10.04f, -0.87f)
                reflectiveCurveToRelative(-7.28f, 0.47f, -10.04f, 0.87f)
                lineToRelative(-1.88f, 0.27f)
                lineToRelative(4.58f, 4.98f)
                lineTo(0.3f, 18.05f)
                lineToRelative(2.34f, -0.32f)
                curveToRelative(2.0f, -0.27f, 5.89f, -0.73f, 9.36f, -0.73f)
                reflectiveCurveToRelative(7.35f, 0.46f, 9.36f, 0.73f)
                lineToRelative(2.34f, 0.32f)
                lineToRelative(-4.36f, -5.93f)
                lineToRelative(4.58f, -4.98f)
                close()
                moveTo(12f, 15f)
                curveToRelative(-2.51f, 0f, -5.21f, 0.23f, -7.31f, 0.47f)
                lineToRelative(2.56f, -3.48f)
                lineToRelative(-3.12f, -3.39f)
                curveToRelative(2.44f, -0.31f, 5.37f, -0.59f, 7.86f, -0.59f)
                reflectiveCurveToRelative(5.42f, 0.28f, 7.86f, 0.59f)
                lineToRelative(-3.12f, 3.39f)
                lineToRelative(2.56f, 3.48f)
                curveToRelative(-2.1f, -0.23f, -4.8f, -0.47f, -7.31f, -0.47f)
                close()
            }
        }.also { _Banner = it}
