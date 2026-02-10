package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hurricane: ImageVector? = null

val Icons.Br.Hurricane: ImageVector
    get() = _Hurricane ?: UXIcon(name = "Hurricane") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.52f, 24f)
            horizontalLineToRelative(-4f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
            arcToRelative(6.4f, 6.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.43f, -0.49f)
            arcToRelative(10.82f, 10.82f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.5f, -4.6f)
            arcToRelative(9.87f, 9.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.89f, -8.21f)
            arcTo(11.39f, 11.39f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.48f, 0f)
            horizontalLineToRelative(4f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
            arcToRelative(6.4f, 6.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.43f, 0.49f)
            arcToRelative(10.82f, 10.82f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 4.6f)
            arcToRelative(9.86f, 9.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.89f, 8.21f)
            arcTo(11.39f, 11.39f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.52f, 24f)
            close()
            moveTo(11.03f, 3.34f)
            arcTo(8.23f, 8.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.4f, 8.63f)
            arcToRelative(6.9f, 6.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.62f, 5.75f)
            arcToRelative(7.71f, 7.71f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.12f, 3.64f)
            arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.83f, 2.64f)
            arcTo(8.23f, 8.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.6f, 15.37f)
            arcToRelative(6.91f, 6.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.62f, -5.75f)
            arcTo(7.71f, 7.71f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.86f, 5.98f)
            horizontalLineToRelative(0f)
            arcTo(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.03f, 3.34f)
            close()
            moveTo(12f, 15f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -6f)
            arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 15f)
            close()
        }
    }.also { _Hurricane = it }
