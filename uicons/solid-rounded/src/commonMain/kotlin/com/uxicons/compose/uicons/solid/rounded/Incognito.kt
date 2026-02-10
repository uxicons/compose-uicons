package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Incognito: ImageVector? = null

val Icons.Sr.Incognito: ImageVector
    get() = _Incognito ?: UXIcon(name = "Incognito") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.04f, 8.07f)
                curveTo(4.5f, 0.57f, 8.71f, 0.03f, 8.9f, 0.01f)
                arcTo(0.92f, 0.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 0f)
                arcToRelative(4.51f, 4.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.42f, 0.82f)
                arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.17f, 0f)
                arcTo(4.51f, 4.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 0f)
                arcToRelative(0.92f, 0.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.1f, 0.01f)
                curveToRelative(0.19f, 0.02f, 4.4f, 0.56f, 4.85f, 8.06f)
                arcTo(0.73f, 0.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.5f, 8.8f)
                arcTo(20.31f, 20.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 10f)
                arcTo(20.32f, 20.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, 8.8f)
                arcTo(0.73f, 0.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.04f, 8.07f)
                close()
                moveTo(22.69f, 9.99f)
                arcToRelative(0.94f, 0.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.03f, -0.04f)
                curveTo(20.56f, 10.6f, 17.54f, 12f, 12f, 12f)
                reflectiveCurveTo(3.44f, 10.6f, 2.33f, 9.95f)
                arcToRelative(0.94f, 0.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.03f, 0.04f)
                arcTo(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 12f)
                curveToRelative(0f, 3.69f, 6.19f, 4f, 12f, 4f)
                reflectiveCurveToRelative(12f, -0.31f, 12f, -4f)
                arcTo(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.69f, 9.99f)
                close()
                moveTo(16.5f, 17f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.23f, 2.17f)
                arcToRelative(4.68f, 4.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.53f, 0f)
                arcToRelative(3.49f, 3.49f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0.19f, 2.03f)
                arcTo(3.52f, 3.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 21f)
                arcToRelative(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.07f, 0.21f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 16.5f, 17f)
                close()
            }
        }.also { _Incognito = it}
