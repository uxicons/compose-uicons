package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NfcSlash: ImageVector? = null

val Icons.Bs.NfcSlash: ImageVector
    get() = _NfcSlash ?: UXIcon(name = "NfcSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 20.88f)
                lineTo(23f, 4.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(4.5f, 1f)
                curveToRelative(-0.4f, 0f, -0.8f, 0.07f, -1.18f, 0.2f)
                lineTo(2.16f, 0.04f)
                lineTo(0.04f, 2.16f)
                lineTo(21.84f, 23.96f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-0.96f, -0.96f)
                close()
                moveTo(19.5f, 4f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(13.38f)
                lineToRelative(-2f, -2f)
                lineTo(18f, 6f)
                horizontalLineToRelative(-2.55f)
                lineToRelative(-3f, 3f)
                horizontalLineToRelative(2.55f)
                verticalLineToRelative(3.88f)
                lineToRelative(-4.63f, -4.63f)
                lineToRelative(2.25f, -2.25f)
                horizontalLineToRelative(-4.5f)
                lineToRelative(-2f, -2f)
                horizontalLineToRelative(13.38f)
                close()
                moveTo(9f, 13.95f)
                verticalLineToRelative(1.05f)
                horizontalLineToRelative(1.05f)
                lineToRelative(3f, 3f)
                lineTo(6f, 18f)
                verticalLineToRelative(-7.05f)
                lineToRelative(3f, 3f)
                close()
                moveTo(15.05f, 20f)
                lineToRelative(3f, 3f)
                lineTo(1f, 23f)
                lineTo(1f, 5.95f)
                lineToRelative(3f, 3f)
                verticalLineToRelative(11.05f)
                lineTo(15.05f, 20f)
                close()
            }
        }.also { _NfcSlash = it}
