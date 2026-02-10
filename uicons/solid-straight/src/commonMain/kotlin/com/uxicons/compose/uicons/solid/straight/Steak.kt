package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Steak: ImageVector? = null

val Icons.Ss.Steak: ImageVector
    get() = _Steak ?: UXIcon(name = "Steak") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 0f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 10f)
                curveToRelative(0f, 5.33f, 4.21f, 10f, 9f, 10f)
                arcToRelative(4.34f, 4.34f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.78f, 1.76f)
                arcTo(5.77f, 5.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.5f, 24f)
                arcTo(6.51f, 6.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 17.5f)
                curveTo(24f, 11.59f, 19.77f, 0f, 10f, 0f)
                close()
                moveTo(4f, 10f)
                arcTo(5.97f, 5.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.29f, 6.3f)
                lineTo(6.3f, 5.29f)
                arcTo(5.97f, 5.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 4f)
                curveToRelative(0.13f, 0f, 0.25f, 0.03f, 0.38f, 0.03f)
                lineTo(4.02f, 10.39f)
                curveTo(4.01f, 10.26f, 4f, 10.13f, 4f, 10f)
                close()
                moveTo(4.69f, 12.89f)
                lineTo(12.94f, 4.65f)
                arcTo(8.03f, 8.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.7f, 5.72f)
                lineTo(5.89f, 14.52f)
                arcTo(6.23f, 6.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.69f, 12.89f)
                close()
                moveTo(10.33f, 16.08f)
                arcTo(10.68f, 10.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 16f)
                arcToRelative(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.19f, -0.23f)
                lineTo(16.28f, 7.3f)
                arcToRelative(14.05f, 14.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.15f, 1.68f)
                close()
                moveTo(12.8f, 16.79f)
                lineTo(18.5f, 11.09f)
                arcToRelative(20.7f, 20.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 2.08f)
                lineToRelative(-4.72f, 4.72f)
                arcTo(7.76f, 7.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.8f, 16.79f)
                close()
                moveTo(19.64f, 18.78f)
                lineTo(18.78f, 19.64f)
                arcTo(2.47f, 2.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.5f, 20f)
                arcToRelative(1.53f, 1.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.38f, -0.53f)
                lineToRelative(3.73f, -3.73f)
                arcTo(11.85f, 11.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 17.5f)
                arcTo(2.47f, 2.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.64f, 18.78f)
                close()
            }
        }.also { _Steak = it}
