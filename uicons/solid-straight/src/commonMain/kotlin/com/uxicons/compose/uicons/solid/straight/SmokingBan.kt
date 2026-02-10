package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmokingBan: ImageVector? = null

val Icons.Ss.SmokingBan: ImageVector
    get() = _SmokingBan ?: UXIcon(name = "SmokingBan") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(22f, 12f)
                curveToRelative(0f, 2.4f, -0.85f, 4.6f, -2.26f, 6.32f)
                lineToRelative(-2.33f, -2.33f)
                horizontalLineToRelative(1.59f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-5.59f)
                lineToRelative(-7.74f, -7.74f)
                curveToRelative(1.73f, -1.41f, 3.93f, -2.26f, 6.32f, -2.26f)
                curveToRelative(5.51f, 0f, 10f, 4.49f, 10f, 10f)
                close()
                moveTo(2f, 12f)
                curveToRelative(0f, -2.4f, 0.85f, -4.6f, 2.26f, -6.32f)
                lineToRelative(14.06f, 14.06f)
                curveToRelative(-1.73f, 1.41f, -3.93f, 2.26f, -6.32f, 2.26f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                close()
                moveTo(11f, 4f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 0.65f, 0.45f, 1.25f, 1.18f, 1.56f)
                lineToRelative(2.42f, 1.04f)
                curveToRelative(1.46f, 0.62f, 2.4f, 1.96f, 2.4f, 3.4f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -0.65f, -0.45f, -1.25f, -1.18f, -1.56f)
                lineToRelative(-2.42f, -1.04f)
                curveToRelative(-1.46f, -0.62f, -2.4f, -1.96f, -2.4f, -3.4f)
                close()
                moveTo(12.76f, 16f)
                horizontalLineToRelative(-7.76f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(3.76f)
                lineToRelative(4f, 4f)
                close()
            }
        }.also { _SmokingBan = it}
