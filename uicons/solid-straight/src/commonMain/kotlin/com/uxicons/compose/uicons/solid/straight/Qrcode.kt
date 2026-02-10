package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Qrcode: ImageVector? = null

val Icons.Ss.Qrcode: ImageVector
    get() = _Qrcode ?: UXIcon(name = "Qrcode") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 0f)
                lineTo(0f, 11f)
                lineTo(11f, 11f)
                lineTo(11f, 0f)
                lineTo(0f, 0f)
                close()
                moveTo(7f, 7f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                close()
                moveTo(13f, 0f)
                lineTo(13f, 11f)
                horizontalLineToRelative(11f)
                lineTo(24f, 0f)
                lineTo(13f, 0f)
                close()
                moveTo(20f, 7f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                close()
                moveTo(0f, 13f)
                verticalLineToRelative(11f)
                lineTo(11f, 24f)
                lineTo(11f, 13f)
                lineTo(0f, 13f)
                close()
                moveTo(7f, 20f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                close()
                moveTo(17f, 17f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                close()
                moveTo(20f, 20f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                close()
                moveTo(17f, 24f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                close()
                moveTo(24f, 17f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                close()
            }
        }.also { _Qrcode = it}
