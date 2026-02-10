package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FlowerTulip: ImageVector? = null

val Icons.Br.FlowerTulip: ImageVector
    get() = _FlowerTulip ?: UXIcon(name = "FlowerTulip") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.26f, 14.76f)
            arcToRelative(2.43f, 2.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -0.75f)
            arcTo(12.49f, 12.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 17.34f)
            lineTo(13.5f, 14.82f)
            arcToRelative(6.51f, 6.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -6.32f)
            curveToRelative(0f, -2.97f, -2.02f, -5.43f, -3.99f, -7.44f)
            arcToRelative(3.59f, 3.59f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.03f, 0f)
            curveTo(7.52f, 3.07f, 5.5f, 5.53f, 5.5f, 8.5f)
            arcToRelative(6.51f, 6.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 6.32f)
            verticalLineToRelative(2.52f)
            arcToRelative(12.49f, 12.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.76f, -3.33f)
            arcToRelative(2.43f, 2.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0.75f)
            arcToRelative(2.67f, 2.67f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.69f, 2.2f)
            curveToRelative(0.81f, 5.67f, 6.6f, 7.11f, 10.56f, 7.11f)
            curveToRelative(5.01f, 0.14f, 12.1f, -0.16f, 13.34f, -7.11f)
            arcTo(2.67f, 2.67f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.26f, 14.76f)
            close()
            moveTo(8.5f, 8.5f)
            arcToRelative(7.04f, 7.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -4.12f)
            lineTo(10.5f, 7.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            lineTo(13.5f, 4.38f)
            arcToRelative(7.04f, 7.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 4.12f)
            arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7f, 0f)
            close()
            moveTo(3.13f, 17.08f)
            arcToRelative(8.95f, 8.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.56f, 3.96f)
            curveTo(7.37f, 20.9f, 3.92f, 20.16f, 3.13f, 17.08f)
            close()
            moveTo(14.31f, 21.03f)
            arcToRelative(8.96f, 8.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.56f, -3.96f)
            curveTo(20.08f, 20.16f, 16.63f, 20.9f, 14.31f, 21.03f)
            close()
        }
    }.also { _FlowerTulip = it }
