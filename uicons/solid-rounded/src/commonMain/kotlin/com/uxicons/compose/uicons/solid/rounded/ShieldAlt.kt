package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldAlt: ImageVector? = null

val Icons.Sr.ShieldAlt: ImageVector
    get() = _ShieldAlt ?: UXIcon(name = "ShieldAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 23.94f)
                curveToRelative(-2.31f, -1.18f, -9f, -5.16f, -9f, -11.57f)
                verticalLineToRelative(-5.77f)
                curveToRelative(0f, -2.16f, 1.38f, -4.07f, 3.43f, -4.75f)
                lineToRelative(5.57f, -1.85f)
                verticalLineToRelative(23.94f)
                close()
                moveTo(18.57f, 1.85f)
                lineToRelative(-5.57f, -1.85f)
                verticalLineToRelative(24f)
                curveToRelative(2.37f, -0.99f, 9f, -4.42f, 9f, -11.63f)
                verticalLineToRelative(-5.77f)
                curveToRelative(0f, -2.16f, -1.38f, -4.07f, -3.43f, -4.75f)
                close()
            }
        }.also { _ShieldAlt = it}
