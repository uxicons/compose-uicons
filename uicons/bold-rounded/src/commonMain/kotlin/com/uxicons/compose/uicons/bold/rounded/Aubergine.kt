package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Aubergine: ImageVector? = null

val Icons.Br.Aubergine: ImageVector
    get() = _Aubergine ?: UXIcon(name = "Aubergine") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.73f, 5.08f)
            arcToRelative(6.09f, 6.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.6f, -0.33f)
            arcToRelative(1.49f, 1.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.42f, -2.06f)
            arcToRelative(1.51f, 1.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.07f, -0.44f)
            arcToRelative(5.68f, 5.68f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.68f, 0.6f)
            verticalLineTo(1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            verticalLineTo(2.84f)
            arcToRelative(5.73f, 5.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.68f, -0.6f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.65f, 2.5f)
            arcToRelative(5.88f, 5.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.61f, 0.33f)
            arcTo(6.47f, 6.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.13f, 8.7f)
            curveTo(11.05f, 9.09f, 10.69f, 10f, 9f, 10f)
            horizontalLineTo(7.5f)
            curveTo(3.22f, 10f, 0f, 13.01f, 0f, 17f)
            reflectiveCurveToRelative(3.22f, 7f, 7.5f, 7f)
            curveTo(17.83f, 24f, 24f, 18.77f, 24f, 10f)
            arcTo(6.48f, 6.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.73f, 5.08f)
            close()
            moveTo(7.5f, 21f)
            curveTo(4.85f, 21f, 3f, 19.36f, 3f, 17f)
            reflectiveCurveToRelative(1.85f, -4f, 4.5f, -4f)
            horizontalLineTo(9f)
            curveToRelative(3.19f, 0f, 4.72f, -1.99f, 5.07f, -3.7f)
            arcTo(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 6.85f)
            verticalLineTo(8f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            verticalLineTo(6.85f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 10f)
            curveTo(21f, 19.57f, 12.54f, 21f, 7.5f, 21f)
            close()
        }
    }.also { _Aubergine = it }
