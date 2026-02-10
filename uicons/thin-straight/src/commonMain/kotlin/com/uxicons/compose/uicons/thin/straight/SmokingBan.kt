package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmokingBan: ImageVector? = null

val Icons.Ts.SmokingBan: ImageVector
    get() = _SmokingBan ?: UXIcon(name = "SmokingBan") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                curveToRelative(0f, -2.85f, 1.1f, -5.45f, 2.89f, -7.4f)
                lineToRelative(15.52f, 15.52f)
                curveToRelative(-1.96f, 1.79f, -4.55f, 2.89f, -7.4f, 2.89f)
                close()
                moveTo(13.71f, 13f)
                horizontalLineToRelative(5.29f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3.29f)
                lineToRelative(-2f, -2f)
                close()
                moveTo(20.11f, 19.4f)
                lineToRelative(-3.4f, -3.4f)
                horizontalLineToRelative(3.29f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-7.29f)
                lineTo(4.6f, 3.89f)
                curveToRelative(1.96f, -1.79f, 4.55f, -2.89f, 7.4f, -2.89f)
                curveToRelative(6.07f, 0f, 11f, 4.93f, 11f, 11f)
                curveToRelative(0f, 2.85f, -1.1f, 5.45f, -2.89f, 7.4f)
                close()
                moveTo(12f, 3f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, 1.03f, 0.68f, 1.96f, 1.78f, 2.44f)
                lineToRelative(2.83f, 1.21f)
                curveToRelative(1.47f, 0.63f, 2.39f, 1.92f, 2.39f, 3.35f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, -1.03f, -0.68f, -1.96f, -1.78f, -2.43f)
                lineToRelative(-2.83f, -1.21f)
                curveToRelative(-1.47f, -0.63f, -2.39f, -1.92f, -2.39f, -3.35f)
                close()
                moveTo(11.46f, 15f)
                horizontalLineToRelative(-1.47f)
                verticalLineToRelative(-1.47f)
                lineToRelative(-1.54f, -1.53f)
                horizontalLineToRelative(-4.46f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(8.46f)
                lineToRelative(-1f, -1f)
                close()
                moveTo(9f, 15f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _SmokingBan = it}
