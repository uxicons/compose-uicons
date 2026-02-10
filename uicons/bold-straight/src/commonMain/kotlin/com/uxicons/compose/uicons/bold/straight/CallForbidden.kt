package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CallForbidden: ImageVector? = null

val Icons.Bs.CallForbidden: ImageVector
    get() = _CallForbidden ?: UXIcon(name = "CallForbidden") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.9f, -0.01f)
                curveTo(5.28f, -0.01f, -0.1f, 5.37f, -0.1f, 11.99f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.52f, -0.01f, 11.9f, -0.01f)
                close()
                moveTo(11.9f, 2.99f)
                curveToRelative(1.94f, 0f, 3.73f, 0.62f, 5.21f, 1.67f)
                lineToRelative(-1.72f, 1.72f)
                curveToRelative(-1.32f, -0.9f, -2.87f, -1.39f, -4.49f, -1.39f)
                verticalLineToRelative(3f)
                curveToRelative(0.81f, 0f, 1.59f, 0.21f, 2.3f, 0.58f)
                lineToRelative(-4.4f, 4.4f)
                curveToRelative(-0.3f, -0.46f, -0.56f, -0.95f, -0.78f, -1.5f)
                lineToRelative(1.77f, -1.77f)
                lineToRelative(-2.71f, -2.71f)
                lineToRelative(-1.38f, 1.38f)
                curveToRelative(-0.54f, 0.54f, -0.8f, 1.25f, -0.8f, 1.96f)
                curveToRelative(0f, 1.53f, 0.77f, 3.18f, 1.92f, 4.62f)
                lineToRelative(-2.25f, 2.25f)
                curveToRelative(-1.05f, -1.47f, -1.67f, -3.27f, -1.67f, -5.21f)
                curveTo(2.9f, 7.03f, 6.94f, 2.99f, 11.9f, 2.99f)
                close()
                moveTo(11.9f, 20.99f)
                curveToRelative(-1.94f, 0f, -3.73f, -0.62f, -5.21f, -1.67f)
                lineTo(19.23f, 6.78f)
                curveToRelative(1.05f, 1.47f, 1.67f, 3.27f, 1.67f, 5.21f)
                curveToRelative(0f, 4.96f, -4.04f, 9f, -9f, 9f)
                close()
                moveTo(18.9f, 12.99f)
                horizontalLineToRelative(-3f)
                curveToRelative(0f, -0.01f, -0.0f, -0.03f, -0.0f, -0.04f)
                lineToRelative(2.56f, -2.56f)
                curveToRelative(0.28f, 0.83f, 0.44f, 1.7f, 0.44f, 2.6f)
                close()
                moveTo(14.44f, 14.36f)
                lineToRelative(2.46f, 2.46f)
                lineToRelative(-1.38f, 1.38f)
                curveToRelative(-0.54f, 0.54f, -1.25f, 0.8f, -1.96f, 0.8f)
                curveToRelative(-0.92f, 0f, -1.92f, -0.32f, -2.92f, -0.83f)
                lineToRelative(3.79f, -3.79f)
                close()
            }
        }.also { _CallForbidden = it}
