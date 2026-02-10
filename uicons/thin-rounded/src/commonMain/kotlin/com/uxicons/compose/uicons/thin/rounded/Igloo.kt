package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Igloo: ImageVector? = null

val Icons.Tr.Igloo: ImageVector
    get() = _Igloo ?: UXIcon(name = "Igloo") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                verticalLineToRelative(7.5f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(2f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(2f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-7.5f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                close()
                moveTo(22.25f, 8f)
                curveToRelative(0.49f, 1.24f, 0.75f, 2.59f, 0.75f, 4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-6f)
                lineTo(17f, 8f)
                horizontalLineToRelative(5.25f)
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
                moveTo(7f, 22.5f)
                curveToRelative(0f, 0.28f, -0.23f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-2.5f)
                lineTo(7f, 17f)
                verticalLineToRelative(5.5f)
                close()
                moveTo(12f, 12f)
                curveToRelative(-1.63f, 0f, -3.09f, 0.79f, -4f, 2.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(6.0f)
                curveToRelative(-0.91f, -1.22f, -2.37f, -2.0f, -4f, -2.0f)
                close()
                moveTo(19.5f, 23f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                close()
            }
        }.also { _Igloo = it}
