package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TachometerAltAverage: ImageVector? = null

val Icons.Bs.TachometerAltAverage: ImageVector
    get() = _TachometerAltAverage ?: UXIcon(name = "TachometerAltAverage") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                arcTo(11.99f, 11.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.97f, 22.71f)
                lineTo(5.36f, 23f)
                lineTo(18.64f, 23f)
                lineToRelative(0.39f, -0.29f)
                arcTo(11.99f, 11.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 1f)
                close()
                moveTo(17.65f, 20f)
                lineTo(6.35f, 20f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, 11.29f, 0f)
                close()
                moveTo(13.5f, 11.68f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 0f)
                lineTo(10.5f, 6f)
                horizontalLineToRelative(3f)
                close()
                moveTo(9.17f, 15.83f)
                arcToRelative(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.53f, 0.45f)
                lineTo(7.97f, 18.73f)
                arcToRelative(7.06f, 7.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.92f, -0.78f)
                arcTo(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 6.67f)
                verticalLineToRelative(3.68f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.17f, 5.47f)
                close()
                moveTo(19f, 13f)
                arcToRelative(6.95f, 6.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.05f, 4.95f)
                arcToRelative(7.06f, 7.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.92f, 0.78f)
                lineTo(14.3f, 16.27f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.7f, -5.92f)
                lineTo(15f, 6.67f)
                arcTo(7.02f, 7.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 13f)
                close()
            }
        }.also { _TachometerAltAverage = it}
