package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsSplitUpAndLeft: ImageVector? = null

val Icons.Br.ArrowsSplitUpAndLeft: ImageVector
    get() = _ArrowsSplitUpAndLeft ?: UXIcon(name = "ArrowsSplitUpAndLeft") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 22.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-5f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            verticalLineToRelative(-3.5f)
            horizontalLineTo(4.35f)
            lineToRelative(2.18f, 2.08f)
            curveToRelative(0.6f, 0.57f, 0.62f, 1.52f, 0.05f, 2.12f)
            curveToRelative(-0.29f, 0.31f, -0.69f, 0.47f, -1.09f, 0.47f)
            curveToRelative(-0.37f, 0f, -0.74f, -0.14f, -1.03f, -0.41f)
            lineToRelative(-3.41f, -3.25f)
            curveToRelative(-0.69f, -0.69f, -1.05f, -1.56f, -1.05f, -2.5f)
            reflectiveCurveToRelative(0.36f, -1.81f, 1.03f, -2.48f)
            lineToRelative(3.44f, -3.28f)
            curveToRelative(0.6f, -0.57f, 1.55f, -0.55f, 2.12f, 0.05f)
            curveToRelative(0.57f, 0.6f, 0.55f, 1.55f, -0.05f, 2.12f)
            lineToRelative(-2.18f, 2.08f)
            horizontalLineToRelative(7.65f)
            verticalLineTo(4.35f)
            lineToRelative(-2.08f, 2.18f)
            curveToRelative(-0.57f, 0.6f, -1.52f, 0.62f, -2.12f, 0.05f)
            curveToRelative(-0.6f, -0.57f, -0.62f, -1.52f, -0.05f, -2.12f)
            lineToRelative(3.25f, -3.41f)
            curveToRelative(1.37f, -1.37f, 3.65f, -1.35f, 4.98f, -0.03f)
            lineToRelative(3.28f, 3.44f)
            curveToRelative(0.57f, 0.6f, 0.55f, 1.55f, -0.05f, 2.12f)
            curveToRelative(-0.29f, 0.28f, -0.66f, 0.41f, -1.03f, 0.41f)
            curveToRelative(-0.4f, 0f, -0.79f, -0.16f, -1.09f, -0.47f)
            lineToRelative(-2.08f, -2.18f)
            verticalLineToRelative(14.15f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _ArrowsSplitUpAndLeft = it }
