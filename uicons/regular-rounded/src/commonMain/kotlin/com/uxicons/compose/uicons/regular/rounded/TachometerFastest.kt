package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TachometerFastest: ImageVector? = null

val Icons.Rr.TachometerFastest: ImageVector
    get() = _TachometerFastest ?: UXIcon(name = "TachometerFastest") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 13f)
                arcToRelative(11.91f, 11.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.51f, 8.47f)
                arcToRelative(3.04f, 3.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.12f, 0.17f)
                lineToRelative(-1.03f, -0.89f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.31f, -1.51f)
                lineToRelative(1.03f, 0.89f)
                arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.4f, -0.07f)
                arcToRelative(10.04f, 10.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.41f, -14.51f)
                arcTo(9.91f, 9.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.84f, 3.06f)
                arcTo(9.99f, 9.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.96f, 20.09f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.36f, 0.04f)
                lineToRelative(1.03f, -0.89f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.31f, 1.51f)
                lineToRelative(-1.03f, 0.89f)
                arcToRelative(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.07f, -0.13f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 13f)
                close()
                moveTo(18.05f, 16.75f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0.8f, -1.83f)
                lineTo(13.99f, 12.78f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, -0.8f, 1.83f)
                close()
            }
        }.also { _TachometerFastest = it}
