package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GpsNavigation: ImageVector? = null

val Icons.Ts.GpsNavigation: ImageVector
    get() = _GpsNavigation ?: UXIcon(name = "GpsNavigation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 12.5f)
                horizontalLineToRelative(-2.02f)
                curveToRelative(-0.26f, 5.12f, -4.36f, 9.22f, -9.47f, 9.47f)
                verticalLineToRelative(2.02f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2.02f)
                curveToRelative(-5.12f, -0.26f, -9.22f, -4.36f, -9.47f, -9.47f)
                lineTo(0f, 12.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2.02f)
                curveToRelative(0.19f, -3.91f, 2.64f, -7.24f, 6.07f, -8.7f)
                lineToRelative(-0.93f, 1.63f)
                curveToRelative(-2.36f, 1.52f, -3.96f, 4.11f, -4.12f, 7.07f)
                horizontalLineToRelative(1.97f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1.98f)
                curveToRelative(0.25f, 4.56f, 3.91f, 8.22f, 8.47f, 8.47f)
                verticalLineToRelative(-1.98f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1.98f)
                curveToRelative(4.56f, -0.25f, 8.22f, -3.91f, 8.47f, -8.47f)
                horizontalLineToRelative(-1.98f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1.97f)
                curveToRelative(-0.17f, -2.96f, -1.75f, -5.54f, -4.1f, -7.06f)
                lineToRelative(-0.94f, -1.64f)
                curveToRelative(3.42f, 1.47f, 5.86f, 4.79f, 6.05f, 8.69f)
                horizontalLineToRelative(2.02f)
                verticalLineToRelative(1f)
                close()
                moveTo(12f, -0.0f)
                lineToRelative(4.88f, 8.47f)
                curveToRelative(0.13f, 0.25f, 0.16f, 0.52f, 0.09f, 0.77f)
                curveToRelative(-0.07f, 0.26f, -0.23f, 0.47f, -0.45f, 0.61f)
                curveToRelative(-0.31f, 0.19f, -0.68f, 0.18f, -1.02f, -0.02f)
                lineToRelative(-3.5f, -1.29f)
                lineToRelative(-3.61f, 1.37f)
                curveToRelative(-0.09f, 0.06f, -0.24f, 0.1f, -0.39f, 0.1f)
                curveToRelative(-0.1f, 0f, -0.2f, -0.01f, -0.29f, -0.04f)
                curveToRelative(-0.25f, -0.08f, -0.46f, -0.25f, -0.58f, -0.49f)
                curveToRelative(-0.15f, -0.3f, -0.15f, -0.66f, 0f, -0.96f)
                lineTo(12f, -0.0f)
                close()
                moveTo(8.01f, 8.97f)
                curveToRelative(-0.0f, 0.01f, -0.0f, 0.03f, 0.0f, 0.04f)
                lineToRelative(3.98f, -1.54f)
                lineToRelative(4.05f, 1.51f)
                lineToRelative(-4.04f, -6.98f)
                lineToRelative(-3.99f, 6.97f)
                close()
            }
        }.also { _GpsNavigation = it}
