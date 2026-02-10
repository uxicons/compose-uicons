package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HomeLocation: ImageVector? = null

val Icons.Ss.HomeLocation: ImageVector
    get() = _HomeLocation ?: UXIcon(name = "HomeLocation") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 8f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.83f, 6.83f)
                lineTo(12f, 17.6f)
                lineToRelative(2.84f, -2.77f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 8f)
                close()
                moveTo(12f, 12.99f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 12.99f)
                close()
                moveTo(22.85f, 7.68f)
                lineToRelative(-9f, -7.04f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.7f, 0f)
                lineToRelative(-9f, 7.04f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 10.04f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 10.04f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.85f, 7.68f)
                close()
                moveTo(16.24f, 16.24f)
                lineTo(12f, 20.39f)
                lineTo(7.76f, 16.25f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8.48f, -8.49f)
                horizontalLineToRelative(0f)
                arcTo(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.24f, 16.24f)
                close()
            }
        }.also { _HomeLocation = it}
