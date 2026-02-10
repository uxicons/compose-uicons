package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WindowFrame: ImageVector? = null

val Icons.Rr.WindowFrame: ImageVector
    get() = _WindowFrame ?: UXIcon(name = "WindowFrame") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 22f)
                horizontalLineToRelative(-1f)
                lineTo(22f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                lineTo(7f, 0f)
                curveTo(4.24f, 0f, 2f, 2.24f, 2f, 5f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(22f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(20f, 22f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(9f)
                close()
                moveTo(20f, 5f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-7f)
                lineTo(13f, 2f)
                horizontalLineToRelative(4f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(7f, 2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                close()
                moveTo(4f, 13f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-9f)
                close()
            }
        }.also { _WindowFrame = it}
