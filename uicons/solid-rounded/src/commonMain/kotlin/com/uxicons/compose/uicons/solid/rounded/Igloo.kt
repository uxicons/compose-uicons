package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Igloo: ImageVector? = null

val Icons.Sr.Igloo: ImageVector
    get() = _Igloo ?: UXIcon(name = "Igloo") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 0.06f)
                curveToRelative(4.4f, 0.37f, 8.14f, 3.1f, 9.9f, 6.94f)
                lineTo(13f, 7f)
                lineTo(13f, 0.06f)
                close()
                moveTo(7f, 9f)
                lineTo(0.46f, 9f)
                curveToRelative(-0.3f, 1.07f, -0.46f, 2.2f, -0.46f, 3.35f)
                verticalLineToRelative(3.65f)
                lineTo(7f, 16f)
                verticalLineToRelative(-7f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, -1.04f, -0.15f, -2.04f, -0.4f, -3f)
                horizontalLineToRelative(-6.6f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-4f)
                close()
                moveTo(11f, 7f)
                lineTo(11f, 0.05f)
                curveToRelative(-0.05f, 0.0f, -0.1f, 0.0f, -0.16f, 0.01f)
                curveTo(6.51f, 0.46f, 2.96f, 3.24f, 1.2f, 7f)
                lineTo(11f, 7f)
                close()
                moveTo(16f, 18f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(1.5f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-8f)
                close()
                moveTo(0f, 19.5f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-4f)
                lineTo(0f, 18f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(15f, 15.38f)
                verticalLineToRelative(-6.38f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(6.38f)
                curveToRelative(0.73f, -0.84f, 1.8f, -1.38f, 3f, -1.38f)
                reflectiveCurveToRelative(2.27f, 0.54f, 3f, 1.38f)
                close()
            }
        }.also { _Igloo = it}
