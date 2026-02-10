package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldAlt: ImageVector? = null

val Icons.Ss.ShieldAlt: ImageVector
    get() = _ShieldAlt ?: UXIcon(name = "ShieldAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 0f)
                verticalLineToRelative(23.94f)
                curveToRelative(-2.1f, -1.06f, -9f, -5.05f, -9f, -11.56f)
                verticalLineToRelative(-7.22f)
                curveToRelative(0f, -1.29f, 0.83f, -2.44f, 2.06f, -2.85f)
                lineTo(11f, 0f)
                close()
                moveTo(19.94f, 2.3f)
                lineTo(13f, 0f)
                verticalLineToRelative(24f)
                curveToRelative(2.21f, -0.91f, 9f, -4.28f, 9f, -11.62f)
                verticalLineToRelative(-7.22f)
                curveToRelative(0f, -1.29f, -0.83f, -2.44f, -2.06f, -2.85f)
                close()
            }
        }.also { _ShieldAlt = it}
