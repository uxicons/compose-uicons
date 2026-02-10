package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Avocado: ImageVector? = null

val Icons.Br.Avocado: ImageVector
    get() = _Avocado ?: UXIcon(name = "Avocado") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 16f)
            curveToRelative(0f, -2.54f, 1f, -5f, 3f, -5f)
            reflectiveCurveToRelative(3f, 2.46f, 3f, 5f)
            arcToRelative(2.91f, 2.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
            arcTo(2.91f, 2.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 16f)
            close()
            moveTo(22.09f, 14.69f)
            arcToRelative(8.47f, 8.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.99f, -5.78f)
            arcToRelative(13.74f, 13.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.25f, -4.37f)
            arcTo(6.03f, 6.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
            curveTo(8.51f, 0f, 2f, 4.98f, 2f, 14.5f)
            arcTo(9.77f, 9.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 24f)
            curveTo(17.56f, 24f, 22.09f, 19.82f, 22.09f, 14.69f)
            close()
            moveTo(14.98f, 5.41f)
            arcToRelative(16.77f, 16.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.73f, 5.32f)
            arcToRelative(5.55f, 5.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.37f, 3.96f)
            curveTo(19.09f, 18.17f, 15.91f, 21f, 12f, 21f)
            arcToRelative(6.77f, 6.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7f, -6.5f)
            curveTo(5f, 7.03f, 9.97f, 3f, 12f, 3f)
            arcTo(3.05f, 3.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.98f, 5.41f)
            close()
        }
    }.also { _Avocado = it }
