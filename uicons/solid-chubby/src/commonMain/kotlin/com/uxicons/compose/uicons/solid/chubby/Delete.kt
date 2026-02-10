package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Delete: ImageVector? = null

val Icons.Sc.Delete: ImageVector
    get() = _Delete ?: UXIcon(name = "Delete") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.03f, 5.09f)
                curveToRelative(-0.1f, -0.33f, -0.36f, -0.58f, -0.69f, -0.67f)
                curveToRelative(-0.13f, -0.04f, -3.23f, -0.9f, -7.37f, -0.9f)
                curveToRelative(-4.17f, 0f, -7.51f, 0.95f, -7.58f, 0.98f)
                curveToRelative(-0.17f, 0.1f, -1.09f, 0.66f, -2.46f, 2.48f)
                curveToRelative(-1.85f, 2.48f, -2.81f, 4.5f, -2.85f, 4.58f)
                curveToRelative(-0.13f, 0.27f, -0.13f, 0.58f, 0f, 0.85f)
                curveToRelative(0.04f, 0.08f, 0.99f, 2.1f, 2.85f, 4.58f)
                curveToRelative(1.36f, 1.82f, 2.29f, 2.39f, 2.46f, 2.48f)
                curveToRelative(0.07f, 0.04f, 3.41f, 0.98f, 7.58f, 0.98f)
                curveToRelative(4.13f, 0f, 7.24f, -0.86f, 7.37f, -0.9f)
                curveToRelative(0.33f, -0.09f, 0.59f, -0.35f, 0.69f, -0.67f)
                curveToRelative(0.04f, -0.13f, 0.97f, -3.24f, 0.97f, -6.91f)
                reflectiveCurveToRelative(-0.93f, -6.77f, -0.97f, -6.91f)
                close()
                moveTo(16.84f, 13.85f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineToRelative(-1.85f, -1.85f)
                lineToRelative(-1.85f, 1.85f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(1.85f, -1.85f)
                lineToRelative(-1.85f, -1.85f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(1.85f, 1.85f)
                lineToRelative(1.85f, -1.85f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(-1.85f, 1.85f)
                lineToRelative(1.85f, 1.85f)
                close()
            }
        }.also { _Delete = it}
