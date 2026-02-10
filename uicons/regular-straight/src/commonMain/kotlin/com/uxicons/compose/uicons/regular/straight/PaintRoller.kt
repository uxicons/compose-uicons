package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PaintRoller: ImageVector? = null

val Icons.Rs.PaintRoller: ImageVector
    get() = _PaintRoller ?: UXIcon(name = "PaintRoller") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 3f)
                horizontalLineToRelative(-1f)
                lineTo(20f, 0f)
                lineTo(0f, 0f)
                lineTo(0f, 8f)
                lineTo(20f, 8f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(12f, 10f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(1.17f)
                curveToRelative(-1.16f, 0.41f, -2f, 1.52f, -2f, 2.83f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -1.3f, -0.84f, -2.42f, -2f, -2.83f)
                verticalLineToRelative(-1.17f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(9f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(18f, 6f)
                lineTo(2f, 6f)
                lineTo(2f, 2f)
                lineTo(18f, 2f)
                lineTo(18f, 6f)
                close()
                moveTo(11f, 22f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(5f)
                close()
            }
        }.also { _PaintRoller = it}
