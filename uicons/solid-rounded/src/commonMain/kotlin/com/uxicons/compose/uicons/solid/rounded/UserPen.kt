package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserPen: ImageVector? = null

val Icons.Sr.UserPen: ImageVector
    get() = _UserPen ?: UXIcon(name = "UserPen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 12f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveTo(5.69f, 0f, 9f, 0f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
                moveTo(13.27f, 19.48f)
                curveToRelative(-0.81f, 0.81f, -1.27f, 1.92f, -1.27f, 3.06f)
                verticalLineToRelative(1.46f)
                horizontalLineToRelative(1.46f)
                curveToRelative(1.15f, 0f, 2.25f, -0.46f, 3.06f, -1.27f)
                lineToRelative(6.81f, -6.81f)
                curveToRelative(0.9f, -0.9f, 0.9f, -2.35f, 0f, -3.25f)
                curveToRelative(-0.9f, -0.9f, -2.35f, -0.9f, -3.25f, 0f)
                lineToRelative(-6.81f, 6.81f)
                close()
                moveTo(10f, 22.55f)
                curveToRelative(0f, -1.69f, 0.66f, -3.28f, 1.85f, -4.48f)
                lineToRelative(2.38f, -2.38f)
                curveToRelative(-1.48f, -1.06f, -3.28f, -1.69f, -5.23f, -1.69f)
                curveTo(4.04f, 14f, 0f, 18.04f, 0f, 23f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                lineTo(10f, 24f)
                verticalLineToRelative(-1.46f)
                close()
            }
        }.also { _UserPen = it}
