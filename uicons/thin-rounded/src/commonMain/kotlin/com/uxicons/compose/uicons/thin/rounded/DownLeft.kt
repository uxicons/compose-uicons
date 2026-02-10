package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DownLeft: ImageVector? = null

val Icons.Tr.DownLeft: ImageVector
    get() = _DownLeft ?: UXIcon(name = "DownLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.35f, 23f)
                horizontalLineTo(4.5f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.58f, -3.5f, -3.5f)
                verticalLineTo(9.65f)
                curveToRelative(0f, -1.09f, 0.62f, -2.02f, 1.62f, -2.44f)
                curveToRelative(1f, -0.42f, 2.1f, -0.2f, 2.88f, 0.56f)
                lineToRelative(2.18f, 2.18f)
                lineTo(15.61f, 2.03f)
                curveToRelative(1.36f, -1.36f, 3.58f, -1.37f, 4.95f, 0f)
                lineToRelative(1.41f, 1.41f)
                curveToRelative(0.66f, 0.66f, 1.03f, 1.54f, 1.03f, 2.47f)
                reflectiveCurveToRelative(-0.36f, 1.81f, -1.03f, 2.47f)
                lineToRelative(-7.93f, 7.93f)
                lineToRelative(2.18f, 2.18f)
                curveToRelative(0.77f, 0.77f, 0.98f, 1.87f, 0.57f, 2.88f)
                curveToRelative(-0.42f, 1f, -1.35f, 1.62f, -2.44f, 1.62f)
                close()
                moveTo(3.66f, 8.01f)
                curveToRelative(-0.24f, 0f, -0.46f, 0.05f, -0.65f, 0.13f)
                curveToRelative(-0.49f, 0.2f, -1.01f, 0.71f, -1.01f, 1.52f)
                verticalLineToRelative(9.85f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineTo(14.35f)
                curveToRelative(0.81f, 0f, 1.31f, -0.52f, 1.52f, -1f)
                reflectiveCurveToRelative(0.22f, -1.21f, -0.35f, -1.79f)
                lineToRelative(-2.53f, -2.53f)
                curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0f, -0.71f)
                lineTo(21.27f, 7.68f)
                horizontalLineToRelative(0f)
                curveToRelative(0.47f, -0.47f, 0.73f, -1.1f, 0.73f, -1.77f)
                reflectiveCurveToRelative(-0.26f, -1.29f, -0.73f, -1.77f)
                lineToRelative(-1.41f, -1.41f)
                curveToRelative(-0.98f, -0.98f, -2.56f, -0.97f, -3.54f, 0f)
                lineTo(8.04f, 11.02f)
                curveToRelative(-0.19f, 0.19f, -0.52f, 0.19f, -0.71f, 0f)
                lineToRelative(-2.54f, -2.54f)
                curveToRelative(-0.35f, -0.35f, -0.76f, -0.48f, -1.14f, -0.48f)
                close()
            }
        }.also { _DownLeft = it}
