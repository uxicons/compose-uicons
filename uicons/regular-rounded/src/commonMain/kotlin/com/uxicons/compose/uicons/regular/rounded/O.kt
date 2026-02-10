package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _O: ImageVector? = null

val Icons.Rr.O: ImageVector
    get() = _O ?: UXIcon(name = "O") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.02f, 24f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                verticalLineToRelative(-4f)
                curveToRelative(0.5f, -13.25f, 19.5f, -13.24f, 20f, 0f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 5.51f, -4.49f, 10f, -10f, 10f)
                close()
                moveTo(12.02f, 2f)
                curveToRelative(-4.41f, 0f, -8f, 3.59f, -8f, 8f)
                verticalLineToRelative(4f)
                curveToRelative(0.38f, 10.59f, 15.63f, 10.58f, 16f, 0f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -4.41f, -3.59f, -8f, -8f, -8f)
                close()
            }
        }.also { _O = it}
