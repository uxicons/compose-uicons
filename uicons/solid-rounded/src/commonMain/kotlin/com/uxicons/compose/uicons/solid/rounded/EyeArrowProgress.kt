package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EyeArrowProgress: ImageVector? = null

val Icons.Sr.EyeArrowProgress: ImageVector
    get() = _EyeArrowProgress ?: UXIcon(name = "EyeArrowProgress") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.27f, 9.51f)
                curveToRelative(-1.55f, -2.43f, -5.08f, -6.51f, -11.27f, -6.51f)
                reflectiveCurveTo(2.28f, 7.08f, 0.73f, 9.52f)
                curveToRelative(-0.98f, 1.53f, -0.98f, 3.44f, 0f, 4.97f)
                curveToRelative(1.55f, 2.43f, 5.08f, 6.51f, 11.27f, 6.51f)
                reflectiveCurveToRelative(9.72f, -4.08f, 11.27f, -6.51f)
                curveToRelative(0.98f, -1.53f, 0.98f, -3.44f, 0f, -4.97f)
                close()
                moveTo(12f, 17f)
                curveToRelative(-1.66f, 0f, -3.12f, -0.82f, -4.03f, -2.06f)
                lineToRelative(1.53f, -1.53f)
                lineToRelative(0.79f, 0.79f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                lineToRelative(1.56f, -1.56f)
                lineToRelative(0.66f, 0.66f)
                curveToRelative(0.4f, 0.4f, 1.07f, 0.12f, 1.07f, -0.44f)
                verticalLineToRelative(-2.76f)
                curveToRelative(0f, -0.34f, -0.27f, -0.61f, -0.61f, -0.61f)
                horizontalLineToRelative(-2.76f)
                curveToRelative(-0.56f, 0f, -0.84f, 0.68f, -0.44f, 1.07f)
                lineToRelative(0.66f, 0.66f)
                lineToRelative(-0.85f, 0.85f)
                lineToRelative(-0.79f, -0.79f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-1.69f, 1.69f)
                curveToRelative(-0.06f, -0.32f, -0.1f, -0.65f, -0.1f, -0.99f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
            }
        }.also { _EyeArrowProgress = it}
