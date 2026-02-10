package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AppleWhole: ImageVector? = null

val Icons.Br.AppleWhole: ImageVector
    get() = _AppleWhole ?: UXIcon(name = "AppleWhole") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.34f, 6f)
            horizontalLineToRelative(-0.35f)
            arcToRelative(6.92f, 6.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.55f, -1.52f)
            arcToRelative(5.77f, 5.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.45f, -3.36f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.12f, -1.12f)
            arcToRelative(5.77f, 5.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.36f, 1.45f)
            arcTo(5.47f, 5.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.2f, 4.25f)
            arcTo(10.81f, 10.81f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.75f, 0.67f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.5f, 1.66f)
            arcTo(8.21f, 8.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.45f, 6f)
            lineTo(8.66f, 6f)
            arcTo(8.85f, 8.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 15f)
            curveToRelative(-0.19f, 5.66f, 5.93f, 10.88f, 11.07f, 8.32f)
            arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.95f, 0.02f)
            curveTo(18.14f, 25.88f, 24.18f, 20.58f, 24f, 15f)
            arcTo(8.85f, 8.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.34f, 6f)
            close()
            moveTo(15.34f, 21f)
            arcToRelative(1.82f, 1.82f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.92f, -0.32f)
            arcTo(4.83f, 4.83f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 20f)
            arcToRelative(4.74f, 4.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.31f, 0.66f)
            arcTo(2.06f, 2.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.66f, 21f)
            curveToRelative(-7.48f, -0.25f, -7.47f, -11.76f, 0f, -12f)
            horizontalLineToRelative(6.68f)
            curveTo(22.82f, 9.25f, 22.81f, 20.76f, 15.34f, 21f)
            close()
        }
    }.also { _AppleWhole = it }
