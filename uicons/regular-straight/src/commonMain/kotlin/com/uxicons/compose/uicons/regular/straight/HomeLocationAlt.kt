package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HomeLocationAlt: ImageVector? = null

val Icons.Rs.HomeLocationAlt: ImageVector
    get() = _HomeLocationAlt ?: UXIcon(name = "HomeLocationAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 14.01f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = false, 7.06f, 18.96f)
                lineTo(12f, 23.8f)
                lineToRelative(4.95f, -4.84f)
                arcTo(6.95f, 6.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 14.01f)
                close()
                moveTo(12f, 21f)
                lineTo(8.46f, 17.54f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7.08f, -0.01f)
                close()
                moveTo(12f, 11f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3f, 3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 11f)
                close()
                moveTo(24f, 10.05f)
                lineTo(24f, 24f)
                lineTo(14.65f, 24f)
                lineTo(16.7f, 22f)
                lineTo(22f, 22f)
                lineTo(22f, 10.04f)
                arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.38f, -0.79f)
                lineToRelative(-9f, -7.04f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.23f, 0f)
                lineToRelative(-9f, 7.04f)
                arcTo(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 10.04f)
                lineTo(2f, 22f)
                lineTo(7.3f, 22f)
                lineToRelative(2.04f, 2f)
                lineTo(0f, 24f)
                lineTo(0f, 10.04f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.15f, 7.68f)
                lineToRelative(9f, -7.04f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.7f, 0f)
                lineToRelative(9f, 7.04f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 10.04f)
                close()
            }
        }.also { _HomeLocationAlt = it}
