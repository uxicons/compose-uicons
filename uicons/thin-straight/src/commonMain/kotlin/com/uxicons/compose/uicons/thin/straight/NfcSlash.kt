package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NfcSlash: ImageVector? = null

val Icons.Ts.NfcSlash: ImageVector
    get() = _NfcSlash ?: UXIcon(name = "NfcSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 22.29f)
                lineTo(23f, 3.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(3.5f, 1f)
                curveToRelative(-0.49f, 0f, -0.97f, 0.15f, -1.38f, 0.41f)
                lineTo(0.75f, 0.05f)
                lineTo(0.05f, 0.75f)
                lineTo(23.25f, 23.95f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(-0.95f, -0.95f)
                close()
                moveTo(3.5f, 2f)
                lineTo(20.5f, 2f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                lineTo(22f, 21.29f)
                lineToRelative(-3f, -3f)
                lineTo(19f, 5f)
                horizontalLineToRelative(-5.21f)
                lineToRelative(-4.04f, 4.04f)
                lineToRelative(-1.79f, -1.79f)
                lineToRelative(2.25f, -2.25f)
                lineTo(5.71f, 5f)
                lineTo(2.85f, 2.15f)
                curveToRelative(0.2f, -0.1f, 0.42f, -0.15f, 0.65f, -0.15f)
                close()
                moveTo(18f, 17.29f)
                lineToRelative(-7.54f, -7.54f)
                lineToRelative(3.75f, -3.75f)
                horizontalLineToRelative(3.79f)
                verticalLineToRelative(11.29f)
                close()
                moveTo(7.25f, 6.54f)
                lineToRelative(-0.54f, -0.54f)
                horizontalLineToRelative(1.09f)
                lineToRelative(-0.54f, 0.54f)
                close()
                moveTo(6f, 9.53f)
                verticalLineToRelative(8.46f)
                lineTo(14.46f, 17.99f)
                lineToRelative(1f, 1f)
                lineTo(5f, 18.99f)
                lineTo(5f, 8.54f)
                lineToRelative(1f, 1f)
                close()
                moveTo(10f, 13.53f)
                verticalLineToRelative(0.46f)
                horizontalLineToRelative(0.46f)
                lineToRelative(1f, 1f)
                horizontalLineToRelative(-2.46f)
                verticalLineToRelative(-2.46f)
                lineToRelative(1f, 1f)
                close()
                moveTo(18.46f, 21.99f)
                lineToRelative(1f, 1f)
                lineTo(1f, 22.99f)
                lineTo(1f, 4.54f)
                lineToRelative(1f, 1f)
                lineTo(2f, 22f)
                lineTo(18.46f, 22f)
                close()
            }
        }.also { _NfcSlash = it}
