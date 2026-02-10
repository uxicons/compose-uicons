package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Igloo: ImageVector? = null

val Icons.Ts.Igloo: ImageVector
    get() = _Igloo ?: UXIcon(name = "Igloo") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                verticalLineToRelative(12f)
                lineTo(8f, 24f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(8f)
                lineTo(24f, 12f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                close()
                moveTo(23f, 16f)
                horizontalLineToRelative(-6f)
                lineTo(17f, 8f)
                horizontalLineToRelative(5.25f)
                curveToRelative(0.49f, 1.24f, 0.75f, 2.59f, 0.75f, 4f)
                verticalLineToRelative(4f)
                close()
                moveTo(21.8f, 7f)
                lineTo(12.5f, 7f)
                lineTo(12.5f, 1.01f)
                curveToRelative(4.05f, 0.18f, 7.54f, 2.57f, 9.3f, 5.99f)
                close()
                moveTo(11.5f, 1.01f)
                lineTo(11.5f, 7f)
                lineTo(2.2f, 7f)
                curveTo(3.96f, 3.58f, 7.45f, 1.19f, 11.5f, 1.01f)
                close()
                moveTo(1.75f, 8f)
                lineTo(7f, 8f)
                verticalLineToRelative(8f)
                lineTo(1f, 16f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.41f, 0.27f, -2.76f, 0.75f, -4f)
                close()
                moveTo(7f, 23f)
                lineTo(1f, 23f)
                verticalLineToRelative(-6f)
                lineTo(7f, 17f)
                verticalLineToRelative(6f)
                close()
                moveTo(12f, 12f)
                curveToRelative(-1.63f, 0f, -3.09f, 0.79f, -4f, 2.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(6.0f)
                curveToRelative(-0.91f, -1.22f, -2.37f, -2.0f, -4f, -2.0f)
                close()
                moveTo(17f, 23f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-6f)
                close()
            }
        }.also { _Igloo = it}
