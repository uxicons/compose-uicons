package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HomeLocationAlt: ImageVector? = null

val Icons.Ss.HomeLocationAlt: ImageVector
    get() = _HomeLocationAlt ?: UXIcon(name = "HomeLocationAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 9.01f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.54f, 8.54f)
                lineTo(12f, 21.2f)
                lineToRelative(3.54f, -3.67f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 9.01f)
                close()
                moveTo(12f, 15.99f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, -2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 15.99f)
                close()
                moveTo(22.85f, 7.68f)
                lineToRelative(-9f, -7.04f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.7f, 0f)
                lineToRelative(-9f, 7.04f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 10.04f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 10.04f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.85f, 7.68f)
                close()
                moveTo(16.95f, 18.96f)
                lineTo(12.11f, 23.9f)
                lineTo(7.06f, 18.96f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = true, 9.89f, -0.01f)
                close()
            }
        }.also { _HomeLocationAlt = it}
