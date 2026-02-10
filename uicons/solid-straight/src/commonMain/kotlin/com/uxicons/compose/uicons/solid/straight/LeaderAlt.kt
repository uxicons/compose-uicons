package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LeaderAlt: ImageVector? = null

val Icons.Ss.LeaderAlt: ImageVector
    get() = _LeaderAlt ?: UXIcon(name = "LeaderAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 3.67f)
                verticalLineToRelative(0.65f)
                lineToRelative(-2.84f, 0.84f)
                lineToRelative(-0.83f, 2.84f)
                horizontalLineToRelative(-0.65f)
                lineToRelative(-0.84f, -2.84f)
                lineToRelative(-2.84f, -0.84f)
                verticalLineToRelative(-0.65f)
                lineToRelative(2.84f, -0.83f)
                lineToRelative(0.84f, -2.84f)
                horizontalLineToRelative(0.65f)
                lineToRelative(0.83f, 2.84f)
                lineToRelative(2.84f, 0.83f)
                close()
                moveTo(4.5f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveTo(5.88f, 0f, 4.5f, 0f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(12f, 20f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-7f)
                lineToRelative(7.02f, -4.15f)
                lineToRelative(-1.05f, -1.7f)
                lineToRelative(-6.54f, 3.85f)
                lineTo(3f, 6.0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3.05f)
                curveToRelative(-1.14f, 0.23f, -2f, 1.24f, -2f, 2.45f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-12f)
                close()
                moveTo(11f, 11.56f)
                lineToRelative(6.46f, -4.04f)
                lineToRelative(-0.22f, -0.75f)
                lineToRelative(-1.59f, -0.47f)
                lineToRelative(-4.64f, 2.92f)
                verticalLineToRelative(2.35f)
                close()
            }
        }.also { _LeaderAlt = it}
