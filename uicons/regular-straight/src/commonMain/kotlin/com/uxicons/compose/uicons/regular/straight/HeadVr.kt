package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeadVr: ImageVector? = null

val Icons.Rs.HeadVr: ImageVector
    get() = _HeadVr ?: UXIcon(name = "HeadVr") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.06f, 10f)
                lineTo(10.13f, 10f)
                curveToRelative(0.45f, 1.72f, 2.01f, 3f, 3.87f, 3f)
                horizontalLineToRelative(10f)
                lineTo(24f, 5f)
                horizontalLineToRelative(-3.77f)
                curveToRelative(-0.15f, -0.22f, -0.29f, -0.41f, -0.43f, -0.58f)
                curveTo(17.36f, 1.16f, 13.49f, -0.45f, 9.45f, 0.11f)
                curveTo(4.46f, 0.79f, 0.5f, 4.95f, 0.05f, 9.98f)
                curveToRelative(-0.27f, 2.94f, 0.62f, 5.79f, 2.5f, 8.05f)
                curveToRelative(0.29f, 0.35f, 0.46f, 0.8f, 0.46f, 1.26f)
                verticalLineToRelative(4.71f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2.25f)
                curveToRelative(1.5f, 0f, 2.78f, -1.12f, 2.97f, -2.61f)
                lineToRelative(0.45f, -3.39f)
                horizontalLineToRelative(-2.02f)
                lineToRelative(-0.41f, 3.13f)
                curveToRelative(-0.07f, 0.49f, -0.49f, 0.87f, -0.99f, 0.87f)
                horizontalLineToRelative(-4.25f)
                verticalLineToRelative(3f)
                lineTo(5f, 22f)
                verticalLineToRelative(-2.71f)
                curveToRelative(0f, -0.93f, -0.33f, -1.83f, -0.92f, -2.54f)
                curveToRelative(-1.53f, -1.84f, -2.26f, -4.18f, -2.04f, -6.59f)
                curveToRelative(0.01f, -0.06f, 0.01f, -0.11f, 0.02f, -0.16f)
                close()
                moveTo(22f, 11f)
                lineTo(14f, 11f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(4f)
                close()
                moveTo(9.72f, 2.09f)
                curveToRelative(3.02f, -0.42f, 5.95f, 0.66f, 7.97f, 2.91f)
                horizontalLineToRelative(-3.69f)
                curveToRelative(-1.86f, 0f, -3.43f, 1.28f, -3.87f, 3f)
                lineTo(2.51f, 8f)
                curveToRelative(1.1f, -3.1f, 3.87f, -5.45f, 7.21f, -5.91f)
                close()
            }
        }.also { _HeadVr = it}
