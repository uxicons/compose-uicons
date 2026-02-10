package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Banner5: ImageVector? = null

val Icons.Bs.Banner5: ImageVector
    get() = _Banner5 ?: UXIcon(name = "Banner5") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 11f)
                reflectiveCurveToRelative(-1.59f, -1.06f, -4f, -1.63f)
                verticalLineToRelative(-3.88f)
                lineToRelative(-0.94f, -0.38f)
                curveToRelative(-0.11f, -0.04f, -2.82f, -1.11f, -7.06f, -1.11f)
                reflectiveCurveToRelative(-6.94f, 1.06f, -7.06f, 1.11f)
                lineToRelative(-0.94f, 0.38f)
                verticalLineToRelative(3.88f)
                curveToRelative(-2.41f, 0.58f, -4f, 1.63f, -4f, 1.63f)
                curveToRelative(1.5f, 0.93f, 3f, 3f, 3f, 3f)
                curveToRelative(0f, 0f, -1.81f, 2.11f, -3f, 5f)
                curveToRelative(2.5f, -1f, 5.18f, -1.82f, 7f, -2f)
                verticalLineToRelative(-2.36f)
                curveToRelative(1.1f, -0.27f, 2.97f, -0.64f, 5f, -0.64f)
                reflectiveCurveToRelative(3.9f, 0.37f, 5f, 0.64f)
                verticalLineToRelative(2.36f)
                curveToRelative(1.82f, 0.18f, 4.5f, 1f, 7f, 2f)
                curveToRelative(-1.19f, -2.89f, -3f, -5f, -3f, -5f)
                curveToRelative(0f, 0f, 1.5f, -2.07f, 3f, -3f)
                close()
                moveTo(17f, 11.56f)
                curveToRelative(-1.28f, -0.28f, -3.06f, -0.56f, -5f, -0.56f)
                reflectiveCurveToRelative(-3.72f, 0.28f, -5f, 0.56f)
                verticalLineToRelative(-3.95f)
                curveToRelative(1.0f, -0.26f, 2.75f, -0.6f, 5f, -0.6f)
                reflectiveCurveToRelative(4.0f, 0.34f, 5f, 0.6f)
                verticalLineToRelative(3.96f)
                close()
            }
        }.also { _Banner5 = it}
