package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tomato: ImageVector? = null

val Icons.Rr.Tomato: ImageVector
    get() = _Tomato ?: UXIcon(name = "Tomato") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.69f, 5.1f)
                curveToRelative(0.95f, -0.99f, 2.3f, -3.79f, 0.31f, -4.1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                curveToRelative(0f, 1.24f, -1.13f, 2.55f, -3f, 2.9f)
                verticalLineTo(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineTo(4.9f)
                curveTo(9.13f, 4.55f, 8f, 3.23f, 8f, 2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 1f)
                curveToRelative(-1.98f, 0.31f, -0.64f, 3.11f, 0.31f, 4.1f)
                arcTo(8.85f, 8.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 14f)
                curveToRelative(0f, 4.72f, 4.28f, 10f, 10f, 10f)
                horizontalLineToRelative(4f)
                curveTo(25.99f, 24.13f, 27.46f, 6.97f, 16.69f, 5.1f)
                close()
                moveTo(14f, 22f)
                horizontalLineTo(10f)
                arcToRelative(8.32f, 8.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                curveToRelative(-0.05f, -4.61f, 4.3f, -8.17f, 8.5f, -6.65f)
                arcTo(4.47f, 4.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.76f, 9.03f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.73f, 1.21f)
                curveToRelative(0.74f, 2.13f, 4.75f, -0.97f, 4.97f, -1.56f)
                curveToRelative(0.21f, 0.58f, 4.24f, 3.7f, 4.97f, 1.56f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.73f, -1.21f)
                arcTo(4.47f, 4.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 7.35f)
                curveTo(23.92f, 4.59f, 25.41f, 21.99f, 14f, 22f)
                close()
            }
        }.also { _Tomato = it}
