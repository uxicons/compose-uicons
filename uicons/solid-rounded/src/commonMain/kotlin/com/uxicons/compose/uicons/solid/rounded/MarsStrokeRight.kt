package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MarsStrokeRight: ImageVector? = null

val Icons.Sr.MarsStrokeRight: ImageVector
    get() = _MarsStrokeRight ?: UXIcon(name = "MarsStrokeRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.14f, 9.9f)
                lineToRelative(-2.41f, -2.59f)
                curveToRelative(-0.38f, -0.4f, -1.01f, -0.42f, -1.41f, -0.05f)
                curveToRelative(-0.4f, 0.38f, -0.42f, 1.01f, -0.05f, 1.41f)
                lineToRelative(2.16f, 2.32f)
                horizontalLineToRelative(-4.43f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1.08f)
                curveToRelative(-0.49f, -3.39f, -3.4f, -6f, -6.92f, -6f)
                curveTo(3.14f, 5f, 0f, 8.14f, 0f, 12f)
                reflectiveCurveToRelative(3.14f, 7f, 7f, 7f)
                curveToRelative(3.52f, 0f, 6.43f, -2.61f, 6.92f, -6f)
                horizontalLineToRelative(1.08f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4.43f)
                lineToRelative(-2.16f, 2.32f)
                curveToRelative(-0.38f, 0.4f, -0.35f, 1.04f, 0.05f, 1.41f)
                curveToRelative(0.19f, 0.18f, 0.44f, 0.27f, 0.68f, 0.27f)
                curveToRelative(0.27f, 0f, 0.53f, -0.11f, 0.73f, -0.32f)
                lineToRelative(2.39f, -2.56f)
                curveToRelative(0.57f, -0.57f, 0.88f, -1.32f, 0.88f, -2.12f)
                reflectiveCurveToRelative(-0.31f, -1.55f, -0.85f, -2.1f)
                close()
            }
        }.also { _MarsStrokeRight = it}
