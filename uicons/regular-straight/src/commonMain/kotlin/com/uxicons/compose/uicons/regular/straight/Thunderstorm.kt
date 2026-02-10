package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Thunderstorm: ImageVector? = null

val Icons.Rs.Thunderstorm: ImageVector
    get() = _Thunderstorm ?: UXIcon(name = "Thunderstorm") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 12.5f)
                arcToRelative(7.51f, 7.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.86f, 7.47f)
                lineToRelative(1.38f, -1.9f)
                arcToRelative(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.32f, -0.59f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.68f, 7f)
                lineToRelative(-0.72f, -0.02f)
                lineToRelative(-0.21f, -0.69f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4.39f, 10.13f)
                lineToRelative(0.32f, 0.84f)
                lineToRelative(-0.8f, 0.41f)
                arcToRelative(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.01f, 6.23f)
                arcToRelative(3.84f, 3.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.41f, 2.27f)
                arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.07f, -9.82f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 0f)
                arcToRelative(8.05f, 8.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.44f, 5.06f)
                arcTo(7.46f, 7.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 12.5f)
                close()
                moveTo(16.85f, 16.96f)
                lineTo(11.74f, 24f)
                lineTo(8.76f, 24f)
                lineToRelative(0.97f, -4f)
                lineTo(7.8f, 20f)
                arcToRelative(1.92f, 1.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.84f, -2.48f)
                lineTo(8.56f, 10f)
                horizontalLineToRelative(6.47f)
                lineToRelative(-1.54f, 4f)
                horizontalLineToRelative(1.77f)
                arcToRelative(1.91f, 1.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.59f, 2.96f)
                close()
                moveTo(15.11f, 15.95f)
                lineTo(10.58f, 16f)
                lineToRelative(1.54f, -4f)
                lineTo(9.98f, 12f)
                lineTo(7.9f, 18.03f)
                lineTo(11f, 18f)
                horizontalLineToRelative(1.27f)
                lineToRelative(-0.68f, 2.8f)
                close()
            }
        }.also { _Thunderstorm = it}
