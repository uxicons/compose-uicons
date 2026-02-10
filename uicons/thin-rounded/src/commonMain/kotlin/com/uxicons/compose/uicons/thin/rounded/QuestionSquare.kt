package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _QuestionSquare: ImageVector? = null

val Icons.Tr.QuestionSquare: ImageVector
    get() = _QuestionSquare ?: UXIcon(name = "QuestionSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 18f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(24f, 19.5f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                lineTo(4.5f, 0f)
                curveTo(2.02f, 0f, 0f, 2.02f, 0f, 4.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                close()
                moveTo(19.5f, 1f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(4.5f, 23f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(1f, 4.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(15f)
                close()
                moveTo(12.5f, 15.5f)
                verticalLineToRelative(-0.65f)
                curveToRelative(0f, -0.89f, 0.61f, -1.9f, 1.43f, -2.35f)
                curveToRelative(1.5f, -0.83f, 2.31f, -2.52f, 2.01f, -4.23f)
                curveToRelative(-0.28f, -1.61f, -1.6f, -2.93f, -3.22f, -3.22f)
                curveToRelative(-1.1f, -0.19f, -2.2f, 0.06f, -3.1f, 0.71f)
                curveToRelative(-0.88f, 0.64f, -1.46f, 1.6f, -1.61f, 2.66f)
                curveToRelative(-0.04f, 0.27f, 0.15f, 0.53f, 0.42f, 0.57f)
                curveToRelative(0.28f, 0.04f, 0.53f, -0.15f, 0.57f, -0.42f)
                curveToRelative(0.11f, -0.79f, 0.55f, -1.51f, 1.21f, -1.99f)
                curveToRelative(0.68f, -0.49f, 1.51f, -0.68f, 2.34f, -0.53f)
                curveToRelative(1.2f, 0.21f, 2.19f, 1.2f, 2.4f, 2.4f)
                curveToRelative(0.23f, 1.3f, -0.36f, 2.55f, -1.51f, 3.18f)
                curveToRelative(-1.15f, 0.63f, -1.95f, 1.96f, -1.95f, 3.22f)
                verticalLineToRelative(0.65f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                close()
            }
        }.also { _QuestionSquare = it}
