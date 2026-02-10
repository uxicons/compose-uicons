package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _QuestionSquare: ImageVector? = null

val Icons.Sr.QuestionSquare: ImageVector
    get() = _QuestionSquare ?: UXIcon(name = "QuestionSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 0f)
                lineTo(5f, 0f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(12f, 19f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(13.93f, 12.49f)
                curveToRelative(-0.52f, 0.29f, -0.93f, 0.95f, -0.93f, 1.51f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -1.28f, 0.81f, -2.63f, 1.96f, -3.26f)
                curveToRelative(0.76f, -0.42f, 1.16f, -1.25f, 1.0f, -2.12f)
                curveToRelative(-0.14f, -0.79f, -0.81f, -1.46f, -1.6f, -1.6f)
                curveToRelative(-0.61f, -0.11f, -1.2f, 0.05f, -1.66f, 0.43f)
                curveToRelative(-0.46f, 0.38f, -0.71f, 0.94f, -0.71f, 1.53f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -1.19f, 0.52f, -2.3f, 1.43f, -3.06f)
                curveToRelative(0.91f, -0.76f, 2.11f, -1.08f, 3.29f, -0.87f)
                curveToRelative(1.61f, 0.28f, 2.94f, 1.61f, 3.22f, 3.22f)
                curveToRelative(0.3f, 1.7f, -0.51f, 3.4f, -2.01f, 4.22f)
                close()
            }
        }.also { _QuestionSquare = it}
