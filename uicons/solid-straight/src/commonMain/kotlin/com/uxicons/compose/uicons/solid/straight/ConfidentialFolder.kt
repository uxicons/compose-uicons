package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ConfidentialFolder: ImageVector? = null

val Icons.Ss.ConfidentialFolder: ImageVector
    get() = _ConfidentialFolder ?: UXIcon(name = "ConfidentialFolder") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 14f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(6f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-7f)
                close()
                moveTo(16f, 13f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(19f, 20f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(18f, 4.1f)
                verticalLineToRelative(2.9f)
                horizontalLineToRelative(-6.29f)
                lineToRelative(-4f, -2f)
                horizontalLineToRelative(-3.71f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.68f, 1.37f, -3f, 3.13f, -3f)
                horizontalLineToRelative(6.92f)
                lineToRelative(3.95f, 4.1f)
                close()
                moveTo(11.03f, 24f)
                horizontalLineToRelative(-11.03f)
                verticalLineToRelative(-14f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(4.24f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(2.32f)
                curveToRelative(-0.75f, 0.83f, -1.28f, 1.85f, -1.47f, 3f)
                horizontalLineToRelative(-2.08f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 1.13f, 0.39f, 2.16f, 1.03f, 3f)
                close()
            }
        }.also { _ConfidentialFolder = it}
