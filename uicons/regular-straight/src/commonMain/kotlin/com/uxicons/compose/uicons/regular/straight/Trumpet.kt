package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Trumpet: ImageVector? = null

val Icons.Rs.Trumpet: ImageVector
    get() = _Trumpet ?: UXIcon(name = "Trumpet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 3f)
                curveToRelative(-1.45f, 5.02f, -5.28f, 7.11f, -8f, 7.71f)
                verticalLineToRelative(-1.71f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1.99f)
                curveToRelative(-0.11f, 0.01f, -0.2f, 0.01f, -0.3f, 0.01f)
                horizontalLineToRelative(-1.7f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                lineTo(0f, 11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3.0f)
                curveToRelative(-0.63f, 0.84f, -1.0f, 1.88f, -1.0f, 3f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(4f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                curveToRelative(0f, -0.82f, -0.2f, -1.59f, -0.55f, -2.27f)
                curveToRelative(2.5f, 0.88f, 5.35f, 3.14f, 6.55f, 7.27f)
                horizontalLineToRelative(2f)
                lineTo(24f, 3f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(11f, 19f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                curveToRelative(0f, 0f, 4.04f, 0.0f, 4.09f, 0.0f)
                curveToRelative(1.61f, 0.05f, 2.91f, 1.38f, 2.91f, 3.0f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                close()
                moveTo(22f, 16.09f)
                curveToRelative(-1.55f, -2.13f, -3.59f, -3.37f, -5.49f, -4.09f)
                curveToRelative(1.9f, -0.72f, 3.94f, -1.97f, 5.49f, -4.09f)
                verticalLineToRelative(8.18f)
                close()
            }
        }.also { _Trumpet = it}
