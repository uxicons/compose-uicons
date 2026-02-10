package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Carrot: ImageVector? = null

val Icons.Br.Carrot: ImageVector
    get() = _Carrot ?: UXIcon(name = "Carrot") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.5f, 5f)
            lineTo(21.12f, 5f)
            lineToRelative(1.44f, -1.44f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.12f, -2.12f)
            lineTo(19f, 2.88f)
            lineTo(19f, 1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            lineTo(16f, 4.54f)
            arcToRelative(7.53f, 7.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.83f, -1.18f)
            arcToRelative(4.1f, 4.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.8f, 1.11f)
            curveTo(7.66f, 6.18f, 2.98f, 14.75f, 0.35f, 19.7f)
            arcTo(2.92f, 2.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.3f, 23.65f)
            curveToRelative(4.95f, -2.63f, 13.52f, -7.31f, 15.23f, -9.02f)
            curveTo(22f, 12.16f, 20.97f, 9.86f, 19.45f, 8f)
            lineTo(22.5f, 8f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.5f, 5f)
            close()
            moveTo(17.41f, 12.51f)
            arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.83f, 1.95f)
            lineToRelative(-1.02f, -1.02f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.12f, 2.12f)
            lineToRelative(0.48f, 0.48f)
            curveToRelative(-2.39f, 1.39f, -5.41f, 3.07f, -8.85f, 4.93f)
            curveToRelative(0.96f, -1.81f, 1.88f, -3.5f, 2.73f, -5.04f)
            lineToRelative(0.63f, 0.64f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, -2.12f)
            lineTo(7.33f, 13.21f)
            curveToRelative(0.8f, -1.4f, 1.51f, -2.63f, 2.13f, -3.63f)
            lineToRelative(0.98f, 0.99f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, -2.12f)
            lineTo(11.14f, 7.02f)
            arcToRelative(4.71f, 4.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.36f, -0.43f)
            curveToRelative(0.65f, -0.61f, 0.93f, -0.71f, 1.5f, -0.47f)
            arcToRelative(11.31f, 11.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.68f, 2.22f)
            curveTo(18.48f, 11.15f, 18.31f, 11.6f, 17.41f, 12.51f)
            close()
        }
    }.also { _Carrot = it }
