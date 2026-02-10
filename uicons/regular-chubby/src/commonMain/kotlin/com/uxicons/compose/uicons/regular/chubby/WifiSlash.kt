package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WifiSlash: ImageVector? = null

val Icons.Rc.WifiSlash: ImageVector
    get() = _WifiSlash ?: UXIcon(name = "WifiSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.7f, 8.98f)
                curveToRelative(-4.4f, -4.31f, -10.5f, -5.67f, -15.95f, -3.56f)
                lineToRelative(-3.03f, -3.12f)
                curveToRelative(-0.39f, -0.4f, -1.02f, -0.41f, -1.41f, -0.02f)
                curveToRelative(-0.4f, 0.39f, -0.41f, 1.02f, -0.02f, 1.41f)
                lineToRelative(17.0f, 17.51f)
                curveToRelative(0.2f, 0.2f, 0.84f, 0.58f, 1.41f, 0.02f)
                curveToRelative(0.4f, -0.39f, 0.41f, -1.02f, 0.02f, -1.41f)
                lineToRelative(-5.99f, -6.17f)
                curveToRelative(0.91f, 0.4f, 1.77f, 0.99f, 2.57f, 1.77f)
                curveToRelative(0.2f, 0.19f, 0.76f, 0.56f, 1.42f, -0.01f)
                curveToRelative(0.37f, -0.33f, 0.38f, -1.03f, -0.01f, -1.42f)
                curveToRelative(-1.89f, -1.85f, -4.12f, -2.85f, -6.46f, -2.92f)
                lineToRelative(-3.95f, -4.07f)
                curveToRelative(4.55f, -1.43f, 9.35f, -0.19f, 13.02f, 3.41f)
                curveToRelative(0.2f, 0.19f, 0.84f, 0.55f, 1.42f, -0.01f)
                curveToRelative(0.4f, -0.38f, 0.38f, -1.03f, -0.01f, -1.42f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3.12f, 7.43f)
                curveToRelative(-0.63f, 0.47f, -1.24f, 0.99f, -1.82f, 1.55f)
                curveToRelative(-0.39f, 0.39f, -0.42f, 1.04f, -0.01f, 1.41f)
                curveToRelative(0.61f, 0.56f, 1.22f, 0.2f, 1.41f, 0.01f)
                curveToRelative(0.51f, -0.5f, 1.05f, -0.96f, 1.6f, -1.37f)
                curveToRelative(0.44f, -0.33f, 0.54f, -0.95f, 0.21f, -1.4f)
                curveToRelative(-0.33f, -0.44f, -0.95f, -0.54f, -1.4f, -0.21f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.71f, 12.19f)
                curveToRelative(-0.85f, 0.47f, -1.66f, 1.07f, -2.41f, 1.8f)
                curveToRelative(-0.39f, 0.39f, -0.4f, 1.02f, -0.01f, 1.42f)
                curveToRelative(0.56f, 0.56f, 1.22f, 0.2f, 1.42f, 0.01f)
                curveToRelative(0.61f, -0.6f, 1.27f, -1.1f, 1.96f, -1.48f)
                curveToRelative(0.48f, -0.27f, 0.66f, -0.87f, 0.4f, -1.36f)
                reflectiveCurveToRelative(-0.87f, -0.67f, -1.36f, -0.4f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.5f, 19.54f)
                arcToRelative(2.5f, 2.46f, 0f, isMoreThanHalf = true, isPositiveArc = false, 5f, 0f)
                arcToRelative(2.5f, 2.46f, 0f, isMoreThanHalf = true, isPositiveArc = false, -5f, 0f)
                close()
            }
        }.also { _WifiSlash = it}
