package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Igloo: ImageVector? = null

val Icons.Ss.Igloo: ImageVector
    get() = _Igloo ?: UXIcon(name = "Igloo") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1.1f, 7f)
                curveTo(2.87f, 3.16f, 6.6f, 0.42f, 11f, 0.05f)
                lineTo(11f, 7f)
                lineTo(1.1f, 7f)
                close()
                moveTo(17f, 16f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.04f, -0.15f, -2.04f, -0.4f, -3f)
                horizontalLineToRelative(-6.61f)
                verticalLineToRelative(7f)
                close()
                moveTo(13f, 7f)
                horizontalLineToRelative(9.89f)
                curveTo(21.13f, 3.16f, 17.4f, 0.42f, 13f, 0.05f)
                lineTo(13f, 7f)
                close()
                moveTo(0.4f, 9f)
                curveToRelative(-0.25f, 0.96f, -0.4f, 1.96f, -0.4f, 3f)
                verticalLineToRelative(4f)
                lineTo(7f, 16f)
                verticalLineToRelative(-7f)
                lineTo(0.4f, 9f)
                close()
                moveTo(16f, 18f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-8f)
                close()
                moveTo(0f, 18f)
                verticalLineToRelative(6f)
                lineTo(8f, 24f)
                verticalLineToRelative(-6f)
                lineTo(0f, 18f)
                close()
                moveTo(9f, 9f)
                verticalLineToRelative(6.39f)
                curveToRelative(0.73f, -0.84f, 1.79f, -1.39f, 3f, -1.39f)
                reflectiveCurveToRelative(2.27f, 0.54f, 3f, 1.39f)
                verticalLineToRelative(-6.39f)
                horizontalLineToRelative(-6f)
                close()
            }
        }.also { _Igloo = it}
