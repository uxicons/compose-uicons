package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CatHead: ImageVector? = null

val Icons.Bs.CatHead: ImageVector
    get() = _CatHead ?: UXIcon(name = "CatHead") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.5f, 12f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(16.5f, 9f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(24f, 13.5f)
                curveToRelative(0f, 5.79f, -4.71f, 10.5f, -10.5f, 10.5f)
                horizontalLineToRelative(-3f)
                curveTo(4.71f, 24f, 0f, 19.29f, 0f, 13.5f)
                curveTo(0f, 6.91f, 0.99f, 2.37f, 1.04f, 2.17f)
                lineTo(1.52f, 0.01f)
                lineToRelative(4.2f, 2.88f)
                curveToRelative(1.83f, -1.2f, 3.9f, -1.84f, 6.06f, -1.88f)
                curveToRelative(2.28f, -0.03f, 4.51f, 0.61f, 6.47f, 1.91f)
                lineTo(22.56f, -0.04f)
                lineToRelative(0.41f, 2.27f)
                curveToRelative(0.04f, 0.23f, 1.02f, 5.7f, 1.02f, 11.27f)
                close()
                moveTo(21f, 13.5f)
                curveToRelative(0f, -3.15f, -0.34f, -6.34f, -0.62f, -8.41f)
                lineToRelative(-2.22f, 1.52f)
                lineToRelative(-0.87f, -0.69f)
                curveToRelative(-1.62f, -1.29f, -3.5f, -1.95f, -5.46f, -1.91f)
                curveToRelative(-1.85f, 0.03f, -3.64f, 0.69f, -5.16f, 1.89f)
                lineToRelative(-0.87f, 0.69f)
                lineToRelative(-2.22f, -1.52f)
                curveToRelative(-0.27f, 1.89f, -0.58f, 4.86f, -0.58f, 8.44f)
                curveToRelative(0f, 4.14f, 3.36f, 7.5f, 7.5f, 7.5f)
                horizontalLineToRelative(3f)
                curveToRelative(4.14f, 0f, 7.5f, -3.36f, 7.5f, -7.5f)
                close()
                moveTo(13.51f, 14.59f)
                curveToRelative(0.65f, -0.4f, 0.99f, -1.0f, 0.99f, -1.4f)
                curveToRelative(0f, -0.66f, -0.89f, -1.19f, -2.5f, -1.19f)
                reflectiveCurveToRelative(-2.5f, 0.53f, -2.5f, 1.19f)
                curveToRelative(0f, 0.41f, 0.34f, 1.01f, 0.99f, 1.4f)
                curveToRelative(-0.05f, 0.57f, -0.59f, 1.93f, -2.49f, 2.41f)
                verticalLineToRelative(2f)
                curveToRelative(1.56f, 0f, 2.99f, -0.57f, 4f, -1.45f)
                curveToRelative(1.01f, 0.89f, 2.44f, 1.45f, 4f, 1.45f)
                verticalLineToRelative(-2f)
                curveToRelative(-1.9f, -0.48f, -2.44f, -1.83f, -2.49f, -2.41f)
                close()
            }
        }.also { _CatHead = it}
