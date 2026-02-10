package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sauce: ImageVector? = null

val Icons.Ts.Sauce: ImageVector
    get() = _Sauce ?: UXIcon(name = "Sauce") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.5f, 9f)
                horizontalLineToRelative(-0.5f)
                lineTo(17f, 5f)
                horizontalLineToRelative(-2.59f)
                lineTo(13.41f, 0f)
                horizontalLineToRelative(-2.82f)
                lineToRelative(-1f, 5f)
                horizontalLineToRelative(-2.59f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(12.5f)
                lineTo(20f, 24f)
                lineTo(20f, 11.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(11.41f, 1f)
                horizontalLineToRelative(1.18f)
                lineToRelative(0.8f, 4f)
                horizontalLineToRelative(-2.78f)
                lineToRelative(0.8f, -4f)
                close()
                moveTo(8f, 6f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(3f)
                lineTo(8f, 9f)
                verticalLineToRelative(-3f)
                close()
                moveTo(19f, 23f)
                lineTo(5f, 23f)
                lineTo(5f, 11.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(11f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(11.5f)
                close()
                moveTo(8f, 19f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-5f)
                lineTo(8f, 14f)
                verticalLineToRelative(5f)
                close()
                moveTo(9f, 15f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _Sauce = it}
