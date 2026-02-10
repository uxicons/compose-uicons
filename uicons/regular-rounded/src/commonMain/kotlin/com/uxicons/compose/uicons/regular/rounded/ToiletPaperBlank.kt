package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ToiletPaperBlank: ImageVector? = null

val Icons.Rr.ToiletPaperBlank: ImageVector
    get() = _ToiletPaperBlank ?: UXIcon(name = "ToiletPaperBlank") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 0f)
                lineTo(8f, 0f)
                curveTo(5.2f, 0f, 3f, 3.29f, 3f, 7.5f)
                verticalLineToRelative(9.5f)
                curveToRelative(0f, 0.82f, -0.49f, 1.55f, -1.26f, 1.86f)
                curveToRelative(-1.06f, 0.42f, -1.74f, 1.4f, -1.74f, 2.49f)
                curveToRelative(0f, 1.46f, 1.19f, 2.65f, 2.65f, 2.65f)
                lineTo(11f, 24.0f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                curveToRelative(2.8f, 0f, 5f, -3.73f, 5f, -8.5f)
                reflectiveCurveTo(21.8f, 0f, 19f, 0f)
                close()
                moveTo(14f, 19f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(2.65f, 22f)
                curveToRelative(-0.36f, 0f, -0.65f, -0.29f, -0.65f, -0.65f)
                curveToRelative(0f, -0.32f, 0.25f, -0.54f, 0.48f, -0.63f)
                curveToRelative(1.53f, -0.61f, 2.52f, -2.07f, 2.52f, -3.72f)
                lineTo(5f, 7.5f)
                curveToRelative(0f, -3.24f, 1.58f, -5.5f, 3f, -5.5f)
                horizontalLineToRelative(7.75f)
                curveToRelative(-1.07f, 1.55f, -1.75f, 3.87f, -1.75f, 6.5f)
                verticalLineToRelative(10.5f)
                close()
                moveTo(19f, 15f)
                curveToRelative(-1.42f, 0f, -3f, -2.67f, -3f, -6.5f)
                reflectiveCurveToRelative(1.58f, -6.5f, 3f, -6.5f)
                reflectiveCurveToRelative(3f, 2.67f, 3f, 6.5f)
                reflectiveCurveToRelative(-1.58f, 6.5f, -3f, 6.5f)
                close()
                moveTo(20f, 8.5f)
                curveToRelative(0f, 0.83f, -0.45f, 1.5f, -1f, 1.5f)
                reflectiveCurveToRelative(-1f, -0.67f, -1f, -1.5f)
                reflectiveCurveToRelative(0.45f, -1.5f, 1f, -1.5f)
                reflectiveCurveToRelative(1f, 0.67f, 1f, 1.5f)
                close()
            }
        }.also { _ToiletPaperBlank = it}
