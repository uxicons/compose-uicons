package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HomeLocationAlt: ImageVector? = null

val Icons.Bs.HomeLocationAlt: ImageVector
    get() = _HomeLocationAlt ?: UXIcon(name = "HomeLocationAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.24f, 9.76f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.49f, 8.49f)
                lineTo(12f, 22.39f)
                lineToRelative(4.24f, -4.15f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.24f, 9.76f)
                close()
                moveTo(12f, 16f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, -2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 16f)
                close()
                moveTo(24f, 10.13f)
                lineTo(24f, 24f)
                lineTo(14.65f, 24f)
                lineToRelative(3.07f, -3f)
                lineTo(21f, 21f)
                lineTo(21f, 10.13f)
                arcToRelative(0.41f, 0.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.16f, -0.32f)
                lineToRelative(-8.59f, -6.72f)
                arcToRelative(0.41f, 0.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.51f, 0f)
                lineTo(3.16f, 9.81f)
                arcTo(0.41f, 0.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 10.13f)
                lineTo(3f, 21f)
                lineTo(6.29f, 21f)
                lineToRelative(3.07f, 3f)
                lineTo(0f, 24f)
                lineTo(0f, 10.13f)
                arcTo(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.31f, 7.45f)
                lineTo(9.9f, 0.72f)
                arcToRelative(3.41f, 3.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.2f, 0f)
                lineToRelative(8.59f, 6.72f)
                arcTo(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 10.13f)
                close()
            }
        }.also { _HomeLocationAlt = it}
