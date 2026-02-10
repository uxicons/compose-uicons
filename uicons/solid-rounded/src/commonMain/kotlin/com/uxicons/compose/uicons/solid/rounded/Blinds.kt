package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Blinds: ImageVector? = null

val Icons.Sr.Blinds: ImageVector
    get() = _Blinds ?: UXIcon(name = "Blinds") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 21f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                curveToRelative(0f, -1.3f, 0.84f, -2.4f, 2f, -2.82f)
                lineTo(20f, 5f)
                curveToRelative(0f, -1.3f, -0.84f, -2.42f, -2f, -2.83f)
                verticalLineToRelative(1.83f)
                lineTo(0f, 4f)
                curveTo(0f, 1.79f, 1.79f, 0f, 4f, 0f)
                horizontalLineToRelative(13f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                verticalLineToRelative(13.18f)
                curveToRelative(1.16f, 0.41f, 2f, 1.51f, 2f, 2.82f)
                close()
                moveTo(18f, 12f)
                lineTo(0f, 12f)
                verticalLineToRelative(4f)
                lineTo(18f, 16f)
                verticalLineToRelative(-4f)
                close()
                moveTo(18f, 6f)
                lineTo(0f, 6f)
                verticalLineToRelative(4f)
                lineTo(18f, 10f)
                lineTo(18f, 6f)
                close()
                moveTo(0f, 18f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(12.1f)
                curveToRelative(-0.07f, -0.32f, -0.1f, -0.66f, -0.1f, -1f)
                curveToRelative(0f, -1.13f, 0.39f, -2.16f, 1.02f, -3f)
                lineTo(0f, 18f)
                close()
            }
        }.also { _Blinds = it}
