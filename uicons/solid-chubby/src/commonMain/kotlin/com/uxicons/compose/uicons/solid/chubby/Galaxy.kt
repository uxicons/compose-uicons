package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Galaxy: ImageVector? = null

val Icons.Sc.Galaxy: ImageVector
    get() = _Galaxy ?: UXIcon(name = "Galaxy") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.39f, 6.04f)
                curveToRelative(0.38f, -0.86f, 1.08f, -2.1f, 2.32f, -3.33f)
                curveToRelative(0.29f, -0.29f, 0.37f, -0.72f, 0.22f, -1.09f)
                curveToRelative(-0.15f, -0.37f, -0.52f, -0.62f, -0.92f, -0.62f)
                curveToRelative(-6.53f, 0f, -9.57f, 2.59f, -9.96f, 8.61f)
                curveToRelative(-0.86f, -0.38f, -2.1f, -1.08f, -3.34f, -2.32f)
                curveToRelative(-0.29f, -0.29f, -0.72f, -0.37f, -1.09f, -0.22f)
                curveToRelative(-0.37f, 0.15f, -0.62f, 0.52f, -0.62f, 0.92f)
                curveToRelative(0f, 6.53f, 2.59f, 9.57f, 8.61f, 9.96f)
                curveToRelative(-0.38f, 0.86f, -1.08f, 2.1f, -2.32f, 3.33f)
                curveToRelative(-0.29f, 0.29f, -0.37f, 0.72f, -0.22f, 1.09f)
                curveToRelative(0.15f, 0.37f, 0.52f, 0.62f, 0.92f, 0.62f)
                curveToRelative(6.53f, 0f, 9.57f, -2.59f, 9.96f, -8.61f)
                curveToRelative(0.86f, 0.38f, 2.1f, 1.08f, 3.34f, 2.32f)
                curveToRelative(0.29f, 0.29f, 0.72f, 0.37f, 1.09f, 0.22f)
                curveToRelative(0.37f, -0.15f, 0.62f, -0.52f, 0.62f, -0.92f)
                curveToRelative(0f, -6.53f, -2.59f, -9.57f, -8.61f, -9.96f)
                close()
                moveTo(12f, 13.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _Galaxy = it}
