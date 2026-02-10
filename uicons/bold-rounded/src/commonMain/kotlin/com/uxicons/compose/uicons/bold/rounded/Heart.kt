package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Heart: ImageVector? = null

val Icons.Br.Heart: ImageVector
    get() = _Heart ?: UXIcon(name = "Heart") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.25f, 1.85f)
            arcTo(6.57f, 6.57f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 4.56f)
            arcTo(6.57f, 6.57f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.75f, 1.85f)
            arcTo(7.04f, 7.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 9.13f)
            curveToRelative(0f, 4.55f, 4.67f, 9.43f, 8.6f, 12.71f)
            arcToRelative(5.29f, 5.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.81f, 0f)
            curveToRelative(3.92f, -3.29f, 8.6f, -8.16f, 8.6f, -12.71f)
            arcTo(7.04f, 7.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.25f, 1.85f)
            close()
            moveTo(13.48f, 19.54f)
            arcToRelative(2.29f, 2.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.96f, 0f)
            curveTo(5.74f, 15.53f, 3f, 11.74f, 3f, 9.13f)
            arcTo(4.04f, 4.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.75f, 4.85f)
            arcTo(4.04f, 4.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 9.13f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            arcToRelative(4.04f, 4.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.75f, -4.28f)
            arcTo(4.04f, 4.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 9.13f)
            curveTo(21f, 11.74f, 18.26f, 15.53f, 13.48f, 19.54f)
            close()
        }
    }.also { _Heart = it }
