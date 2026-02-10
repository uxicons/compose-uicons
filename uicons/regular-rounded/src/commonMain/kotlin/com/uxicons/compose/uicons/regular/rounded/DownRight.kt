package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DownRight: ImageVector? = null

val Icons.Rr.DownRight: ImageVector
    get() = _DownRight ?: UXIcon(name = "DownRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 23f)
                curveToRelative(-1.23f, 0f, -2.29f, -0.71f, -2.77f, -1.84f)
                curveToRelative(-0.48f, -1.14f, -0.23f, -2.39f, 0.64f, -3.27f)
                lineToRelative(1.48f, -1.48f)
                lineTo(2.17f, 9.24f)
                curveToRelative(-1.56f, -1.56f, -1.56f, -4.1f, 0f, -5.66f)
                lineToRelative(1.41f, -1.42f)
                curveToRelative(1.56f, -1.56f, 4.1f, -1.56f, 5.66f, 0f)
                lineToRelative(7.17f, 7.17f)
                lineToRelative(1.47f, -1.47f)
                curveToRelative(0.88f, -0.87f, 2.12f, -1.12f, 3.27f, -0.64f)
                curveToRelative(1.14f, 0.47f, 1.85f, 1.54f, 1.85f, 2.77f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 2.2f, -1.8f, 4f, -4f, 4f)
                horizontalLineTo(10f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                close()
                moveTo(6.41f, 3f)
                curveToRelative(-0.51f, 0f, -1.03f, 0.19f, -1.42f, 0.58f)
                lineToRelative(-1.41f, 1.42f)
                curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0f, 2.83f)
                lineToRelative(7.88f, 7.88f)
                curveToRelative(0.19f, 0.19f, 0.29f, 0.44f, 0.29f, 0.71f)
                reflectiveCurveToRelative(-0.11f, 0.52f, -0.29f, 0.71f)
                lineToRelative(-2.18f, 2.18f)
                curveToRelative(-0.43f, 0.44f, -0.27f, 0.94f, -0.21f, 1.09f)
                curveToRelative(0.06f, 0.14f, 0.3f, 0.61f, 0.92f, 0.61f)
                horizontalLineToRelative(9f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(10f)
                curveToRelative(0f, -0.62f, -0.47f, -0.87f, -0.61f, -0.92f)
                reflectiveCurveToRelative(-0.65f, -0.22f, -1.09f, 0.21f)
                lineToRelative(-2.18f, 2.18f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                lineTo(7.83f, 3.58f)
                curveToRelative(-0.39f, -0.39f, -0.9f, -0.58f, -1.41f, -0.58f)
                close()
            }
        }.also { _DownRight = it}
