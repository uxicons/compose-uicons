package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SkillAlt: ImageVector? = null

val Icons.Bs.SkillAlt: ImageVector
    get() = _SkillAlt ?: UXIcon(name = "SkillAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 0f)
                lineTo(0f, 8f)
                horizontalLineToRelative(8f)
                lineTo(8f, 0f)
                lineTo(0f, 0f)
                close()
                moveTo(4.21f, 5.65f)
                curveToRelative(-0.46f, 0.47f, -1.22f, 0.47f, -1.68f, -0.01f)
                lineTo(0.5f, 3.49f)
                lineToRelative(1.39f, -1.44f)
                lineToRelative(1.5f, 1.58f)
                lineTo(5.93f, 1f)
                lineToRelative(1.4f, 1.43f)
                lineToRelative(-3.11f, 3.22f)
                close()
                moveTo(8f, 18f)
                lineTo(0f, 18f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(8f)
                close()
                moveTo(6.0f, 21f)
                horizontalLineToRelative(7.0f)
                reflectiveCurveToRelative(0f, -3f, 0f, -3f)
                horizontalLineToRelative(4.89f)
                curveToRelative(0.25f, 0f, 0.46f, -0.19f, 0.49f, -0.43f)
                lineToRelative(0.7f, -5.57f)
                horizontalLineToRelative(1.56f)
                curveToRelative(-0.06f, -0.15f, -0.13f, -0.29f, -0.19f, -0.44f)
                curveToRelative(-0.99f, -2.28f, -2.02f, -4.14f, -2.98f, -5.33f)
                curveToRelative(-1.75f, -2.33f, -4.59f, -3.51f, -7.48f, -3.15f)
                lineTo(10f, 0.07f)
                curveToRelative(3.83f, -0.35f, 7.56f, 1.26f, 9.84f, 4.32f)
                curveToRelative(1.18f, 1.46f, 2.24f, 3.39f, 3.36f, 5.97f)
                curveToRelative(0.22f, 0.51f, 0.8f, 1.81f, 0.8f, 1.81f)
                verticalLineToRelative(2.82f)
                horizontalLineToRelative(-2.3f)
                reflectiveCurveToRelative(-0.35f, 2.98f, -0.35f, 2.98f)
                curveToRelative(-0.24f, 1.72f, -1.73f, 3.02f, -3.47f, 3.02f)
                horizontalLineToRelative(-1.89f)
                reflectiveCurveToRelative(0f, 3f, 0f, 3f)
                lineTo(3f, 24f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1f)
                close()
            }
        }.also { _SkillAlt = it}
