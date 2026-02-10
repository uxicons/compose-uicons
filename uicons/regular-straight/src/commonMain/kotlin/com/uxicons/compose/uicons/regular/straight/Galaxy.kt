package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Galaxy: ImageVector? = null

val Icons.Rs.Galaxy: ImageVector
    get() = _Galaxy ?: UXIcon(name = "Galaxy") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.5f, 12f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(24.0f, 18.71f)
                lineToRelative(-1.75f, -1.98f)
                curveToRelative(-0.97f, -1.1f, -2.18f, -1.96f, -3.54f, -2.5f)
                curveToRelative(0.11f, 1.02f, 0.04f, 2.04f, -0.22f, 3.06f)
                curveToRelative(-0.98f, 3.95f, -4.61f, 6.71f, -8.83f, 6.71f)
                horizontalLineToRelative(-4.38f)
                reflectiveCurveToRelative(1.98f, -1.75f, 1.98f, -1.75f)
                curveToRelative(1.1f, -0.97f, 1.96f, -2.18f, 2.5f, -3.54f)
                curveToRelative(-1.02f, 0.11f, -2.04f, 0.04f, -3.06f, -0.22f)
                curveTo(2.76f, 17.52f, 0.0f, 13.89f, 0f, 9.67f)
                verticalLineToRelative(-4.38f)
                reflectiveCurveToRelative(1.75f, 1.98f, 1.75f, 1.98f)
                curveToRelative(0.97f, 1.1f, 2.18f, 1.96f, 3.54f, 2.5f)
                curveToRelative(-0.11f, -1.02f, -0.04f, -2.04f, 0.22f, -3.06f)
                curveTo(6.48f, 2.76f, 10.11f, 0.0f, 14.33f, 0f)
                horizontalLineToRelative(4.38f)
                reflectiveCurveToRelative(-1.98f, 1.75f, -1.98f, 1.75f)
                curveToRelative(-1.1f, 0.97f, -1.96f, 2.18f, -2.5f, 3.54f)
                curveToRelative(1.02f, -0.11f, 2.04f, -0.04f, 3.06f, 0.22f)
                curveToRelative(3.95f, 0.98f, 6.71f, 4.61f, 6.71f, 8.83f)
                verticalLineToRelative(4.38f)
                close()
                moveTo(21.98f, 13.78f)
                curveToRelative(-0.23f, -3.02f, -2.33f, -5.64f, -5.17f, -6.34f)
                curveToRelative(-1.0f, -0.25f, -2.01f, -0.27f, -3.0f, -0.07f)
                curveToRelative(-0.53f, 0.11f, -1.06f, -0.07f, -1.42f, -0.47f)
                curveToRelative(-0.36f, -0.4f, -0.49f, -0.97f, -0.32f, -1.5f)
                curveToRelative(0.38f, -1.22f, 0.97f, -2.37f, 1.72f, -3.39f)
                curveToRelative(-3.02f, 0.23f, -5.64f, 2.33f, -6.34f, 5.17f)
                curveToRelative(-0.25f, 1.0f, -0.27f, 2.01f, -0.07f, 3.0f)
                curveToRelative(0.11f, 0.53f, -0.07f, 1.06f, -0.47f, 1.42f)
                curveToRelative(-0.4f, 0.36f, -0.97f, 0.48f, -1.5f, 0.32f)
                curveToRelative(-1.22f, -0.38f, -2.37f, -0.97f, -3.39f, -1.72f)
                curveToRelative(0.23f, 3.02f, 2.33f, 5.64f, 5.17f, 6.34f)
                curveToRelative(1.0f, 0.25f, 2.02f, 0.27f, 3.0f, 0.07f)
                curveToRelative(0.1f, -0.02f, 0.2f, -0.03f, 0.3f, -0.03f)
                curveToRelative(0.42f, 0f, 0.82f, 0.18f, 1.11f, 0.5f)
                curveToRelative(0.36f, 0.4f, 0.49f, 0.97f, 0.32f, 1.5f)
                curveToRelative(-0.38f, 1.22f, -0.97f, 2.37f, -1.72f, 3.39f)
                curveToRelative(3.02f, -0.23f, 5.64f, -2.33f, 6.34f, -5.17f)
                curveToRelative(0.25f, -1.0f, 0.27f, -2.01f, 0.07f, -3.0f)
                curveToRelative(-0.11f, -0.53f, 0.07f, -1.06f, 0.47f, -1.42f)
                curveToRelative(0.4f, -0.36f, 0.97f, -0.48f, 1.5f, -0.32f)
                curveToRelative(1.22f, 0.38f, 2.37f, 0.97f, 3.39f, 1.72f)
                close()
            }
        }.also { _Galaxy = it}
