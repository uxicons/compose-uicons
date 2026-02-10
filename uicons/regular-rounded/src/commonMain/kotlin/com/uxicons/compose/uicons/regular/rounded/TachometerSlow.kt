package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TachometerSlow: ImageVector? = null

val Icons.Rr.TachometerSlow: ImageVector
    get() = _TachometerSlow ?: UXIcon(name = "TachometerSlow") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.45f, 21.52f)
                arcToRelative(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.07f, 0.13f)
                lineToRelative(-1.03f, -0.89f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.31f, -1.51f)
                lineToRelative(1.03f, 0.89f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.36f, -0.04f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = false, -14.11f, -0.04f)
                arcToRelative(1.02f, 1.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.4f, 0.08f)
                lineToRelative(1.03f, -0.89f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.31f, 1.51f)
                lineToRelative(-1.03f, 0.89f)
                arcToRelative(3.04f, 3.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.12f, -0.17f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.38f, 1.08f)
                arcToRelative(11.99f, 11.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.06f, 20.44f)
                close()
                moveTo(12f, 11f)
                arcToRelative(2.01f, 2.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.52f, 0.07f)
                lineTo(7.71f, 7.29f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.29f, 8.71f)
                lineToRelative(3.77f, 3.77f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 11f)
                close()
            }
        }.also { _TachometerSlow = it}
