package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WindowFrame: ImageVector? = null

val Icons.Sr.WindowFrame: ImageVector
    get() = _WindowFrame ?: UXIcon(name = "WindowFrame") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(1f, 24f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(22f, 4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-6.5f)
                close()
                moveTo(11f, 0f)
                horizontalLineToRelative(-4.5f)
                curveTo(4.01f, 0f, 2f, 2.02f, 2f, 4.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(9f)
                lineTo(11f, 0f)
                close()
            }
        }.also { _WindowFrame = it}
