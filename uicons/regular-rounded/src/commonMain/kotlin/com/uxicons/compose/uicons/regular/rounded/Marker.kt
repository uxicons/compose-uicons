package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Marker: ImageVector? = null

val Icons.Rr.Marker: ImageVector
    get() = _Marker ?: UXIcon(name = "Marker") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 6f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4f, 4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 6f)
                close()
                moveTo(12f, 12f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, -2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 12f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                arcToRelative(5.27f, 5.27f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.31f, -2.2f)
                curveToRelative(-3.81f, -5.26f, -5.74f, -9.21f, -5.74f, -11.75f)
                arcToRelative(10.05f, 10.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.11f, 0f)
                curveToRelative(0f, 2.54f, -1.93f, 6.49f, -5.74f, 11.75f)
                arcTo(5.27f, 5.27f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 24f)
                close()
                moveTo(12f, 2.18f)
                arcToRelative(7.88f, 7.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.87f, 7.87f)
                curveToRelative(0f, 2.01f, 1.89f, 5.73f, 5.33f, 10.47f)
                arcToRelative(3.15f, 3.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.09f, 0f)
                curveToRelative(3.44f, -4.74f, 5.33f, -8.46f, 5.33f, -10.47f)
                arcTo(7.88f, 7.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2.18f)
                close()
            }
        }.also { _Marker = it}
