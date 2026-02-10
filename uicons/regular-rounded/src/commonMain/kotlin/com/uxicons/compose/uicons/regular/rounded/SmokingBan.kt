package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmokingBan: ImageVector? = null

val Icons.Rr.SmokingBan: ImageVector
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
                horizontalLineToRelative(0.59f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4.59f)
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
                moveTo(11f, 5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                curveToRelative(0f, 0.1f, 0.26f, 0.46f, 1.06f, 0.69f)
                lineToRelative(2.42f, 0.69f)
                curveToRelative(1.55f, 0.44f, 2.51f, 1.45f, 2.51f, 2.62f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -0.1f, -0.26f, -0.46f, -1.06f, -0.69f)
                lineToRelative(-2.42f, -0.69f)
                curveToRelative(-1.55f, -0.44f, -2.51f, -1.44f, -2.51f, -2.62f)
                close()
                moveTo(7.76f, 12f)
                lineToRelative(4f, 4f)
                horizontalLineToRelative(-5.76f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1.76f)
                close()
            }
        }.also { _SmokingBan = it}
