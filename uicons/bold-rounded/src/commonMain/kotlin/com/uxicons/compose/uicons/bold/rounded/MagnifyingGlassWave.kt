package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MagnifyingGlassWave: ImageVector? = null

val Icons.Br.MagnifyingGlassWave: ImageVector
    get() = _MagnifyingGlassWave ?: UXIcon(name = "MagnifyingGlassWave") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23.56f, 21.44f)
            lineToRelative(-5.51f, -5.51f)
            curveToRelative(1.23f, -1.66f, 1.96f, -3.7f, 1.96f, -5.92f)
            curveTo(20.01f, 4.49f, 15.52f, 0.01f, 10.01f, 0.01f)
            reflectiveCurveTo(0.01f, 4.49f, 0.01f, 10.01f)
            reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
            curveToRelative(2.22f, 0f, 4.26f, -0.73f, 5.92f, -1.96f)
            lineToRelative(5.51f, 5.51f)
            curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
            reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
            curveToRelative(0.59f, -0.59f, 0.59f, -1.53f, 0f, -2.12f)
            close()
            moveTo(10.01f, 17.0f)
            curveToRelative(-3.86f, 0f, -7f, -3.14f, -7f, -7f)
            reflectiveCurveToRelative(3.14f, -7f, 7f, -7f)
            reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
            reflectiveCurveToRelative(-3.14f, 7f, -7f, 7f)
            close()
            moveTo(11f, 5.5f)
            verticalLineToRelative(8.5f)
            curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
            lineTo(9f, 5.5f)
            curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
            close()
            moveTo(14f, 8.5f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
            verticalLineToRelative(-2.5f)
            curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
            close()
            moveTo(8f, 7.5f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
            verticalLineToRelative(-4.5f)
            curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
            close()
        }
    }.also { _MagnifyingGlassWave = it }
