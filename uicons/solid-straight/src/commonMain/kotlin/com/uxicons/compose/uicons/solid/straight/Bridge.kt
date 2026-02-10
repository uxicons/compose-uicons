package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bridge: ImageVector? = null

val Icons.Ss.Bridge: ImageVector
    get() = _Bridge ?: UXIcon(name = "Bridge") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 0f)
                lineTo(0f, 12.93f)
                lineToRelative(0.83f, 0.14f)
                curveToRelative(2.41f, 0.41f, 4.17f, 2.48f, 4.17f, 4.93f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -2.45f, 1.75f, -4.53f, 4.17f, -4.93f)
                lineToRelative(0.83f, -0.14f)
                lineTo(24f, 0f)
                lineTo(0f, 0f)
                close()
                moveTo(22f, 5f)
                horizontalLineToRelative(-3.5f)
                lineTo(18.5f, 2f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(3f)
                close()
                moveTo(7.5f, 5f)
                lineTo(7.5f, 2f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3.5f)
                close()
                moveTo(13f, 2f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3.5f)
                lineTo(13f, 2f)
                close()
                moveTo(5.5f, 2f)
                verticalLineToRelative(3f)
                lineTo(2f, 5f)
                lineTo(2f, 2f)
                horizontalLineToRelative(3.5f)
                close()
            }
        }.also { _Bridge = it}
