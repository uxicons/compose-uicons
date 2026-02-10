package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TachometerAltAverage: ImageVector? = null

val Icons.Br.TachometerAltAverage: ImageVector
    get() = _TachometerAltAverage ?: UXIcon(name = "TachometerAltAverage") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.02f, 4.06f)
            arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.1f, 11.4f)
            arcTo(11.86f, 11.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.61f, 21.49f)
            arcTo(5.31f, 5.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.34f, 23f)
            horizontalLineToRelative(9.32f)
            arcToRelative(5.17f, 5.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.57f, -1.37f)
            arcTo(11.97f, 11.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.02f, 4.06f)
            close()
            moveTo(18.18f, 19.44f)
            arcTo(2.23f, 2.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.66f, 20f)
            lineTo(7.34f, 20f)
            arcToRelative(2.33f, 2.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.63f, -0.66f)
            arcToRelative(8.89f, 8.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.63f, -7.57f)
            arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.95f, 4.06f)
            curveTo(19.41f, 3f, 24.47f, 13.61f, 18.18f, 19.44f)
            close()
            moveTo(19f, 12.79f)
            arcToRelative(6.97f, 6.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.84f, 4.73f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.21f, -2.03f)
            arcToRelative(3.92f, 3.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.34f, -4.9f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.42f, -1.78f)
            arcTo(6.67f, 6.67f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 12.79f)
            close()
            moveTo(9.05f, 15.49f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.21f, 2.03f)
            arcToRelative(6.93f, 6.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.55f, -8.71f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.42f, 1.78f)
            arcTo(3.92f, 3.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.05f, 15.48f)
            close()
            moveTo(13.5f, 11.68f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 0f)
            lineTo(10.5f, 7.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
            close()
        }
    }.also { _TachometerAltAverage = it }
