package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserPen: ImageVector? = null

val Icons.Ts.UserPen: ImageVector
    get() = _UserPen ?: UXIcon(name = "UserPen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.97f, 12.03f)
                curveToRelative(3.32f, 0f, 6.03f, -2.7f, 6.03f, -6.03f)
                reflectiveCurveTo(12.3f, -0.03f, 8.97f, -0.03f)
                reflectiveCurveTo(2.95f, 2.68f, 2.95f, 6f)
                reflectiveCurveToRelative(2.7f, 6.03f, 6.03f, 6.03f)
                close()
                moveTo(8.97f, 0.97f)
                curveToRelative(2.77f, 0f, 5.03f, 2.25f, 5.03f, 5.03f)
                reflectiveCurveToRelative(-2.25f, 5.03f, -5.03f, 5.03f)
                reflectiveCurveTo(3.95f, 8.77f, 3.95f, 6f)
                reflectiveCurveTo(6.2f, 0.97f, 8.97f, 0.97f)
                close()
                moveTo(23.27f, 11.73f)
                curveToRelative(-0.94f, -0.94f, -2.59f, -0.94f, -3.54f, 0f)
                lineToRelative(-8.73f, 8.73f)
                verticalLineToRelative(3.54f)
                horizontalLineToRelative(3.54f)
                lineToRelative(8.73f, -8.73f)
                curveToRelative(0.47f, -0.47f, 0.73f, -1.1f, 0.73f, -1.77f)
                reflectiveCurveToRelative(-0.26f, -1.3f, -0.73f, -1.77f)
                close()
                moveTo(22.56f, 14.56f)
                lineToRelative(-8.44f, 8.44f)
                horizontalLineToRelative(-2.12f)
                verticalLineToRelative(-2.12f)
                lineToRelative(8.44f, -8.44f)
                curveToRelative(0.57f, -0.57f, 1.55f, -0.57f, 2.12f, 0f)
                curveToRelative(0.28f, 0.28f, 0.44f, 0.66f, 0.44f, 1.06f)
                reflectiveCurveToRelative(-0.16f, 0.78f, -0.44f, 1.06f)
                close()
                moveTo(13.5f, 15.0f)
                lineTo(4.5f, 15.0f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(5.5f)
                lineTo(0f, 24.0f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                lineTo(13.5f, 14.0f)
                curveToRelative(0.34f, 0f, 0.68f, 0.05f, 1.01f, 0.12f)
                lineToRelative(-0.89f, 0.89f)
                curveToRelative(-0.04f, -0.0f, -0.08f, -0.01f, -0.12f, -0.01f)
                close()
            }
        }.also { _UserPen = it}
