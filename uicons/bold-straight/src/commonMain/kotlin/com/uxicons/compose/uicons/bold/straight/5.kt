package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _5: ImageVector? = null

val Icons.Bs.Five: ImageVector
    get() = _5 ?: UXIcon(name = "5") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.5f, 24f)
            horizontalLineTo(4f)
            verticalLineToRelative(-3f)
            horizontalLineTo(12.5f)
            curveToRelative(1.23f, 0f, 2.38f, -0.48f, 3.23f, -1.37f)
            curveToRelative(0.85f, -0.88f, 1.3f, -2.04f, 1.27f, -3.27f)
            curveToRelative(-0.07f, -2.4f, -2.2f, -4.36f, -4.75f, -4.36f)
            horizontalLineTo(4f)
            verticalLineTo(3.5f)
            curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
            horizontalLineToRelative(11.5f)
            verticalLineTo(3f)
            horizontalLineTo(7.5f)
            curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
            verticalLineToRelative(5.5f)
            horizontalLineToRelative(5.25f)
            curveToRelative(4.15f, 0f, 7.63f, 3.26f, 7.75f, 7.27f)
            curveToRelative(0.06f, 2.05f, -0.69f, 3.98f, -2.11f, 5.45f)
            curveToRelative(-1.43f, 1.47f, -3.34f, 2.28f, -5.38f, 2.28f)
            close()
        }
    }.also { _5 = it }
