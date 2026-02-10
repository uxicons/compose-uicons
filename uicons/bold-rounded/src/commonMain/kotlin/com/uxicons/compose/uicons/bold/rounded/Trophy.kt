package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Trophy: ImageVector? = null

val Icons.Br.Trophy: ImageVector
    get() = _Trophy ?: UXIcon(name = "Trophy") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 10f)
            arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.39f, -3.66f)
            curveToRelative(0.07f, -0.21f, 0.15f, -0.42f, 0.21f, -0.63f)
            arcToRelative(4.38f, 4.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.7f, -3.9f)
            arcTo(4.47f, 4.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.5f, 0f)
            lineTo(6.5f, 0f)
            arcTo(4.47f, 4.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.88f, 1.81f)
            arcToRelative(4.38f, 4.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.7f, 3.9f)
            curveToRelative(0.06f, 0.21f, 0.14f, 0.42f, 0.21f, 0.63f)
            arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 10f)
            curveToRelative(0f, 3.15f, 2.38f, 6.8f, 9f, 6.98f)
            lineTo(9f, 19.5f)
            arcTo(1.37f, 1.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 21f)
            horizontalLineToRelative(-1f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(11f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            horizontalLineToRelative(-0.98f)
            arcTo(1.38f, 1.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 19.5f)
            lineTo(15f, 16.98f)
            curveTo(21.62f, 16.8f, 24f, 13.15f, 24f, 10f)
            close()
            moveTo(21f, 10f)
            curveToRelative(0f, 1.59f, -1.15f, 3.26f, -4.21f, 3.81f)
            arcToRelative(17.73f, 17.73f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.62f, -4.72f)
            arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 10f)
            close()
            moveTo(5.29f, 3.61f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.5f, 3f)
            horizontalLineToRelative(11f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.21f, 0.61f)
            arcToRelative(1.4f, 1.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.23f, 1.25f)
            arcToRelative(15.6f, 15.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.34f, 6.88f)
            arcTo(6.49f, 6.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 16.92f)
            horizontalLineToRelative(0f)
            arcToRelative(6.49f, 6.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.61f, -5.18f)
            arcTo(15.59f, 15.59f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.06f, 4.86f)
            arcTo(1.4f, 1.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.29f, 3.61f)
            close()
            moveTo(3f, 10f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.59f, -0.91f)
            arcToRelative(17.72f, 17.72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.62f, 4.72f)
            curveTo(4.15f, 13.26f, 3f, 11.59f, 3f, 10f)
            close()
        }
    }.also { _Trophy = it }
