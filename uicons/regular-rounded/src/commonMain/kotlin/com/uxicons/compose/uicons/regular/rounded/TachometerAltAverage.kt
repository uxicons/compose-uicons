package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TachometerAltAverage: ImageVector? = null

val Icons.Rr.TachometerAltAverage: ImageVector
    get() = _TachometerAltAverage ?: UXIcon(name = "TachometerAltAverage") {
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
                arcToRelative(3.0f, 3.0f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.11f, -0.86f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 13.86f, 0.12f)
                close()
                moveTo(8.82f, 6.68f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.25f, 1.39f)
                arcToRelative(6.03f, 6.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.77f, 9.21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.4f, 1.43f)
                arcTo(8.04f, 8.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.43f, 6.43f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.82f, 6.68f)
                close()
                moveTo(20f, 13f)
                arcToRelative(7.93f, 7.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.41f, 5.71f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.4f, -1.43f)
                arcToRelative(6.03f, 6.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.77f, -9.21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.14f, -1.64f)
                arcTo(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 13f)
                close()
                moveTo(14f, 13f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, -1.73f)
                lineTo(11f, 6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                verticalLineToRelative(5.27f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 13f)
                close()
            }
        }.also { _TachometerAltAverage = it}
