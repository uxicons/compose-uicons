package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SignHanging: ImageVector? = null

val Icons.Ss.SignHanging: ImageVector
    get() = _SignHanging ?: UXIcon(name = "SignHanging") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 2f)
                lineTo(24f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                lineTo(0f, 24f)
                lineTo(2f, 24f)
                lineTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                lineTo(7f, 2f)
                verticalLineToRelative(2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(13f)
                lineTo(24f, 20f)
                lineTo(24f, 7f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(21f, 2f)
                horizontalLineToRelative(3f)
                close()
                moveTo(19f, 4f)
                lineTo(9f, 4f)
                lineTo(9f, 2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _SignHanging = it}
