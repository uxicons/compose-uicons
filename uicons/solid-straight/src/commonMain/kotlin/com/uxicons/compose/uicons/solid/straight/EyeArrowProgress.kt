package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EyeArrowProgress: ImageVector? = null

val Icons.Ss.EyeArrowProgress: ImageVector
    get() = _EyeArrowProgress ?: UXIcon(name = "EyeArrowProgress") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.82f, 11.18f)
                curveToRelative(-0.88f, -1.92f, -4.32f, -8.18f, -11.82f, -8.18f)
                reflectiveCurveTo(1.06f, 9.26f, 0.18f, 11.18f)
                curveToRelative(-0.24f, 0.52f, -0.24f, 1.12f, 0f, 1.64f)
                curveToRelative(0.88f, 1.92f, 4.32f, 8.18f, 11.82f, 8.18f)
                reflectiveCurveToRelative(10.94f, -6.26f, 11.82f, -8.18f)
                curveToRelative(0.24f, -0.52f, 0.24f, -1.12f, 0f, -1.64f)
                close()
                moveTo(12f, 17f)
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
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
            }
        }.also { _EyeArrowProgress = it}
