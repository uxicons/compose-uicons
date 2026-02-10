package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dagger: ImageVector? = null

val Icons.Sr.Dagger: ImageVector
    get() = _Dagger ?: UXIcon(name = "Dagger") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.41f, 6.0f)
                lineToRelative(4.3f, -4.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.42f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, -0.0f)
                lineToRelative(-4.3f, 4.29f)
                lineToRelative(-1.46f, -1.46f)
                curveTo(14.52f, 1.11f, 11.85f, 0f, 9f, 0f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                curveToRelative(1.88f, 0f, 3.66f, 0.6f, 5.14f, 1.7f)
                lineToRelative(-7.02f, 7.03f)
                curveToRelative(-2.46f, 2.46f, -4.51f, 5.29f, -6.07f, 8.4f)
                curveToRelative(0f, 0f, -0.96f, 1.94f, -0.98f, 2.02f)
                curveToRelative(-0.17f, 0.78f, 0.06f, 1.59f, 0.63f, 2.16f)
                curveToRelative(0.45f, 0.45f, 1.04f, 0.69f, 1.65f, 0.69f)
                curveToRelative(0.17f, 0f, 0.34f, -0.02f, 0.51f, -0.06f)
                curveToRelative(0.08f, -0.02f, 2.02f, -0.98f, 2.02f, -0.98f)
                curveToRelative(3.11f, -1.57f, 5.94f, -3.61f, 8.4f, -6.08f)
                lineToRelative(7.02f, -7.03f)
                curveToRelative(1.1f, 1.48f, 1.71f, 3.27f, 1.71f, 5.15f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -2.72f, -1.02f, -5.29f, -2.88f, -7.27f)
                curveToRelative(-0.02f, -0.02f, -1.71f, -1.74f, -1.71f, -1.74f)
                close()
            }
        }.also { _Dagger = it}
