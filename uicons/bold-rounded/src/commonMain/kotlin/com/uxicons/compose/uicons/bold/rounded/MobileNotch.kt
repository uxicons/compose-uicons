package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MobileNotch: ImageVector? = null

val Icons.Br.MobileNotch: ImageVector
    get() = _MobileNotch ?: UXIcon(name = "MobileNotch") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.5f, 0f)
            horizontalLineToRelative(-5f)
            curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(5f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(20f, 5.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(17f, 18.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-5f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            lineTo(7f, 5.5f)
            curveToRelative(0f, -1.08f, 0.69f, -2.0f, 1.65f, -2.35f)
            lineToRelative(0.51f, 1.02f)
            curveToRelative(0.25f, 0.51f, 0.77f, 0.83f, 1.34f, 0.83f)
            horizontalLineToRelative(3f)
            curveToRelative(0.57f, 0f, 1.09f, -0.32f, 1.34f, -0.83f)
            lineToRelative(0.51f, -1.02f)
            curveToRelative(0.96f, 0.35f, 1.65f, 1.27f, 1.65f, 2.35f)
            verticalLineToRelative(13f)
            close()
            moveTo(13f, 19f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
            horizontalLineToRelative(0f)
            curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
            horizontalLineToRelative(2f)
            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
            horizontalLineToRelative(0f)
            curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
            close()
        }
    }.also { _MobileNotch = it }
