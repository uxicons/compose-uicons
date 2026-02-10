package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Thunderstorm: ImageVector? = null

val Icons.Br.Thunderstorm: ImageVector
    get() = _Thunderstorm ?: UXIcon(name = "Thunderstorm") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11f, 19.99f)
            lineTo(7.92f, 19.99f)
            arcTo(0.92f, 0.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.04f, 18.8f)
            lineToRelative(2.12f, -6.14f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.94f, -0.67f)
            lineTo(12f, 11.99f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.93f, 1.36f)
            lineTo(12f, 15.99f)
            horizontalLineToRelative(3.09f)
            arcToRelative(0.91f, 0.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.76f, 1.41f)
            lineToRelative(-4.25f, 6.22f)
            arcToRelative(0.87f, 0.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.56f, -0.73f)
            close()
            moveTo(20.26f, 19.25f)
            curveToRelative(5.87f, -3.73f, 4.48f, -12.98f, -2.45f, -14.33f)
            arcToRelative(0.44f, 0.44f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.32f, -0.24f)
            arcTo(8.25f, 8.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.56f, 0.14f)
            arcTo(8.13f, 8.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.02f, 6.79f)
            arcToRelative(8.32f, 8.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.04f, 2.95f)
            arcTo(0.43f, 0.43f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.9f, 10.1f)
            arcToRelative(5.83f, 5.83f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.77f, 9.15f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.67f, -2.49f)
            arcToRelative(2.8f, 2.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.42f, -4.44f)
            arcTo(3.41f, 3.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 9.17f)
            arcToRelative(5.35f, 5.35f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.02f, -1.89f)
            arcToRelative(5.18f, 5.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.79f, -1.32f)
            arcToRelative(3.42f, 3.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.45f, 1.9f)
            curveToRelative(4.33f, 0.87f, 5.03f, 6.57f, 1.39f, 8.88f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.64f, 2.51f)
            close()
        }
    }.also { _Thunderstorm = it }
