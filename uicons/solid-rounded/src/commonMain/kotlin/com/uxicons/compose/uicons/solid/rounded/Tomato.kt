package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tomato: ImageVector? = null

val Icons.Sr.Tomato: ImageVector
    get() = _Tomato ?: UXIcon(name = "Tomato") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.8f, 5.02f)
                curveToRelative(1.05f, -0.61f, 3.31f, -3.1f, 1.51f, -3.96f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.26f, 0.63f)
                arcTo(3.46f, 3.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 3.93f)
                verticalLineTo(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineTo(3.93f)
                arcTo(3.46f, 3.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.95f, 1.68f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.26f, -0.63f)
                curveTo(4.88f, 1.92f, 7.15f, 4.4f, 8.2f, 5.02f)
                arcTo(8.79f, 8.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 14f)
                curveToRelative(0f, 4.72f, 4.28f, 10f, 10f, 10f)
                horizontalLineToRelative(4f)
                curveTo(26.51f, 24.06f, 27.35f, 5.88f, 15.8f, 5.02f)
                close()
                moveTo(16.97f, 9.24f)
                curveToRelative(-0.74f, 2.13f, -4.75f, -0.97f, -4.97f, -1.56f)
                curveToRelative(-0.21f, 0.58f, -4.24f, 3.7f, -4.97f, 1.56f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.76f, 8.03f)
                arcTo(4.19f, 4.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.71f, 6f)
                horizontalLineToRelative(2.58f)
                arcToRelative(4.19f, 4.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.95f, 2.03f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.97f, 9.24f)
                close()
            }
        }.also { _Tomato = it}
