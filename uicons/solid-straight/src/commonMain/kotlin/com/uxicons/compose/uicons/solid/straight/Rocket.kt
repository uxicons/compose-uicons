package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Rocket: ImageVector? = null

val Icons.Ss.Rocket: ImageVector
    get() = _Rocket ?: UXIcon(name = "Rocket") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.35f, 0.65f)
                arcToRelative(2.19f, 2.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.31f, -0.51f)
                lineToRelative(-0.22f, 0.08f)
                arcTo(32.5f, 32.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                arcToRelative(36.11f, 36.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.7f, 6.64f)
                lineTo(5.59f, 17f)
                lineTo(3f, 19.59f)
                lineTo(4.41f, 21f)
                lineTo(7f, 18.41f)
                lineToRelative(2.32f, 2.32f)
                arcToRelative(36.15f, 36.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.64f, -4.7f)
                arcTo(32.74f, 32.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.79f, 3.17f)
                lineToRelative(0.07f, -0.21f)
                arcTo(2.19f, 2.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.35f, 0.65f)
                close()
                moveTo(11f, 14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 14f)
                close()
                moveTo(14f, 11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 11f)
                close()
                moveTo(17f, 8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 8f)
                close()
                moveTo(18.95f, 15.76f)
                arcTo(11.42f, 11.42f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.43f, 24f)
                lineTo(11f, 24f)
                lineTo(11f, 22.08f)
                arcToRelative(34.92f, 34.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.38f, -4.63f)
                curveTo(17.93f, 16.9f, 18.45f, 16.33f, 18.95f, 15.76f)
                close()
                moveTo(6.55f, 6.57f)
                arcToRelative(34.92f, 34.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.63f, 6.38f)
                lineTo(0f, 12.95f)
                lineTo(0f, 9.52f)
                arcTo(11.42f, 11.42f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.24f, 5f)
                curveTo(7.67f, 5.5f, 7.1f, 6.02f, 6.55f, 6.57f)
                close()
            }
        }.also { _Rocket = it}
