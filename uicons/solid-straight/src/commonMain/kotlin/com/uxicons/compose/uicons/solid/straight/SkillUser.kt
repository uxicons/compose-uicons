package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SkillUser: ImageVector? = null

val Icons.Ss.SkillUser: ImageVector
    get() = _SkillUser ?: UXIcon(name = "SkillUser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.0f, 0f)
                lineToRelative(-6f, 0.0f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2.0f, 2.0f)
                lineToRelative(0.0f, 7.77f)
                curveToRelative(0f, 0.86f, 0.95f, 1.38f, 1.67f, 0.92f)
                lineToRelative(2.45f, -1.69f)
                horizontalLineToRelative(5.87f)
                lineTo(24f, 2f)
                curveTo(24f, 0.9f, 23.1f, 0f, 22.0f, 0f)
                close()
                moveTo(19.47f, 6.67f)
                curveToRelative(-0.46f, 0.47f, -1.22f, 0.47f, -1.68f, -0.01f)
                lineToRelative(-2.04f, -2.15f)
                lineToRelative(1.39f, -1.44f)
                lineToRelative(1.5f, 1.58f)
                lineToRelative(2.54f, -2.63f)
                lineToRelative(1.4f, 1.43f)
                lineToRelative(-3.11f, 3.22f)
                close()
                moveTo(7.5f, 12f)
                curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
                reflectiveCurveTo(4.47f, 1f, 7.5f, 1f)
                reflectiveCurveToRelative(5.5f, 2.47f, 5.5f, 5.5f)
                reflectiveCurveToRelative(-2.47f, 5.5f, -5.5f, 5.5f)
                close()
                moveTo(15.0f, 24f)
                lineTo(0f, 24f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(6f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                verticalLineToRelative(5.5f)
                close()
            }
        }.also { _SkillUser = it}
