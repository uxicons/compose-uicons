package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SkillUser: ImageVector? = null

val Icons.Sr.SkillUser: ImageVector
    get() = _SkillUser ?: UXIcon(name = "SkillUser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 0f)
                lineToRelative(-5f, 0.0f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.13f, -2.5f, 2.5f)
                verticalLineToRelative(6.85f)
                curveToRelative(0.0f, 1.07f, 1.21f, 1.7f, 2.08f, 1.08f)
                lineToRelative(2.05f, -1.44f)
                horizontalLineToRelative(3.37f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-4f)
                curveTo(24f, 1.12f, 22.88f, 0f, 21.5f, 0f)
                close()
                moveTo(21.98f, 4.24f)
                lineToRelative(-2.08f, 2.15f)
                curveToRelative(-0.8f, 0.82f, -2.12f, 0.82f, -2.9f, -0.01f)
                lineToRelative(-0.77f, -0.81f)
                curveToRelative(-0.37f, -0.39f, -0.36f, -0.99f, 0.01f, -1.38f)
                curveToRelative(0.4f, -0.41f, 1.05f, -0.41f, 1.45f, 0.01f)
                lineToRelative(0.78f, 0.82f)
                lineToRelative(2.09f, -2.16f)
                curveToRelative(0.39f, -0.41f, 1.04f, -0.41f, 1.43f, -0.0f)
                curveToRelative(0.38f, 0.39f, 0.38f, 1.0f, 0.0f, 1.39f)
                close()
                moveTo(7.5f, 12f)
                curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
                reflectiveCurveTo(10.53f, 1f, 7.5f, 1f)
                reflectiveCurveTo(2f, 3.47f, 2f, 6.5f)
                reflectiveCurveToRelative(2.47f, 5.5f, 5.5f, 5.5f)
                close()
                moveTo(7.5f, 14f)
                curveToRelative(-4.14f, 0f, -7.5f, 3.36f, -7.5f, 7.5f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(13f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -4.14f, -3.36f, -7.5f, -7.5f, -7.5f)
                close()
            }
        }.also { _SkillUser = it}
