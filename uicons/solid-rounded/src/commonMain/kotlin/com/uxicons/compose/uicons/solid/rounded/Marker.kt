package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Marker: ImageVector? = null

val Icons.Sr.Marker: ImageVector
    get() = _Marker ?: UXIcon(name = "Marker") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0.04f)
                arcToRelative(9.99f, 9.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.98f, 9.98f)
                curveToRelative(0f, 2.57f, 1.99f, 6.59f, 5.92f, 11.95f)
                arcToRelative(5.03f, 5.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.13f, 0f)
                curveToRelative(3.92f, -5.36f, 5.92f, -9.38f, 5.92f, -11.95f)
                arcTo(9.99f, 9.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0.04f)
                close()
                moveTo(12f, 14f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, -4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 14f)
                close()
            }
        }.also { _Marker = it}
