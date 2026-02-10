package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _QuestionSquare: ImageVector? = null

val Icons.Br.QuestionSquare: ImageVector
    get() = _QuestionSquare ?: UXIcon(name = "QuestionSquare") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.94f, 8.29f)
            curveToRelative(0.3f, 1.7f, -0.51f, 3.39f, -2.01f, 4.22f)
            curveToRelative(0f, 0f, -0.41f, 0.22f, -0.47f, 0.24f)
            curveToRelative(-0.16f, 0.68f, -0.76f, 1.25f, -1.46f, 1.25f)
            curveToRelative(-0.81f, -0.02f, -1.5f, -0.69f, -1.5f, -1.5f)
            curveToRelative(0f, -1.58f, 1.13f, -2.18f, 1.74f, -2.49f)
            lineToRelative(0.24f, -0.13f)
            curveToRelative(0.29f, -0.16f, 0.6f, -0.54f, 0.5f, -1.07f)
            curveToRelative(-0.07f, -0.38f, -0.41f, -0.72f, -0.79f, -0.79f)
            curveToRelative(-0.61f, -0.11f, -1.13f, 0.32f, -1.22f, 0.78f)
            curveToRelative(-0.17f, 0.81f, -0.96f, 1.33f, -1.77f, 1.17f)
            curveToRelative(-0.81f, -0.17f, -1.34f, -0.96f, -1.17f, -1.77f)
            curveToRelative(0.43f, -2.11f, 2.53f, -3.52f, 4.68f, -3.14f)
            curveToRelative(1.61f, 0.28f, 2.94f, 1.61f, 3.23f, 3.23f)
            close()
            moveTo(12f, 16f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(24f, 5.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            lineTo(5.5f, 24f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            lineTo(0f, 5.5f)
            curveTo(0f, 2.47f, 2.47f, 0f, 5.5f, 0f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            close()
            moveTo(21f, 5.5f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            lineTo(5.5f, 3f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            lineTo(21f, 5.5f)
            close()
        }
    }.also { _QuestionSquare = it }
