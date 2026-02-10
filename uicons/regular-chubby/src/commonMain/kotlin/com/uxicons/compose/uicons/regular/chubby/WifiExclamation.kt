package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WifiExclamation: ImageVector? = null

val Icons.Rc.WifiExclamation: ImageVector
    get() = _WifiExclamation ?: UXIcon(name = "WifiExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.68f, 3.68f)
                curveToRelative(-2.36f, 0.76f, -4.52f, 2.1f, -6.39f, 4f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.03f, 0.01f, 1.41f)
                curveToRelative(0.57f, 0.55f, 1.22f, 0.19f, 1.41f, -0.01f)
                curveToRelative(1.65f, -1.67f, 3.53f, -2.84f, 5.58f, -3.5f)
                curveToRelative(0.53f, -0.17f, 0.81f, -0.73f, 0.65f, -1.26f)
                curveToRelative(-0.17f, -0.53f, -0.73f, -0.81f, -1.26f, -0.65f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.7f, 7.68f)
                curveToRelative(-1.88f, -1.9f, -4.03f, -3.24f, -6.39f, -4f)
                curveToRelative(-0.53f, -0.17f, -1.09f, 0.12f, -1.26f, 0.65f)
                curveToRelative(-0.17f, 0.53f, 0.12f, 1.09f, 0.65f, 1.26f)
                curveToRelative(2.06f, 0.66f, 3.94f, 1.84f, 5.58f, 3.5f)
                curveToRelative(0.2f, 0.2f, 0.84f, 0.55f, 1.41f, 0.01f)
                curveToRelative(0.4f, -0.38f, 0.4f, -1.02f, 0.01f, -1.41f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.48f, 11.1f)
                curveToRelative(-0.77f, 0.46f, -1.51f, 1.04f, -2.19f, 1.73f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.03f, 0.01f, 1.41f)
                curveToRelative(0.56f, 0.55f, 1.22f, 0.19f, 1.41f, -0.01f)
                curveToRelative(0.56f, -0.57f, 1.17f, -1.04f, 1.79f, -1.42f)
                curveToRelative(0.47f, -0.28f, 0.63f, -0.9f, 0.35f, -1.37f)
                curveToRelative(-0.28f, -0.47f, -0.9f, -0.63f, -1.37f, -0.35f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.52f, 11.1f)
                curveToRelative(-0.47f, -0.28f, -1.09f, -0.13f, -1.37f, 0.35f)
                curveToRelative(-0.28f, 0.47f, -0.13f, 1.09f, 0.35f, 1.37f)
                curveToRelative(0.63f, 0.37f, 1.23f, 0.85f, 1.79f, 1.42f)
                curveToRelative(0.2f, 0.2f, 0.85f, 0.56f, 1.41f, 0.01f)
                curveToRelative(0.39f, -0.39f, 0.4f, -1.02f, 0.01f, -1.41f)
                curveToRelative(-0.68f, -0.69f, -1.42f, -1.27f, -2.19f, -1.73f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 18.5f)
                moveToRelative(-2.5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 14f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-9f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                close()
            }
        }.also { _WifiExclamation = it}
