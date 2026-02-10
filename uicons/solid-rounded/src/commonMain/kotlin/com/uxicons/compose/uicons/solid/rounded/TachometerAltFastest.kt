package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TachometerAltFastest: ImageVector? = null

val Icons.Sr.TachometerAltFastest: ImageVector
    get() = _TachometerAltFastest ?: UXIcon(name = "TachometerAltFastest") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 4.05f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.61f, 21.57f)
                arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.12f, 23f)
                horizontalLineToRelative(9.77f)
                arcToRelative(4.84f, 4.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.35f, -1.29f)
                arcTo(12.05f, 12.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 4.05f)
                close()
                moveTo(19.42f, 16.19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.31f, 0.52f)
                lineTo(13.19f, 14.6f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0.79f, -1.84f)
                lineToRelative(4.92f, 2.11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.41f, 16.19f)
                close()
                moveTo(20.06f, 13f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.12f, -0.87f)
                arcToRelative(6.93f, 6.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -4.08f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.9f, 9.9f)
                curveToRelative(0.1f, 0.1f, 0.21f, 0.2f, 0.32f, 0.3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.32f, 1.5f)
                curveToRelative(-0.14f, -0.12f, -0.28f, -0.25f, -0.41f, -0.39f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.36f, 6.64f)
                arcToRelative(8.92f, 8.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.57f, 5.25f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.06f, 13f)
                close()
            }
        }.also { _TachometerAltFastest = it}
