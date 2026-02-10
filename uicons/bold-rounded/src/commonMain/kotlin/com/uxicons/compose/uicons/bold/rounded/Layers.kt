package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Layers: ImageVector? = null

val Icons.Br.Layers: ImageVector
    get() = _Layers ?: UXIcon(name = "Layers") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(0.91f, 10.6f)
            lineTo(10.2f, 16.17f)
            arcToRelative(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.6f, 0f)
            lineTo(23.09f, 10.6f)
            arcToRelative(1.86f, 1.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3.19f)
            lineTo(13.8f, 1.83f)
            arcToRelative(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.6f, 0f)
            horizontalLineToRelative(0f)
            lineTo(0.91f, 7.4f)
            arcToRelative(1.86f, 1.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3.19f)
            close()
            moveTo(11.74f, 4.4f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.51f, 0f)
            lineTo(19.92f, 9f)
            lineToRelative(-7.66f, 4.6f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.51f, 0f)
            lineTo(4.08f, 9f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.29f, 18.83f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.57f, 0f)
            lineTo(2.27f, 13.77f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 15.05f)
            horizontalLineTo(0f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.73f, 1.29f)
            lineTo(9.17f, 21.4f)
            arcToRelative(5.49f, 5.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.66f, 0f)
            lineToRelative(8.44f, -5.07f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 15.05f)
            horizontalLineToRelative(0f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.27f, -1.29f)
            close()
        }
    }.also { _Layers = it }
