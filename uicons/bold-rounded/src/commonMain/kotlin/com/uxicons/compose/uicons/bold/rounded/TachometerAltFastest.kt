package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TachometerAltFastest: ImageVector? = null

val Icons.Br.TachometerAltFastest: ImageVector
    get() = _TachometerAltFastest ?: UXIcon(name = "TachometerAltFastest") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.02f, 4.06f)
            arcTo(12.02f, 12.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.1f, 11.4f)
            arcTo(11.87f, 11.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.61f, 21.49f)
            arcTo(5.32f, 5.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.34f, 23f)
            horizontalLineToRelative(9.32f)
            arcToRelative(5.17f, 5.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.57f, -1.37f)
            arcTo(11.97f, 11.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.02f, 4.06f)
            close()
            moveTo(18.18f, 19.44f)
            arcTo(2.23f, 2.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.66f, 20f)
            lineTo(7.34f, 20f)
            arcToRelative(2.33f, 2.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.64f, -0.66f)
            arcToRelative(8.89f, 8.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.63f, -7.56f)
            arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.95f, 4.06f)
            curveTo(19.41f, 3f, 24.47f, 13.61f, 18.18f, 19.44f)
            close()
            moveTo(17.81f, 16.23f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.04f, 0.58f)
            lineToRelative(-3.34f, -1.86f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.46f, -2.62f)
            lineToRelative(3.34f, 1.86f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.81f, 16.23f)
            close()
            moveTo(17.58f, 11.84f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.02f, -0.65f)
            curveToRelative(-2.9f, -5.1f, -10.17f, -0.32f, -6.65f, 4.36f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6.6f, 17.45f)
            curveTo(0.48f, 9.18f, 13.1f, 0.91f, 18.24f, 9.82f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.58f, 11.84f)
            close()
        }
    }.also { _TachometerAltFastest = it }
