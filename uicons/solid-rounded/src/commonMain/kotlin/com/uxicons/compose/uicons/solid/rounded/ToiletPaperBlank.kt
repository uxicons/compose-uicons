package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ToiletPaperBlank: ImageVector? = null

val Icons.Sr.ToiletPaperBlank: ImageVector
    get() = _ToiletPaperBlank ?: UXIcon(name = "ToiletPaperBlank") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 0f)
                horizontalLineToRelative(9.87f)
                curveToRelative(-1.27f, 2.01f, -1.87f, 5.26f, -1.87f, 8.5f)
                verticalLineToRelative(10.5f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(1.65f, 24f)
                curveToRelative(-0.91f, 0f, -1.65f, -0.74f, -1.65f, -1.65f)
                curveToRelative(0f, -0.68f, 0.44f, -1.29f, 1.11f, -1.56f)
                curveToRelative(1.15f, -0.46f, 1.89f, -1.55f, 1.89f, -2.79f)
                lineTo(3f, 7.5f)
                curveTo(3f, 3.29f, 5.2f, 0f, 8f, 0f)
                close()
                moveTo(24f, 8.5f)
                curveToRelative(0f, 4.69f, -1.34f, 8.5f, -3f, 8.5f)
                reflectiveCurveToRelative(-3f, -3.81f, -3f, -8.5f)
                reflectiveCurveTo(19.34f, 0f, 21f, 0f)
                reflectiveCurveToRelative(3f, 3.81f, 3f, 8.5f)
                close()
                moveTo(22f, 8.5f)
                curveToRelative(0f, -1.1f, -0.45f, -2f, -1f, -2f)
                reflectiveCurveToRelative(-1f, 0.9f, -1f, 2f)
                reflectiveCurveToRelative(0.45f, 2f, 1f, 2f)
                reflectiveCurveToRelative(1f, -0.9f, 1f, -2f)
                close()
            }
        }.also { _ToiletPaperBlank = it}
