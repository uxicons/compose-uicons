package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserHardWork: ImageVector? = null

val Icons.Bs.UserHardWork: ImageVector
    get() = _UserHardWork ?: UXIcon(name = "UserHardWork") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.99f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(21.3f, 0f, 17.99f, 0f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(17.99f, 3f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                close()
                moveTo(0.99f, 3.5f)
                curveTo(0.99f, 2.12f, 2.1f, 1f, 3.49f, 1f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveTo(0.99f, 4.88f, 0.99f, 3.5f)
                close()
                moveTo(3.97f, 17f)
                lineToRelative(-0.03f, 3.88f)
                lineToRelative(-0.82f, 3.12f)
                lineTo(0.01f, 24f)
                lineToRelative(0.97f, -3.69f)
                lineTo(0.99f, 10.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(3.38f)
                lineToRelative(2.56f, -2.56f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-3.44f, 3.44f)
                horizontalLineToRelative(-2.12f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4.04f)
                lineToRelative(-3f, 2.08f)
                verticalLineToRelative(-3.12f)
                lineTo(3.97f, 17.0f)
                close()
                moveTo(4.9f, 24f)
                lineTo(23.99f, 10.76f)
                verticalLineToRelative(3.65f)
                lineToRelative(-13.82f, 9.59f)
                lineTo(4.9f, 24f)
                close()
            }
        }.also { _UserHardWork = it}
