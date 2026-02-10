package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _QuestionSquare: ImageVector? = null

val Icons.Rr.QuestionSquare: ImageVector
    get() = _QuestionSquare ?: UXIcon(name = "QuestionSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 16f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(13f, 14f)
                curveToRelative(0f, -0.56f, 0.41f, -1.23f, 0.93f, -1.51f)
                curveToRelative(1.5f, -0.83f, 2.31f, -2.52f, 2.01f, -4.22f)
                curveToRelative(-0.28f, -1.61f, -1.61f, -2.94f, -3.22f, -3.22f)
                curveToRelative(-1.18f, -0.2f, -2.38f, 0.11f, -3.29f, 0.87f)
                curveToRelative(-0.91f, 0.76f, -1.43f, 1.88f, -1.43f, 3.06f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -0.59f, 0.26f, -1.15f, 0.71f, -1.53f)
                curveToRelative(0.46f, -0.39f, 1.05f, -0.54f, 1.66f, -0.43f)
                curveToRelative(0.79f, 0.14f, 1.46f, 0.81f, 1.6f, 1.6f)
                curveToRelative(0.15f, 0.87f, -0.24f, 1.7f, -1.0f, 2.12f)
                curveToRelative(-1.16f, 0.64f, -1.96f, 1.98f, -1.96f, 3.26f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                close()
                moveTo(24f, 19f)
                lineTo(24f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                lineTo(5f, 0f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                close()
                moveTo(19f, 2f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(5f, 22f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(2f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(14f)
                close()
            }
        }.also { _QuestionSquare = it}
