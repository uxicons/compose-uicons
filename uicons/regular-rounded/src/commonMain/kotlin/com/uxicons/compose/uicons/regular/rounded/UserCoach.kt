package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserCoach: ImageVector? = null

val Icons.Rr.UserCoach: ImageVector
    get() = _UserCoach ?: UXIcon(name = "UserCoach") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1.35f)
                curveToRelative(-0.83f, -2.33f, -3.04f, -4f, -5.65f, -4f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(12f, 10f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                horizontalLineToRelative(8f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                close()
                moveTo(12f, 2f)
                curveToRelative(1.47f, 0f, 2.75f, 0.81f, 3.44f, 2f)
                horizontalLineToRelative(-6.89f)
                curveToRelative(0.69f, -1.19f, 1.97f, -2f, 3.44f, -2f)
                close()
                moveTo(21f, 23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -2.25f, -1.07f, -4.25f, -2.72f, -5.53f)
                lineToRelative(-1.15f, 2.1f)
                curveToRelative(-0.33f, 0.52f, -1.07f, 0.57f, -1.47f, 0.09f)
                lineToRelative(-1.7f, -2.04f)
                lineToRelative(-1.7f, 2.04f)
                curveToRelative(-0.4f, 0.47f, -1.14f, 0.43f, -1.47f, -0.09f)
                lineToRelative(-1.12f, -2.06f)
                curveToRelative(-1.62f, 1.28f, -2.67f, 3.26f, -2.67f, 5.49f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -4.96f, 4.04f, -9f, 9f, -9f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                close()
            }
        }.also { _UserCoach = it}
