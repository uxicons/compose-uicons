package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GpsNavigation: ImageVector? = null

val Icons.Sr.GpsNavigation: ImageVector
    get() = _GpsNavigation ?: UXIcon(name = "GpsNavigation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 12f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-0.55f)
                curveToRelative(-0.47f, 4.99f, -4.46f, 8.97f, -9.45f, 9.45f)
                verticalLineToRelative(0.55f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-0.55f)
                curveToRelative(-4.99f, -0.47f, -8.97f, -4.46f, -9.45f, -9.45f)
                horizontalLineToRelative(-0.55f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(0.56f)
                curveToRelative(0.26f, -2.79f, 1.61f, -5.35f, 3.81f, -7.14f)
                curveToRelative(0.43f, -0.35f, 1.06f, -0.29f, 1.41f, 0.14f)
                curveToRelative(0.35f, 0.43f, 0.28f, 1.06f, -0.14f, 1.41f)
                curveToRelative(-1.73f, 1.41f, -2.81f, 3.41f, -3.07f, 5.59f)
                horizontalLineToRelative(1.44f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-1.44f)
                curveToRelative(0.46f, 3.89f, 3.55f, 6.98f, 7.44f, 7.44f)
                verticalLineToRelative(-1.44f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1.44f)
                curveToRelative(3.89f, -0.46f, 6.98f, -3.55f, 7.44f, -7.44f)
                horizontalLineToRelative(-1.44f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1.44f)
                curveToRelative(-0.26f, -2.18f, -1.34f, -4.18f, -3.07f, -5.59f)
                curveToRelative(-0.43f, -0.35f, -0.49f, -0.98f, -0.14f, -1.41f)
                curveToRelative(0.35f, -0.43f, 0.98f, -0.49f, 1.41f, -0.14f)
                curveToRelative(2.2f, 1.79f, 3.55f, 4.35f, 3.81f, 7.14f)
                horizontalLineToRelative(0.56f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(16.8f, 7.72f)
                lineTo(13.46f, 0.88f)
                curveToRelative(-0.33f, -0.58f, -0.89f, -0.87f, -1.46f, -0.88f)
                curveToRelative(-0.56f, 0.0f, -1.13f, 0.29f, -1.46f, 0.88f)
                lineToRelative(-3.34f, 6.85f)
                curveToRelative(-0.71f, 1.26f, 0.54f, 2.73f, 1.81f, 2.15f)
                lineToRelative(2.98f, -1.35f)
                lineToRelative(2.98f, 1.35f)
                curveToRelative(1.28f, 0.58f, 2.52f, -0.89f, 1.81f, -2.15f)
                close()
            }
        }.also { _GpsNavigation = it}
