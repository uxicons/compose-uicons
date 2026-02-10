package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WingsBox: ImageVector? = null

val Icons.Sr.WingsBox: ImageVector
    get() = _WingsBox ?: UXIcon(name = "WingsBox") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 12f)
                horizontalLineToRelative(-6f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(6f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
                moveTo(13f, 17f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(22.64f, 3.88f)
                curveToRelative(0.22f, 0.32f, 0.36f, 0.7f, 0.36f, 1.11f)
                curveToRelative(0f, 0.87f, -0.56f, 1.61f, -1.34f, 1.88f)
                curveToRelative(0.22f, 0.32f, 0.34f, 0.7f, 0.34f, 1.12f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-16f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                curveToRelative(0f, -0.41f, 0.13f, -0.8f, 0.34f, -1.12f)
                curveToRelative(-0.78f, -0.27f, -1.34f, -1.01f, -1.34f, -1.88f)
                curveToRelative(0f, -0.42f, 0.14f, -0.8f, 0.36f, -1.11f)
                curveToRelative(-0.79f, -0.27f, -1.36f, -1.01f, -1.36f, -1.89f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(3.5f)
                curveToRelative(2.88f, 0f, 3.76f, 2.51f, 3.86f, 3f)
                curveToRelative(0.33f, 1.64f, 0.98f, 3.66f, 2.64f, 5f)
                curveToRelative(1.67f, -1.34f, 2.31f, -3.37f, 2.64f, -5f)
                curveToRelative(0.1f, -0.49f, 0.97f, -3f, 3.86f, -3f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                curveToRelative(0f, 0.88f, -0.57f, 1.62f, -1.36f, 1.89f)
                close()
            }
        }.also { _WingsBox = it}
