package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MagnifyingGlassPlay: ImageVector? = null

val Icons.Br.MagnifyingGlassPlay: ImageVector
    get() = _MagnifyingGlassPlay ?: UXIcon(name = "MagnifyingGlassPlay") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23.56f, 21.44f)
            lineToRelative(-5.52f, -5.51f)
            curveToRelative(1.23f, -1.66f, 1.96f, -3.7f, 1.96f, -5.92f)
            curveToRelative(0f, -5.51f, -4.49f, -10f, -10f, -10f)
            reflectiveCurveToRelative(-10f, 4.49f, -10f, 10f)
            reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
            curveToRelative(2.22f, 0f, 4.26f, -0.73f, 5.92f, -1.96f)
            lineToRelative(5.52f, 5.51f)
            curveToRelative(0.59f, 0.58f, 1.54f, 0.58f, 2.12f, 0f)
            curveToRelative(0.58f, -0.59f, 0.58f, -1.54f, 0f, -2.12f)
            close()
            moveTo(10f, 17.0f)
            curveToRelative(-3.86f, 0f, -7f, -3.14f, -7f, -7f)
            reflectiveCurveToRelative(3.14f, -7.0f, 7f, -7.0f)
            reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
            reflectiveCurveToRelative(-3.14f, 7f, -7f, 7f)
            close()
            moveTo(12.99f, 10.87f)
            reflectiveCurveToRelative(-4.51f, 2.47f, -4.51f, 2.47f)
            curveToRelative(-0.66f, 0.37f, -1.48f, -0.11f, -1.48f, -0.87f)
            verticalLineToRelative(-4.94f)
            curveToRelative(0f, -0.76f, 0.82f, -1.24f, 1.48f, -0.87f)
            lineToRelative(4.51f, 2.47f)
            curveToRelative(0.68f, 0.38f, 0.68f, 1.35f, 0f, 1.74f)
            close()
        }
    }.also { _MagnifyingGlassPlay = it }
