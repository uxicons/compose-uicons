package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsSplitRightAndLeft: ImageVector? = null

val Icons.Br.ArrowsSplitRightAndLeft: ImageVector
    get() = _ArrowsSplitRightAndLeft ?: UXIcon(name = "ArrowsSplitRightAndLeft") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.65f, 6.35f)
            lineToRelative(-3.6f, 3.8f)
            curveToRelative(-0.76f, 0.76f, -2.05f, 0.22f, -2.05f, -0.85f)
            verticalLineToRelative(-2.3f)
            horizontalLineToRelative(-2f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineTo(9.5f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(2.3f)
            curveToRelative(0f, 1.07f, -1.29f, 1.6f, -2.05f, 0.85f)
            lineTo(0.35f, 6.35f)
            curveToRelative(-0.47f, -0.47f, -0.47f, -1.23f, 0f, -1.7f)
            lineTo(3.95f, 0.85f)
            curveToRelative(0.76f, -0.76f, 2.05f, -0.22f, 2.05f, 0.85f)
            verticalLineToRelative(2.3f)
            horizontalLineToRelative(2f)
            curveToRelative(1.58f, 0f, 3.0f, 0.67f, 4f, 1.74f)
            curveToRelative(1.0f, -1.07f, 2.42f, -1.74f, 4f, -1.74f)
            horizontalLineToRelative(2f)
            verticalLineTo(1.7f)
            curveToRelative(0f, -1.07f, 1.29f, -1.6f, 2.05f, -0.85f)
            lineToRelative(3.6f, 3.8f)
            curveToRelative(0.47f, 0.47f, 0.47f, 1.23f, 0f, 1.7f)
            close()
        }
    }.also { _ArrowsSplitRightAndLeft = it }
