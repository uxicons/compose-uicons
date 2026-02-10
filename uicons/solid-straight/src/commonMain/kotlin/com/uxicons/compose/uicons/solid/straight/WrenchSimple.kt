package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WrenchSimple: ImageVector? = null

val Icons.Ss.WrenchSimple: ImageVector
    get() = _WrenchSimple ?: UXIcon(name = "WrenchSimple") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.31f, 0.54f)
                lineToRelative(-0.32f, -0.1f)
                verticalLineTo(10f)
                horizontalLineToRelative(-6f)
                verticalLineTo(0.44f)
                lineToRelative(-0.32f, 0.1f)
                curveTo(4.39f, 1.97f, 1.5f, 5.97f, 1.5f, 10.5f)
                curveToRelative(0f, 4.28f, 2.58f, 8.09f, 6.5f, 9.7f)
                verticalLineToRelative(3.8f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-3.8f)
                curveToRelative(3.92f, -1.61f, 6.5f, -5.42f, 6.5f, -9.7f)
                curveToRelative(0f, -4.53f, -2.89f, -8.53f, -7.18f, -9.96f)
                close()
            }
        }.also { _WrenchSimple = it}
