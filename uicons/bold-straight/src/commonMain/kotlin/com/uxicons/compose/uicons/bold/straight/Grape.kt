package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Grape: ImageVector? = null

val Icons.Bs.Grape: ImageVector
    get() = _Grape ?: UXIcon(name = "Grape") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 11.5f)
                arcToRelative(5.49f, 5.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.49f, -4.61f)
                curveTo(13.65f, 3.12f, 15.97f, 3f, 16f, 3f)
                arcToRelative(0.88f, 0.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                horizontalLineToRelative(3f)
                arcToRelative(3.87f, 3.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, -4f)
                arcToRelative(5.4f, 5.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.95f, 2.07f)
                arcTo(6.24f, 6.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.81f, 0.16f)
                lineTo(8.47f, 2.84f)
                curveToRelative(0.48f, 0.24f, 1.93f, 0.97f, 2.03f, 4.05f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 6.73f, 16.94f)
                arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 10.54f, 0f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 11.5f)
                close()
                moveTo(5f, 11.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7.5f, 14f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 11.5f)
                close()
                moveTo(12f, 21f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.5f, -2.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 21f)
                close()
                moveTo(16.5f, 14f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 19f, 11.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 14f)
                close()
            }
        }.also { _Grape = it}
