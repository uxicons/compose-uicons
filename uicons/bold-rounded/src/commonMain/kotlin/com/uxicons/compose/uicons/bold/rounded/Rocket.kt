package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Rocket: ImageVector? = null

val Icons.Br.Rocket: ImageVector
    get() = _Rocket ?: UXIcon(name = "Rocket") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(15f, 7.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.5f, 1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, -1.5f)
            close()
            moveTo(13.5f, 12f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.5f, -1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 1.5f)
            close()
            moveTo(10.5f, 15f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.5f, -1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 1.5f)
            close()
            moveTo(23.84f, 3.55f)
            lineTo(23.77f, 3.76f)
            curveToRelative(-1.65f, 4.59f, -3.23f, 8.93f, -6.88f, 12.69f)
            arcToRelative(11.06f, 11.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.3f, 6.79f)
            arcToRelative(2.76f, 2.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.89f, 0.76f)
            arcToRelative(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.7f, -2.7f)
            verticalLineToRelative(-1.63f)
            arcToRelative(5.26f, 5.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.61f, -0.94f)
            lineToRelative(-1.83f, 1.83f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.12f, -2.12f)
            lineToRelative(1.83f, -1.83f)
            arcToRelative(5.28f, 5.28f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.15f, -2.6f)
            horizontalLineToRelative(-1.43f)
            arcToRelative(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.7f, -2.7f)
            arcToRelative(2.76f, 2.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.76f, -1.89f)
            arcToRelative(11.29f, 11.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.98f, -3.39f)
            curveToRelative(3.48f, -2.89f, 7.39f, -4.3f, 11.5f, -5.78f)
            lineToRelative(0.21f, -0.07f)
            arcToRelative(2.65f, 2.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.39f, 3.39f)
            close()
            moveTo(20.77f, 3.23f)
            curveToRelative(-4.36f, 1.57f, -8.13f, 3.01f, -11.37f, 6.24f)
            arcToRelative(26.06f, 26.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.92f, 2.45f)
            arcToRelative(2.32f, 2.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.26f, 2.98f)
            lineToRelative(1.42f, 1.42f)
            arcToRelative(2.32f, 2.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.98f, 0.26f)
            arcToRelative(17.55f, 17.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.39f, -1.98f)
            curveToRelative(3.23f, -3.23f, 4.67f, -7.01f, 6.24f, -11.37f)
            close()
        }
    }.also { _Rocket = it }
