package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarTilt: ImageVector? = null

val Icons.Sr.CarTilt: ImageVector
    get() = _CarTilt ?: UXIcon(name = "CarTilt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0.98f, 8.73f)
                arcTo(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.39f, 4.36f)
                lineTo(10.26f, 0.74f)
                arcTo(4.96f, 4.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.2f, 0.69f)
                lineTo(19.49f, 3.51f)
                arcToRelative(5.44f, 5.44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.85f, 0.61f)
                lineTo(1.81f, 14.67f)
                curveToRelative(-0.06f, -0.28f, -0.1f, -0.53f, -0.14f, -0.74f)
                curveTo(1.67f, 13.94f, 0.98f, 8.77f, 0.98f, 8.73f)
                close()
                moveTo(18.81f, 8.49f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.09f, 9.52f)
                lineToRelative(-0.56f, -0.93f)
                lineTo(7.57f, 13.7f)
                lineToRelative(0.46f, 0.75f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.7f, 1.05f)
                lineToRelative(-0.5f, -0.81f)
                lineTo(2.41f, 16.63f)
                arcToRelative(4.83f, 4.83f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.26f, 0.5f)
                lineToRelative(0.53f, 1.03f)
                arcTo(3.98f, 3.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.12f, 19.8f)
                lineToRelative(0.15f, 0.24f)
                arcToRelative(1.99f, 1.99f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3.4f, -2.05f)
                lineToRelative(-0.07f, -0.11f)
                lineToRelative(7.01f, -3.93f)
                lineToRelative(0.19f, 0.32f)
                arcToRelative(1.99f, 1.99f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3.41f, -2.05f)
                lineToRelative(-0.23f, -0.39f)
                arcToRelative(3.92f, 3.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.55f, -4.71f)
                lineTo(22f, 6.09f)
                curveToRelative(-0.09f, -0.15f, -0.2f, -0.3f, -0.3f, -0.44f)
                lineTo(18.27f, 7.6f)
                close()
                moveTo(23f, 22f)
                lineTo(1f, 22f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                lineTo(23f, 24f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 22f)
                close()
            }
        }.also { _CarTilt = it}
