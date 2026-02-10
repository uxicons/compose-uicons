package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ToiletPaperBlank: ImageVector? = null

val Icons.Ss.ToiletPaperBlank: ImageVector
    get() = _ToiletPaperBlank ?: UXIcon(name = "ToiletPaperBlank") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                curveToRelative(-1.66f, 0f, -3f, 3.81f, -3f, 8.5f)
                reflectiveCurveToRelative(1.34f, 8.5f, 3f, 8.5f)
                reflectiveCurveToRelative(3f, -3.81f, 3f, -8.5f)
                reflectiveCurveTo(22.66f, 0f, 21f, 0f)
                close()
                moveTo(21f, 10.5f)
                curveToRelative(-0.55f, 0f, -1f, -0.9f, -1f, -2f)
                reflectiveCurveToRelative(0.45f, -2f, 1f, -2f)
                reflectiveCurveToRelative(1f, 0.9f, 1f, 2f)
                reflectiveCurveToRelative(-0.45f, 2f, -1f, 2f)
                close()
                moveTo(16f, 20f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                lineTo(0f, 24f)
                verticalLineToRelative(-2f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                lineTo(2f, 7.5f)
                curveTo(2f, 3.29f, 4.2f, 0f, 7f, 0f)
                horizontalLineToRelative(10.87f)
                curveToRelative(-1.27f, 2.01f, -1.87f, 5.26f, -1.87f, 8.5f)
                verticalLineToRelative(11.5f)
                close()
            }
        }.also { _ToiletPaperBlank = it}
