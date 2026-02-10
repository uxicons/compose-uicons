package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Search: ImageVector? = null

val Icons.Sr.Search: ImageVector
    get() = _Search ?: UXIcon(name = "Search", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(213.38f, 426.69f)
                curveToRelative(49.21f, 0.06f, 96.92f, -16.96f, 134.98f, -48.17f)
                lineToRelative(127.28f, 127.25f)
                curveToRelative(8.48f, 8.19f, 21.98f, 7.95f, 30.17f, -0.52f)
                curveToRelative(7.98f, -8.27f, 7.98f, -21.37f, 0f, -29.64f)
                lineTo(378.55f, 348.34f)
                curveToRelative(74.54f, -91.24f, 61.01f, -225.64f, -30.23f, -300.18f)
                reflectiveCurveTo(122.68f, -12.85f, 48.13f, 78.39f)
                reflectiveCurveTo(-12.88f, 304.02f, 78.36f, 378.57f)
                curveTo(116.47f, 409.7f, 164.17f, 426.7f, 213.38f, 426.69f)
                close()
            }
        }.also { _Search = it}
