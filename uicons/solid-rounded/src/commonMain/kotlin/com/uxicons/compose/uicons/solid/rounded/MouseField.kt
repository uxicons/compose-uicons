package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MouseField: ImageVector? = null

val Icons.Sr.MouseField: ImageVector
    get() = _MouseField ?: UXIcon(name = "MouseField") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 19f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(3f, 20f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                lineTo(12f, 22f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                lineTo(3.12f, 24f)
                curveToRelative(-1.45f, 0f, -2.78f, -0.98f, -3.06f, -2.4f)
                curveToRelative(-0.37f, -1.92f, 1.09f, -3.6f, 2.94f, -3.6f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, -0.08f, 0.08f, -6.27f, 4.97f, -8.87f)
                curveToRelative(0.49f, 0.48f, 1.05f, 0.89f, 1.69f, 1.2f)
                curveToRelative(0.03f, 0.06f, 0.15f, 0.36f, 0.15f, 0.36f)
                curveToRelative(1.31f, 2.62f, 4.13f, 4.32f, 7.2f, 4.32f)
                horizontalLineToRelative(0.98f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(24f, 9.19f)
                verticalLineToRelative(2.26f)
                curveToRelative(0f, 0.86f, -0.7f, 1.55f, -1.55f, 1.55f)
                horizontalLineToRelative(-4.43f)
                curveToRelative(-2.34f, 0f, -4.44f, -1.27f, -5.41f, -3.21f)
                curveToRelative(-0.16f, -0.41f, -0.32f, -0.74f, -0.48f, -1.03f)
                curveToRelative(-1.81f, -0.58f, -3.13f, -2.26f, -3.13f, -4.26f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                curveToRelative(1.98f, 0f, 3.64f, 1.28f, 4.24f, 3.06f)
                curveToRelative(0.03f, 0.06f, 0.24f, 0.72f, 0.25f, 0.99f)
                curveToRelative(0.03f, 0.54f, 0.47f, 0.95f, 1.0f, 0.95f)
                curveToRelative(0.61f, 0.01f, 1.02f, -0.49f, 0.99f, -1.05f)
                curveToRelative(-0.03f, -0.6f, -0.14f, -1.17f, -0.32f, -1.71f)
                curveToRelative(0.1f, 0.04f, 0.2f, 0.09f, 0.32f, 0.13f)
                curveToRelative(2.54f, 1.02f, 4.01f, 3.95f, 4.01f, 6.81f)
                close()
                moveTo(22f, 8.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }.also { _MouseField = it}
