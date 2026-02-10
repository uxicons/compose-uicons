package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Aubergine: ImageVector? = null

val Icons.Sr.Aubergine: ImageVector
    get() = _Aubergine ?: UXIcon(name = "Aubergine") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.24f, 4.92f)
                arcToRelative(8.32f, 8.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.31f, -1.08f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.1f, -1.67f)
                arcTo(6.51f, 6.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 2.93f)
                verticalLineTo(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineTo(2.93f)
                arcToRelative(6.53f, 6.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.45f, -0.77f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.1f, 1.67f)
                arcTo(8.34f, 8.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.79f, 4.92f)
                curveToRelative(-2.02f, 0.52f, -3.01f, 1.89f, -3.83f, 3.82f)
                curveTo(13f, 11f, 11f, 11f, 7f, 11f)
                curveToRelative(-3.86f, 0f, -7f, 2.64f, -7f, 6.5f)
                reflectiveCurveTo(3.14f, 24f, 7f, 24f)
                curveToRelative(10.64f, 0f, 17f, -7.5f, 17f, -14.26f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.24f, 4.92f)
                close()
                moveTo(19f, 8.5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                verticalLineTo(4.95f)
                arcToRelative(10.13f, 10.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineTo(7.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 8.5f)
                close()
            }
        }.also { _Aubergine = it}
