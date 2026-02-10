package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarBump: ImageVector? = null

val Icons.Rr.CarBump: ImageVector
    get() = _CarBump ?: UXIcon(name = "CarBump") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.23f, 23.97f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.2f, -0.74f)
                curveToRelative(-0.7f, -2.95f, -5.32f, -2.92f, -6.06f, 0.02f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.94f, -0.49f)
                curveToRelative(1.23f, -4.95f, 8.77f, -4.93f, 9.94f, 0.02f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23.23f, 23.97f)
                close()
                moveTo(8.85f, 19.25f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.71f, 1.5f)
                lineToRelative(-0.08f, -0.18f)
                arcToRelative(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.03f, -2.48f)
                lineToRelative(-0.53f, -1.3f)
                arcTo(9.92f, 9.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 13.38f)
                reflectiveCurveTo(0.12f, 8.14f, 0.12f, 8.11f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.2f, 4.14f)
                lineToRelative(7.11f, -2.77f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.96f, 0.7f)
                lineToRelative(3.82f, 3.48f)
                arcTo(7.28f, 7.28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.18f, 8.5f)
                lineToRelative(0.53f, 1.3f)
                arcToRelative(4.02f, 4.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.97f, 4.43f)
                lineToRelative(0.07f, 0.17f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.68f, 1.56f)
                close()
                moveTo(2.12f, 8.32f)
                lineTo(2f, 13.38f)
                lineTo(17.8f, 7.07f)
                horizontalLineToRelative(0f)
                lineTo(13.97f, 3.59f)
                arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.93f, -0.37f)
                lineTo(3.94f, 6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, 8.32f)
                close()
                moveTo(5.5f, 18.43f)
                lineTo(18.75f, 13.16f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.1f, -2.6f)
                lineToRelative(-0.53f, -1.3f)
                curveToRelative(-0.08f, -0.19f, -0.16f, -0.37f, -0.25f, -0.54f)
                lineToRelative(-1.83f, 0.73f)
                lineToRelative(0.38f, 0.94f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.85f, 0.75f)
                lineToRelative(-0.39f, -0.95f)
                lineTo(5.87f, 13.99f)
                lineToRelative(0.36f, 0.92f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.86f, 0.74f)
                lineToRelative(-0.36f, -0.91f)
                lineTo(2.2f, 15.46f)
                arcToRelative(3.64f, 3.64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.17f, 0.57f)
                lineToRelative(0.53f, 1.3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 18.43f)
                close()
            }
        }.also { _CarBump = it}
