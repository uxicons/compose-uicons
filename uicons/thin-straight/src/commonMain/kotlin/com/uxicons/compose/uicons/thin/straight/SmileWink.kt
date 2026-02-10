package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmileWink: ImageVector? = null

val Icons.Ts.SmileWink: ImageVector
    get() = _SmileWink ?: UXIcon(name = "SmileWink") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 24f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                reflectiveCurveToRelative(-5.38f, 12f, -12f, 12f)
                close()
                moveTo(12f, 1f)
                curveTo(5.93f, 1f, 1f, 5.93f, 1f, 12f)
                reflectiveCurveToRelative(4.93f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -4.93f, 11f, -11f)
                reflectiveCurveTo(18.07f, 1f, 12f, 1f)
                close()
                moveTo(17.33f, 15.87f)
                lineToRelative(-0.67f, -0.75f)
                curveToRelative(-0.02f, 0.02f, -2.14f, 1.87f, -4.67f, 1.87f)
                reflectiveCurveToRelative(-4.65f, -1.85f, -4.67f, -1.87f)
                lineToRelative(-0.67f, 0.75f)
                curveToRelative(0.1f, 0.09f, 2.42f, 2.13f, 5.33f, 2.13f)
                reflectiveCurveToRelative(5.24f, -2.04f, 5.33f, -2.13f)
                close()
                moveTo(19f, 11f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(15f, 10f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                close()
                moveTo(10f, 10f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _SmileWink = it}
