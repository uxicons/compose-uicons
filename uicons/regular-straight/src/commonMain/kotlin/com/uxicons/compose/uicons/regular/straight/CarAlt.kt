package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarAlt: ImageVector? = null

val Icons.Rs.CarAlt: ImageVector
    get() = _CarAlt ?: UXIcon(name = "CarAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 8f)
                lineTo(22.39f, 8f)
                arcToRelative(29.96f, 29.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.08f, -4.95f)
                arcToRelative(3.88f, 3.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.98f, -1.36f)
                curveToRelative(-1.76f, -0.86f, -8.91f, -0.86f, -10.67f, 0f)
                arcTo(3.88f, 3.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.69f, 3.05f)
                arcTo(29.96f, 29.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.61f, 8f)
                lineTo(0f, 8f)
                lineTo(0f, 19f)
                lineTo(2f, 19f)
                verticalLineToRelative(4f)
                lineTo(8f, 23f)
                lineTo(8f, 19f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(6f)
                lineTo(22f, 19f)
                horizontalLineToRelative(2f)
                close()
                moveTo(6.27f, 4.27f)
                arcToRelative(1.9f, 1.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.97f, -0.66f)
                curveToRelative(1.52f, -0.75f, 8f, -0.75f, 9.52f, 0f)
                arcToRelative(1.9f, 1.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.97f, 0.66f)
                arcToRelative(28.62f, 28.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.72f, 6.49f)
                arcToRelative(65.42f, 65.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, -18.89f, 0f)
                arcTo(28.62f, 28.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.27f, 4.27f)
                close()
                moveTo(6f, 21f)
                lineTo(4f, 21f)
                lineTo(4f, 19f)
                lineTo(6f, 19f)
                close()
                moveTo(20f, 21f)
                lineTo(18f, 21f)
                lineTo(18f, 19f)
                horizontalLineToRelative(2f)
                close()
                moveTo(2f, 17f)
                lineTo(2f, 12.86f)
                arcTo(75.85f, 75.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 12f)
                arcToRelative(75.85f, 75.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 0.86f)
                lineTo(22f, 17f)
                close()
                moveTo(6f, 15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 15f)
                close()
                moveTo(20f, 15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 15f)
                close()
            }
        }.also { _CarAlt = it}
