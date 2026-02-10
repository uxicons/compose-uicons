package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Navigation: ImageVector? = null

val Icons.Rs.Navigation: ImageVector
    get() = _Navigation ?: UXIcon(name = "Navigation") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 22f, 12f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                close()
                moveTo(5f, 11.03f)
                arcToRelative(1.95f, 1.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.35f, 1.9f)
                lineToRelative(3.38f, 1.34f)
                lineToRelative(1.35f, 3.34f)
                arcTo(1.98f, 1.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.99f, 19f)
                lineTo(13f, 19f)
                arcToRelative(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.92f, -1.48f)
                lineTo(17.9f, 6.1f)
                lineTo(6.46f, 9.11f)
                arcTo(1.98f, 1.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 11.03f)
                close()
                moveTo(15.1f, 8.9f)
                lineTo(12.99f, 17f)
                lineToRelative(-1.72f, -4.27f)
                lineTo(7.09f, 11.07f)
                lineToRelative(-0.11f, -0.03f)
                close()
            }
        }.also { _Navigation = it}
