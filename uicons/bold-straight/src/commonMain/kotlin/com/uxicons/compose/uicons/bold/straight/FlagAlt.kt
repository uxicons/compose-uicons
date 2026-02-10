package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FlagAlt: ImageVector? = null

val Icons.Bs.FlagAlt: ImageVector
    get() = _FlagAlt ?: UXIcon(name = "FlagAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24.01f, 0f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                lineTo(0f, 24f)
                lineTo(3f, 24f)
                verticalLineToRelative(-8f)
                lineTo(24.01f, 16f)
                lineToRelative(-6.03f, -8f)
                lineTo(24.01f, 0f)
                close()
                moveTo(17.99f, 13f)
                lineTo(3f, 13f)
                lineTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(14.49f)
                lineToRelative(-3.77f, 5f)
                lineToRelative(3.77f, 5f)
                close()
            }
        }.also { _FlagAlt = it}
