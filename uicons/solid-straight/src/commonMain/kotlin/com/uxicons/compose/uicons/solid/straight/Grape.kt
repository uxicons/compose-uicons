package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Grape: ImageVector? = null

val Icons.Ss.Grape: ImageVector
    get() = _Grape ?: UXIcon(name = "Grape") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.55f, 1.9f)
                lineTo(9.45f, 0.1f)
                arcTo(5.87f, 5.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.01f, 2.56f)
                arcTo(4.77f, 4.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
                lineToRelative(0f, -2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                curveToRelative(-0.03f, 0f, -2.66f, 0.06f, -2.97f, 4.19f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2.06f, 0f)
                curveTo(10.81f, 4.04f, 10.02f, 2.63f, 8.55f, 1.9f)
                close()
                moveTo(8f, 9f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3f, 3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 9f)
                close()
                moveTo(19f, 6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3f, 3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 6f)
                close()
                moveTo(11f, 15f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3f, 3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 15f)
                close()
                moveTo(16f, 12f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3f, 3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 12f)
                close()
                moveTo(12f, 18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3f, 3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 18f)
                close()
            }
        }.also { _Grape = it}
