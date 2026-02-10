package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tree: ImageVector? = null

val Icons.Sr.Tree: ImageVector
    get() = _Tree ?: UXIcon(name = "Tree") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.47f, 17.3f)
                curveToRelative(-0.02f, -0.03f, -1.56f, -1.81f, -1.56f, -1.81f)
                arcToRelative(2.67f, 2.67f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.62f, -3.66f)
                curveToRelative(-0.03f, -0.04f, -1.89f, -2.09f, -1.89f, -2.09f)
                arcToRelative(2.48f, 2.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.08f, -1.07f)
                arcToRelative(2.43f, 2.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.18f, -2.53f)
                curveTo(18.53f, 6.1f, 13.89f, 0.85f, 13.89f, 0.85f)
                arcToRelative(2.61f, 2.61f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.77f, 0f)
                reflectiveCurveTo(5.47f, 6.1f, 5.45f, 6.13f)
                arcTo(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 7.6f)
                arcTo(1.41f, 1.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.41f, 9f)
                horizontalLineTo(12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                horizontalLineTo(5.21f)
                reflectiveCurveToRelative(-0.71f, 0.78f, -0.73f, 0.82f)
                arcTo(2.94f, 2.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 13.38f)
                arcToRelative(1.28f, 1.28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.09f, 0.52f)
                arcTo(1.84f, 1.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.83f, 15f)
                horizontalLineTo(13f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                horizontalLineTo(3.78f)
                reflectiveCurveToRelative(-0.23f, 0.27f, -0.25f, 0.3f)
                arcToRelative(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.6f, 4.06f)
                arcTo(2.88f, 2.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.99f, 22f)
                horizontalLineTo(11f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineTo(22f)
                horizontalLineToRelative(5.01f)
                arcToRelative(2.88f, 2.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.86f, -0.64f)
                arcTo(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.47f, 17.3f)
                close()
            }
        }.also { _Tree = it}
