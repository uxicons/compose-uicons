package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TachometerAltFastest: ImageVector? = null

val Icons.Rr.TachometerAltFastest: ImageVector
    get() = _TachometerAltFastest ?: UXIcon(name = "TachometerAltFastest") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 4.05f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.61f, 21.57f)
                arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.12f, 23f)
                horizontalLineToRelative(9.77f)
                arcToRelative(4.84f, 4.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.35f, -1.29f)
                arcTo(12.05f, 12.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 4.05f)
                close()
                moveTo(18.87f, 20.26f)
                arcTo(2.86f, 2.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.89f, 21f)
                lineTo(7.12f, 21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.11f, -0.86f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 13.86f, 0.12f)
                close()
                moveTo(19.07f, 12.99f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.13f, -0.85f)
                arcTo(6.02f, 6.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 7f)
                curveToRelative(-5.27f, -0.1f, -8.04f, 6.69f, -4.19f, 10.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.4f, 1.43f)
                curveTo(1.29f, 13.85f, 4.94f, 4.92f, 12f, 5f)
                arcToRelative(8.04f, 8.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.92f, 6.86f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.07f, 12.99f)
                close()
                moveTo(19.37f, 16.23f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.32f, 0.51f)
                lineToRelative(-4.87f, -2.14f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0.8f, -1.83f)
                lineToRelative(4.87f, 2.14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.37f, 16.23f)
                close()
            }
        }.also { _TachometerAltFastest = it}
