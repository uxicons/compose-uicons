package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EmptySet: ImageVector? = null

val Icons.Tc.EmptySet: ImageVector
    get() = _EmptySet ?: UXIcon(name = "EmptySet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.85f, 1.15f)
                curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0f)
                lineToRelative(-2.86f, 2.86f)
                curveToRelative(-1.61f, -1.38f, -3.99f, -2.01f, -7.29f, -2.01f)
                curveToRelative(-7.1f, 0f, -10f, 2.9f, -10f, 10f)
                curveToRelative(0f, 3.29f, 0.63f, 5.67f, 2.01f, 7.29f)
                lineToRelative(-2.86f, 2.86f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                reflectiveCurveToRelative(0.51f, 0.2f, 0.71f, 0f)
                lineToRelative(2.86f, -2.86f)
                curveToRelative(1.61f, 1.38f, 3.99f, 2.01f, 7.29f, 2.01f)
                curveToRelative(7.1f, 0f, 10f, -2.9f, 10f, -10f)
                curveToRelative(0f, -3.29f, -0.63f, -5.67f, -2.01f, -7.29f)
                lineToRelative(2.86f, -2.86f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                close()
                moveTo(3f, 12f)
                curveToRelative(0f, -6.48f, 2.52f, -9f, 9f, -9f)
                curveToRelative(2.97f, 0f, 5.11f, 0.54f, 6.55f, 1.74f)
                lineToRelative(-13.81f, 13.81f)
                curveToRelative(-1.2f, -1.45f, -1.74f, -3.58f, -1.74f, -6.55f)
                close()
                moveTo(21f, 12f)
                curveToRelative(0f, 6.48f, -2.52f, 9f, -9f, 9f)
                curveToRelative(-2.97f, 0f, -5.11f, -0.54f, -6.55f, -1.74f)
                lineToRelative(13.81f, -13.81f)
                curveToRelative(1.2f, 1.45f, 1.74f, 3.58f, 1.74f, 6.55f)
                close()
            }
        }.also { _EmptySet = it}
