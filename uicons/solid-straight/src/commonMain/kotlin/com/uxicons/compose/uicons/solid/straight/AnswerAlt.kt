package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AnswerAlt: ImageVector? = null

val Icons.Ss.AnswerAlt: ImageVector
    get() = _AnswerAlt ?: UXIcon(name = "AnswerAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(6.92f)
                lineToRelative(3.75f, 3.16f)
                curveToRelative(0.38f, 0.34f, 0.86f, 0.51f, 1.34f, 0.51f)
                curveToRelative(0.47f, 0f, 0.93f, -0.16f, 1.29f, -0.48f)
                lineToRelative(3.85f, -3.18f)
                horizontalLineToRelative(6.85f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(9.45f, 16f)
                lineToRelative(-0.71f, -3f)
                horizontalLineToRelative(-3.48f)
                lineToRelative(-0.71f, 3f)
                horizontalLineToRelative(-2.05f)
                lineToRelative(2.44f, -10.36f)
                curveToRelative(0.29f, -1.24f, 1.62f, -2.01f, 2.94f, -1.46f)
                curveToRelative(0.63f, 0.26f, 1.05f, 0.87f, 1.2f, 1.53f)
                lineToRelative(2.42f, 10.29f)
                horizontalLineToRelative(-2.05f)
                close()
                moveTo(19f, 15f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                close()
                moveTo(21f, 11f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                close()
                moveTo(21f, 7f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                close()
                moveTo(7.11f, 6.09f)
                lineToRelative(1.16f, 4.91f)
                horizontalLineToRelative(-2.54f)
                lineToRelative(1.16f, -4.91f)
                curveToRelative(0.01f, -0.05f, 0.06f, -0.09f, 0.11f, -0.09f)
                reflectiveCurveToRelative(0.1f, 0.04f, 0.11f, 0.09f)
                close()
            }
        }.also { _AnswerAlt = it}
