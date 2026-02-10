package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EmptySet: ImageVector? = null

val Icons.Sc.EmptySet: ImageVector
    get() = _EmptySet ?: UXIcon(name = "EmptySet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.56f, 1.44f)
                curveToRelative(-0.59f, -0.59f, -1.53f, -0.59f, -2.12f, 0f)
                lineToRelative(-2.04f, 2.04f)
                curveToRelative(-1.58f, -0.99f, -3.69f, -1.48f, -6.4f, -1.48f)
                curveToRelative(-6.92f, 0.0f, -10.0f, 3.08f, -10.0f, 10.0f)
                curveToRelative(0f, 2.71f, 0.48f, 4.83f, 1.48f, 6.4f)
                lineToRelative(-2.04f, 2.04f)
                curveToRelative(-0.59f, 0.59f, -0.59f, 1.53f, 0f, 2.12f)
                reflectiveCurveToRelative(1.53f, 0.59f, 2.12f, 0f)
                lineToRelative(2.04f, -2.04f)
                curveToRelative(1.58f, 0.99f, 3.69f, 1.48f, 6.4f, 1.48f)
                curveToRelative(6.92f, 0f, 10f, -3.08f, 10f, -10f)
                curveToRelative(0f, -2.71f, -0.48f, -4.83f, -1.48f, -6.4f)
                lineToRelative(2.04f, -2.04f)
                curveToRelative(0.59f, -0.58f, 0.59f, -1.54f, 0f, -2.12f)
                close()
                moveTo(5f, 12f)
                curveToRelative(0f, -5.23f, 1.77f, -7f, 7f, -7f)
                curveToRelative(1.78f, 0f, 3.15f, 0.21f, 4.19f, 0.69f)
                lineToRelative(-10.51f, 10.51f)
                curveToRelative(-0.47f, -1.04f, -0.69f, -2.41f, -0.69f, -4.19f)
                close()
                moveTo(19f, 12f)
                curveToRelative(0f, 5.23f, -1.77f, 7f, -7f, 7f)
                curveToRelative(-1.78f, 0f, -3.15f, -0.21f, -4.19f, -0.69f)
                lineToRelative(10.51f, -10.51f)
                curveToRelative(0.47f, 1.04f, 0.69f, 2.41f, 0.69f, 4.19f)
                close()
            }
        }.also { _EmptySet = it}
