package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NfcSlash: ImageVector? = null

val Icons.Rs.NfcSlash: ImageVector
    get() = _NfcSlash ?: UXIcon(name = "NfcSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 11.24f)
                verticalLineToRelative(5.76f)
                horizontalLineToRelative(5.76f)
                lineToRelative(2f, 2f)
                lineTo(5f, 19f)
                lineTo(5f, 9.24f)
                lineToRelative(2f, 2f)
                close()
                moveTo(3f, 21f)
                lineTo(3f, 7.24f)
                lineTo(1f, 5.24f)
                lineTo(1f, 23f)
                lineTo(18.76f, 23f)
                lineToRelative(-2f, -2f)
                lineTo(3f, 21f)
                close()
                moveTo(23.96f, 22.54f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(0.04f, 1.46f)
                lineTo(1.46f, 0.04f)
                lineToRelative(1.27f, 1.27f)
                curveToRelative(0.4f, -0.19f, 0.83f, -0.31f, 1.28f, -0.31f)
                lineTo(20f, 1f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                lineTo(23f, 21.59f)
                lineToRelative(0.96f, 0.96f)
                close()
                moveTo(4.41f, 3f)
                lineToRelative(2f, 2f)
                horizontalLineToRelative(3.82f)
                lineToRelative(-1.91f, 1.91f)
                lineToRelative(1.18f, 1.18f)
                lineToRelative(3.09f, -3.09f)
                horizontalLineToRelative(6.41f)
                verticalLineToRelative(12.59f)
                lineToRelative(2f, 2f)
                lineTo(21f, 4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(4.41f, 3f)
                close()
                moveTo(17f, 7f)
                horizontalLineToRelative(-3.59f)
                lineToRelative(-2.41f, 2.41f)
                verticalLineToRelative(0.17f)
                lineToRelative(6f, 6f)
                lineTo(17f, 7f)
                close()
            }
        }.also { _NfcSlash = it}
