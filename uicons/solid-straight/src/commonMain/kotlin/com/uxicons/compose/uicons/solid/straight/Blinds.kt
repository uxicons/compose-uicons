package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Blinds: ImageVector? = null

val Icons.Ss.Blinds: ImageVector
    get() = _Blinds ?: UXIcon(name = "Blinds") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 12f)
                lineTo(18f, 12f)
                verticalLineToRelative(4f)
                lineTo(0f, 16f)
                verticalLineToRelative(-4f)
                close()
                moveTo(0f, 10f)
                lineTo(18f, 10f)
                lineTo(18f, 6f)
                lineTo(0f, 6f)
                verticalLineToRelative(4f)
                close()
                moveTo(17.03f, 18f)
                lineTo(0f, 18f)
                verticalLineToRelative(4f)
                lineTo(16.11f, 22f)
                curveToRelative(-0.07f, -0.32f, -0.11f, -0.66f, -0.11f, -1f)
                curveToRelative(0f, -1.14f, 0.39f, -2.17f, 1.03f, -3f)
                close()
                moveTo(24f, 21f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                curveToRelative(0f, -1.3f, 0.84f, -2.4f, 2f, -2.82f)
                lineTo(20f, 3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                lineTo(0f, 4f)
                verticalLineToRelative(-1f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                lineTo(19f, 0f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(15.18f)
                curveToRelative(1.16f, 0.41f, 2f, 1.51f, 2f, 2.82f)
                close()
            }
        }.also { _Blinds = it}
