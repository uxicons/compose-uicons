package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarBump: ImageVector? = null

val Icons.Rs.CarBump: ImageVector
    get() = _CarBump ?: UXIcon(name = "CarBump") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.04f, 15.43f)
                lineToRelative(0.74f, 1.86f)
                lineToRelative(4.65f, -1.85f)
                lineToRelative(-0.74f, -1.86f)
                lineToRelative(1.86f, -0.74f)
                lineTo(21.29f, 9.69f)
                arcToRelative(12.04f, 12.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.16f, -4.52f)
                lineToRelative(-3.81f, -3.4f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.1f, -0.55f)
                lineTo(2.36f, 4.73f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.48f, 7.26f)
                lineTo(0.04f, 12.35f)
                arcTo(12.08f, 12.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.85f, 17.81f)
                lineTo(2.1f, 20.97f)
                lineToRelative(1.86f, -0.74f)
                lineTo(4.7f, 22.09f)
                lineToRelative(4.65f, -1.84f)
                lineToRelative(-0.74f, -1.86f)
                close()
                moveTo(2.47f, 7.43f)
                arcTo(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.1f, 6.59f)
                lineToRelative(8.86f, -3.52f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.03f, 0.18f)
                lineTo(16.7f, 6.57f)
                lineTo(2.05f, 12.39f)
                close()
                moveTo(2.07f, 14.53f)
                lineTo(3.61f, 13.92f)
                lineTo(3.98f, 14.85f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.86f, -0.74f)
                lineToRelative(-0.37f, -0.93f)
                lineToRelative(9.29f, -3.69f)
                lineToRelative(0.37f, 0.93f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.86f, -0.74f)
                lineToRelative(-0.37f, -0.93f)
                lineToRelative(1.54f, -0.61f)
                arcToRelative(10.03f, 10.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.28f, 2.29f)
                lineToRelative(0.52f, 1.3f)
                lineToRelative(-2.9f, 1.15f)
                lineToRelative(-1.75f, 0.69f)
                horizontalLineToRelative(0f)
                lineTo(7.87f, 16.53f)
                horizontalLineToRelative(0f)
                lineTo(3.22f, 18.38f)
                lineToRelative(-0.52f, -1.3f)
                arcTo(10.02f, 10.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.07f, 14.53f)
                close()
                moveTo(24f, 24f)
                lineTo(22f, 24f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6f, 0f)
                lineTo(14f, 24f)
                curveTo(14.21f, 17.39f, 23.79f, 17.4f, 24f, 24f)
                close()
            }
        }.also { _CarBump = it}
