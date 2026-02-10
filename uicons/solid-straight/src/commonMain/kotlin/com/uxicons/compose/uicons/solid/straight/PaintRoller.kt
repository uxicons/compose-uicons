package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PaintRoller: ImageVector? = null

val Icons.Ss.PaintRoller: ImageVector
    get() = _PaintRoller ?: UXIcon(name = "PaintRoller") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 6f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineTo(12f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1.18f)
                curveToRelative(1.16f, 0.41f, 2f, 1.51f, 2f, 2.82f)
                verticalLineToRelative(7f)
                horizontalLineTo(7f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -1.3f, 0.84f, -2.4f, 2f, -2.82f)
                verticalLineToRelative(-1.18f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(9f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                horizontalLineTo(20f)
                verticalLineTo(3f)
                horizontalLineToRelative(1f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
            }
        }.also { _PaintRoller = it}
