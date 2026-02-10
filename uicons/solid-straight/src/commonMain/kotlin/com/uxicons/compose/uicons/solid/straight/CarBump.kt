package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarBump: ImageVector? = null

val Icons.Ss.CarBump: ImageVector
    get() = _CarBump ?: UXIcon(name = "CarBump") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 24f)
                lineTo(14f, 24f)
                curveTo(14.21f, 17.39f, 23.79f, 17.4f, 24f, 24f)
                close()
                moveTo(22.55f, 12.85f)
                lineToRelative(-1.86f, 0.74f)
                lineToRelative(0.74f, 1.86f)
                lineToRelative(-4.65f, 1.85f)
                lineToRelative(-0.74f, -1.86f)
                lineTo(8.61f, 18.39f)
                lineToRelative(0.74f, 1.86f)
                lineTo(4.7f, 22.09f)
                lineToRelative(-0.74f, -1.86f)
                lineTo(2.1f, 20.97f)
                lineTo(0.85f, 17.81f)
                arcToRelative(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.69f, -2.52f)
                lineToRelative(19.9f, -7.91f)
                arcToRelative(11.93f, 11.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.23f, 2.3f)
                close()
                moveTo(6.59f, 15.94f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.86f, 0.74f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.59f, 15.94f)
                close()
                moveTo(17.74f, 11.51f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.86f, 0.74f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.74f, 11.51f)
                close()
                moveTo(18.73f, 5.76f)
                curveToRelative(-0.2f, -0.2f, -0.38f, -0.41f, -0.59f, -0.59f)
                lineToRelative(-3.81f, -3.4f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.1f, -0.55f)
                lineTo(2.36f, 4.73f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.48f, 7.26f)
                lineTo(0.04f, 12.35f)
                curveToRelative(-0.02f, 0.28f, -0.02f, 0.56f, -0.02f, 0.84f)
                close()
            }
        }.also { _CarBump = it}
