package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Suggestion: ImageVector? = null

val Icons.Bs.Suggestion: ImageVector
    get() = _Suggestion ?: UXIcon(name = "Suggestion") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.09f, 16f)
                horizontalLineToRelative(-3.09f)
                verticalLineToRelative(-3.09f)
                lineToRelative(6.28f, -6.28f)
                curveToRelative(0.85f, -0.85f, 2.23f, -0.85f, 3.09f, 0f)
                reflectiveCurveToRelative(0.85f, 2.23f, 0f, 3.09f)
                close()
                moveTo(6.5f, 13f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0f, -3.59f, 2.91f, -6.5f, 6.5f, -6.5f)
                reflectiveCurveToRelative(6.5f, 2.91f, 6.5f, 6.5f)
                reflectiveCurveToRelative(-2.91f, 6.5f, -6.5f, 6.5f)
                close()
                moveTo(3.5f, 5.03f)
                horizontalLineToRelative(2f)
                curveToRelative(0.05f, -0.65f, 0.49f, -1.14f, 1.29f, -0.99f)
                curveToRelative(0.33f, 0.09f, 0.62f, 0.39f, 0.69f, 0.74f)
                curveToRelative(0.11f, 0.52f, -0.18f, 0.94f, -0.51f, 1.11f)
                curveToRelative(-0.4f, 0.21f, -1.47f, 0.77f, -1.47f, 2.12f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -0.06f, 0f, -0.14f, 0.4f, -0.35f)
                curveToRelative(1.2f, -0.63f, 1.81f, -1.95f, 1.54f, -3.29f)
                curveToRelative(-0.23f, -1.09f, -1.07f, -1.98f, -2.14f, -2.26f)
                curveToRelative(-0.92f, -0.24f, -1.87f, -0.05f, -2.61f, 0.52f)
                curveToRelative(-0.74f, 0.57f, -1.18f, 1.47f, -1.18f, 2.4f)
                close()
                moveTo(5.5f, 11f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(21.0f, 20.43f)
                lineTo(17.6f, 19.0f)
                horizontalLineToRelative(-8.6f)
                verticalLineToRelative(-4.38f)
                curveToRelative(-0.79f, 0.24f, -1.63f, 0.38f, -2.5f, 0.38f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(11f)
                lineToRelative(4.44f, 1.86f)
                curveToRelative(0.21f, 0.09f, 0.46f, 0.14f, 0.68f, 0.13f)
                curveToRelative(1.03f, 0f, 1.87f, -0.84f, 1.87f, -1.87f)
                lineToRelative(0.01f, -10.13f)
                lineToRelative(-3.0f, 3.0f)
                close()
                moveTo(14.86f, 5f)
                curveToRelative(0.09f, 0.49f, 0.14f, 0.99f, 0.14f, 1.5f)
                reflectiveCurveToRelative(-0.05f, 1.01f, -0.14f, 1.5f)
                horizontalLineToRelative(1.23f)
                lineToRelative(2.77f, -2.77f)
                curveToRelative(0.09f, -0.09f, 0.18f, -0.15f, 0.27f, -0.23f)
                close()
            }
        }.also { _Suggestion = it}
