package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EyeArrowProgress: ImageVector? = null

val Icons.Bs.EyeArrowProgress: ImageVector
    get() = _EyeArrowProgress ?: UXIcon(name = "EyeArrowProgress") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 21.06f)
                curveTo(3.05f, 20.82f, 0.41f, 12.92f, 0f, 12f)
                curveTo(0.4f, 11.09f, 3.06f, 3.18f, 12f, 2.94f)
                curveToRelative(8.95f, 0.24f, 11.59f, 8.14f, 12.0f, 9.06f)
                curveToRelative(-0.4f, 0.91f, -3.06f, 8.82f, -12.0f, 9.06f)
                close()
                moveTo(3.23f, 12f)
                curveToRelative(0.74f, 1.57f, 3.34f, 6.06f, 8.77f, 6.06f)
                reflectiveCurveToRelative(8.02f, -4.49f, 8.77f, -6.06f)
                curveToRelative(-0.74f, -1.57f, -3.34f, -6.06f, -8.77f, -6.06f)
                reflectiveCurveTo(3.98f, 10.43f, 3.23f, 12f)
                close()
                moveTo(12f, 7f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                curveToRelative(0f, 0.33f, 0.04f, 0.64f, 0.1f, 0.95f)
                lineToRelative(2.36f, -2.36f)
                lineToRelative(1.5f, 1.5f)
                lineToRelative(1.29f, -1.29f)
                lineToRelative(-1.29f, -1.29f)
                horizontalLineToRelative(3.43f)
                curveToRelative(0.32f, 0f, 0.57f, 0.26f, 0.57f, 0.57f)
                verticalLineToRelative(3.43f)
                lineToRelative(-1.29f, -1.29f)
                lineToRelative(-2.71f, 2.71f)
                lineToRelative(-1.5f, -1.5f)
                lineToRelative(-1.5f, 1.5f)
                curveToRelative(0.91f, 1.26f, 2.38f, 2.08f, 4.05f, 2.08f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                reflectiveCurveToRelative(-2.24f, -5f, -5f, -5f)
                close()
            }
        }.also { _EyeArrowProgress = it}
