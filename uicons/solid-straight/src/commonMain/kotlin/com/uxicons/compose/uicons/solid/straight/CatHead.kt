package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CatHead: ImageVector? = null

val Icons.Ss.CatHead: ImageVector
    get() = _CatHead ?: UXIcon(name = "CatHead") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.94f, 1.62f)
                lineTo(22.65f, 0.01f)
                lineToRelative(-4.13f, 3.13f)
                curveToRelative(-2.08f, -1.48f, -4.21f, -2.17f, -6.54f, -2.14f)
                curveToRelative(-2.28f, 0.04f, -4.62f, 0.81f, -6.53f, 2.12f)
                lineTo(1.4f, 0.05f)
                lineToRelative(-0.33f, 1.54f)
                curveToRelative(-0.04f, 0.2f, -1.07f, 5.08f, -1.07f, 11.91f)
                curveToRelative(0f, 5.79f, 4.71f, 10.5f, 10.5f, 10.5f)
                horizontalLineToRelative(3f)
                curveToRelative(5.79f, 0f, 10.5f, -4.71f, 10.5f, -10.5f)
                reflectiveCurveToRelative(-1.02f, -11.63f, -1.06f, -11.88f)
                close()
                moveTo(6f, 10.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(16f, 19f)
                curveToRelative(-1.99f, 0f, -3.25f, -0.83f, -4f, -1.88f)
                curveToRelative(-0.75f, 1.05f, -2.01f, 1.88f, -4f, 1.88f)
                verticalLineToRelative(-2f)
                curveToRelative(2.03f, 0f, 2.69f, -1.29f, 2.9f, -2.21f)
                curveToRelative(-0.91f, -0.36f, -1.4f, -1.12f, -1.4f, -1.61f)
                curveToRelative(0f, -0.66f, 0.89f, -1.19f, 2.5f, -1.19f)
                reflectiveCurveToRelative(2.5f, 0.53f, 2.5f, 1.19f)
                curveToRelative(0f, 0.49f, -0.49f, 1.24f, -1.4f, 1.61f)
                curveToRelative(0.21f, 0.91f, 0.87f, 2.21f, 2.9f, 2.21f)
                verticalLineToRelative(2f)
                close()
                moveTo(16.5f, 12f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _CatHead = it}
