package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tomato: ImageVector? = null

val Icons.Rs.Tomato: ImageVector
    get() = _Tomato ?: UXIcon(name = "Tomato") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.7f, 5.09f)
                arcTo(4.61f, 4.61f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 2f)
                horizontalLineTo(16f)
                arcToRelative(3.32f, 3.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 2.91f)
                verticalLineTo(0f)
                horizontalLineTo(11f)
                verticalLineTo(4.91f)
                arcTo(3.32f, 3.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 2f)
                horizontalLineTo(6f)
                arcTo(4.61f, 4.61f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.3f, 5.09f)
                arcTo(8.86f, 8.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 14f)
                curveToRelative(0f, 4.72f, 3.63f, 10f, 8.5f, 10f)
                horizontalLineToRelative(7f)
                curveToRelative(4.87f, 0f, 8.5f, -5.28f, 8.5f, -10f)
                arcTo(8.86f, 8.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.7f, 5.09f)
                close()
                moveTo(15.5f, 22f)
                horizontalLineToRelative(-7f)
                curveTo(4.84f, 22f, 2f, 17.7f, 2f, 14f)
                arcTo(6.77f, 6.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.5f, 7f)
                arcToRelative(6.04f, 6.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.54f, 0.2f)
                arcTo(6.68f, 6.68f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.76f, 9.03f)
                lineToRelative(0.49f, 1.94f)
                arcTo(8.62f, 8.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 8.01f)
                arcToRelative(8.63f, 8.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.76f, 2.96f)
                lineToRelative(0.48f, -1.94f)
                arcTo(6.68f, 6.68f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.96f, 7.2f)
                arcTo(6.04f, 6.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.5f, 7f)
                arcTo(6.77f, 6.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 14f)
                curveTo(22f, 17.7f, 19.16f, 22f, 15.5f, 22f)
                close()
            }
        }.also { _Tomato = it}
