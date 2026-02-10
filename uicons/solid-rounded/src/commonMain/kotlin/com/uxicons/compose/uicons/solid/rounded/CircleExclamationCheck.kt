package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleExclamationCheck: ImageVector? = null

val Icons.Sr.CircleExclamationCheck: ImageVector
    get() = _CircleExclamationCheck ?: UXIcon(name = "CircleExclamationCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.0f, 15f)
                curveToRelative(-0.8f, 0f, -1.61f, -0.31f, -2.22f, -0.92f)
                lineToRelative(-1.46f, -1.35f)
                curveToRelative(-0.41f, -0.37f, -0.43f, -1.01f, -0.06f, -1.41f)
                curveToRelative(0.38f, -0.41f, 1.01f, -0.43f, 1.41f, -0.06f)
                lineToRelative(1.49f, 1.38f)
                curveToRelative(0.47f, 0.47f, 1.19f, 0.47f, 1.63f, 0.03f)
                lineToRelative(3.5f, -3.39f)
                curveToRelative(0.4f, -0.38f, 1.03f, -0.37f, 1.41f, 0.02f)
                curveToRelative(0.38f, 0.4f, 0.37f, 1.03f, -0.02f, 1.41f)
                lineToRelative(-3.49f, 3.38f)
                curveToRelative(-0.6f, 0.6f, -1.4f, 0.91f, -2.2f, 0.91f)
                close()
                moveTo(16.61f, 16.79f)
                curveToRelative(-1.59f, 2.53f, -4.4f, 4.21f, -7.61f, 4.21f)
                curveTo(4.03f, 21f, 0f, 16.97f, 0f, 12f)
                reflectiveCurveTo(4.03f, 3f, 9f, 3f)
                curveToRelative(4.48f, 0f, 8.19f, 3.28f, 8.88f, 7.57f)
                lineToRelative(-0.85f, -0.78f)
                curveToRelative(-1.22f, -1.11f, -3.11f, -1.03f, -4.24f, 0.18f)
                curveToRelative(-0.54f, 0.59f, -0.82f, 1.35f, -0.79f, 2.15f)
                curveToRelative(0.03f, 0.8f, 0.38f, 1.54f, 0.96f, 2.08f)
                lineToRelative(1.4f, 1.29f)
                curveToRelative(0.63f, 0.63f, 1.41f, 1.05f, 2.24f, 1.29f)
                close()
                moveTo(8f, 12f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4f)
                close()
                moveTo(10.5f, 16.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }.also { _CircleExclamationCheck = it}
