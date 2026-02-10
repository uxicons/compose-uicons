package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserCoach: ImageVector? = null

val Icons.Rs.UserCoach: ImageVector
    get() = _UserCoach ?: UXIcon(name = "UserCoach") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2.35f)
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
                moveTo(21f, 18.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -1.22f, -0.87f, -2.23f, -2.02f, -2.45f)
                lineToRelative(-2.52f, 3.95f)
                lineToRelative(-2.5f, -3f)
                lineToRelative(-2.5f, 3f)
                lineToRelative(-2.5f, -3.94f)
                curveToRelative(-1.12f, 0.25f, -1.96f, 1.25f, -1.96f, 2.44f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(9f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                close()
            }
        }.also { _UserCoach = it}
