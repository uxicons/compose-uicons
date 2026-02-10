package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Trumpet: ImageVector? = null

val Icons.Ss.Trumpet: ImageVector
    get() = _Trumpet ?: UXIcon(name = "Trumpet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 3f)
                verticalLineToRelative(0.03f)
                curveToRelative(-1.41f, 5.19f, -5.26f, 7.01f, -8f, 7.64f)
                verticalLineToRelative(-1.67f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1.97f)
                curveToRelative(-0.24f, 0.02f, -0.42f, 0.02f, -0.58f, 0.03f)
                horizontalLineToRelative(-0.08f)
                curveToRelative(-0.18f, -0.0f, -0.31f, -0.0f, -0.36f, 0f)
                horizontalLineToRelative(-0.98f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                lineTo(0f, 11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3.03f)
                curveToRelative(-0.64f, 0.84f, -1.03f, 1.87f, -1.03f, 3f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(4f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                curveToRelative(0f, -0.81f, -0.21f, -1.56f, -0.55f, -2.24f)
                curveToRelative(2.51f, 0.91f, 5.38f, 2.88f, 6.55f, 7.19f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(0f, 0.04f, 0f, 0.04f)
                horizontalLineToRelative(2f)
                lineTo(24f, 3f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(11f, 19f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(4f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                close()
            }
        }.also { _Trumpet = it}
