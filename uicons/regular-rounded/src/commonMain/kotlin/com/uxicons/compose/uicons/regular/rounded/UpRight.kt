package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UpRight: ImageVector? = null

val Icons.Rr.UpRight: ImageVector
    get() = _UpRight ?: UXIcon(name = "UpRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.41f, 23f)
                curveToRelative(-1.07f, 0f, -2.07f, -0.42f, -2.83f, -1.17f)
                lineToRelative(-1.41f, -1.41f)
                curveToRelative(-0.76f, -0.76f, -1.17f, -1.76f, -1.17f, -2.83f)
                reflectiveCurveToRelative(0.42f, -2.07f, 1.17f, -2.83f)
                lineToRelative(7.17f, -7.17f)
                lineToRelative(-1.47f, -1.47f)
                curveToRelative(-0.87f, -0.88f, -1.12f, -2.13f, -0.64f, -3.27f)
                curveToRelative(0.47f, -1.14f, 1.54f, -1.85f, 2.77f, -1.85f)
                horizontalLineToRelative(9.01f)
                curveToRelative(2.2f, 0f, 4f, 1.8f, 4f, 4f)
                horizontalLineToRelative(0f)
                verticalLineTo(14f)
                curveToRelative(0f, 1.23f, -0.7f, 2.29f, -1.84f, 2.77f)
                curveToRelative(-1.14f, 0.47f, -2.39f, 0.23f, -3.27f, -0.64f)
                lineToRelative(-1.48f, -1.48f)
                lineToRelative(-7.17f, 7.17f)
                curveToRelative(-0.76f, 0.76f, -1.76f, 1.17f, -2.83f, 1.17f)
                close()
                moveTo(10f, 3f)
                curveToRelative(-0.62f, 0f, -0.86f, 0.47f, -0.92f, 0.62f)
                curveToRelative(-0.06f, 0.14f, -0.22f, 0.65f, 0.21f, 1.09f)
                lineToRelative(2.18f, 2.18f)
                curveToRelative(0.19f, 0.19f, 0.29f, 0.44f, 0.29f, 0.71f)
                reflectiveCurveToRelative(-0.11f, 0.52f, -0.29f, 0.71f)
                lineToRelative(-7.88f, 7.88f)
                curveToRelative(-0.38f, 0.38f, -0.59f, 0.88f, -0.59f, 1.41f)
                reflectiveCurveToRelative(0.21f, 1.04f, 0.59f, 1.41f)
                lineToRelative(1.41f, 1.41f)
                curveToRelative(0.76f, 0.76f, 2.07f, 0.76f, 2.83f, 0f)
                lineToRelative(7.88f, -7.88f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(2.18f, 2.18f)
                curveToRelative(0.44f, 0.43f, 0.94f, 0.27f, 1.09f, 0.21f)
                curveToRelative(0.14f, -0.06f, 0.62f, -0.3f, 0.61f, -0.92f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineTo(10f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                close()
            }
        }.also { _UpRight = it}
