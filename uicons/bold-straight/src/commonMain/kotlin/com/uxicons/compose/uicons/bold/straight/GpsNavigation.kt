package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GpsNavigation: ImageVector? = null

val Icons.Bs.GpsNavigation: ImageVector
    get() = _GpsNavigation ?: UXIcon(name = "GpsNavigation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 14f)
                horizontalLineToRelative(-1.7f)
                curveToRelative(-0.84f, 4.35f, -4.38f, 7.74f, -8.8f, 8.38f)
                verticalLineToRelative(1.62f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1.62f)
                curveToRelative(-4.42f, -0.64f, -7.96f, -4.03f, -8.8f, -8.38f)
                horizontalLineTo(0f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1.55f)
                curveToRelative(0.39f, -4.09f, 3.14f, -7.5f, 6.88f, -8.86f)
                lineToRelative(-2.93f, 5.0f)
                reflectiveCurveToRelative(-0.8f, 1.11f, -0.96f, 3.87f)
                horizontalLineToRelative(1.47f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-1.22f)
                curveToRelative(0.75f, 2.69f, 2.96f, 4.79f, 5.72f, 5.35f)
                verticalLineToRelative(-1.35f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1.35f)
                curveToRelative(2.77f, -0.56f, 4.97f, -2.65f, 5.72f, -5.35f)
                horizontalLineToRelative(-1.22f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1.47f)
                curveToRelative(-0.17f, -2.75f, -0.96f, -3.87f, -0.96f, -3.87f)
                lineToRelative(-2.93f, -5.0f)
                curveToRelative(3.73f, 1.36f, 6.49f, 4.77f, 6.88f, 8.86f)
                horizontalLineToRelative(1.55f)
                verticalLineToRelative(3f)
                close()
                moveTo(6.91f, 9.7f)
                curveToRelative(0.27f, 0.48f, 0.88f, 0.66f, 1.36f, 0.39f)
                lineToRelative(3.73f, -1.61f)
                lineToRelative(3.75f, 1.59f)
                curveToRelative(0.3f, 0.17f, 0.67f, 0.17f, 0.97f, -0.0f)
                curveToRelative(0.48f, -0.27f, 0.65f, -0.88f, 0.38f, -1.36f)
                lineTo(12f, 0f)
                lineToRelative(-5.09f, 8.73f)
                curveToRelative(-0.17f, 0.3f, -0.17f, 0.67f, -0.0f, 0.97f)
                close()
            }
        }.also { _GpsNavigation = it}
