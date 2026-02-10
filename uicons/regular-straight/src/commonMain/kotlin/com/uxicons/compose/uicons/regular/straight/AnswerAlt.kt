package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AnswerAlt: ImageVector? = null

val Icons.Rs.AnswerAlt: ImageVector
    get() = _AnswerAlt ?: UXIcon(name = "AnswerAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 13f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                close()
                moveTo(10.08f, 5.71f)
                lineToRelative(2.42f, 10.29f)
                horizontalLineToRelative(-2.05f)
                lineToRelative(-0.71f, -3f)
                horizontalLineToRelative(-3.48f)
                lineToRelative(-0.71f, 3f)
                horizontalLineToRelative(-2.05f)
                lineToRelative(2.44f, -10.36f)
                curveToRelative(0.29f, -1.24f, 1.62f, -2.01f, 2.94f, -1.46f)
                curveToRelative(0.63f, 0.26f, 1.05f, 0.87f, 1.2f, 1.53f)
                close()
                moveTo(9.27f, 11f)
                lineToRelative(-1.16f, -4.91f)
                curveToRelative(-0.01f, -0.05f, -0.06f, -0.09f, -0.11f, -0.09f)
                reflectiveCurveToRelative(-0.1f, 0.04f, -0.11f, 0.09f)
                lineToRelative(-1.16f, 4.91f)
                horizontalLineToRelative(2.54f)
                close()
                moveTo(24f, 3f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(-6.85f)
                lineToRelative(-3.85f, 3.18f)
                curveToRelative(-0.36f, 0.32f, -0.82f, 0.48f, -1.29f, 0.48f)
                curveToRelative(-0.48f, 0f, -0.96f, -0.17f, -1.34f, -0.51f)
                lineToRelative(-3.75f, -3.16f)
                lineTo(0f, 20f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                horizontalLineToRelative(18f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(22f, 3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(3f, 2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(5.65f)
                lineToRelative(4.33f, 3.65f)
                lineToRelative(4.45f, -3.65f)
                horizontalLineToRelative(5.57f)
                lineTo(22f, 3f)
                close()
                moveTo(14f, 11f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                close()
                moveTo(14f, 7f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _AnswerAlt = it}
