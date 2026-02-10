package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Intersection: ImageVector? = null

val Icons.Sc.Intersection: ImageVector
    get() = _Intersection ?: UXIcon(name = "Intersection") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.5f, 23f)
                curveToRelative(-0.91f, 0.01f, -1.64f, -0.84f, -1.48f, -1.74f)
                curveToRelative(0.01f, -0.06f, 0.98f, -6.09f, 0.98f, -11.26f)
                curveToRelative(0f, -4.54f, -1.46f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 1.46f, -6f, 6f)
                curveToRelative(0f, 5.17f, 0.97f, 11.2f, 0.98f, 11.26f)
                curveToRelative(0.13f, 0.82f, -0.42f, 1.59f, -1.24f, 1.72f)
                curveToRelative(-0.82f, 0.14f, -1.59f, -0.42f, -1.72f, -1.24f)
                curveToRelative(-0.04f, -0.26f, -1.02f, -6.33f, -1.02f, -11.74f)
                curveToRelative(0.0f, -6.22f, 2.78f, -9.0f, 9.0f, -9.0f)
                reflectiveCurveToRelative(9f, 2.78f, 9f, 9f)
                curveToRelative(0f, 5.42f, -0.98f, 11.48f, -1.02f, 11.74f)
                curveToRelative(-0.12f, 0.73f, -0.76f, 1.26f, -1.48f, 1.26f)
                close()
            }
        }.also { _Intersection = it}
