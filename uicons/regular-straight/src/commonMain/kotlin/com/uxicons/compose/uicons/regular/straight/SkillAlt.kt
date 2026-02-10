package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SkillAlt: ImageVector? = null

val Icons.Rs.SkillAlt: ImageVector
    get() = _SkillAlt ?: UXIcon(name = "SkillAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 22f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-3f)
                reflectiveCurveToRelative(4.25f, 0f, 4.25f, 0f)
                curveToRelative(0.5f, 0f, 0.93f, -0.37f, 0.99f, -0.87f)
                lineToRelative(0.68f, -5.13f)
                horizontalLineToRelative(1.99f)
                reflectiveCurveToRelative(-0.47f, -1.06f, -0.47f, -1.06f)
                curveToRelative(-1.07f, -2.46f, -2.21f, -5.04f, -3.24f, -6.32f)
                curveToRelative(-1.94f, -2.59f, -4.99f, -3.89f, -8.2f, -3.55f)
                lineTo(10f, 0.07f)
                curveToRelative(3.82f, -0.34f, 7.45f, 1.24f, 9.78f, 4.32f)
                curveToRelative(1.2f, 1.49f, 2.33f, 4.07f, 3.5f, 6.75f)
                lineToRelative(0.72f, 1.65f)
                verticalLineToRelative(2.21f)
                reflectiveCurveToRelative(-2.33f, 0f, -2.33f, 0f)
                lineToRelative(-0.45f, 3.39f)
                curveToRelative(-0.2f, 1.49f, -1.47f, 2.61f, -2.97f, 2.61f)
                horizontalLineToRelative(-2.25f)
                verticalLineToRelative(3f)
                reflectiveCurveToRelative(-13f, 0f, -13f, 0f)
                verticalLineToRelative(-4f)
                reflectiveCurveToRelative(2f, 0f, 2f, 0f)
                verticalLineToRelative(2f)
                close()
                moveTo(8f, 0f)
                verticalLineToRelative(8f)
                lineTo(0f, 8f)
                lineTo(0f, 0f)
                horizontalLineToRelative(8f)
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
                moveTo(8f, 18f)
                lineTo(0f, 18f)
                reflectiveCurveTo(0f, 10f, 0f, 10f)
                lineTo(8f, 10f)
                reflectiveCurveToRelative(0f, 8f, 0f, 8f)
                close()
                moveTo(6f, 12f)
                lineTo(2f, 12f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                close()
            }
        }.also { _SkillAlt = it}
