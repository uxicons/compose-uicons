package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NfcTrash: ImageVector? = null

val Icons.Ss.NfcTrash: ImageVector
    get() = _NfcTrash ?: UXIcon(name = "NfcTrash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 12f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(4f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2f)
                close()
                moveTo(17f, 11f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                close()
                moveTo(22f, 3f)
                verticalLineToRelative(5.37f)
                curveToRelative(-0.73f, -0.83f, -1.8f, -1.37f, -3f, -1.37f)
                lineTo(19f, 3f)
                horizontalLineToRelative(-7.41f)
                lineToRelative(-3.59f, 3.59f)
                verticalLineToRelative(7.41f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                lineTo(5f, 17f)
                lineTo(5f, 6.09f)
                lineToRelative(3.23f, -3.09f)
                lineTo(3f, 3f)
                lineTo(3f, 19f)
                lineTo(11f, 19f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.34f, 0.04f, 0.68f, 0.1f, 1f)
                lineTo(0f, 22f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                lineTo(19f, 0f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(12.41f, 5f)
                horizontalLineToRelative(4.59f)
                verticalLineToRelative(2f)
                curveToRelative(-1.86f, 0f, -3.43f, 1.28f, -3.87f, 3f)
                horizontalLineToRelative(-3.13f)
                verticalLineToRelative(-2.59f)
                lineToRelative(2.41f, -2.41f)
                close()
            }
        }.also { _NfcTrash = it}
