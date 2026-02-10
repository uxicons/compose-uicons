package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Aubergine: ImageVector? = null

val Icons.Rr.Aubergine: ImageVector
    get() = _Aubergine ?: UXIcon(name = "Aubergine") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.43f, 4.38f)
                arcToRelative(6.55f, 6.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.13f, -0.55f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.1f, -1.67f)
                arcTo(6.51f, 6.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 2.93f)
                verticalLineTo(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineTo(2.93f)
                arcToRelative(6.53f, 6.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.45f, -0.77f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.1f, 1.67f)
                arcToRelative(6.55f, 6.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.13f, 0.55f)
                arcToRelative(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.53f, 2.99f)
                curveToRelative(-0.52f, 2.77f, -3.49f, 2.6f, -6.39f, 2.63f)
                curveTo(-2.04f, 9.61f, -2.68f, 23.57f, 7f, 24f)
                curveToRelative(10.33f, 0f, 17f, -6.28f, 17f, -16f)
                arcTo(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.43f, 4.38f)
                close()
                moveTo(7f, 22f)
                curveToRelative(-7.02f, -0.33f, -6.38f, -10.47f, 0.64f, -10f)
                curveToRelative(3.54f, 0.15f, 7.84f, -0.36f, 8.38f, -4.38f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 5.18f)
                curveToRelative(0.09f, 0.92f, -0.44f, 2.77f, 1f, 2.82f)
                curveToRelative(1.43f, -0.05f, 0.91f, -1.9f, 1f, -2.82f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 8f)
                curveTo(22f, 16.64f, 16.25f, 22f, 7f, 22f)
                close()
            }
        }.also { _Aubergine = it}
