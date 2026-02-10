package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Gun: ImageVector? = null

val Icons.Rr.Gun: ImageVector
    get() = _Gun ?: UXIcon(name = "Gun") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 4f)
                curveToRelative(-0.02f, 0f, -0.03f, 0.01f, -0.05f, 0.01f)
                curveToRelative(-0.2f, -0.98f, -0.97f, -1.76f, -1.95f, -1.96f)
                verticalLineToRelative(-0.05f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                lineTo(3f, 2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2.19f)
                curveToRelative(0f, 1.36f, 0.85f, 2.55f, 2.12f, 2.97f)
                curveToRelative(0.33f, 0.11f, 0.65f, 0.21f, 0.23f, 1.65f)
                lineTo(0.17f, 18.0f)
                curveToRelative(-0.72f, 1.87f, 0.82f, 4.05f, 2.83f, 4.0f)
                horizontalLineToRelative(0.76f)
                curveToRelative(1.57f, 0f, 2.96f, -1.0f, 3.45f, -2.49f)
                lineToRelative(1.16f, -3.51f)
                horizontalLineToRelative(2.81f)
                curveToRelative(2.23f, 0f, 4.15f, -1.43f, 4.79f, -3.56f)
                lineToRelative(0.73f, -2.44f)
                horizontalLineToRelative(3.79f)
                curveToRelative(1.21f, 0f, 2.22f, -0.87f, 2.45f, -2.01f)
                curveToRelative(0.02f, 0f, 0.03f, 0.01f, 0.05f, 0.01f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
                moveTo(5.32f, 18.88f)
                curveToRelative(-0.22f, 0.67f, -0.84f, 1.12f, -1.55f, 1.12f)
                horizontalLineToRelative(-0.76f)
                curveToRelative(-0.67f, 0.02f, -1.19f, -0.71f, -0.94f, -1.33f)
                lineToRelative(2.2f, -6.25f)
                curveToRelative(0.13f, -0.47f, 0.42f, -1.48f, 0.2f, -2.42f)
                horizontalLineToRelative(3.8f)
                lineToRelative(-2.94f, 8.88f)
                close()
                moveTo(14.06f, 11.86f)
                curveToRelative(-0.38f, 1.28f, -1.54f, 2.14f, -2.87f, 2.14f)
                horizontalLineToRelative(-2.15f)
                lineToRelative(0.66f, -2f)
                horizontalLineToRelative(1.3f)
                curveToRelative(0.42f, 0f, 0.8f, -0.27f, 0.94f, -0.66f)
                lineToRelative(0.48f, -1.34f)
                horizontalLineToRelative(2.2f)
                lineToRelative(-0.56f, 1.86f)
                close()
                moveTo(21f, 7.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(2.5f, 8.0f)
                curveToRelative(-0.05f, 0f, -0.1f, 0.0f, -0.15f, 0.01f)
                curveToRelative(-0.21f, -0.21f, -0.34f, -0.51f, -0.34f, -0.82f)
                verticalLineToRelative(-1.36f)
                curveToRelative(0.85f, -0.3f, 1.53f, -0.98f, 1.83f, -1.83f)
                lineTo(20.5f, 4.0f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _Gun = it}
