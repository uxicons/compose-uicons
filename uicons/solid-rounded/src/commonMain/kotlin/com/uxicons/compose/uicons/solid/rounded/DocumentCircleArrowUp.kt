package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DocumentCircleArrowUp: ImageVector? = null

val Icons.Sr.DocumentCircleArrowUp: ImageVector
    get() = _DocumentCircleArrowUp ?: UXIcon(name = "DocumentCircleArrowUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 7f)
                lineTo(12f, 0.46f)
                curveToRelative(0.91f, 0.35f, 1.75f, 0.88f, 2.46f, 1.59f)
                lineToRelative(3.48f, 3.49f)
                curveToRelative(0.71f, 0.71f, 1.25f, 1.55f, 1.59f, 2.46f)
                horizontalLineToRelative(-6.54f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
                moveTo(18f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(20.93f, 17.46f)
                curveToRelative(-0.14f, 0.33f, -0.46f, 0.54f, -0.81f, 0.54f)
                horizontalLineToRelative(-1.12f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1.12f)
                curveToRelative(-0.35f, 0f, -0.68f, -0.21f, -0.81f, -0.54f)
                curveToRelative(-0.14f, -0.33f, -0.06f, -0.71f, 0.19f, -0.96f)
                lineToRelative(1.5f, -1.5f)
                curveToRelative(0.69f, -0.69f, 1.8f, -0.69f, 2.48f, 0f)
                lineToRelative(1.5f, 1.5f)
                curveToRelative(0.25f, 0.25f, 0.33f, 0.63f, 0.19f, 0.96f)
                close()
                moveTo(10f, 18f)
                curveToRelative(0f, -4.41f, 3.59f, -8f, 8f, -8f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(10f, 0.02f)
                curveToRelative(-0.16f, -0.01f, -0.32f, -0.02f, -0.48f, -0.02f)
                lineTo(5f, 0f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(7.73f)
                curveToRelative(-1.67f, -1.47f, -2.73f, -3.61f, -2.73f, -6f)
                close()
            }
        }.also { _DocumentCircleArrowUp = it}
