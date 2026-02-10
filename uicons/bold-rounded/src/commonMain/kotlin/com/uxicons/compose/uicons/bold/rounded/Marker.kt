package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Marker: ImageVector? = null

val Icons.Br.Marker: ImageVector
    get() = _Marker ?: UXIcon(name = "Marker") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 0f)
            arcTo(10.51f, 10.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 10.5f)
            curveToRelative(0f, 2.83f, 2.2f, 6.77f, 6.54f, 11.71f)
            arcToRelative(5.28f, 5.28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.92f, 0f)
            curveTo(20.3f, 17.27f, 22.5f, 13.33f, 22.5f, 10.5f)
            arcTo(10.51f, 10.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
            close()
            moveTo(13.71f, 20.23f)
            arcToRelative(2.33f, 2.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.41f, 0f)
            curveToRelative(-3.68f, -4.2f, -5.8f, -7.74f, -5.8f, -9.73f)
            arcToRelative(7.5f, 7.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 0f)
            curveTo(19.5f, 12.49f, 17.39f, 16.04f, 13.71f, 20.23f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 6.05f)
            arcToRelative(4.36f, 4.36f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4.36f, 4.36f)
            arcTo(4.37f, 4.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 6.05f)
            close()
            moveTo(12f, 11.78f)
            arcToRelative(1.36f, 1.36f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.36f, -1.36f)
            arcTo(1.36f, 1.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 11.78f)
            close()
        }
    }.also { _Marker = it }
