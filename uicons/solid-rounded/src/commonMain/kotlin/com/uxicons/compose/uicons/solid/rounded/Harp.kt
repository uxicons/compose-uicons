package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Harp: ImageVector? = null

val Icons.Sr.Harp: ImageVector
    get() = _Harp ?: UXIcon(name = "Harp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 6f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                curveToRelative(-1.22f, 0f, -2.11f, 0.56f, -2.89f, 1.05f)
                curveToRelative(-0.81f, 0.51f, -1.5f, 0.95f, -2.61f, 0.95f)
                curveToRelative(-1.7f, 0f, -2.7f, -0.72f, -3.96f, -1.63f)
                curveToRelative(-1.54f, -1.11f, -3.3f, -2.37f, -6.54f, -2.37f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(20f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(11f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1.43f)
                curveToRelative(8.37f, -7.08f, 13.43f, -13.92f, 13.43f, -16f)
                close()
                moveTo(22f, 5.99f)
                curveToRelative(-0.03f, 0.42f, -0.69f, 1.64f, -2f, 3.42f)
                verticalLineToRelative(-5.41f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 1.99f)
                close()
                moveTo(18f, 4.85f)
                verticalLineToRelative(7.05f)
                curveToRelative(-0.6f, 0.7f, -1.26f, 1.45f, -2f, 2.23f)
                verticalLineToRelative(-8.34f)
                curveToRelative(0.81f, -0.22f, 1.45f, -0.59f, 2f, -0.94f)
                close()
                moveTo(14f, 16.18f)
                curveToRelative(-0.63f, 0.62f, -1.29f, 1.25f, -2f, 1.9f)
                verticalLineToRelative(-12.54f)
                curveToRelative(0.59f, 0.23f, 1.25f, 0.38f, 2f, 0.43f)
                close()
                moveTo(10f, 4.44f)
                verticalLineToRelative(15.41f)
                curveToRelative(-0.64f, 0.55f, -1.31f, 1.11f, -2f, 1.67f)
                verticalLineToRelative(-18.45f)
                curveToRelative(0.47f, 0.28f, 0.92f, 0.6f, 1.37f, 0.92f)
                curveToRelative(0.21f, 0.15f, 0.42f, 0.3f, 0.63f, 0.45f)
                close()
                moveTo(4f, 2f)
                curveToRelative(0.77f, 0f, 1.42f, 0.09f, 2f, 0.24f)
                verticalLineToRelative(19.76f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.also { _Harp = it}
