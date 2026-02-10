package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Aubergine: ImageVector? = null

val Icons.Ss.Aubergine: ImageVector
    get() = _Aubergine ?: UXIcon(name = "Aubergine") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.21f, 3.93f)
                arcToRelative(17.32f, 17.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.16f, -1f)
                lineToRelative(-0.74f, -1.86f)
                arcTo(15.62f, 15.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 1.94f)
                verticalLineTo(0f)
                horizontalLineTo(17f)
                verticalLineTo(1.94f)
                arcToRelative(15.62f, 15.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.63f, -0.87f)
                lineToRelative(-0.74f, 1.86f)
                arcTo(17.3f, 17.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.8f, 3.93f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.76f, 4.21f)
                arcToRelative(2.52f, 2.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.57f, 1.32f)
                curveToRelative(-1.1f, 1.27f, -2.34f, 1.56f, -4.82f, 1.54f)
                lineTo(7f, 11f)
                curveToRelative(-3.86f, 0f, -7f, 2.56f, -7f, 6.42f)
                reflectiveCurveTo(3.14f, 24f, 7f, 24f)
                curveToRelative(10.02f, 0f, 16f, -6.04f, 16f, -15.23f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.21f, 3.93f)
                close()
                moveTo(17f, 7f)
                verticalLineTo(3.96f)
                curveToRelative(0.33f, 0.03f, 0.66f, 0.04f, 1f, 0.04f)
                reflectiveCurveToRelative(0.67f, -0.02f, 1f, -0.04f)
                verticalLineTo(7f)
                close()
            }
        }.also { _Aubergine = it}
