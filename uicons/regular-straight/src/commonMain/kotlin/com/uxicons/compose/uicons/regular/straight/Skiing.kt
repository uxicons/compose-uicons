package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Skiing: ImageVector? = null

val Icons.Rs.Skiing: ImageVector
    get() = _Skiing ?: UXIcon(name = "Skiing") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.98f, 2.5f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.5f, 2.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.98f, 2.5f)
                close()
                moveTo(22.16f, 20.86f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.67f, 0.94f)
                lineToRelative(-7.76f, -3.68f)
                lineToRelative(2.82f, -4.58f)
                lineTo(11.2f, 11.07f)
                curveToRelative(-0.46f, -0.48f, 0f, -1.04f, 0.12f, -1.17f)
                lineToRelative(0.35f, -0.34f)
                lineToRelative(2.31f, 1.1f)
                lineTo(13.98f, 8.44f)
                lineTo(13.2f, 8.07f)
                lineToRelative(0.77f, -0.75f)
                arcTo(0.97f, 0.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.73f, 7f)
                arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.65f, 0.29f)
                lineToRelative(0.57f, 0.43f)
                verticalLineToRelative(3.89f)
                lineToRelative(4.49f, 2.06f)
                lineToRelative(0.83f, -1.82f)
                lineToRelative(-3.33f, -1.53f)
                verticalLineToRelative(-3.6f)
                lineToRelative(-1.3f, -0.98f)
                arcTo(2.91f, 2.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.79f, 5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.26f, 0.92f)
                lineTo(11.27f, 7.15f)
                lineTo(5.94f, 4.61f)
                lineToRelative(0.76f, -1.6f)
                lineTo(4.89f, 2.15f)
                lineTo(4.13f, 3.75f)
                lineToRelative(-1.41f, -0.67f)
                lineTo(1.87f, 4.88f)
                lineToRelative(1.41f, 0.67f)
                lineToRelative(-0.76f, 1.6f)
                lineToRelative(1.81f, 0.86f)
                lineToRelative(0.76f, -1.6f)
                lineTo(9.77f, 8.65f)
                arcToRelative(2.76f, 2.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.09f, 3.91f)
                lineToRelative(2.02f, 1.5f)
                lineToRelative(-1.97f, 3.2f)
                lineToRelative(-9.05f, -4.3f)
                lineTo(0f, 14.77f)
                lineToRelative(18.63f, 8.84f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.34f, -1.88f)
                close()
            }
        }.also { _Skiing = it}
