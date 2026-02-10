package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Filter: ImageVector? = null

val Icons.Rr.Filter: ImageVector
    get() = _Filter ?: UXIcon(name = "Filter") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 24f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.6f, -0.2f)
                lineToRelative(-4f, -3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.4f, -0.8f)
                verticalLineToRelative(-5.62f)
                lineToRelative(-7.02f, -7.89f)
                arcToRelative(3.9f, 3.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.92f, -6.49f)
                horizontalLineToRelative(14.2f)
                arcToRelative(3.9f, 3.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.91f, 6.49f)
                lineToRelative(-7.01f, 7.89f)
                verticalLineToRelative(8.62f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                close()
                moveTo(11f, 19.5f)
                lineTo(13f, 21f)
                verticalLineToRelative(-7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.25f, -0.66f)
                lineToRelative(7.27f, -8.18f)
                arcToRelative(1.9f, 1.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.42f, -3.16f)
                horizontalLineToRelative(-14.2f)
                arcToRelative(1.9f, 1.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.42f, 3.16f)
                lineToRelative(7.27f, 8.18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.25f, 0.66f)
                close()
            }
        }.also { _Filter = it}
