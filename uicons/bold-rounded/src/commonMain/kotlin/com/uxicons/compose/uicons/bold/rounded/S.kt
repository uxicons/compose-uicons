package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _S: ImageVector? = null

val Icons.Br.S: ImageVector
    get() = _S ?: UXIcon(name = "S") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.9f, 24f)
            horizontalLineToRelative(-7.81f)
            curveToRelative(-3.36f, 0f, -6.1f, -2.73f, -6.1f, -6.1f)
            verticalLineToRelative(-0.4f)
            curveToRelative(0.03f, -1.97f, 2.97f, -1.97f, 3f, 0f)
            verticalLineToRelative(0.4f)
            curveToRelative(0f, 1.71f, 1.39f, 3.1f, 3.1f, 3.1f)
            horizontalLineToRelative(7.81f)
            curveToRelative(3.55f, -0.01f, 4.25f, -5.08f, 0.85f, -6.07f)
            lineToRelative(-10.35f, -2.98f)
            curveTo(-0.29f, 9.94f, 1.09f, 0.08f, 8.1f, 0f)
            horizontalLineToRelative(7.81f)
            curveToRelative(3.36f, 0f, 6.1f, 2.73f, 6.1f, 6.1f)
            verticalLineToRelative(0.4f)
            curveToRelative(-0.03f, 1.97f, -2.97f, 1.97f, -3f, 0f)
            verticalLineToRelative(-0.4f)
            curveToRelative(0f, -1.71f, -1.39f, -3.1f, -3.1f, -3.1f)
            horizontalLineToRelative(-7.81f)
            curveToRelative(-3.55f, 0.01f, -4.25f, 5.08f, -0.85f, 6.07f)
            lineToRelative(10.35f, 2.98f)
            curveToRelative(6.7f, 2.02f, 5.32f, 11.88f, -1.69f, 11.95f)
            close()
        }
    }.also { _S = it }
