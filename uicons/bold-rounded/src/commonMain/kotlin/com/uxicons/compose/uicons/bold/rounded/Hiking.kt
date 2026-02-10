package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hiking: ImageVector? = null

val Icons.Br.Hiking: ImageVector
    get() = _Hiking ?: UXIcon(name = "Hiking") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.57f, 19.82f)
            lineTo(7.97f, 22.8f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.5f, 24f)
            arcToRelative(1.46f, 1.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.3f, -0.03f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.03f, 22.2f)
            lineToRelative(0.6f, -2.97f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.94f, 0.6f)
            close()
            moveTo(12.5f, 5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 10f, 2.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.5f, 5f)
            close()
            moveTo(22f, 9.5f)
            verticalLineToRelative(13f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 0f)
            verticalLineTo(13f)
            horizontalLineTo(16.41f)
            arcToRelative(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.67f, -1.24f)
            lineToRelative(-1.05f, -1.24f)
            lineTo(11.5f, 15.3f)
            lineToRelative(1.17f, 0.93f)
            arcTo(3.48f, 3.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 18.97f)
            verticalLineTo(22.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 0f)
            verticalLineTo(18.97f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.19f, -0.39f)
            lineTo(8.12f, 16.44f)
            arcToRelative(3.52f, 3.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.68f, -0.71f)
            arcTo(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.97f, 16f)
            arcTo(3.85f, 3.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12.03f)
            curveTo(2f, 8.76f, 5.4f, 6f, 9.41f, 6f)
            horizontalLineToRelative(1.83f)
            arcToRelative(3.86f, 3.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.92f, 1.61f)
            lineToRelative(1.87f, 2.21f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.38f, 0.18f)
            horizontalLineTo(19f)
            verticalLineTo(9.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
            close()
            moveTo(5.97f, 13f)
            arcToRelative(1.37f, 1.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.05f, -0.64f)
            lineTo(7.8f, 9.24f)
            curveTo(6.21f, 9.71f, 5f, 10.83f, 5f, 12.03f)
            arcTo(0.86f, 0.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.97f, 13f)
            close()
        }
    }.also { _Hiking = it }
