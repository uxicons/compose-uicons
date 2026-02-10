package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Entrance: ImageVector? = null

val Icons.Rs.Entrance: ImageVector
    get() = _Entrance ?: UXIcon(name = "Entrance") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 12f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(24f, 4.2f)
                verticalLineToRelative(19.8f)
                horizontalLineToRelative(-16f)
                verticalLineToRelative(-4.32f)
                lineToRelative(2f, -2.06f)
                verticalLineToRelative(4.37f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-18f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(5.37f)
                lineToRelative(-2f, -2.05f)
                verticalLineToRelative(-3.32f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(1.19f)
                curveToRelative(0.18f, -0.51f, 0.48f, -0.97f, 0.91f, -1.32f)
                curveToRelative(0.7f, -0.57f, 1.61f, -0.8f, 2.49f, -0.62f)
                lineToRelative(6f, 1.2f)
                curveToRelative(1.4f, 0.28f, 2.41f, 1.52f, 2.41f, 2.94f)
                close()
                moveTo(22f, 4.2f)
                curveToRelative(0f, -0.47f, -0.34f, -0.89f, -0.8f, -0.98f)
                lineToRelative(-6.0f, -1.2f)
                curveToRelative(-0.29f, -0.06f, -0.6f, 0.02f, -0.83f, 0.21f)
                reflectiveCurveToRelative(-0.37f, 0.47f, -0.37f, 0.77f)
                verticalLineToRelative(19f)
                horizontalLineToRelative(8f)
                close()
                moveTo(9.95f, 14f)
                curveToRelative(0f, -0.54f, -0.21f, -1.04f, -0.58f, -1.41f)
                lineToRelative(-3.18f, -3.27f)
                lineToRelative(-1.43f, 1.4f)
                lineToRelative(2.21f, 2.28f)
                horizontalLineToRelative(-6.96f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6.98f)
                lineToRelative(-2.22f, 2.28f)
                lineToRelative(1.43f, 1.4f)
                lineToRelative(3.17f, -3.26f)
                curveToRelative(0.38f, -0.38f, 0.59f, -0.88f, 0.59f, -1.42f)
                close()
            }
        }.also { _Entrance = it}
