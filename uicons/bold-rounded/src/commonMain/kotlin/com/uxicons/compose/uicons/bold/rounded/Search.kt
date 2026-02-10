package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Search: ImageVector? = null

val Icons.Br.Search: ImageVector
    get() = _Search ?: UXIcon(name = "Search", viewportWidth = 512f, viewportHeight = 512f) {
        path(fill = SolidColor(Color.Black)) {
            moveTo(504.35f, 459.06f)
            lineToRelative(-99.43f, -99.48f)
            curveToRelative(74.4f, -99.43f, 54.12f, -240.34f, -45.31f, -314.75f)
            reflectiveCurveTo(119.26f, -9.28f, 44.86f, 90.15f)
            reflectiveCurveTo(-9.26f, 330.49f, 90.17f, 404.9f)
            curveToRelative(79.87f, 59.77f, 189.57f, 59.77f, 269.43f, 0f)
            lineToRelative(99.48f, 99.48f)
            curveToRelative(12.5f, 12.5f, 32.77f, 12.5f, 45.27f, 0f)
            curveToRelative(12.5f, -12.5f, 12.5f, -32.77f, 0f, -45.27f)
            lineTo(504.35f, 459.06f)
            close()
            moveTo(225.72f, 385.7f)
            curveToRelative(-88.37f, 0f, -160f, -71.63f, -160f, -160f)
            reflectiveCurveToRelative(71.63f, -160f, 160f, -160f)
            reflectiveCurveToRelative(160f, 71.63f, 160f, 160f)
            curveTo(385.62f, 314.02f, 314.04f, 385.6f, 225.72f, 385.7f)
            close()
        }
    }.also { _Search = it }
