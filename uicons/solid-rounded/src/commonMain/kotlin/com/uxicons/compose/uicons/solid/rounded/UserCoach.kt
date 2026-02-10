package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserCoach: ImageVector? = null

val Icons.Sr.UserCoach: ImageVector
    get() = _UserCoach ?: UXIcon(name = "UserCoach") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(4f, 24f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -3.2f, 1.68f, -6.0f, 4.2f, -7.6f)
                lineToRelative(1.59f, 3.18f)
                curveToRelative(0.33f, 0.52f, 1.07f, 0.57f, 1.47f, 0.09f)
                lineToRelative(1.7f, -2.04f)
                lineToRelative(1.7f, 2.04f)
                curveToRelative(0.4f, 0.47f, 1.14f, 0.43f, 1.47f, -0.09f)
                lineToRelative(1.66f, -3.18f)
                curveToRelative(2.52f, 1.6f, 4.21f, 4.4f, 4.21f, 7.6f)
                close()
                moveTo(19f, 5f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1.81f)
                curveToRelative(-1.04f, -1.79f, -2.97f, -3f, -5.18f, -3f)
                curveToRelative(-2.97f, 0f, -5.43f, 2.17f, -5.91f, 5f)
                horizontalLineToRelative(12.91f)
                close()
                moveTo(12f, 12f)
                curveToRelative(2.97f, 0f, 5.43f, -2.17f, 5.91f, -5f)
                lineTo(6.09f, 7f)
                curveToRelative(0.48f, 2.83f, 2.94f, 5f, 5.91f, 5f)
                close()
            }
        }.also { _UserCoach = it}
