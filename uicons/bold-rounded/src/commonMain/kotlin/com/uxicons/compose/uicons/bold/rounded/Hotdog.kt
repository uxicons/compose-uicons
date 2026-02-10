package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hotdog: ImageVector? = null

val Icons.Br.Hotdog: ImageVector
    get() = _Hotdog ?: UXIcon(name = "Hotdog") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.5f, 5.5f)
            verticalLineToRelative(-3f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
            verticalLineToRelative(3f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 0f)
            close()
            moveTo(17.5f, 6f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 4.5f)
            verticalLineToRelative(-2f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3f, 0f)
            verticalLineToRelative(2f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.5f, 6f)
            close()
            moveTo(6.5f, 5.99f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 4.49f)
            lineTo(8f, 2.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3f, 0f)
            lineTo(5f, 4.49f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.5f, 5.99f)
            close()
            moveTo(21.86f, 19.98f)
            arcTo(19.32f, 19.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 23f)
            arcToRelative(19.32f, 19.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9.86f, -3.02f)
            arcTo(4.82f, 4.82f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.81f, 13.3f)
            arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.82f, -0.92f)
            arcTo(9.08f, 9.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 11.6f)
            arcTo(2.73f, 2.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.69f, 7.82f)
            curveTo(4.83f, 7.96f, 8f, 10.98f, 12f, 10.98f)
            reflectiveCurveToRelative(7.17f, -3.01f, 7.31f, -3.15f)
            arcTo(2.73f, 2.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23.26f, 11.6f)
            arcToRelative(9.04f, 9.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.89f, 0.78f)
            arcToRelative(4.76f, 4.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.51f, 7.6f)
            close()
            moveTo(20.7f, 14.96f)
            arcToRelative(1.82f, 1.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.16f, -0.78f)
            arcToRelative(1.78f, 1.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.34f, 0.26f)
            arcTo(12.3f, 12.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 16.5f)
            arcToRelative(12.19f, 12.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.19f, -2.05f)
            arcToRelative(1.78f, 1.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.99f, -0.3f)
            arcToRelative(1.82f, 1.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.01f, 3.33f)
            arcTo(16.07f, 16.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 20f)
            arcToRelative(16.07f, 16.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.19f, -2.52f)
            arcTo(1.82f, 1.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.7f, 14.96f)
            close()
        }
    }.also { _Hotdog = it }
