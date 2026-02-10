package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SecondMedal: ImageVector? = null

val Icons.Ss.SecondMedal: ImageVector
    get() = _SecondMedal ?: UXIcon(name = "SecondMedal") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.45f, 6.91f)
                curveToRelative(-1.73f, -1.59f, -3.97f, -2.64f, -6.45f, -2.87f)
                lineTo(15f, 0f)
                horizontalLineToRelative(7.87f)
                lineToRelative(-3.42f, 6.91f)
                close()
                moveTo(21f, 15f)
                curveToRelative(0f, 4.96f, -4.04f, 9f, -9f, 9f)
                reflectiveCurveTo(3f, 19.96f, 3f, 15f)
                reflectiveCurveTo(7.04f, 6f, 12f, 6f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                close()
                moveTo(11.93f, 17f)
                curveToRelative(0.13f, -0.09f, 0.27f, -0.18f, 0.41f, -0.27f)
                curveToRelative(1.12f, -0.74f, 2.66f, -1.76f, 2.66f, -3.73f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                curveToRelative(0f, 0.83f, -0.67f, 1.33f, -1.77f, 2.06f)
                curveToRelative(-1.05f, 0.69f, -2.23f, 1.48f, -2.23f, 2.94f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3.07f)
                close()
                moveTo(11.0f, 4.05f)
                lineToRelative(-2.0f, -4.05f)
                lineTo(1.03f, -0f)
                lineToRelative(3.45f, 6.99f)
                curveToRelative(1.74f, -1.64f, 4.01f, -2.71f, 6.52f, -2.94f)
                close()
            }
        }.also { _SecondMedal = it}
