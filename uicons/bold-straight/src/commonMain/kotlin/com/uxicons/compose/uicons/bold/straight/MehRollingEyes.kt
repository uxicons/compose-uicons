package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MehRollingEyes: ImageVector? = null

val Icons.Bs.MehRollingEyes: ImageVector
    get() = _MehRollingEyes ?: UXIcon(name = "MehRollingEyes") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 15f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(3f)
                lineTo(8f, 18f)
                close()
                moveTo(24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 24f)
                curveTo(-3.9f, 23.4f, -3.89f, 0.6f, 12f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 12f)
                close()
                moveTo(21f, 12f)
                arcToRelative(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9f, -9f)
                curveTo(0.08f, 3.45f, 0.08f, 20.55f, 12f, 21f)
                arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 12f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.5f, 6f)
                curveToRelative(-4.61f, 0.13f, -4.61f, 7.87f, 0f, 8f)
                curveTo(21.11f, 13.87f, 21.11f, 6.13f, 16.5f, 6f)
                close()
                moveTo(16.5f, 12f)
                curveToRelative(-1.11f, 0.04f, -1.83f, -1.74f, -1.35f, -2.85f)
                arcToRelative(1.51f, 1.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.7f, 0f)
                curveTo(18.33f, 10.26f, 17.61f, 12.04f, 16.5f, 12f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.5f, 6f)
                curveToRelative(-4.61f, 0.13f, -4.61f, 7.87f, 0f, 8f)
                curveTo(12.11f, 13.87f, 12.11f, 6.13f, 7.5f, 6f)
                close()
                moveTo(7.5f, 12f)
                curveToRelative(-1.11f, 0.04f, -1.83f, -1.74f, -1.35f, -2.85f)
                arcToRelative(1.51f, 1.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.7f, 0f)
                curveTo(9.33f, 10.26f, 8.61f, 12.04f, 7.5f, 12f)
                close()
            }
        }.also { _MehRollingEyes = it}
