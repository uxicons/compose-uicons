package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ToiletPaperBlank: ImageVector? = null

val Icons.Bs.ToiletPaperBlank: ImageVector
    get() = _ToiletPaperBlank ?: UXIcon(name = "ToiletPaperBlank") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 0f)
                lineTo(7.5f, 0f)
                curveTo(4.42f, 0f, 2f, 3.51f, 2f, 8f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                verticalLineToRelative(3f)
                lineTo(14.5f, 24f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(1f)
                curveToRelative(2.21f, 0f, 4f, -3.58f, 4f, -8f)
                reflectiveCurveTo(22.21f, 0f, 20f, 0f)
                close()
                moveTo(16f, 19.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                lineTo(4.58f, 21f)
                curveToRelative(0.27f, -0.61f, 0.42f, -1.29f, 0.42f, -2f)
                lineTo(5f, 8f)
                curveToRelative(0f, -2.86f, 1.32f, -5f, 2.5f, -5f)
                horizontalLineToRelative(9.38f)
                curveToRelative(-0.55f, 1.37f, -0.88f, 3.11f, -0.88f, 5f)
                verticalLineToRelative(11.5f)
                close()
                moveTo(20f, 11.5f)
                curveToRelative(-0.55f, 0f, -1f, -1.57f, -1f, -3.5f)
                reflectiveCurveToRelative(0.45f, -3.5f, 1f, -3.5f)
                reflectiveCurveToRelative(1f, 1.57f, 1f, 3.5f)
                reflectiveCurveToRelative(-0.45f, 3.5f, -1f, 3.5f)
                close()
            }
        }.also { _ToiletPaperBlank = it}
