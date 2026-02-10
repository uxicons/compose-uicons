package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserHardWork: ImageVector? = null

val Icons.Ss.UserHardWork: ImageVector
    get() = _UserHardWork ?: UXIcon(name = "UserHardWork") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1.57f, 3.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveTo(1.57f, 4.88f, 1.57f, 3.5f)
                close()
                moveTo(9.07f, 17f)
                lineTo(3.07f, 17f)
                verticalLineToRelative(3f)
                lineToRelative(-1.0f, 4f)
                lineTo(0f, 24f)
                lineToRelative(1.1f, -4.38f)
                lineToRelative(-0.02f, -2.62f)
                horizontalLineToRelative(-0.01f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(4.61f)
                lineToRelative(3.85f, -3.47f)
                curveToRelative(0.94f, -2.08f, 3.03f, -3.53f, 5.46f, -3.53f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                curveToRelative(-3.08f, 0f, -5.63f, -2.34f, -5.96f, -5.34f)
                lineToRelative(-2.52f, 2.34f)
                horizontalLineToRelative(-3.43f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(3.73f)
                lineToRelative(-2f, 1.39f)
                verticalLineToRelative(-3.11f)
                close()
                moveTo(6.97f, 24f)
                horizontalLineToRelative(3.27f)
                lineToRelative(13.82f, -9.59f)
                verticalLineToRelative(-2.27f)
                lineTo(6.97f, 24f)
                close()
            }
        }.also { _UserHardWork = it}
