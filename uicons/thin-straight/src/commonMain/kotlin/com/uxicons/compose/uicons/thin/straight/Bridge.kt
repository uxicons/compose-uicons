package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bridge: ImageVector? = null

val Icons.Ts.Bridge: ImageVector
    get() = _Bridge ?: UXIcon(name = "Bridge") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 0f)
                lineTo(0f, 12.09f)
                lineToRelative(0.36f, 0.1f)
                curveToRelative(2.14f, 0.61f, 3.64f, 2.58f, 3.64f, 4.81f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -2.22f, 1.5f, -4.2f, 3.64f, -4.81f)
                lineToRelative(0.36f, -0.1f)
                lineTo(24f, 0f)
                lineTo(0f, 0f)
                close()
                moveTo(23f, 4f)
                horizontalLineToRelative(-3f)
                lineTo(20f, 1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                close()
                moveTo(5f, 4f)
                lineTo(5f, 1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                lineTo(5f, 4f)
                close()
                moveTo(10f, 1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4f)
                lineTo(10f, 1f)
                close()
                moveTo(15f, 1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4f)
                lineTo(15f, 1f)
                close()
                moveTo(4f, 1f)
                verticalLineToRelative(3f)
                lineTo(1f, 4f)
                lineTo(1f, 1f)
                horizontalLineToRelative(3f)
                close()
                moveTo(19f, 17f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -2.54f, -1.63f, -4.81f, -4f, -5.65f)
                lineTo(1f, 5f)
                lineTo(23f, 5f)
                verticalLineToRelative(6.35f)
                curveToRelative(-2.37f, 0.84f, -4f, 3.11f, -4f, 5.65f)
                close()
            }
        }.also { _Bridge = it}
