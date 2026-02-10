package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MehRollingEyes: ImageVector? = null

val Icons.Sr.MehRollingEyes: ImageVector
    get() = _MehRollingEyes ?: UXIcon(name = "MehRollingEyes") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.85f, 9.15f)
                curveToRelative(0.49f, 1.11f, -0.23f, 2.9f, -1.35f, 2.85f)
                curveToRelative(-1.11f, 0.04f, -1.84f, -1.75f, -1.35f, -2.85f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.85f, 9.15f)
                close()
                moveTo(9f, 10f)
                arcToRelative(2.49f, 2.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.15f, -0.85f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.69f, 0f)
                curveTo(5.22f, 11.95f, 8.74f, 13.4f, 9f, 10f)
                close()
                moveTo(24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 24f)
                curveTo(-3.9f, 23.4f, -3.89f, 0.6f, 12f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 12f)
                close()
                moveTo(7.5f, 14f)
                curveToRelative(4.61f, -0.13f, 4.61f, -7.87f, 0f, -8f)
                curveTo(2.89f, 6.13f, 2.89f, 13.87f, 7.5f, 14f)
                close()
                moveTo(17f, 17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                lineTo(8f, 16f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 17f)
                close()
                moveTo(20f, 10f)
                curveToRelative(-0.13f, -5.28f, -6.87f, -5.28f, -7f, 0f)
                curveTo(13.13f, 15.28f, 19.87f, 15.28f, 20f, 10f)
                close()
            }
        }.also { _MehRollingEyes = it}
