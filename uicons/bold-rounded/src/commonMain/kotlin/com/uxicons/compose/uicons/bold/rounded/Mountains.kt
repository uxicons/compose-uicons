package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mountains: ImageVector? = null

val Icons.Br.Mountains: ImageVector
    get() = _Mountains ?: UXIcon(name = "Mountains") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.5f, 7f)
            arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -7f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.5f, 7f)
            close()
            moveTo(21.06f, 24f)
            lineTo(12.94f, 24f)
            arcToRelative(2.92f, 2.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.54f, -1.45f)
            arcToRelative(2.82f, 2.82f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.03f, -2.83f)
            lineToRelative(4.07f, -7.24f)
            arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.14f, 0f)
            lineToRelative(4.06f, 7.23f)
            arcToRelative(2.82f, 2.82f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.03f, 2.83f)
            arcTo(2.92f, 2.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.06f, 24f)
            close()
            moveTo(16.99f, 14.02f)
            lineTo(13.11f, 21f)
            horizontalLineToRelative(7.81f)
            close()
            moveTo(8f, 22.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.5f, 21f)
            lineTo(3.71f, 21f)
            arcToRelative(0.69f, 0.69f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.61f, -0.35f)
            arcToRelative(0.7f, 0.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.01f, -0.7f)
            lineTo(9.35f, 8.37f)
            arcToRelative(0.71f, 0.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.25f, 0f)
            lineToRelative(0.62f, 1.15f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 13.86f, 8.1f)
            lineToRelative(-0.62f, -1.15f)
            arcToRelative(3.73f, 3.73f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.52f, 0f)
            lineTo(0.45f, 18.52f)
            arcTo(3.71f, 3.71f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.71f, 24f)
            lineTo(6.5f, 24f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 22.5f)
            close()
        }
    }.also { _Mountains = it }
