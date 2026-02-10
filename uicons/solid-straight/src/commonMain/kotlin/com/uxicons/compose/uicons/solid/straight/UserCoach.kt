package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserCoach: ImageVector? = null

val Icons.Ss.UserCoach: ImageVector
    get() = _UserCoach ?: UXIcon(name = "UserCoach") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 18.5f)
                verticalLineToRelative(5.5f)
                lineTo(3f, 24f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -2.1f, 1.46f, -3.86f, 3.41f, -4.35f)
                lineToRelative(3.05f, 4.85f)
                lineToRelative(2.5f, -3f)
                lineToRelative(2.5f, 3f)
                lineToRelative(3.12f, -4.85f)
                curveToRelative(1.96f, 0.49f, 3.42f, 2.25f, 3.42f, 4.35f)
                close()
                moveTo(6.08f, 5f)
                curveToRelative(0.48f, -2.83f, 2.95f, -5f, 5.92f, -5f)
                curveToRelative(2.22f, 0f, 4.16f, 1.21f, 5.19f, 3f)
                horizontalLineToRelative(2.81f)
                verticalLineToRelative(2f)
                lineTo(6.08f, 5f)
                close()
                moveTo(6.08f, 7f)
                horizontalLineToRelative(11.83f)
                curveToRelative(-0.48f, 2.83f, -2.95f, 5f, -5.92f, 5f)
                reflectiveCurveToRelative(-5.44f, -2.17f, -5.92f, -5f)
                close()
            }
        }.also { _UserCoach = it}
