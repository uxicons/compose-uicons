package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GlobeAlt: ImageVector? = null

val Icons.Sc.GlobeAlt: ImageVector
    get() = _GlobeAlt ?: UXIcon(name = "GlobeAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.67f, 14.02f)
                curveToRelative(3.96f, 0f, 5.89f, -1.94f, 5.89f, -5.93f)
                curveToRelative(0f, -5.31f, -3.36f, -5.93f, -5.89f, -5.93f)
                curveToRelative(-3.96f, 0f, -5.89f, 1.94f, -5.89f, 5.93f)
                curveToRelative(0f, 5.31f, 3.36f, 5.93f, 5.89f, 5.93f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.42f, 12.37f)
                curveToRelative(-0.71f, -0.42f, -1.63f, -0.19f, -2.06f, 0.53f)
                curveToRelative(-1.23f, 2.08f, -3.42f, 3.09f, -6.7f, 3.09f)
                curveToRelative(-5.19f, 0f, -7.83f, -2.66f, -7.83f, -7.9f)
                curveToRelative(0f, -1.33f, 0.2f, -3.25f, 1.14f, -4.82f)
                curveToRelative(0.42f, -0.71f, 0.19f, -1.63f, -0.52f, -2.06f)
                curveToRelative(-0.71f, -0.42f, -1.63f, -0.19f, -2.06f, 0.52f)
                curveToRelative(-1.29f, 2.16f, -1.56f, 4.65f, -1.56f, 6.36f)
                curveToRelative(0f, 6.41f, 3.38f, 10.28f, 9.32f, 10.83f)
                verticalLineToRelative(1.08f)
                horizontalLineToRelative(-3.29f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(9.59f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-3.29f)
                verticalLineToRelative(-1.08f)
                curveToRelative(4.43f, -0.41f, 6.67f, -2.62f, 7.78f, -4.5f)
                curveToRelative(0.42f, -0.71f, 0.19f, -1.63f, -0.53f, -2.06f)
                close()
            }
        }.also { _GlobeAlt = it}
