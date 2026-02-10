package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _O: ImageVector? = null

val Icons.Br.O: ImageVector
    get() = _O ?: UXIcon(name = "O") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.02f, 24f)
            curveToRelative(-5.53f, 0f, -10.02f, -4.53f, -10.02f, -10.09f)
            verticalLineToRelative(-3.82f)
            curveToRelative(0.51f, -13.35f, 19.5f, -13.38f, 20f, 0f)
            verticalLineToRelative(3.82f)
            curveToRelative(0f, 5.56f, -4.48f, 10.09f, -9.98f, 10.09f)
            close()
            moveTo(12.02f, 3f)
            curveToRelative(-3.87f, 0f, -7.02f, 3.18f, -7.02f, 7.09f)
            verticalLineToRelative(3.82f)
            curveToRelative(0.28f, 9.33f, 13.78f, 9.43f, 14f, 0f)
            verticalLineToRelative(-3.82f)
            curveToRelative(0f, -3.98f, -3.06f, -7.09f, -6.98f, -7.09f)
            close()
        }
    }.also { _O = it }
