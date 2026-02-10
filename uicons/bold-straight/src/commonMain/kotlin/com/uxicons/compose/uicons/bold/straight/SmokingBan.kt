package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmokingBan: ImageVector? = null

val Icons.Bs.SmokingBan: ImageVector
    get() = _SmokingBan ?: UXIcon(name = "SmokingBan") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(21f, 12f)
                curveToRelative(0f, 1.94f, -0.62f, 3.73f, -1.67f, 5.21f)
                lineToRelative(-2.21f, -2.21f)
                horizontalLineToRelative(1.88f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-5.88f)
                lineToRelative(-6.33f, -6.33f)
                curveToRelative(1.47f, -1.05f, 3.27f, -1.67f, 5.21f, -1.67f)
                curveToRelative(4.96f, 0f, 9f, 4.04f, 9f, 9f)
                close()
                moveTo(3f, 12f)
                curveToRelative(0f, -1.94f, 0.62f, -3.73f, 1.67f, -5.21f)
                lineToRelative(12.53f, 12.53f)
                curveToRelative(-1.47f, 1.05f, -3.27f, 1.67f, -5.21f, 1.67f)
                curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
                close()
                moveTo(12f, 5f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 0.29f, 0.23f, 0.58f, 0.59f, 0.73f)
                lineToRelative(1.61f, 0.69f)
                curveToRelative(1.09f, 0.47f, 1.8f, 1.48f, 1.8f, 2.57f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -0.29f, -0.23f, -0.58f, -0.59f, -0.73f)
                lineToRelative(-1.61f, -0.69f)
                curveToRelative(-1.09f, -0.47f, -1.8f, -1.48f, -1.8f, -2.57f)
                close()
                moveTo(6.05f, 11f)
                lineToRelative(4f, 4f)
                horizontalLineToRelative(-5.05f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(1.05f)
                close()
            }
        }.also { _SmokingBan = it}
