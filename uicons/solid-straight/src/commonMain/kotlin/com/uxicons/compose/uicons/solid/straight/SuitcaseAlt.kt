package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SuitcaseAlt: ImageVector? = null

val Icons.Ss.SuitcaseAlt: ImageVector
    get() = _SuitcaseAlt ?: UXIcon(name = "SuitcaseAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 4f)
                horizontalLineToRelative(-3f)
                lineTo(18f, 2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                lineTo(8f, 0f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(2f)
                lineTo(3f, 4f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                lineTo(0f, 24f)
                lineTo(6f, 24f)
                lineTo(6f, 8f)
                horizontalLineToRelative(2f)
                lineTo(8f, 24f)
                horizontalLineToRelative(8f)
                lineTo(16f, 8f)
                horizontalLineToRelative(2f)
                lineTo(18f, 24f)
                horizontalLineToRelative(6f)
                lineTo(24f, 7f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(8f, 4f)
                lineTo(8f, 2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                lineTo(8f, 4f)
                close()
            }
        }.also { _SuitcaseAlt = it}
