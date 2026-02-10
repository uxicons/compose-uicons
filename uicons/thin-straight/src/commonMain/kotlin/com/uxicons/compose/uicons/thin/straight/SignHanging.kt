package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SignHanging: ImageVector? = null

val Icons.Ts.SignHanging: ImageVector
    get() = _SignHanging ?: UXIcon(name = "SignHanging") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 1f)
                lineTo(24f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                lineTo(0f, 24f)
                lineTo(1f, 24f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(7f, 1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(13.5f)
                lineTo(24f, 20f)
                lineTo(24f, 6.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-0.5f)
                lineTo(21f, 1f)
                horizontalLineToRelative(3f)
                close()
                moveTo(23f, 6.5f)
                verticalLineToRelative(12.5f)
                lineTo(5f, 19f)
                lineTo(5f, 6.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(15f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(20f, 4f)
                lineTo(8f, 4f)
                lineTo(8f, 1f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _SignHanging = it}
