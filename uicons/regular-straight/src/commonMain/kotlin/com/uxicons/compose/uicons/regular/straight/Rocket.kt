package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Rocket: ImageVector? = null

val Icons.Rs.Rocket: ImageVector
    get() = _Rocket ?: UXIcon(name = "Rocket") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 7f)
                close()
                moveTo(14f, 9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 9f)
                close()
                moveTo(11f, 12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 12f)
                close()
                moveTo(23.35f, 0.65f)
                arcToRelative(2.19f, 2.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.51f, 2.31f)
                lineToRelative(-0.07f, 0.21f)
                curveTo(22.29f, 7.34f, 20.85f, 11.3f, 18f, 14.82f)
                lineTo(18f, 15f)
                arcToRelative(11.06f, 11.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.4f, 8.8f)
                lineToRelative(-0.27f, 0.2f)
                lineTo(9f, 24f)
                lineTo(9f, 20.41f)
                lineToRelative(-2f, -2f)
                lineTo(4.71f, 20.71f)
                lineTo(3.29f, 19.29f)
                lineTo(5.59f, 17f)
                lineToRelative(-2f, -2f)
                lineTo(0f, 15f)
                lineTo(0f, 10.44f)
                lineToRelative(0.2f, -0.27f)
                arcTo(10.81f, 10.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 6f)
                horizontalLineToRelative(0.18f)
                curveTo(12.7f, 3.15f, 16.66f, 1.71f, 20.83f, 0.21f)
                lineToRelative(0.22f, -0.08f)
                arcTo(2.19f, 2.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23.35f, 0.65f)
                close()
                moveTo(2f, 13f)
                lineTo(3.42f, 13f)
                arcTo(31.58f, 31.58f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.8f, 8.24f)
                arcTo(8.49f, 8.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 11.12f)
                close()
                moveTo(15.7f, 17.25f)
                arcTo(31.72f, 31.72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 20.58f)
                lineTo(11f, 22f)
                horizontalLineToRelative(1.66f)
                arcTo(9.05f, 9.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.7f, 17.25f)
                close()
                moveTo(21.94f, 2.06f)
                arcToRelative(0.19f, 0.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.22f, -0.05f)
                lineToRelative(-0.21f, 0.08f)
                curveTo(16.66f, 3.84f, 12.48f, 5.35f, 8.88f, 8.95f)
                arcTo(26.98f, 26.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.25f, 13.84f)
                lineToRelative(4.92f, 4.92f)
                arcToRelative(27.07f, 27.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.89f, -3.63f)
                curveToRelative(3.6f, -3.6f, 5.11f, -7.79f, 6.86f, -12.63f)
                lineToRelative(0.08f, -0.21f)
                arcTo(0.19f, 0.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.94f, 2.06f)
                close()
            }
        }.also { _Rocket = it}
