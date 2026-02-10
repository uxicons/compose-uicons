package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MehRollingEyes: ImageVector? = null

val Icons.Rr.MehRollingEyes: ImageVector
    get() = _MehRollingEyes ?: UXIcon(name = "MehRollingEyes") {
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
                moveTo(11f, 10f)
                curveToRelative(-0.13f, -5.28f, -6.87f, -5.28f, -7f, 0f)
                curveTo(4.13f, 15.28f, 10.87f, 15.28f, 11f, 10f)
                close()
                moveTo(6f, 10f)
                arcToRelative(2.48f, 2.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.15f, -0.85f)
                arcToRelative(1.51f, 1.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.7f, 0f)
                curveTo(9.77f, 11.96f, 6.26f, 13.4f, 6f, 10f)
                close()
                moveTo(17f, 17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                lineTo(8f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 17f)
                close()
                moveTo(12f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 12f)
                curveToRelative(0.6f, 15.9f, 23.4f, 15.89f, 24f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(12f, 22f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                curveTo(2.5f, -1.25f, 21.5f, -1.24f, 22f, 12f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                close()
            }
        }.also { _MehRollingEyes = it}
