package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarAlt: ImageVector? = null

val Icons.Ss.CarAlt: ImageVector
    get() = _CarAlt ?: UXIcon(name = "CarAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 11.03f)
                lineTo(0f, 8f)
                lineTo(1.64f, 8f)
                arcTo(30.08f, 30.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.69f, 3.05f)
                arcTo(3.88f, 3.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.67f, 1.69f)
                curveToRelative(1.76f, -0.86f, 8.91f, -0.86f, 10.67f, 0f)
                arcToRelative(3.88f, 3.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.98f, 1.36f)
                arcTo(30.08f, 30.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.36f, 8f)
                lineTo(24f, 8f)
                verticalLineToRelative(3.03f)
                arcTo(88.7f, 88.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 10f)
                arcTo(88.7f, 88.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 11.03f)
                close()
                moveTo(24f, 13.06f)
                lineTo(24f, 19f)
                lineTo(0f, 19f)
                lineTo(0f, 13.06f)
                arcTo(89.08f, 89.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 12f)
                arcTo(89.08f, 89.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 13.06f)
                close()
                moveTo(6f, 16f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 16f)
                close()
                moveTo(20f, 16f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 16f)
                close()
                moveTo(3f, 21f)
                verticalLineToRelative(3f)
                lineTo(7f, 24f)
                lineTo(7f, 21f)
                close()
                moveTo(21f, 21f)
                verticalLineToRelative(3f)
                lineTo(17f, 24f)
                lineTo(17f, 21f)
                close()
            }
        }.also { _CarAlt = it}
