package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Deer: ImageVector? = null

val Icons.Ss.Deer: ImageVector
    get() = _Deer ?: UXIcon(name = "Deer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.38f, 7.45f)
                lineToRelative(-0.1f, -0.11f)
                curveToRelative(-0.79f, -0.81f, -1.59f, -1.63f, -2.92f, -2.36f)
                curveToRelative(1.0f, -0.83f, 1.65f, -2.08f, 1.65f, -3.48f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineTo(0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.92f, 0.28f, 1.78f, 0.76f, 2.5f)
                horizontalLineToRelative(-1.26f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineTo(0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(2.07f)
                curveToRelative(-0.46f, 0.94f, -0.57f, 1.99f, -0.57f, 2.59f)
                verticalLineToRelative(1.41f)
                horizontalLineTo(5.89f)
                curveToRelative(-1.27f, 0f, -2.44f, 0.6f, -3.21f, 1.51f)
                lineTo(0.0f, 14.55f)
                lineToRelative(2.09f, 1.81f)
                curveToRelative(0.13f, 0.39f, 0.77f, 1.87f, 0.91f, 2.29f)
                verticalLineToRelative(5.35f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-5.12f)
                curveToRelative(0.63f, -0.75f, 2f, -2.69f, 2f, -5.49f)
                verticalLineToRelative(-2.02f)
                lineToRelative(2.1f, -0.26f)
                curveToRelative(1.08f, -0.14f, 1.9f, -1.06f, 1.9f, -2.15f)
                curveToRelative(0f, -0.57f, -0.22f, -1.11f, -0.62f, -1.52f)
                close()
            }
        }.also { _Deer = it}
