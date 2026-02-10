package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CursorFinger: ImageVector? = null

val Icons.Tr.CursorFinger: ImageVector
    get() = _CursorFinger ?: UXIcon(name = "CursorFinger") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.42f, 10.64f)
                lineToRelative(-7.42f, -1.54f)
                lineTo(11f, 2.68f)
                curveToRelative(0f, -1.27f, -0.9f, -2.38f, -2.08f, -2.57f)
                curveToRelative(-0.73f, -0.12f, -1.48f, 0.09f, -2.04f, 0.56f)
                curveToRelative(-0.56f, 0.48f, -0.88f, 1.17f, -0.88f, 1.91f)
                verticalLineToRelative(8.54f)
                lineToRelative(-2.67f, 2.64f)
                curveToRelative(-0.86f, 0.85f, -1.33f, 1.98f, -1.33f, 3.19f)
                reflectiveCurveToRelative(0.47f, 2.34f, 1.32f, 3.2f)
                lineToRelative(1.79f, 1.74f)
                curveToRelative(1.41f, 1.37f, 3.26f, 2.12f, 5.23f, 2.12f)
                horizontalLineToRelative(7.16f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-4.46f)
                curveToRelative(0f, -2.12f, -1.51f, -3.97f, -3.58f, -4.41f)
                close()
                moveTo(21f, 19.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-7.16f)
                curveToRelative(-1.7f, 0f, -3.31f, -0.65f, -4.53f, -1.84f)
                lineToRelative(-1.79f, -1.74f)
                curveToRelative(-0.66f, -0.66f, -1.03f, -1.54f, -1.02f, -2.48f)
                curveToRelative(0.0f, -0.94f, 0.37f, -1.82f, 1.04f, -2.48f)
                lineToRelative(1.96f, -1.95f)
                verticalLineToRelative(3.69f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                lineTo(7f, 2.57f)
                curveToRelative(0f, -0.44f, 0.19f, -0.86f, 0.53f, -1.14f)
                curveToRelative(0.34f, -0.29f, 0.78f, -0.41f, 1.23f, -0.34f)
                curveToRelative(0.71f, 0.12f, 1.24f, 0.8f, 1.24f, 1.59f)
                verticalLineToRelative(6.82f)
                curveToRelative(0f, 0.24f, 0.17f, 0.44f, 0.4f, 0.49f)
                lineToRelative(7.82f, 1.63f)
                curveToRelative(1.61f, 0.34f, 2.79f, 1.78f, 2.79f, 3.43f)
                verticalLineToRelative(4.46f)
                close()
            }
        }.also { _CursorFinger = it}
