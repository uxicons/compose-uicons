package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Browsers: ImageVector? = null

val Icons.Ss.Browsers: ImageVector
    get() = _Browsers ?: UXIcon(name = "Browsers") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 6f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(13f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(1f)
                lineTo(5f, 6f)
                close()
                moveTo(5f, 8f)
                verticalLineToRelative(10f)
                lineTo(24f, 18f)
                lineTo(24f, 8f)
                lineTo(5f, 8f)
                close()
                moveTo(3f, 20f)
                lineTo(3f, 6f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(13f)
                lineTo(19f, 22f)
                verticalLineToRelative(-2f)
                lineTo(3f, 20f)
                close()
            }
        }.also { _Browsers = it}
