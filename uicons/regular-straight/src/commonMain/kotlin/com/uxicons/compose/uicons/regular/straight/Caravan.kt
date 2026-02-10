package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Caravan: ImageVector? = null

val Icons.Rs.Caravan: ImageVector
    get() = _Caravan ?: UXIcon(name = "Caravan") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 18f)
                lineTo(22f, 3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                lineTo(3f, 0f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                lineTo(0f, 20f)
                lineTo(4f, 20f)
                curveToRelative(0.14f, 5.28f, 7.86f, 5.27f, 8f, 0f)
                lineTo(24f, 20f)
                lineTo(24f, 18f)
                close()
                moveTo(2f, 8f)
                lineTo(7f, 8f)
                verticalLineToRelative(2f)
                lineTo(2f, 10f)
                close()
                moveTo(8f, 22f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 22f)
                close()
                moveTo(8f, 16f)
                arcToRelative(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.44f, 2f)
                lineTo(2f, 18f)
                lineTo(2f, 12f)
                lineTo(9f, 12f)
                lineTo(9f, 6f)
                lineTo(2f, 6f)
                lineTo(2f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 2f)
                lineTo(19f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                lineTo(20f, 18f)
                lineTo(18f, 18f)
                lineTo(18f, 6f)
                lineTo(11f, 6f)
                lineTo(11f, 17.38f)
                arcTo(3.97f, 3.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 16f)
                close()
                moveTo(16f, 18f)
                lineTo(13f, 18f)
                lineTo(13f, 8f)
                horizontalLineToRelative(3f)
                close()
            }
        }.also { _Caravan = it}
