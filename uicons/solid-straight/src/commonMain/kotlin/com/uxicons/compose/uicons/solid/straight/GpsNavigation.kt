package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GpsNavigation: ImageVector? = null

val Icons.Ss.GpsNavigation: ImageVector
    get() = _GpsNavigation ?: UXIcon(name = "GpsNavigation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 13f)
                horizontalLineToRelative(-1.55f)
                curveToRelative(-0.47f, 4.99f, -4.46f, 8.97f, -9.45f, 9.45f)
                verticalLineToRelative(1.55f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1.55f)
                curveToRelative(-4.99f, -0.47f, -8.97f, -4.46f, -9.45f, -9.45f)
                horizontalLineTo(0f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1.55f)
                curveToRelative(0.39f, -4.11f, 3.16f, -7.52f, 6.9f, -8.87f)
                lineToRelative(-2.01f, 3.45f)
                curveToRelative(-1.56f, 1.35f, -2.63f, 3.26f, -2.88f, 5.42f)
                horizontalLineToRelative(2.44f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2.44f)
                curveToRelative(0.46f, 3.89f, 3.55f, 6.98f, 7.44f, 7.44f)
                verticalLineToRelative(-2.44f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.44f)
                curveToRelative(3.89f, -0.46f, 6.98f, -3.55f, 7.44f, -7.44f)
                horizontalLineToRelative(-2.44f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2.44f)
                curveToRelative(-0.25f, -2.13f, -1.3f, -4.02f, -2.83f, -5.37f)
                lineToRelative(-2.05f, -3.49f)
                curveToRelative(3.74f, 1.35f, 6.5f, 4.77f, 6.89f, 8.87f)
                horizontalLineToRelative(1.55f)
                verticalLineToRelative(2f)
                close()
                moveTo(7.19f, 8.84f)
                lineTo(12f, 0.05f)
                lineToRelative(4.83f, 8.77f)
                curveToRelative(0.18f, 0.35f, 0.22f, 0.72f, 0.13f, 1.08f)
                curveToRelative(-0.1f, 0.37f, -0.33f, 0.68f, -0.65f, 0.88f)
                curveToRelative(-0.42f, 0.25f, -0.93f, 0.27f, -1.38f, 0.04f)
                lineToRelative(-2.93f, -1.08f)
                lineToRelative(-2.96f, 1.12f)
                curveToRelative(-0.19f, 0.1f, -0.41f, 0.14f, -0.62f, 0.14f)
                curveToRelative(-0.14f, 0f, -0.27f, -0.02f, -0.41f, -0.06f)
                curveToRelative(-0.37f, -0.12f, -0.67f, -0.37f, -0.85f, -0.72f)
                curveToRelative(-0.22f, -0.42f, -0.22f, -0.93f, 0.0f, -1.36f)
                lineToRelative(0.01f, -0.02f)
                close()
            }
        }.also { _GpsNavigation = it}
