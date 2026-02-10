package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Eclipse: ImageVector? = null

val Icons.Br.Eclipse: ImageVector
    get() = _Eclipse ?: UXIcon(name = "Eclipse") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18f, 6f)
            curveToRelative(-7.93f, 0.25f, -7.93f, 11.75f, 0f, 12f)
            curveTo(25.93f, 17.75f, 25.93f, 6.25f, 18f, 6f)
            close()
            moveTo(18f, 15f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -6f)
            arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 15f)
            close()
            moveTo(13.5f, 18.9f)
            verticalLineToRelative(3.58f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 0f)
            verticalLineToRelative(-3.15f)
            arcToRelative(7.42f, 7.42f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.63f, -1.1f)
            lineTo(5.64f, 20.47f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.12f, -2.12f)
            lineToRelative(2.24f, -2.24f)
            arcToRelative(7.5f, 7.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.09f, -2.63f)
            lineTo(1.5f, 13.48f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
            lineTo(4.66f, 10.48f)
            arcTo(7.48f, 7.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.75f, 7.86f)
            lineTo(3.52f, 5.62f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.64f, 3.5f)
            lineTo(7.87f, 5.73f)
            arcToRelative(7.4f, 7.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.63f, -1.1f)
            lineTo(10.5f, 1.48f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
            lineTo(13.5f, 5.06f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.14f, 2.47f)
            arcToRelative(4.51f, 4.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 8.91f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 18.9f)
            close()
        }
    }.also { _Eclipse = it }
