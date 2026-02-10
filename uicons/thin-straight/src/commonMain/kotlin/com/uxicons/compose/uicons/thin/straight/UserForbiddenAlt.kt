package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserForbiddenAlt: ImageVector? = null

val Icons.Ts.UserForbiddenAlt: ImageVector
    get() = _UserForbiddenAlt ?: UXIcon(name = "UserForbiddenAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(23f, 18f)
                curveToRelative(0f, 1.2f, -0.44f, 2.29f, -1.15f, 3.15f)
                lineToRelative(-7f, -7f)
                curveToRelative(0.86f, -0.7f, 1.95f, -1.15f, 3.15f, -1.15f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(13f, 18f)
                curveToRelative(0f, -1.2f, 0.44f, -2.29f, 1.15f, -3.15f)
                lineToRelative(7f, 7f)
                curveToRelative(-0.86f, 0.7f, -1.95f, 1.15f, -3.15f, 1.15f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                close()
                moveTo(9f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(12.31f, 0f, 9f, 0f)
                reflectiveCurveTo(3f, 2.69f, 3f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(9f, 1f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
                reflectiveCurveTo(6.24f, 1f, 9f, 1f)
                close()
                moveTo(11.08f, 14f)
                curveToRelative(-0.18f, 0.32f, -0.34f, 0.65f, -0.48f, 1f)
                lineTo(4.5f, 15f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(5.5f)
                lineTo(0f, 24f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(6.58f)
                close()
            }
        }.also { _UserForbiddenAlt = it}
