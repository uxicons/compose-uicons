package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SkillAlt: ImageVector? = null

val Icons.Sr.SkillAlt: ImageVector
    get() = _SkillAlt ?: UXIcon(name = "SkillAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 21f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(7f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                horizontalLineToRelative(0.49f)
                curveToRelative(2.5f, 0f, 4.63f, -1.87f, 4.96f, -4.34f)
                lineToRelative(0.22f, -1.66f)
                horizontalLineToRelative(0.33f)
                curveToRelative(1.3f, 0f, 2f, -1.03f, 2f, -2f)
                curveToRelative(0f, -1.42f, -2.93f, -7.01f, -4.22f, -8.61f)
                curveTo(17.7f, 1.61f, 14.49f, 0f, 11f, 0f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(14.5f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                close()
                moveTo(0f, 12.5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(3f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-3f)
                curveTo(1.12f, 10f, 0f, 11.12f, 0f, 12.5f)
                close()
                moveTo(6f, 0f)
                lineTo(2f, 0f)
                curveTo(0.9f, 0f, 0f, 0.9f, 0f, 2f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                lineTo(8f, 2f)
                curveTo(8f, 0.9f, 7.11f, 0f, 6f, 0f)
                close()
                moveTo(6.72f, 3.5f)
                lineToRelative(-1.82f, 1.88f)
                curveToRelative(-0.8f, 0.82f, -2.12f, 0.82f, -2.9f, -0.01f)
                lineToRelative(-0.77f, -0.81f)
                curveToRelative(-0.37f, -0.39f, -0.36f, -0.99f, 0.01f, -1.38f)
                curveToRelative(0.4f, -0.41f, 1.05f, -0.41f, 1.45f, 0.01f)
                lineToRelative(0.78f, 0.82f)
                lineToRelative(1.83f, -1.89f)
                curveToRelative(0.39f, -0.41f, 1.04f, -0.41f, 1.43f, -0.0f)
                curveToRelative(0.38f, 0.39f, 0.38f, 1.0f, 0.0f, 1.39f)
                close()
            }
        }.also { _SkillAlt = it}
