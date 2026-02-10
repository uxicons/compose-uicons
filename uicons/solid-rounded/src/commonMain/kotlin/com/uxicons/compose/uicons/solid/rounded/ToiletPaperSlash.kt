package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ToiletPaperSlash: ImageVector? = null

val Icons.Sr.ToiletPaperSlash: ImageVector
    get() = _ToiletPaperSlash ?: UXIcon(name = "ToiletPaperSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.71f, 22.29f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineTo(0.29f, 1.71f)
                curveTo(-0.1f, 1.32f, -0.1f, 0.68f, 0.29f, 0.29f)
                reflectiveCurveTo(1.32f, -0.1f, 1.71f, 0.29f)
                lineToRelative(2.42f, 2.42f)
                curveToRelative(0.91f, -1.67f, 2.3f, -2.71f, 3.88f, -2.71f)
                horizontalLineToRelative(9.87f)
                curveToRelative(-1.27f, 2.01f, -1.87f, 5.26f, -1.87f, 8.5f)
                verticalLineToRelative(6.09f)
                lineToRelative(7.71f, 7.71f)
                close()
                moveTo(18f, 8.5f)
                curveToRelative(0f, -4.69f, 1.34f, -8.5f, 3f, -8.5f)
                reflectiveCurveToRelative(3f, 3.81f, 3f, 8.5f)
                reflectiveCurveToRelative(-1.34f, 8.5f, -3f, 8.5f)
                reflectiveCurveToRelative(-3f, -3.81f, -3f, -8.5f)
                close()
                moveTo(20f, 8.5f)
                curveToRelative(0f, 1.66f, 0.45f, 3f, 1f, 3f)
                reflectiveCurveToRelative(1f, -1.34f, 1f, -3f)
                reflectiveCurveToRelative(-0.45f, -3f, -1f, -3f)
                reflectiveCurveToRelative(-1f, 1.34f, -1f, 3f)
                close()
                moveTo(4.72f, 8.94f)
                curveToRelative(-0.63f, -0.63f, -1.72f, -0.19f, -1.72f, 0.71f)
                curveToRelative(0f, 3.18f, 0f, 8.35f, 0f, 8.35f)
                curveToRelative(0f, 1.23f, -0.74f, 2.33f, -1.89f, 2.79f)
                curveToRelative(-0.68f, 0.27f, -1.11f, 0.88f, -1.11f, 1.56f)
                curveToRelative(0f, 0.91f, 0.74f, 1.65f, 1.65f, 1.65f)
                horizontalLineToRelative(9.35f)
                curveToRelative(2.03f, 0f, 3.79f, -1.22f, 4.57f, -2.97f)
                curveToRelative(0.23f, -0.53f, 0.09f, -1.15f, -0.32f, -1.56f)
                lineTo(4.72f, 8.94f)
                close()
            }
        }.also { _ToiletPaperSlash = it}
