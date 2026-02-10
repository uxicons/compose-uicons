package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MoonStars: ImageVector? = null

val Icons.Br.MoonStars: ImageVector
    get() = _MoonStars ?: UXIcon(name = "MoonStars") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 24f)
            arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16.06f, 0.71f)
            arcToRelative(2.93f, 2.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.81f, 5.07f)
            curveToRelative(-5.11f, 3.92f, -5.09f, 8.54f, 0f, 12.44f)
            arcToRelative(2.93f, 2.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.82f, 5.07f)
            arcTo(12.23f, 12.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 24f)
            close()
            moveTo(12f, 3f)
            arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.92f, 17.51f)
            curveToRelative(-6.51f, -5.07f, -6.49f, -11.97f, 0f, -17.02f)
            arcTo(9.32f, 9.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 3f)
            close()
            moveTo(16.86f, 12.14f)
            lineTo(18.41f, 12.59f)
            lineTo(18.86f, 14.14f)
            arcToRelative(1.19f, 1.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.29f, 0f)
            lineToRelative(0.44f, -1.55f)
            lineToRelative(1.55f, -0.44f)
            arcToRelative(1.19f, 1.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2.29f)
            lineToRelative(-1.55f, -0.44f)
            lineToRelative(-0.44f, -1.55f)
            arcToRelative(1.19f, 1.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.29f, 0f)
            lineToRelative(-0.44f, 1.55f)
            lineToRelative(-1.55f, 0.44f)
            arcTo(1.19f, 1.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.86f, 12.14f)
            close()
            moveTo(21f, 18.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 18.5f)
            close()
        }
    }.also { _MoonStars = it }
