package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Grape: ImageVector? = null

val Icons.Br.Grape: ImageVector
    get() = _Grape ?: UXIcon(name = "Grape") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22f, 11.5f)
            arcToRelative(5.49f, 5.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.49f, -4.61f)
            curveTo(13.65f, 3.12f, 15.97f, 3f, 16f, 3f)
            curveToRelative(0.7f, 0f, 1f, 0.38f, 1f, 0.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            arcTo(3.78f, 3.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
            arcToRelative(5.37f, 5.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.8f, 1.88f)
            arcTo(5.38f, 5.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.17f, 0.16f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.83f, 2.84f)
            curveToRelative(0.96f, 0.48f, 1.61f, 1.38f, 1.66f, 4.05f)
            arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 6.73f, 16.94f)
            arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 10.54f, 0f)
            arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 11.5f)
            close()
            moveTo(5f, 11.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7.5f, 14f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 11.5f)
            close()
            moveTo(12f, 21f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.5f, -2.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 21f)
            close()
            moveTo(16.5f, 14f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 19f, 11.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 14f)
            close()
        }
    }.also { _Grape = it }
