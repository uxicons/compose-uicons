package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarBump: ImageVector? = null

val Icons.Sr.CarBump: ImageVector
    get() = _CarBump ?: UXIcon(name = "CarBump") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.78f, 23.62f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 24f)
                lineTo(15f, 24f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.97f, -1.25f)
                curveToRelative(1.23f, -4.95f, 8.77f, -4.93f, 9.94f, 0.02f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23.78f, 23.62f)
                close()
                moveTo(19.08f, 5.54f)
                lineTo(15.27f, 2.07f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.96f, -0.7f)
                lineTo(3.2f, 4.14f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.12f, 8.11f)
                curveTo(0.12f, 8.14f, 0f, 13.38f, 0f, 13.38f)
                curveToRelative(0f, 0.22f, 0.01f, 0.49f, 0.02f, 0.79f)
                lineToRelative(19.8f, -7.91f)
                arcTo(5.44f, 5.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.08f, 5.54f)
                close()
                moveTo(17.12f, 15.96f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.8f, 14.4f)
                lineToRelative(-0.07f, -0.18f)
                arcToRelative(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.98f, -4.42f)
                lineToRelative(-0.53f, -1.3f)
                curveToRelative(-0.07f, -0.18f, -0.16f, -0.35f, -0.25f, -0.53f)
                lineTo(17.24f, 9.45f)
                lineToRelative(0.38f, 0.94f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.85f, 0.75f)
                lineToRelative(-0.39f, -0.95f)
                lineTo(5.87f, 13.99f)
                lineToRelative(0.36f, 0.92f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.86f, 0.74f)
                lineToRelative(-0.36f, -0.91f)
                lineTo(0.33f, 16.21f)
                arcToRelative(5.3f, 5.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.19f, 0.57f)
                lineToRelative(0.53f, 1.3f)
                arcToRelative(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.02f, 2.47f)
                lineToRelative(0.08f, 0.2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.71f, -1.5f)
                close()
            }
        }.also { _CarBump = it}
