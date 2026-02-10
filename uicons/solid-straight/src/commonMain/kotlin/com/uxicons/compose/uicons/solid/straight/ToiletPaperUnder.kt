package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ToiletPaperUnder: ImageVector? = null

val Icons.Ss.ToiletPaperUnder: ImageVector
    get() = _ToiletPaperUnder ?: UXIcon(name = "ToiletPaperUnder") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 0f)
                curveToRelative(-1.66f, 0f, -3f, 3.81f, -3f, 8.5f)
                reflectiveCurveToRelative(1.34f, 8.5f, 3f, 8.5f)
                reflectiveCurveToRelative(3f, -3.81f, 3f, -8.5f)
                reflectiveCurveTo(20.66f, 0f, 19f, 0f)
                close()
                moveTo(19f, 10.5f)
                curveToRelative(-0.55f, 0f, -1f, -0.9f, -1f, -2f)
                reflectiveCurveToRelative(0.45f, -2f, 1f, -2f)
                reflectiveCurveToRelative(1f, 0.9f, 1f, 2f)
                reflectiveCurveToRelative(-0.45f, 2f, -1f, 2f)
                close()
                moveTo(24f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-13f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(11f)
                curveToRelative(1.24f, 0f, 2.23f, -0.68f, 3f, -1.79f)
                verticalLineToRelative(2.79f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                close()
                moveTo(12f, 9f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2.04f)
                curveToRelative(0.16f, -2.71f, 0.75f, -5.3f, 1.82f, -7f)
                lineTo(5f, 0f)
                curveTo(2.49f, 0f, 0.46f, 2.81f, 0.07f, 7f)
                horizontalLineToRelative(1.93f)
                verticalLineToRelative(2f)
                lineTo(0.01f, 9f)
                curveToRelative(0.14f, 4.73f, 2.28f, 8f, 4.99f, 8f)
                horizontalLineToRelative(10.87f)
                curveToRelative(-1.21f, -1.91f, -1.8f, -4.93f, -1.86f, -8f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(6f, 9f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(10f, 9f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _ToiletPaperUnder = it}
