package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TachometerAltSlow: ImageVector? = null

val Icons.Rr.TachometerAltSlow: ImageVector
    get() = _TachometerAltSlow ?: UXIcon(name = "TachometerAltSlow") {
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
                horizontalLineTo(7.12f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.11f, -0.86f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 13.86f, 0.12f)
                close()
                moveTo(20f, 13f)
                arcToRelative(7.93f, 7.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.41f, 5.71f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.4f, -1.43f)
                curveToRelative(4.14f, -3.96f, 0.6f, -11.1f, -5.05f, -10.22f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.29f, -1.98f)
                arcTo(8.03f, 8.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 13f)
                close()
                moveTo(7.81f, 17.28f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.4f, 1.43f)
                arcToRelative(7.97f, 7.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.33f, -6.86f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.98f, 0.29f)
                arcTo(5.97f, 5.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.81f, 17.28f)
                close()
                moveTo(14f, 13f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3.93f, -0.52f)
                lineTo(6.29f, 8.71f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.71f, 7.29f)
                lineToRelative(3.77f, 3.77f)
                arcTo(2.01f, 2.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 13f)
                close()
            }
        }.also { _TachometerAltSlow = it}
