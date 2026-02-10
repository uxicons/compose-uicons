package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EyeArrowProgress: ImageVector? = null

val Icons.Rr.EyeArrowProgress: ImageVector
    get() = _EyeArrowProgress ?: UXIcon(name = "EyeArrowProgress") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 12f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
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
                close()
                moveTo(23.27f, 14.49f)
                curveToRelative(-1.55f, 2.43f, -5.08f, 6.51f, -11.27f, 6.51f)
                reflectiveCurveTo(2.28f, 16.92f, 0.73f, 14.48f)
                curveToRelative(-0.98f, -1.53f, -0.98f, -3.44f, 0f, -4.97f)
                curveTo(2.28f, 7.08f, 5.81f, 3f, 12f, 3f)
                reflectiveCurveToRelative(9.72f, 4.08f, 11.27f, 6.51f)
                curveToRelative(0.98f, 1.53f, 0.98f, 3.44f, 0f, 4.97f)
                close()
                moveTo(21.58f, 10.59f)
                curveToRelative(-1.33f, -2.09f, -4.35f, -5.59f, -9.59f, -5.59f)
                reflectiveCurveTo(3.75f, 8.5f, 2.41f, 10.59f)
                curveToRelative(-0.55f, 0.87f, -0.55f, 1.95f, 0f, 2.82f)
                curveToRelative(1.33f, 2.09f, 4.35f, 5.59f, 9.59f, 5.59f)
                reflectiveCurveToRelative(8.25f, -3.5f, 9.59f, -5.59f)
                curveToRelative(0.55f, -0.87f, 0.55f, -1.95f, 0f, -2.82f)
                close()
            }
        }.also { _EyeArrowProgress = it}
