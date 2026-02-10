package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Clipboard: ImageVector? = null

val Icons.Sr.Clipboard: ImageVector
    get() = _Clipboard ?: UXIcon(name = "Clipboard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 4f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(2f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveTo(17.0f, 2.1f)
                curveToRelative(-0.05f, 2.16f, -1.83f, 3.9f, -4.0f, 3.9f)
                horizontalLineToRelative(-2f)
                curveToRelative(-2.17f, 0f, -3.95f, -1.74f, -4.0f, -3.9f)
                curveToRelative(-2.28f, 0.46f, -4.0f, 2.48f, -4.0f, 4.9f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(8f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(21f, 7f)
                curveToRelative(0f, -2.42f, -1.72f, -4.44f, -4.0f, -4.9f)
                close()
            }
        }.also { _Clipboard = it}
