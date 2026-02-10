package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sort: ImageVector? = null

val Icons.Sc.Sort: ImageVector
    get() = _Sort ?: UXIcon(name = "Sort") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.66f, 10.44f)
                curveToRelative(1.75f, 0.46f, 3.54f, 0.7f, 5.34f, 0.7f)
                reflectiveCurveToRelative(3.59f, -0.23f, 5.34f, -0.7f)
                curveToRelative(0.53f, -0.14f, 0.85f, -0.68f, 0.71f, -1.21f)
                curveTo(16.72f, 3.99f, 12.57f, 1.17f, 12.53f, 1.15f)
                curveToRelative(-0.1f, -0.06f, -0.22f, -0.1f, -0.33f, -0.13f)
                curveToRelative(-0.25f, -0.05f, -0.5f, -0.01f, -0.72f, 0.13f)
                curveToRelative(-0.04f, 0.03f, -4.19f, 2.84f, -5.53f, 8.08f)
                curveToRelative(-0.14f, 0.53f, 0.18f, 1.07f, 0.71f, 1.21f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.34f, 13.56f)
                curveToRelative(-1.75f, -0.46f, -3.54f, -0.7f, -5.34f, -0.7f)
                reflectiveCurveToRelative(-3.59f, 0.23f, -5.34f, 0.7f)
                curveToRelative(-0.53f, 0.14f, -0.85f, 0.68f, -0.71f, 1.21f)
                curveToRelative(1.33f, 5.24f, 5.48f, 8.06f, 5.53f, 8.08f)
                curveToRelative(0.1f, 0.06f, 0.22f, 0.1f, 0.33f, 0.13f)
                curveToRelative(0.25f, 0.05f, 0.5f, 0.01f, 0.72f, -0.13f)
                curveToRelative(0.04f, -0.03f, 4.19f, -2.84f, 5.53f, -8.08f)
                curveToRelative(0.14f, -0.53f, -0.18f, -1.07f, -0.71f, -1.21f)
                close()
            }
        }.also { _Sort = it}
