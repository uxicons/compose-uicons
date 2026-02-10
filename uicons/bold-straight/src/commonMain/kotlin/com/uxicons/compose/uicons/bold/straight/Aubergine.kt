package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Aubergine: ImageVector? = null

val Icons.Bs.Aubergine: ImageVector
    get() = _Aubergine ?: UXIcon(name = "Aubergine") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.86f, 4.19f)
                curveToRelative(0.86f, -0.29f, 1.44f, -0.55f, 1.49f, -0.57f)
                lineTo(22.11f, 0.89f)
                arcTo(15.36f, 15.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 1.85f)
                verticalLineTo(0f)
                horizontalLineTo(16f)
                verticalLineTo(1.85f)
                arcTo(15.18f, 15.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.92f, 0.89f)
                lineTo(11.67f, 3.62f)
                curveToRelative(0.05f, 0.02f, 0.63f, 0.28f, 1.49f, 0.57f)
                arcTo(6.47f, 6.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.13f, 7.7f)
                curveTo(11.05f, 8.09f, 10.69f, 9f, 9f, 9f)
                horizontalLineTo(7.5f)
                arcToRelative(7.5f, 7.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 15f)
                curveTo(17.83f, 24f, 24f, 18.39f, 24f, 9f)
                arcTo(6.48f, 6.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.86f, 4.19f)
                close()
                moveTo(7.5f, 21f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -9f)
                horizontalLineTo(9f)
                curveToRelative(3.19f, 0f, 4.72f, -1.99f, 5.07f, -3.7f)
                arcTo(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 5.85f)
                verticalLineTo(8f)
                horizontalLineToRelative(3f)
                verticalLineTo(5.85f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 9f)
                curveTo(21f, 16.74f, 16.21f, 21f, 7.5f, 21f)
                close()
            }
        }.also { _Aubergine = it}
