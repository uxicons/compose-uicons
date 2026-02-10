package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserForbiddenAlt: ImageVector? = null

val Icons.Bs.UserForbiddenAlt: ImageVector
    get() = _UserForbiddenAlt ?: UXIcon(name = "UserForbiddenAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(21f, 18f)
                curveToRelative(0f, 0.27f, -0.05f, 0.52f, -0.11f, 0.77f)
                lineToRelative(-3.65f, -3.66f)
                curveToRelative(0.25f, -0.07f, 0.5f, -0.11f, 0.77f, -0.11f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(15f, 18f)
                curveToRelative(0f, -0.27f, 0.05f, -0.52f, 0.11f, -0.77f)
                lineToRelative(3.65f, 3.66f)
                curveToRelative(-0.25f, 0.07f, -0.5f, 0.11f, -0.77f, 0.11f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                close()
                moveTo(9f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(12.31f, 0f, 9f, 0f)
                reflectiveCurveTo(3f, 2.69f, 3f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(9f, 3f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                close()
                moveTo(11.08f, 14f)
                curveToRelative(-0.52f, 0.9f, -0.88f, 1.92f, -1.01f, 3f)
                lineTo(5f, 17f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(5f)
                lineTo(0f, 24f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(6.08f)
                close()
            }
        }.also { _UserForbiddenAlt = it}
