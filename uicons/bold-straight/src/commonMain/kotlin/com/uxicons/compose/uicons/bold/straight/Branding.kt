package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Branding: ImageVector? = null

val Icons.Bs.Branding: ImageVector
    get() = _Branding ?: UXIcon(name = "Branding") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 5.66f)
                verticalLineToRelative(16.34f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-14f)
                horizontalLineToRelative(-5f)
                lineTo(16f, 3f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.71f, 0f, -1.39f, 0.15f, -2f, 0.42f)
                lineTo(6f, 3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(9.38f)
                lineToRelative(5.62f, 5.66f)
                close()
                moveTo(2f, 0f)
                curveTo(0.9f, 0f, 0f, 0.9f, 0f, 2f)
                verticalLineToRelative(12f)
                lineToRelative(2f, 2f)
                lineToRelative(2f, -2f)
                lineTo(4f, 2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(12.35f, 17.85f)
                lineToRelative(4.66f, -4.66f)
                curveToRelative(-0.32f, -0.12f, -0.66f, -0.19f, -1.01f, -0.19f)
                horizontalLineToRelative(-8f)
                curveToRelative(-0.36f, 0f, -0.7f, 0.07f, -1.01f, 0.19f)
                lineToRelative(4.66f, 4.66f)
                curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0f)
                close()
                moveTo(14.47f, 19.97f)
                curveToRelative(-0.68f, 0.68f, -1.58f, 1.02f, -2.48f, 1.02f)
                reflectiveCurveToRelative(-1.79f, -0.34f, -2.48f, -1.02f)
                lineToRelative(-4.47f, -4.47f)
                curveToRelative(-0.03f, 0.17f, -0.05f, 0.33f, -0.05f, 0.51f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -0.17f, -0.02f, -0.34f, -0.05f, -0.51f)
                lineToRelative(-4.47f, 4.47f)
                close()
            }
        }.also { _Branding = it}
