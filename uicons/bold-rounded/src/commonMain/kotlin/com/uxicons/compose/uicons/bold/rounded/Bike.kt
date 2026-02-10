package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bike: ImageVector? = null

val Icons.Br.Bike: ImageVector
    get() = _Bike ?: UXIcon(name = "Bike") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.33f, 12.2f)
            arcToRelative(28.86f, 28.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.09f, -2.88f)
            arcTo(13.32f, 13.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 5.5f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 0f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            arcToRelative(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.97f, -0.3f)
            arcTo(1.51f, 1.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 5.5f)
            arcToRelative(7.12f, 7.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.31f, 1.91f)
            lineTo(11.6f, 10.3f)
            lineTo(7.1f, 7f)
            lineTo(8.5f, 7f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            lineTo(5.47f, 4f)
            arcTo(2.47f, 2.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.01f, 8.46f)
            lineToRelative(5.13f, 3.75f)
            lineToRelative(-1.09f, 0.85f)
            arcTo(4.95f, 4.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 12f)
            arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 5f, 5f)
            arcToRelative(4.92f, 4.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.24f, -1.47f)
            lineToRelative(6.66f, -5.18f)
            reflectiveCurveToRelative(0.59f, 1.4f, 0.8f, 1.99f)
            arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3.11f, -0.14f)
            close()
            moveTo(5f, 19f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, -2f)
            arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 19f)
            close()
            moveTo(19f, 19f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, -2f)
            arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 19f)
            close()
        }
    }.also { _Bike = it }
