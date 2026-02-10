package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Fog: ImageVector? = null

val Icons.Br.Fog: ImageVector
    get() = _Fog ?: UXIcon(name = "Fog") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.5f, 24f)
            horizontalLineToRelative(-5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
            horizontalLineToRelative(5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.5f, 24f)
            close()
            moveTo(19f, 22.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.5f, 21f)
            horizontalLineToRelative(-1f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(1f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 22.5f)
            close()
            moveTo(19f, 17.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.5f, 16f)
            horizontalLineToRelative(-5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 17.5f)
            close()
            moveTo(9f, 17.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.5f, 16f)
            horizontalLineToRelative(-1f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(1f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 17.5f)
            close()
            moveTo(2.85f, 17.79f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.54f, -2.05f)
            arcToRelative(2.73f, 2.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.53f, -3.42f)
            arcTo(3.41f, 3.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 9.17f)
            arcToRelative(5.35f, 5.35f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.02f, -1.89f)
            arcToRelative(5.18f, 5.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.79f, -1.32f)
            arcToRelative(3.42f, 3.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.45f, 1.9f)
            arcToRelative(4.72f, 4.72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.16f, 6.92f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.64f, 1.42f)
            arcTo(7.74f, 7.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.81f, 4.92f)
            arcToRelative(0.44f, 0.44f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.33f, -0.24f)
            arcTo(8.24f, 8.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.56f, 0.14f)
            arcTo(8.13f, 8.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.02f, 6.79f)
            arcToRelative(8.32f, 8.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.04f, 2.95f)
            arcTo(0.43f, 0.43f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.9f, 10.1f)
            arcTo(5.75f, 5.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.8f, 17.26f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.05f, 0.54f)
            close()
        }
    }.also { _Fog = it }
