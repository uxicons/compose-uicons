package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarAlt: ImageVector? = null

val Icons.Sr.CarAlt: ImageVector
    get() = _CarAlt ?: UXIcon(name = "CarAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 11f)
                lineTo(0f, 8.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 7f)
                reflectiveCurveToRelative(0.96f, 0f, 1f, 0f)
                arcTo(27.33f, 27.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.69f, 3.05f)
                arcTo(3.88f, 3.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.67f, 1.69f)
                curveToRelative(1.76f, -0.86f, 8.91f, -0.86f, 10.67f, 0f)
                arcToRelative(3.88f, 3.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.98f, 1.36f)
                arcTo(27.33f, 27.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.5f, 7f)
                curveToRelative(0.04f, 0f, 1f, 0f, 1f, 0f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 8.5f)
                lineTo(24f, 11f)
                arcToRelative(90.64f, 90.64f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12f, -1f)
                arcTo(90.64f, 90.64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 11f)
                close()
                moveTo(24f, 13.02f)
                lineTo(24f, 15f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 4f)
                lineTo(4f, 19f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, -4f)
                lineTo(0f, 13.03f)
                arcTo(90.83f, 90.83f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 12f)
                arcTo(90.83f, 90.83f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 13.03f)
                close()
                moveTo(6f, 16f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 16f)
                close()
                moveTo(20f, 16f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 16f)
                close()
                moveTo(6.94f, 21f)
                curveToRelative(0.59f, 3.95f, -5.47f, 3.95f, -4.88f, 0f)
                close()
                moveTo(21.94f, 21f)
                curveToRelative(0.59f, 3.95f, -5.47f, 3.95f, -4.88f, 0f)
                close()
            }
        }.also { _CarAlt = it}
