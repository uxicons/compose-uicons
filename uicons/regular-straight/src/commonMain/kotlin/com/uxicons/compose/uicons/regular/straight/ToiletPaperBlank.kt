package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ToiletPaperBlank: ImageVector? = null

val Icons.Rs.ToiletPaperBlank: ImageVector
    get() = _ToiletPaperBlank ?: UXIcon(name = "ToiletPaperBlank") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 0f)
                lineTo(7f, 0f)
                curveTo(4.2f, 0f, 2f, 3.29f, 2f, 7.5f)
                verticalLineToRelative(12.5f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                verticalLineToRelative(2f)
                lineTo(12f, 24f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                curveToRelative(2.8f, 0f, 5f, -3.73f, 5f, -8.5f)
                reflectiveCurveTo(21.8f, 0f, 19f, 0f)
                close()
                moveTo(14f, 20f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                lineTo(3.46f, 22f)
                curveToRelative(0.34f, -0.59f, 0.54f, -1.27f, 0.54f, -2f)
                lineTo(4f, 7.5f)
                curveToRelative(0f, -3.24f, 1.58f, -5.5f, 3f, -5.5f)
                lineTo(15.74f, 2f)
                curveToRelative(-1.07f, 1.55f, -1.75f, 3.87f, -1.75f, 6.5f)
                verticalLineToRelative(11.5f)
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
