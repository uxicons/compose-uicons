package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EyeArrowProgress: ImageVector? = null

val Icons.Tr.EyeArrowProgress: ImageVector
    get() = _EyeArrowProgress ?: UXIcon(name = "EyeArrowProgress") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 6f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(12f, 17f)
                curveToRelative(-1.84f, 0f, -3.43f, -1.01f, -4.3f, -2.49f)
                lineToRelative(1.82f, -1.78f)
                lineToRelative(0.74f, 0.74f)
                curveToRelative(0.39f, 0.39f, 1.07f, 0.39f, 1.46f, 0f)
                lineToRelative(2.27f, -2.27f)
                verticalLineToRelative(1.79f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(1.79f)
                lineToRelative(-2.31f, 2.27f)
                lineToRelative(-0.74f, -0.74f)
                curveToRelative(-0.4f, -0.4f, -1.06f, -0.4f, -1.46f, 0f)
                lineToRelative(-1.5f, 1.5f)
                curveToRelative(-0.16f, -0.48f, -0.26f, -0.99f, -0.26f, -1.53f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
                moveTo(23.27f, 9.51f)
                curveToRelative(-1.55f, -2.43f, -5.08f, -6.51f, -11.27f, -6.51f)
                reflectiveCurveTo(2.28f, 7.08f, 0.73f, 9.52f)
                curveToRelative(-0.98f, 1.53f, -0.98f, 3.44f, 0f, 4.97f)
                curveToRelative(1.55f, 2.43f, 5.08f, 6.51f, 11.27f, 6.51f)
                reflectiveCurveToRelative(9.72f, -4.08f, 11.27f, -6.51f)
                curveToRelative(0.98f, -1.53f, 0.98f, -3.44f, 0f, -4.97f)
                close()
                moveTo(22.43f, 13.95f)
                curveToRelative(-1.44f, 2.26f, -4.71f, 6.05f, -10.43f, 6.05f)
                reflectiveCurveTo(3.01f, 16.21f, 1.57f, 13.95f)
                curveToRelative(-0.77f, -1.2f, -0.77f, -2.69f, 0f, -3.9f)
                curveToRelative(1.44f, -2.26f, 4.71f, -6.05f, 10.43f, -6.05f)
                reflectiveCurveToRelative(8.99f, 3.79f, 10.43f, 6.05f)
                curveToRelative(0.77f, 1.2f, 0.77f, 2.7f, 0f, 3.9f)
                close()
            }
        }.also { _EyeArrowProgress = it}
