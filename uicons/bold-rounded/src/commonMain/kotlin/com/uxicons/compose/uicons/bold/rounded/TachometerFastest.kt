package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TachometerFastest: ImageVector? = null

val Icons.Br.TachometerFastest: ImageVector
    get() = _TachometerFastest ?: UXIcon(name = "TachometerFastest") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 13f)
            arcToRelative(11.9f, 11.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.48f, 8.44f)
            arcToRelative(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.72f, 0.28f)
            lineToRelative(-1.28f, -1.04f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.89f, -2.33f)
            lineToRelative(1.28f, 1.04f)
            arcToRelative(0.52f, 0.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.7f, -0.06f)
            arcTo(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, 5.6f, 19.32f)
            arcToRelative(0.52f, 0.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.7f, 0.06f)
            lineToRelative(1.24f, -1.03f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 9.46f, 20.66f)
            lineTo(8.21f, 21.69f)
            arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.75f, -0.26f)
            arcTo(11.97f, 11.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.1f, 11.44f)
            curveTo(1.25f, 2f, 12.98f, -2.36f, 20f, 4.06f)
            arcTo(12.02f, 12.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 13f)
            close()
            moveTo(16.57f, 15.93f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.86f, -2.87f)
            lineTo(13.7f, 11.94f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, -0.86f, 2.87f)
            close()
        }
    }.also { _TachometerFastest = it }
