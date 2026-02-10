package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Wifi: ImageVector? = null

val Icons.Rc.Wifi: ImageVector
    get() = _Wifi ?: UXIcon(name = "Wifi") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.71f, 7.68f)
                curveToRelative(-2.99f, -3.02f, -6.79f, -4.68f, -10.71f, -4.68f)
                reflectiveCurveToRelative(-7.72f, 1.66f, -10.71f, 4.68f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.01f, 1.41f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, -0.01f)
                curveToRelative(2.61f, -2.64f, 5.91f, -4.09f, 9.29f, -4.09f)
                reflectiveCurveToRelative(6.68f, 1.45f, 9.29f, 4.09f)
                curveToRelative(0.2f, 0.2f, 0.83f, 0.56f, 1.41f, 0.01f)
                curveToRelative(0.4f, -0.38f, 0.4f, -1.02f, 0.01f, -1.41f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 9.82f)
                curveToRelative(-2.44f, 0f, -4.76f, 1.04f, -6.71f, 3.01f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.01f, 1.42f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.42f, -0.01f)
                curveToRelative(1.57f, -1.58f, 3.4f, -2.42f, 5.29f, -2.42f)
                reflectiveCurveToRelative(3.72f, 0.84f, 5.29f, 2.42f)
                curveToRelative(0.2f, 0.2f, 0.82f, 0.57f, 1.42f, 0.01f)
                curveToRelative(0.4f, -0.38f, 0.4f, -1.02f, 0.01f, -1.42f)
                curveToRelative(-1.95f, -1.97f, -4.27f, -3.01f, -6.71f, -3.01f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 18.5f)
                moveToRelative(-2.5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5f, 0f)
            }
        }.also { _Wifi = it}
