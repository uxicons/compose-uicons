package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimesHexagon: ImageVector? = null

val Icons.Sr.TimesHexagon: ImageVector
    get() = _TimesHexagon ?: UXIcon(name = "TimesHexagon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.34f, 9.48f)
                lineToRelative(-3.5f, -6f)
                curveToRelative(-0.89f, -1.53f, -2.55f, -2.48f, -4.32f, -2.48f)
                horizontalLineToRelative(-7.07f)
                curveToRelative(-1.77f, 0f, -3.43f, 0.95f, -4.32f, 2.48f)
                lineTo(0.63f, 9.48f)
                curveToRelative(-0.91f, 1.55f, -0.91f, 3.48f, 0f, 5.04f)
                lineToRelative(3.5f, 6f)
                curveToRelative(0.89f, 1.53f, 2.55f, 2.48f, 4.32f, 2.48f)
                horizontalLineToRelative(7.07f)
                curveToRelative(1.77f, 0f, 3.43f, -0.95f, 4.32f, -2.48f)
                lineToRelative(3.5f, -6f)
                curveToRelative(0.91f, -1.55f, 0.91f, -3.48f, 0f, -5.04f)
                close()
                moveTo(15.71f, 14.29f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineToRelative(-2.29f, -2.29f)
                lineToRelative(-2.29f, 2.29f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(2.29f, -2.29f)
                lineToRelative(-2.29f, -2.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(2.29f, 2.29f)
                lineToRelative(2.29f, -2.29f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(-2.29f, 2.29f)
                lineToRelative(2.29f, 2.29f)
                close()
            }
        }.also { _TimesHexagon = it}
