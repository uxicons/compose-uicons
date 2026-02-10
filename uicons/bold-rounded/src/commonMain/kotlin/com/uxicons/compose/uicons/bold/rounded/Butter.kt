package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Butter: ImageVector? = null

val Icons.Br.Butter: ImageVector
    get() = _Butter ?: UXIcon(name = "Butter") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 17.5f)
            curveToRelative(0f, -0.65f, -0.42f, -1.21f, -1f, -1.41f)
            lineTo(23f, 7.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            lineTo(6.5f, 2f)
            curveTo(3.47f, 2f, 1f, 4.47f, 1f, 7.5f)
            verticalLineToRelative(8.59f)
            curveToRelative(-0.58f, 0.21f, -1f, 0.76f, -1f, 1.41f)
            curveToRelative(0f, 0.66f, 0.43f, 1.22f, 1.03f, 1.42f)
            curveToRelative(0.21f, 1.73f, 1.69f, 3.08f, 3.47f, 3.08f)
            horizontalLineToRelative(15f)
            curveToRelative(1.79f, 0f, 3.27f, -1.35f, 3.47f, -3.08f)
            curveToRelative(0.6f, -0.2f, 1.03f, -0.76f, 1.03f, -1.42f)
            close()
            moveTo(20f, 7.5f)
            verticalLineToRelative(8.5f)
            horizontalLineToRelative(-2f)
            lineTo(18f, 7.5f)
            curveToRelative(0f, -0.9f, -0.22f, -1.75f, -0.6f, -2.5f)
            horizontalLineToRelative(0.1f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            close()
            moveTo(6.5f, 5f)
            horizontalLineToRelative(6f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(8.5f)
            lineTo(4f, 16f)
            lineTo(4f, 7.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            close()
        }
    }.also { _Butter = it }
