package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandFist: ImageVector? = null

val Icons.Bs.HandFist: ImageVector
    get() = _HandFist ?: UXIcon(name = "HandFist") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.5f, 7f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                lineTo(14f, 1.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(11.5f, 0f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                lineTo(13f, 1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(19.5f, 1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                lineTo(21f, 2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(8.4f, 10.5f)
                curveToRelative(0.8f, -0.8f, 0.8f, -2.09f, 0f, -2.89f)
                curveToRelative(-0.8f, -0.8f, -2.09f, -0.8f, -2.89f, 0f)
                lineToRelative(-2.51f, 1.88f)
                curveToRelative(-0.65f, 0.66f, -1.0f, 1.52f, -1.0f, 2.45f)
                curveToRelative(0f, 0.94f, 0.36f, 1.81f, 1.06f, 2.51f)
                lineToRelative(3.94f, 4.55f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-6.26f)
                lineToRelative(-4.41f, -5.03f)
                lineToRelative(2.81f, -2.21f)
                close()
                moveTo(9f, 5.59f)
                verticalLineToRelative(-3.09f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(2.65f)
                curveToRelative(1.01f, -0.24f, 2.08f, -0.1f, 3f, 0.44f)
                close()
                moveTo(18f, 9.65f)
                verticalLineToRelative(4.1f)
                curveToRelative(0f, 0.79f, -0.27f, 1.57f, -0.77f, 2.19f)
                lineToRelative(-1.23f, 1.54f)
                verticalLineToRelative(6.53f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-5.47f)
                lineToRelative(0.57f, -0.72f)
                curveToRelative(0.92f, -1.15f, 1.43f, -2.59f, 1.43f, -4.06f)
                verticalLineToRelative(-4.1f)
                curveToRelative(-0.46f, 0.22f, -0.96f, 0.35f, -1.5f, 0.35f)
                reflectiveCurveToRelative(-1.04f, -0.13f, -1.5f, -0.35f)
                close()
            }
        }.also { _HandFist = it}
