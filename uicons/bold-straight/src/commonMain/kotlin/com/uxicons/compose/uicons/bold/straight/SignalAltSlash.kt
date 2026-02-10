package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SignalAltSlash: ImageVector? = null

val Icons.Bs.SignalAltSlash: ImageVector
    get() = _SignalAltSlash ?: UXIcon(name = "SignalAltSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 20.86f)
                lineTo(23f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(0.86f)
                lineTo(2.16f, 0.02f)
                lineTo(0.04f, 2.14f)
                lineToRelative(21.8f, 21.8f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-0.96f, -0.96f)
                close()
                moveTo(20f, 3f)
                verticalLineToRelative(14.86f)
                lineToRelative(-2f, -2f)
                lineTo(18f, 3f)
                horizontalLineToRelative(2f)
                close()
                moveTo(13f, 7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5.86f)
                lineToRelative(-2f, -2f)
                verticalLineToRelative(-3.86f)
                close()
                moveTo(15f, 21f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3.07f)
                lineToRelative(-3f, -3f)
                verticalLineToRelative(6.07f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-8.07f)
                lineToRelative(-2.53f, -2.53f)
                curveToRelative(-0.29f, 0.46f, -0.47f, 1.01f, -0.47f, 1.6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(19.07f)
                lineToRelative(-4.07f, -4.07f)
                verticalLineToRelative(1.07f)
                close()
                moveTo(5f, 21f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                close()
            }
        }.also { _SignalAltSlash = it}
