package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HelicopterSide: ImageVector? = null

val Icons.Ts.HelicopterSide: ImageVector
    get() = _HelicopterSide ?: UXIcon(name = "HelicopterSide") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 3f)
                verticalLineToRelative(-1f)
                lineTo(15f, 2f)
                lineTo(15f, 1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(1f)
                lineTo(6f, 2f)
                verticalLineToRelative(1f)
                lineTo(14f, 3f)
                verticalLineToRelative(3f)
                lineTo(1f, 6f)
                verticalLineToRelative(-2f)
                lineTo(0f, 4f)
                verticalLineToRelative(5.9f)
                lineToRelative(7f, 1.5f)
                verticalLineToRelative(1.1f)
                curveToRelative(0f, 2.86f, 2.2f, 5.22f, 5f, 5.48f)
                verticalLineToRelative(4.02f)
                lineTo(7f, 22f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(14.5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(1.5f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -4.14f, -3.36f, -7.5f, -7.5f, -7.5f)
                horizontalLineToRelative(-1.5f)
                lineTo(15f, 3f)
                horizontalLineToRelative(9f)
                close()
                moveTo(18f, 22f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(4f)
                close()
                moveTo(20.5f, 17f)
                lineTo(12.5f, 17f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                verticalLineToRelative(-1.9f)
                lineToRelative(-7f, -1.5f)
                verticalLineToRelative(-2.1f)
                lineTo(14f, 7f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(16.5f, 7f)
                curveToRelative(3.42f, 0f, 6.22f, 2.65f, 6.48f, 6f)
                horizontalLineToRelative(-7.98f)
                lineTo(15f, 7f)
                horizontalLineToRelative(1.5f)
                close()
            }
        }.also { _HelicopterSide = it}
