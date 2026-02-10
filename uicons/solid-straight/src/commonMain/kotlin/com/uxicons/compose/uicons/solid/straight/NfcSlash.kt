package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NfcSlash: ImageVector? = null

val Icons.Ss.NfcSlash: ImageVector
    get() = _NfcSlash ?: UXIcon(name = "NfcSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.76f, 20f)
                lineToRelative(3f, 3f)
                lineTo(1f, 23f)
                lineTo(1f, 5.24f)
                lineToRelative(3f, 3f)
                verticalLineToRelative(11.76f)
                lineTo(15.76f, 20f)
                close()
                moveTo(6f, 10.24f)
                verticalLineToRelative(7.76f)
                horizontalLineToRelative(7.76f)
                lineToRelative(-3f, -3f)
                horizontalLineToRelative(-1.76f)
                verticalLineToRelative(-1.76f)
                lineToRelative(-3f, -3f)
                close()
                moveTo(23.96f, 22.54f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(0.04f, 1.46f)
                lineTo(1.46f, 0.04f)
                lineToRelative(1.26f, 1.26f)
                curveToRelative(0.39f, -0.19f, 0.82f, -0.3f, 1.29f, -0.3f)
                lineTo(20f, 1f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                lineTo(23f, 21.59f)
                lineToRelative(0.96f, 0.96f)
                close()
                moveTo(9.41f, 4f)
                lineTo(5.41f, 4f)
                lineToRelative(2f, 2f)
                lineToRelative(2f, -2f)
                close()
                moveTo(15f, 10f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1.59f)
                lineToRelative(2f, 2f)
                verticalLineToRelative(-3.59f)
                close()
                moveTo(20f, 4f)
                horizontalLineToRelative(-6.91f)
                lineToRelative(-3.84f, 3.84f)
                lineToRelative(1.75f, 1.75f)
                verticalLineToRelative(-0.67f)
                lineToRelative(2.91f, -2.91f)
                horizontalLineToRelative(4.09f)
                verticalLineToRelative(10.59f)
                lineToRelative(2f, 2f)
                lineTo(20f, 4f)
                close()
            }
        }.also { _NfcSlash = it}
