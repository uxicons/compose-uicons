package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimesHexagon: ImageVector? = null

val Icons.Sc.TimesHexagon: ImageVector
    get() = _TimesHexagon ?: UXIcon(name = "TimesHexagon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.98f, 11.69f)
                curveToRelative(-1.21f, -3.63f, -2.91f, -6.69f, -5.22f, -9.34f)
                curveToRelative(-0.15f, -0.17f, -0.34f, -0.28f, -0.56f, -0.32f)
                curveToRelative(-0.11f, -0.02f, -2.63f, -0.52f, -5.2f, -0.52f)
                reflectiveCurveToRelative(-5.09f, 0.5f, -5.2f, 0.52f)
                curveToRelative(-0.22f, 0.04f, -0.41f, 0.16f, -0.56f, 0.32f)
                curveToRelative(-2.31f, 2.65f, -4.01f, 5.71f, -5.22f, 9.34f)
                curveToRelative(-0.07f, 0.2f, -0.07f, 0.42f, 0f, 0.63f)
                curveToRelative(1.21f, 3.63f, 2.91f, 6.69f, 5.22f, 9.34f)
                curveToRelative(0.15f, 0.17f, 0.34f, 0.28f, 0.56f, 0.32f)
                curveToRelative(0.11f, 0.02f, 2.63f, 0.52f, 5.2f, 0.52f)
                reflectiveCurveToRelative(5.09f, -0.5f, 5.2f, -0.52f)
                curveToRelative(0.22f, -0.04f, 0.41f, -0.16f, 0.56f, -0.32f)
                curveToRelative(2.31f, -2.65f, 4.01f, -5.71f, 5.22f, -9.34f)
                curveToRelative(0.07f, -0.2f, 0.07f, -0.42f, 0f, -0.63f)
                close()
                moveTo(15.71f, 9.71f)
                lineTo(13.41f, 12f)
                lineTo(15.71f, 14.29f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                reflectiveCurveToRelative(-1.02f, 0.39f, -1.41f, 0f)
                lineToRelative(-2.29f, -2.29f)
                lineToRelative(-2.29f, 2.29f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                reflectiveCurveToRelative(-0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(2.29f, -2.29f)
                lineToRelative(-2.29f, -2.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(2.29f, 2.29f)
                lineToRelative(2.29f, -2.29f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
                close()
            }
        }.also { _TimesHexagon = it}
