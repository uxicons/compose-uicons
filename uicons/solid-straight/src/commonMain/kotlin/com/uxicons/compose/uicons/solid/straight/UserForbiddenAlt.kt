package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserForbiddenAlt: ImageVector? = null

val Icons.Ss.UserForbiddenAlt: ImageVector
    get() = _UserForbiddenAlt ?: UXIcon(name = "UserForbiddenAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(22f, 18f)
                curveToRelative(0f, 0.74f, -0.22f, 1.42f, -0.57f, 2.02f)
                lineToRelative(-5.45f, -5.45f)
                curveToRelative(0.59f, -0.35f, 1.28f, -0.57f, 2.02f, -0.57f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                close()
                moveTo(14f, 18f)
                curveToRelative(0f, -0.74f, 0.22f, -1.42f, 0.57f, -2.02f)
                lineToRelative(5.45f, 5.45f)
                curveToRelative(-0.59f, 0.35f, -1.28f, 0.57f, -2.02f, 0.57f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                close()
                moveTo(3f, 6f)
                curveTo(3f, 2.69f, 5.69f, 0f, 9f, 0f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                reflectiveCurveTo(3f, 9.31f, 3f, 6f)
                close()
                moveTo(12.72f, 24f)
                lineTo(0f, 24f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(6.08f)
                curveToRelative(-0.68f, 1.18f, -1.08f, 2.54f, -1.08f, 4f)
                curveToRelative(0f, 2.39f, 1.06f, 4.53f, 2.72f, 6f)
                close()
            }
        }.also { _UserForbiddenAlt = it}
