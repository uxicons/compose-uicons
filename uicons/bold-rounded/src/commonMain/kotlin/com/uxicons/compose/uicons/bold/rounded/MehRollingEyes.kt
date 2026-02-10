package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MehRollingEyes: ImageVector? = null

val Icons.Br.MehRollingEyes: ImageVector
    get() = _MehRollingEyes ?: UXIcon(name = "MehRollingEyes") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.5f, 18f)
            horizontalLineToRelative(-7f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
            horizontalLineToRelative(7f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.5f, 18f)
            close()
            moveTo(24f, 12f)
            arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
            curveTo(-3.9f, 0.6f, -3.89f, 23.4f, 12f, 24f)
            arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 12f)
            close()
            moveTo(21f, 12f)
            arcToRelative(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9f, 9f)
            curveTo(0.08f, 20.55f, 0.08f, 3.45f, 12f, 3f)
            arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 12f)
            close()
            moveTo(16.5f, 6f)
            curveToRelative(-4.61f, 0.13f, -4.61f, 7.87f, 0f, 8f)
            curveTo(21.11f, 13.87f, 21.11f, 6.13f, 16.5f, 6f)
            close()
            moveTo(16.5f, 12f)
            curveToRelative(-1.11f, 0.04f, -1.83f, -1.74f, -1.35f, -2.85f)
            arcToRelative(1.51f, 1.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.7f, 0f)
            curveTo(18.33f, 10.26f, 17.61f, 12.04f, 16.5f, 12f)
            close()
            moveTo(11f, 10f)
            curveToRelative(-0.13f, -5.28f, -6.87f, -5.28f, -7f, 0f)
            curveTo(4.13f, 15.28f, 10.87f, 15.28f, 11f, 10f)
            close()
            moveTo(6f, 10f)
            arcToRelative(2.48f, 2.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.15f, -0.85f)
            arcToRelative(1.51f, 1.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.7f, 0f)
            curveTo(9.77f, 11.96f, 6.26f, 13.4f, 6f, 10f)
            close()
        }
    }.also { _MehRollingEyes = it }
