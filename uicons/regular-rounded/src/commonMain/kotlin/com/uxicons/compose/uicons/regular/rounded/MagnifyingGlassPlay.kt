package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MagnifyingGlassPlay: ImageVector? = null

val Icons.Rr.MagnifyingGlassPlay: ImageVector
    get() = _MagnifyingGlassPlay ?: UXIcon(name = "MagnifyingGlassPlay") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.71f, 22.29f)
                lineToRelative(-5.97f, -5.97f)
                curveToRelative(1.41f, -1.73f, 2.26f, -3.93f, 2.26f, -6.32f)
                curveToRelative(0f, -5.51f, -4.49f, -10f, -10f, -10f)
                reflectiveCurveToRelative(-10f, 4.49f, -10f, 10f)
                reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                curveToRelative(2.4f, 0f, 4.6f, -0.85f, 6.32f, -2.26f)
                lineToRelative(5.97f, 5.97f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, -1.02f, 0f, -1.41f)
                close()
                moveTo(2f, 10f)
                curveToRelative(0f, -4.41f, 3.59f, -8f, 8f, -8f)
                reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                reflectiveCurveToRelative(-3.59f, 8f, -8f, 8f)
                reflectiveCurveToRelative(-8f, -3.59f, -8f, -8f)
                close()
                moveTo(13.97f, 8.26f)
                lineTo(9.47f, 5.79f)
                curveToRelative(-1.26f, -0.77f, -3.02f, 0.26f, -2.98f, 1.74f)
                verticalLineToRelative(4.94f)
                curveToRelative(-0.05f, 1.48f, 1.7f, 2.51f, 2.96f, 1.75f)
                lineToRelative(4.51f, -2.47f)
                curveToRelative(1.35f, -0.7f, 1.35f, -2.79f, 0f, -3.49f)
                close()
                moveTo(8.5f, 12.47f)
                lineTo(8.5f, 7.54f)
                lineTo(13.01f, 9.99f)
                lineTo(8.5f, 12.47f)
                close()
            }
        }.also { _MagnifyingGlassPlay = it}
