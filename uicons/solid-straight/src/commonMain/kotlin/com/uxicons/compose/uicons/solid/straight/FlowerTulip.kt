package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FlowerTulip: ImageVector? = null

val Icons.Ss.FlowerTulip: ImageVector
    get() = _FlowerTulip ?: UXIcon(name = "FlowerTulip") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.97f, 14f)
                arcTo(10.6f, 10.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 20.67f)
                verticalLineTo(13.91f)
                arcTo(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 8f)
                curveTo(18f, 4f, 14.11f, 0.87f, 14.09f, 0.85f)
                arcTo(20.47f, 20.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 9f)
                horizontalLineTo(10f)
                arcTo(22.28f, 22.28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.26f, 0.05f)
                arcTo(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.84f, 0.91f)
                curveTo(7.94f, 2.85f, 6f, 5.21f, 6f, 8f)
                arcToRelative(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5.91f)
                verticalLineToRelative(6.76f)
                arcTo(10.6f, 10.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.03f, 14f)
                horizontalLineTo(0f)
                lineToRelative(0.13f, 1.12f)
                curveTo(0.92f, 22.14f, 7.5f, 24f, 10.86f, 24f)
                horizontalLineToRelative(2.28f)
                curveToRelative(3.37f, 0f, 9.94f, -1.85f, 10.73f, -8.88f)
                lineTo(24f, 14f)
                close()
            }
        }.also { _FlowerTulip = it}
