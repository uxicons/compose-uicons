package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _At: ImageVector? = null

val Icons.Br.At: ImageVector
    get() = _At ?: UXIcon(name = "At") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 0f)
            arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 12f)
            curveToRelative(-0.12f, 9.57f, 11.16f, 15.43f, 18.9f, 9.82f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.73f, -2.45f)
            curveTo(11.42f, 23.58f, 2.86f, 19.15f, 3f, 12f)
            curveTo(3.47f, 0.07f, 20.53f, 0.07f, 21f, 12f)
            verticalLineToRelative(1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 0f)
            lineTo(18f, 12f)
            curveTo(17.75f, 4.07f, 6.25f, 4.07f, 6f, 12f)
            arcToRelative(6.02f, 6.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.08f, 4.39f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 13.5f)
            lineTo(24f, 12f)
            arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
            close()
            moveTo(12f, 15f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -6f)
            arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 15f)
            close()
        }
    }.also { _At = it }
