package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MouseField: ImageVector? = null

val Icons.Ss.MouseField: ImageVector
    get() = _MouseField ?: UXIcon(name = "MouseField") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 18f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                lineTo(3f, 20f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                lineTo(13f, 22f)
                verticalLineToRelative(2f)
                lineTo(3f, 24f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, -0.08f, 0.08f, -6.27f, 4.97f, -8.87f)
                curveToRelative(0.49f, 0.48f, 1.05f, 0.89f, 1.69f, 1.2f)
                curveToRelative(0.03f, 0.06f, 0.15f, 0.36f, 0.15f, 0.36f)
                curveToRelative(1.31f, 2.62f, 4.13f, 4.32f, 7.2f, 4.32f)
                horizontalLineToRelative(0.98f)
                verticalLineToRelative(3f)
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
                curveToRelative(0.16f, 0.32f, 0.26f, 1.44f, 0.26f, 1.44f)
                curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                verticalLineToRelative(1.0f)
                curveToRelative(1.26f, -1.06f, 1.28f, -2.42f, 1.28f, -3.42f)
                curveToRelative(0f, 0f, 0.32f, 0.14f, 0.71f, 0.3f)
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
