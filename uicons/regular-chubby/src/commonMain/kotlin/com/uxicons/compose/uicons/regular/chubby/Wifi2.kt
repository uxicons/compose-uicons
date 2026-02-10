package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Wifi2: ImageVector? = null

val Icons.Rc.Wifi2: ImageVector
    get() = _Wifi2 ?: UXIcon(name = "Wifi2") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.71f, 9.42f)
                curveToRelative(-1.95f, -1.97f, -4.27f, -3.01f, -6.71f, -3.01f)
                reflectiveCurveToRelative(-4.76f, 1.04f, -6.71f, 3.01f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.01f, 1.42f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, -0.01f)
                curveToRelative(1.57f, -1.58f, 3.4f, -2.42f, 5.29f, -2.42f)
                reflectiveCurveToRelative(3.72f, 0.84f, 5.29f, 2.42f)
                curveToRelative(0.2f, 0.2f, 0.84f, 0.56f, 1.41f, 0.01f)
                curveToRelative(0.4f, -0.38f, 0.4f, -1.02f, 0.01f, -1.42f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 15.09f)
                moveToRelative(-2.5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5f, 0f)
            }
        }.also { _Wifi2 = it}
