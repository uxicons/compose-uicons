package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ConfidentialFolder: ImageVector? = null

val Icons.Bs.ConfidentialFolder: ImageVector
    get() = _ConfidentialFolder ?: UXIcon(name = "ConfidentialFolder") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3.5f, 9f)
                horizontalLineToRelative(2.8f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(2.2f)
                curveToRelative(0.92f, -2.2f, 3.02f, -3.78f, 5.5f, -3.98f)
                verticalLineToRelative(-3.3f)
                lineToRelative(-3.75f, -3.72f)
                horizontalLineToRelative(-6.62f)
                curveToRelative(-2.04f, 0f, -3.63f, 1.54f, -3.63f, 3.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(14.5f)
                horizontalLineToRelative(12.03f)
                curveToRelative(-0.64f, -0.84f, -1.03f, -1.87f, -1.03f, -3f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-11.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                close()
                moveTo(7f, 3.5f)
                curveToRelative(0f, -0.3f, 0.25f, -0.5f, 0.63f, -0.5f)
                horizontalLineToRelative(5.37f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3.99f)
                lineToRelative(-4f, -2f)
                horizontalLineToRelative(-0.01f)
                close()
                moveTo(23f, 15f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveToRelative(-4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(5f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-6f)
                close()
                moveTo(17f, 13.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(20f, 21f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                close()
            }
        }.also { _ConfidentialFolder = it}
