package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserCoach: ImageVector? = null

val Icons.Br.UserCoach: ImageVector
    get() = _UserCoach ?: UXIcon(name = "UserCoach") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12f, 12f)
            curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
            horizontalLineToRelative(0.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-1.31f)
            curveToRelative(-1.04f, -1.79f, -2.97f, -3f, -5.19f, -3f)
            curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
            reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
            close()
            moveTo(12f, 9f)
            curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
            horizontalLineToRelative(6f)
            curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
            close()
            moveTo(20.97f, 22.4f)
            curveToRelative(0.06f, 0.83f, -0.57f, 1.54f, -1.4f, 1.6f)
            curveToRelative(-0.03f, 0.0f, -0.07f, 0.0f, -0.1f, 0.0f)
            curveToRelative(-0.78f, 0f, -1.44f, -0.61f, -1.5f, -1.4f)
            curveToRelative(-0.1f, -1.52f, -0.77f, -2.88f, -1.79f, -3.88f)
            lineToRelative(-0.91f, 1.78f)
            curveToRelative(-0.38f, 0.61f, -1.25f, 0.66f, -1.71f, 0.11f)
            lineToRelative(-1.57f, -2.11f)
            lineToRelative(-1.57f, 2.11f)
            curveToRelative(-0.46f, 0.55f, -1.32f, 0.49f, -1.71f, -0.11f)
            lineToRelative(-0.91f, -1.78f)
            curveToRelative(-1.02f, 1.0f, -1.69f, 2.36f, -1.79f, 3.88f)
            curveToRelative(-0.06f, 0.83f, -0.77f, 1.46f, -1.6f, 1.4f)
            curveToRelative(-0.83f, -0.06f, -1.45f, -0.77f, -1.4f, -1.6f)
            curveToRelative(0.31f, -4.71f, 4.25f, -8.4f, 8.97f, -8.4f)
            reflectiveCurveToRelative(8.66f, 3.69f, 8.97f, 8.4f)
            close()
        }
    }.also { _UserCoach = it }
