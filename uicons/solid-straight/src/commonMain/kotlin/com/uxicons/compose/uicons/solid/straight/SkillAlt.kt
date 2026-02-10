package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SkillAlt: ImageVector? = null

val Icons.Ss.SkillAlt: ImageVector
    get() = _SkillAlt ?: UXIcon(name = "SkillAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 18f)
                lineTo(0f, 18f)
                reflectiveCurveTo(0f, 10f, 0f, 10f)
                lineTo(8f, 10f)
                reflectiveCurveToRelative(0f, 8f, 0f, 8f)
                close()
                moveTo(10f, 20f)
                lineTo(3f, 20f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-3f)
                reflectiveCurveToRelative(2.25f, 0f, 2.25f, 0f)
                curveToRelative(1.5f, 0f, 2.78f, -1.12f, 2.97f, -2.61f)
                lineToRelative(0.45f, -3.39f)
                horizontalLineToRelative(2.33f)
                verticalLineToRelative(-2.21f)
                reflectiveCurveToRelative(-0.72f, -1.65f, -0.72f, -1.65f)
                curveToRelative(-1.17f, -2.69f, -2.31f, -5.26f, -3.5f, -6.75f)
                curveTo(17.45f, 1.3f, 13.82f, -0.27f, 10f, 0.07f)
                verticalLineToRelative(19.93f)
                close()
                moveTo(8f, 0f)
                verticalLineToRelative(8f)
                lineTo(0f, 8f)
                lineTo(0f, 0f)
                lineTo(8f, 0f)
                close()
                moveTo(7.32f, 2.43f)
                lineToRelative(-1.4f, -1.43f)
                lineToRelative(-2.54f, 2.63f)
                lineToRelative(-1.5f, -1.58f)
                lineTo(0.5f, 3.49f)
                lineToRelative(2.04f, 2.15f)
                curveToRelative(0.46f, 0.48f, 1.22f, 0.48f, 1.68f, 0.01f)
                lineToRelative(3.11f, -3.22f)
                close()
            }
        }.also { _SkillAlt = it}
