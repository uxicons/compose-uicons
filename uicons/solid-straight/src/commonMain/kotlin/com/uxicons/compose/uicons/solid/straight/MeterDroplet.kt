package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MeterDroplet: ImageVector? = null

val Icons.Ss.MeterDroplet: ImageVector
    get() = _MeterDroplet ?: UXIcon(name = "MeterDroplet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.5f, 24.1f)
                curveToRelative(-1.47f, 0f, -2.85f, -0.57f, -3.89f, -1.61f)
                curveToRelative(-1.04f, -1.04f, -1.61f, -2.42f, -1.61f, -3.89f)
                reflectiveCurveToRelative(0.57f, -2.85f, 1.61f, -3.89f)
                lineToRelative(3.89f, -3.8f)
                lineToRelative(3.88f, 3.8f)
                curveToRelative(1.05f, 1.05f, 1.62f, 2.43f, 1.62f, 3.9f)
                reflectiveCurveToRelative(-0.57f, 2.85f, -1.61f, 3.89f)
                horizontalLineToRelative(0f)
                curveToRelative(-1.04f, 1.04f, -2.42f, 1.61f, -3.89f, 1.61f)
                close()
                moveTo(13.2f, 23.9f)
                curveToRelative(-1.42f, -1.41f, -2.2f, -3.3f, -2.2f, -5.3f)
                reflectiveCurveToRelative(0.78f, -3.89f, 2.2f, -5.3f)
                lineToRelative(3.8f, -3.72f)
                verticalLineToRelative(-2.58f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1.6f)
                lineToRelative(4.78f, 4.67f)
                curveToRelative(0.05f, 0.05f, 0.09f, 0.09f, 0.14f, 0.14f)
                curveToRelative(0.06f, -0.46f, 0.08f, -0.94f, 0.08f, -1.41f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                reflectiveCurveTo(0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                curveToRelative(0.42f, 0f, 0.83f, -0.02f, 1.23f, -0.06f)
                curveToRelative(-0.01f, -0.01f, -0.02f, -0.02f, -0.04f, -0.04f)
                close()
                moveTo(13f, 7.0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                close()
                moveTo(7f, 11.0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                close()
                moveTo(9f, 7.0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                close()
            }
        }.also { _MeterDroplet = it}
