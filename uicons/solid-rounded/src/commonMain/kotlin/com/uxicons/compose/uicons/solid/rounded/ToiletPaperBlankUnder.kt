package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ToiletPaperBlankUnder: ImageVector? = null

val Icons.Sr.ToiletPaperBlankUnder: ImageVector
    get() = _ToiletPaperBlankUnder ?: UXIcon(name = "ToiletPaperBlankUnder") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.98f, 22.63f)
                curveToRelative(-0.14f, 0.81f, -0.91f, 1.37f, -1.73f, 1.37f)
                horizontalLineToRelative(-11.24f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(11.5f)
                lineToRelative(-0.02f, -0.04f)
                curveToRelative(1.02f, -0.15f, 1.85f, -0.79f, 2.52f, -1.76f)
                verticalLineToRelative(0.8f)
                curveToRelative(0f, 1.26f, -0.22f, 2.35f, 0.89f, 2.79f)
                curveToRelative(0.74f, 0.3f, 1.23f, 1.02f, 1.09f, 1.85f)
                close()
                moveTo(22f, 8.5f)
                curveToRelative(0f, 4.69f, -1.34f, 8.5f, -3f, 8.5f)
                reflectiveCurveToRelative(-3f, -3.81f, -3f, -8.5f)
                reflectiveCurveTo(17.34f, 0f, 19f, 0f)
                reflectiveCurveToRelative(3f, 3.81f, 3f, 8.5f)
                close()
                moveTo(20f, 8.5f)
                curveToRelative(0f, -1.1f, -0.45f, -2f, -1f, -2f)
                reflectiveCurveToRelative(-1f, 0.9f, -1f, 2f)
                reflectiveCurveToRelative(0.45f, 2f, 1f, 2f)
                reflectiveCurveToRelative(1f, -0.9f, 1f, -2f)
                close()
                moveTo(5f, 17f)
                horizontalLineToRelative(10.87f)
                curveToRelative(-1.27f, -2.01f, -1.87f, -5.26f, -1.87f, -8.5f)
                reflectiveCurveToRelative(0.59f, -6.49f, 1.87f, -8.5f)
                lineTo(5f, 0f)
                curveTo(2.2f, 0f, 0f, 3.5f, 0f, 8.5f)
                reflectiveCurveToRelative(2.2f, 8.5f, 5f, 8.5f)
                close()
            }
        }.also { _ToiletPaperBlankUnder = it}
