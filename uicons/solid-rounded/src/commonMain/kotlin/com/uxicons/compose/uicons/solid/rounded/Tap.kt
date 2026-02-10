package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tap: ImageVector? = null

val Icons.Sr.Tap: ImageVector
    get() = _Tap ?: UXIcon(name = "Tap") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 19.7f)
                verticalLineToRelative(2.8f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineTo(4.69f)
                curveToRelative(-0.54f, 0f, -1.05f, -0.22f, -1.43f, -0.6f)
                lineToRelative(-1.54f, -1.58f)
                curveToRelative(-0.79f, -0.79f, -0.97f, -2.06f, -0.3f, -2.96f)
                curveToRelative(0.69f, -0.93f, 1.92f, -1.14f, 2.85f, -0.62f)
                curveToRelative(0.22f, 0.14f, 0.39f, 0.27f, 0.49f, 0.37f)
                lineToRelative(2.25f, 2.29f)
                verticalLineTo(6f)
                curveToRelative(0f, -1.22f, 1.08f, -2.18f, 2.34f, -1.97f)
                curveToRelative(0.98f, 0.16f, 1.66f, 1.08f, 1.66f, 2.08f)
                verticalLineToRelative(7.39f)
                reflectiveCurveToRelative(8.12f, 2.35f, 8.12f, 2.35f)
                curveToRelative(1.71f, 0.5f, 2.88f, 2.06f, 2.88f, 3.84f)
                close()
                moveTo(4.71f, 11.31f)
                curveToRelative(0.45f, -0.32f, 0.55f, -0.95f, 0.23f, -1.4f)
                curveToRelative(-0.61f, -0.85f, -0.94f, -1.86f, -0.94f, -2.92f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                curveToRelative(0f, 1.06f, -0.32f, 2.06f, -0.94f, 2.92f)
                curveToRelative(-0.32f, 0.45f, -0.22f, 1.07f, 0.23f, 1.4f)
                curveToRelative(0.18f, 0.13f, 0.38f, 0.19f, 0.58f, 0.19f)
                curveToRelative(0.31f, 0f, 0.62f, -0.14f, 0.81f, -0.42f)
                curveToRelative(0.86f, -1.2f, 1.31f, -2.61f, 1.31f, -4.08f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                reflectiveCurveTo(2f, 3.14f, 2f, 7f)
                curveToRelative(0f, 1.48f, 0.46f, 2.89f, 1.31f, 4.08f)
                curveToRelative(0.32f, 0.45f, 0.95f, 0.55f, 1.4f, 0.23f)
                close()
            }
        }.also { _Tap = it}
