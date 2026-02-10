package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MagnifyingGlassPlay: ImageVector? = null

val Icons.Sr.MagnifyingGlassPlay: ImageVector
    get() = _MagnifyingGlassPlay ?: UXIcon(name = "MagnifyingGlassPlay") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.5f, 7.54f)
                lineToRelative(4.5f, 2.45f)
                lineToRelative(-4.51f, 2.48f)
                lineToRelative(0.0f, -4.93f)
                close()
                moveTo(23.71f, 23.71f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                lineToRelative(-5.97f, -5.97f)
                curveToRelative(-1.73f, 1.41f, -3.93f, 2.26f, -6.32f, 2.26f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                reflectiveCurveToRelative(4.49f, -10f, 10f, -10f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                curveToRelative(0f, 2.4f, -0.85f, 4.6f, -2.26f, 6.32f)
                lineToRelative(5.97f, 5.97f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                close()
                moveTo(15f, 10.0f)
                curveToRelative(0f, -0.72f, -0.39f, -1.39f, -1.03f, -1.75f)
                lineToRelative(-4.5f, -2.46f)
                curveToRelative(-1.26f, -0.77f, -3.02f, 0.26f, -2.98f, 1.74f)
                verticalLineToRelative(4.94f)
                curveToRelative(-0.05f, 1.47f, 1.7f, 2.51f, 2.96f, 1.75f)
                lineToRelative(4.51f, -2.47f)
                curveToRelative(0.63f, -0.35f, 1.03f, -1.02f, 1.03f, -1.74f)
                close()
            }
        }.also { _MagnifyingGlassPlay = it}
