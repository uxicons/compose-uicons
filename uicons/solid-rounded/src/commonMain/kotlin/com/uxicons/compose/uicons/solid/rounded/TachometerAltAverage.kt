package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TachometerAltAverage: ImageVector? = null

val Icons.Sr.TachometerAltAverage: ImageVector
    get() = _TachometerAltAverage ?: UXIcon(name = "TachometerAltAverage") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 4.05f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.61f, 21.57f)
                arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.12f, 23f)
                horizontalLineToRelative(9.77f)
                arcToRelative(4.84f, 4.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.35f, -1.29f)
                arcTo(12.05f, 12.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 4.05f)
                close()
                moveTo(12f, 15f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -3.72f)
                lineTo(11f, 6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                verticalLineToRelative(5.28f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 15f)
                close()
                moveTo(17.95f, 19.75f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.32f, -1.5f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 13f)
                horizontalLineToRelative(0f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.5f, -6.07f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1.73f)
                arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.95f, 19.75f)
                close()
                moveTo(3f, 13f)
                arcToRelative(0.28f, 0.28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.01f, -0.03f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 5.2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1.73f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 13f)
                lineTo(5f, 13f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.37f, 5.25f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.32f, 1.5f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 13f)
                close()
            }
        }.also { _TachometerAltAverage = it}
