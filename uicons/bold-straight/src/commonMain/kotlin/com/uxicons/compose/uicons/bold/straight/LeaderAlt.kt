package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LeaderAlt: ImageVector? = null

val Icons.Bs.LeaderAlt: ImageVector
    get() = _LeaderAlt ?: UXIcon(name = "LeaderAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(13f, 14f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(5.38f)
                lineToRelative(5.84f, -3.18f)
                lineToRelative(-1.44f, -2.63f)
                lineToRelative(-5.16f, 2.82f)
                lineTo(3.5f, 6f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-11f)
                verticalLineToRelative(-7f)
                close()
                moveTo(21.16f, 2.84f)
                lineToRelative(-0.83f, -2.84f)
                horizontalLineToRelative(-0.65f)
                lineToRelative(-0.84f, 2.84f)
                lineToRelative(-2.84f, 0.83f)
                verticalLineToRelative(0.65f)
                lineToRelative(2.84f, 0.84f)
                lineToRelative(0.84f, 2.84f)
                horizontalLineToRelative(0.65f)
                lineToRelative(0.83f, -2.84f)
                lineToRelative(2.84f, -0.84f)
                verticalLineToRelative(-0.65f)
                lineToRelative(-2.84f, -0.83f)
                close()
                moveTo(18.0f, 9.4f)
                lineToRelative(-0.87f, -2.77f)
                lineToRelative(-4.13f, 2.25f)
                verticalLineToRelative(3.2f)
                lineToRelative(5.0f, -2.68f)
                close()
            }
        }.also { _LeaderAlt = it}
