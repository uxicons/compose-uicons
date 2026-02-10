package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CatHead: ImageVector? = null

val Icons.Rs.CatHead: ImageVector
    get() = _CatHead ?: UXIcon(name = "CatHead") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.5f, 12f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(13.1f, 14.79f)
                curveToRelative(0.91f, -0.36f, 1.4f, -1.12f, 1.4f, -1.61f)
                curveToRelative(0f, -0.66f, -0.89f, -1.19f, -2.5f, -1.19f)
                reflectiveCurveToRelative(-2.5f, 0.53f, -2.5f, 1.19f)
                curveToRelative(0f, 0.49f, 0.49f, 1.24f, 1.4f, 1.61f)
                curveToRelative(-0.21f, 0.91f, -0.87f, 2.21f, -2.9f, 2.21f)
                verticalLineToRelative(2f)
                curveToRelative(1.99f, 0f, 3.25f, -0.83f, 4f, -1.88f)
                curveToRelative(0.75f, 1.05f, 2.01f, 1.88f, 4f, 1.88f)
                verticalLineToRelative(-2f)
                curveToRelative(-2.03f, 0f, -2.69f, -1.29f, -2.9f, -2.21f)
                close()
                moveTo(24f, 13.5f)
                curveToRelative(0f, 5.79f, -4.71f, 10.5f, -10.5f, 10.5f)
                horizontalLineToRelative(-3f)
                curveTo(4.71f, 24f, 0f, 19.29f, 0f, 13.5f)
                curveTo(0f, 6.66f, 1.03f, 1.79f, 1.07f, 1.59f)
                lineTo(1.4f, 0.05f)
                lineToRelative(4.05f, 3.07f)
                curveToRelative(1.91f, -1.31f, 4.25f, -2.08f, 6.53f, -2.12f)
                curveToRelative(2.33f, -0.02f, 4.46f, 0.66f, 6.54f, 2.14f)
                lineTo(22.65f, 0.01f)
                lineToRelative(0.28f, 1.61f)
                curveToRelative(0.04f, 0.25f, 1.06f, 6.1f, 1.06f, 11.88f)
                close()
                moveTo(22f, 13.5f)
                curveToRelative(0f, -3.82f, -0.47f, -7.75f, -0.78f, -9.9f)
                lineToRelative(-2.71f, 2.06f)
                lineToRelative(-0.61f, -0.48f)
                curveToRelative(-1.89f, -1.5f, -3.8f, -2.22f, -5.88f, -2.18f)
                curveToRelative(-2.1f, 0.04f, -4.27f, 0.82f, -5.95f, 2.15f)
                lineToRelative(-0.61f, 0.48f)
                lineToRelative(-2.71f, -2.06f)
                curveToRelative(-0.3f, 1.95f, -0.75f, 5.54f, -0.75f, 9.92f)
                curveToRelative(0f, 4.69f, 3.81f, 8.5f, 8.5f, 8.5f)
                horizontalLineToRelative(3f)
                curveToRelative(4.69f, 0f, 8.5f, -3.81f, 8.5f, -8.5f)
                close()
                moveTo(16.5f, 9f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _CatHead = it}
