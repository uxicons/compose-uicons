package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sack: ImageVector? = null

val Icons.Br.Sack: ImageVector
    get() = _Sack ?: UXIcon(name = "Sack") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.75f, 5.2f)
            curveToRelative(1.16f, -0.79f, 2.56f, -2.01f, 3.17f, -3.54f)
            curveToRelative(0.32f, -0.8f, -0.32f, -1.66f, -1.18f, -1.66f)
            horizontalLineToRelative(-7.47f)
            curveToRelative(-0.86f, 0f, -1.5f, 0.86f, -1.18f, 1.66f)
            curveToRelative(0.61f, 1.52f, 2.02f, 2.75f, 3.17f, 3.54f)
            curveTo(5.11f, 6.39f, 1f, 12.59f, 1f, 17.75f)
            curveToRelative(0f, 3.45f, 2.8f, 6.25f, 6.25f, 6.25f)
            horizontalLineToRelative(9.5f)
            curveToRelative(3.45f, 0f, 6.25f, -2.8f, 6.25f, -6.25f)
            curveToRelative(0f, -5.17f, -4.11f, -11.36f, -9.25f, -12.55f)
            close()
            moveTo(16.75f, 21f)
            lineTo(7.25f, 21f)
            curveToRelative(-1.79f, 0f, -3.25f, -1.46f, -3.25f, -3.25f)
            curveToRelative(0f, -4.56f, 4.26f, -9.75f, 8f, -9.75f)
            reflectiveCurveToRelative(8f, 5.19f, 8f, 9.75f)
            curveToRelative(0f, 1.79f, -1.46f, 3.25f, -3.25f, 3.25f)
            close()
        }
    }.also { _Sack = it }
