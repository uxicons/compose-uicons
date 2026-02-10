package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoxingGlove: ImageVector? = null

val Icons.Ts.BoxingGlove: ImageVector
    get() = _BoxingGlove ?: UXIcon(name = "BoxingGlove") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 7.04f)
                verticalLineToRelative(-0.54f)
                curveToRelative(0f, -3.58f, -2.92f, -6.5f, -6.5f, -6.5f)
                horizontalLineTo(7.5f)
                curveTo(3.92f, 0f, 1f, 2.92f, 1f, 6.5f)
                verticalLineToRelative(7.87f)
                curveToRelative(0f, 1.55f, 0.47f, 3.04f, 1.36f, 4.31f)
                lineToRelative(0.64f, 0.91f)
                verticalLineToRelative(4.41f)
                horizontalLineTo(20f)
                verticalLineToRelative(-4.36f)
                lineToRelative(0.67f, -0.64f)
                curveToRelative(1.48f, -1.41f, 2.33f, -3.39f, 2.33f, -5.43f)
                verticalLineToRelative(-3.08f)
                curveToRelative(0f, -1.76f, -1.31f, -3.22f, -3f, -3.46f)
                close()
                moveTo(4f, 23f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(3f)
                horizontalLineTo(4f)
                close()
                moveTo(22f, 13.57f)
                curveToRelative(0f, 1.77f, -0.74f, 3.49f, -2.02f, 4.71f)
                lineToRelative(-0.75f, 0.71f)
                horizontalLineTo(3.81f)
                lineToRelative(-0.63f, -0.9f)
                curveToRelative(-0.77f, -1.1f, -1.18f, -2.39f, -1.18f, -3.73f)
                verticalLineToRelative(-5.42f)
                curveToRelative(0.64f, 0.65f, 1.52f, 1.05f, 2.5f, 1.05f)
                horizontalLineTo(14f)
                verticalLineToRelative(-1f)
                horizontalLineTo(4.5f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                curveTo(2f, 3.47f, 4.47f, 1f, 7.5f, 1f)
                horizontalLineToRelative(6f)
                curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
                verticalLineToRelative(0.54f)
                curveToRelative(-1.69f, 0.24f, -3f, 1.7f, -3f, 3.46f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(3.08f)
                close()
            }
        }.also { _BoxingGlove = it}
