package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EyeArrowProgress: ImageVector? = null

val Icons.Rs.EyeArrowProgress: ImageVector
    get() = _EyeArrowProgress ?: UXIcon(name = "EyeArrowProgress") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.69f, 11.65f)
                curveToRelative(-0.13f, -0.35f, -3.29f, -8.65f, -11.69f, -8.65f)
                curveTo(3.32f, 3.15f, 0.46f, 11.31f, 0.18f, 12.0f)
                curveToRelative(0.28f, 0.69f, 3.12f, 8.85f, 11.81f, 9.0f)
                curveToRelative(8.68f, -0.15f, 11.54f, -8.3f, 11.81f, -9f)
                lineToRelative(-0.13f, -0.35f)
                close()
                moveTo(12f, 19f)
                curveToRelative(-6.23f, 0f, -9.04f, -5.53f, -9.67f, -7.0f)
                curveToRelative(0.64f, -1.47f, 3.45f, -7.0f, 9.67f, -7.0f)
                reflectiveCurveToRelative(9.03f, 5.53f, 9.67f, 7f)
                curveToRelative(-0.64f, 1.47f, -3.45f, 7f, -9.67f, 7f)
                close()
                moveTo(17f, 12f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                curveToRelative(-1.67f, 0f, -3.14f, -0.83f, -4.05f, -2.08f)
                lineToRelative(1.5f, -1.5f)
                lineToRelative(1.5f, 1.5f)
                lineToRelative(2.71f, -2.71f)
                lineToRelative(1.29f, 1.29f)
                verticalLineToRelative(-3.43f)
                curveToRelative(0f, -0.32f, -0.26f, -0.57f, -0.57f, -0.57f)
                horizontalLineToRelative(-3.43f)
                lineToRelative(1.29f, 1.29f)
                lineToRelative(-1.29f, 1.29f)
                lineToRelative(-1.5f, -1.5f)
                lineToRelative(-2.36f, 2.36f)
                curveToRelative(-0.06f, -0.31f, -0.1f, -0.62f, -0.1f, -0.95f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                close()
            }
        }.also { _EyeArrowProgress = it}
