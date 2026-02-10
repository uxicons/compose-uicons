package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareG: ImageVector? = null

val Icons.Tr.SquareG: ImageVector
    get() = _SquareG ?: UXIcon(name = "SquareG") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.5f, 0f)
                lineTo(4.5f, 0f)
                curveTo(2.02f, 0f, 0f, 2.02f, 0f, 4.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(23f, 19.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(4.5f, 23f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(1f, 4.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(15f)
                close()
                moveTo(18.57f, 12.75f)
                curveToRelative(0.39f, 0.47f, 0.54f, 1.09f, 0.41f, 1.69f)
                curveToRelative(-0.56f, 2.71f, -2.69f, 5.57f, -6.98f, 5.57f)
                curveToRelative(-0.07f, 0f, -0.14f, 0f, -0.21f, -0.0f)
                curveToRelative(-3.81f, -0.08f, -6.79f, -3.26f, -6.79f, -7.23f)
                verticalLineToRelative(-1.52f)
                curveToRelative(0f, -3.85f, 3.02f, -7.1f, 6.73f, -7.24f)
                curveToRelative(2.46f, -0.1f, 4.83f, 1.15f, 6.17f, 3.23f)
                curveToRelative(0.15f, 0.23f, 0.08f, 0.54f, -0.15f, 0.69f)
                curveToRelative(-0.23f, 0.15f, -0.54f, 0.08f, -0.69f, -0.15f)
                curveToRelative(-1.16f, -1.81f, -3.16f, -2.85f, -5.29f, -2.77f)
                curveToRelative(-3.18f, 0.12f, -5.77f, 2.92f, -5.77f, 6.24f)
                verticalLineToRelative(1.52f)
                curveToRelative(0f, 3.42f, 2.55f, 6.16f, 5.81f, 6.23f)
                curveToRelative(3.82f, 0.09f, 5.71f, -2.41f, 6.19f, -4.77f)
                curveToRelative(0.06f, -0.3f, -0.01f, -0.61f, -0.21f, -0.85f)
                curveToRelative(-0.2f, -0.24f, -0.49f, -0.38f, -0.8f, -0.38f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(5f)
                curveToRelative(0.61f, 0f, 1.18f, 0.27f, 1.57f, 0.75f)
                close()
            }
        }.also { _SquareG = it}
