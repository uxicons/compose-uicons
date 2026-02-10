package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Museum: ImageVector? = null

val Icons.Bs.Museum: ImageVector
    get() = _Museum ?: UXIcon(name = "Museum") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 12.0f)
                verticalLineToRelative(-3.85f)
                curveToRelative(0f, -1.28f, -0.7f, -2.46f, -1.82f, -3.07f)
                lineToRelative(-8.54f, -4.66f)
                curveToRelative(-1.02f, -0.56f, -2.24f, -0.56f, -3.27f, 0f)
                lineToRelative(-8.54f, 4.66f)
                curveToRelative(-1.12f, 0.61f, -1.82f, 1.79f, -1.82f, 3.07f)
                verticalLineToRelative(3.85f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-9.0f)
                close()
                moveTo(3f, 8.15f)
                curveToRelative(0f, -0.18f, 0.1f, -0.35f, 0.26f, -0.44f)
                lineToRelative(8.54f, -4.66f)
                curveToRelative(0.12f, -0.07f, 0.27f, -0.07f, 0.39f, 0f)
                lineToRelative(8.54f, 4.66f)
                curveToRelative(0.16f, 0.09f, 0.26f, 0.26f, 0.26f, 0.44f)
                verticalLineToRelative(0.85f)
                horizontalLineToRelative(-18f)
                close()
                moveTo(13f, 12.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-9.0f)
                close()
                moveTo(6f, 12.0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(18f, 21f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(2f)
                close()
                moveTo(13.5f, 6.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _Museum = it}
