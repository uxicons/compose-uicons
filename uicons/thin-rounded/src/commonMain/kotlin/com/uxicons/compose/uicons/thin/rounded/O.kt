package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _O: ImageVector? = null

val Icons.Tr.O: ImageVector
    get() = _O ?: UXIcon(name = "O") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.02f, 24f)
                curveToRelative(-5.53f, 0f, -10.02f, -4.45f, -10.02f, -9.91f)
                verticalLineToRelative(-4.18f)
                curveToRelative(0.5f, -13.11f, 19.5f, -13.14f, 20f, 0f)
                verticalLineToRelative(4.18f)
                curveToRelative(0f, 5.46f, -4.48f, 9.91f, -9.98f, 9.91f)
                close()
                moveTo(12.02f, 1f)
                curveTo(7.05f, 1f, 3f, 5.0f, 3f, 9.91f)
                verticalLineToRelative(4.18f)
                curveToRelative(0.45f, 11.79f, 17.55f, 11.82f, 18f, 0f)
                verticalLineToRelative(-4.18f)
                curveToRelative(0f, -4.91f, -4.03f, -8.91f, -8.98f, -8.91f)
                close()
            }
        }.also { _O = it}
