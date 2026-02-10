package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MouseField: ImageVector? = null

val Icons.Rs.MouseField: ImageVector
    get() = _MouseField ?: UXIcon(name = "MouseField") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.01f, 2.0f)
                curveToRelative(-0.92f, -1.22f, -2.4f, -2.0f, -4.01f, -2.0f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                curveToRelative(0f, 1.36f, 0.55f, 2.61f, 1.46f, 3.52f)
                curveToRelative(-6.37f, 2.03f, -6.46f, 9.4f, -6.46f, 9.48f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                lineTo(13f, 24f)
                verticalLineToRelative(-2f)
                lineTo(3f, 22f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                lineTo(21f, 20f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(0.01f, -5f)
                horizontalLineToRelative(3.43f)
                curveToRelative(0.86f, 0f, 1.55f, -0.7f, 1.55f, -1.56f)
                verticalLineToRelative(-2.25f)
                curveToRelative(0f, -3.53f, -2.25f, -7.18f, -5.99f, -7.19f)
                close()
                moveTo(17.0f, 18f)
                lineTo(6f, 18f)
                curveToRelative(0f, -0.31f, 0.09f, -7.17f, 6.78f, -7.92f)
                curveToRelative(0.87f, 1.5f, 2.43f, 2.55f, 4.24f, 2.84f)
                lineToRelative(-0.01f, 5.09f)
                close()
                moveTo(22f, 11f)
                horizontalLineToRelative(-3.98f)
                curveToRelative(-1.71f, 0f, -3.22f, -0.97f, -3.76f, -2.42f)
                lineToRelative(-0.21f, -0.59f)
                curveToRelative(-0.24f, 0.01f, -0.56f, -0.05f, -0.56f, -0.05f)
                curveToRelative(-1.44f, -0.25f, -2.49f, -1.49f, -2.49f, -2.95f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                curveToRelative(1.51f, 0f, 2.81f, 1.12f, 3f, 2.62f)
                verticalLineToRelative(2.38f)
                curveToRelative(0.88f, -0.44f, 1.75f, -1.66f, 1.96f, -2.62f)
                curveToRelative(0f, 0f, 0.02f, -0.16f, 0.03f, -0.23f)
                curveToRelative(2.07f, 0.62f, 3.02f, 3.16f, 3.02f, 5.04f)
                verticalLineToRelative(1.81f)
                close()
            }
        }.also { _MouseField = it}
