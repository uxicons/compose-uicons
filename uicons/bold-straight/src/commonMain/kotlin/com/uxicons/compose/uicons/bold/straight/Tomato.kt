package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tomato: ImageVector? = null

val Icons.Bs.Tomato: ImageVector
    get() = _Tomato ?: UXIcon(name = "Tomato") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.97f, 5.17f)
                arcTo(5.71f, 5.71f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 2f)
                horizontalLineTo(15f)
                arcToRelative(2.89f, 2.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 2.38f)
                verticalLineTo(0f)
                horizontalLineToRelative(-3f)
                verticalLineTo(4.38f)
                arcTo(2.89f, 2.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 2f)
                horizontalLineTo(6f)
                arcTo(5.72f, 5.72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.01f, 5.17f)
                arcTo(8.95f, 8.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 14.03f)
                curveTo(0f, 18.74f, 3.7f, 24f, 8.66f, 24f)
                horizontalLineToRelative(6.68f)
                curveTo(20.3f, 24f, 24f, 18.74f, 24f, 14.03f)
                arcTo(8.95f, 8.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.97f, 5.17f)
                close()
                moveTo(15.34f, 21f)
                horizontalLineTo(8.66f)
                curveTo(5.47f, 21f, 3f, 17.25f, 3f, 14.03f)
                arcTo(5.86f, 5.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.66f, 8f)
                curveToRelative(0.16f, 0f, 0.33f, 0.02f, 0.49f, 0.03f)
                arcTo(4.87f, 4.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.14f, 9.04f)
                lineToRelative(0.73f, 2.91f)
                arcTo(7.64f, 7.64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 9.43f)
                arcToRelative(7.63f, 7.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.13f, 2.53f)
                lineToRelative(0.73f, -2.91f)
                arcToRelative(4.92f, 4.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.02f, -1.01f)
                curveToRelative(0.17f, -0.01f, 0.33f, -0.03f, 0.5f, -0.03f)
                arcTo(5.86f, 5.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 14.03f)
                curveTo(21f, 17.25f, 18.53f, 21f, 15.34f, 21f)
                close()
            }
        }.also { _Tomato = it}
