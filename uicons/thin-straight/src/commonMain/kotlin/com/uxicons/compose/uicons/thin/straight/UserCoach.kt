package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserCoach: ImageVector? = null

val Icons.Ts.UserCoach: ImageVector
    get() = _UserCoach ?: UXIcon(name = "UserCoach") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                curveToRelative(0f, -0.34f, -0.04f, -0.67f, -0.09f, -1f)
                horizontalLineToRelative(2.59f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2.85f)
                curveToRelative(-0.83f, -2.33f, -3.04f, -4f, -5.65f, -4f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(12f, 1f)
                curveToRelative(2.04f, 0f, 3.8f, 1.24f, 4.58f, 3f)
                lineTo(7.42f, 4f)
                curveToRelative(0.77f, -1.76f, 2.53f, -3f, 4.58f, -3f)
                close()
                moveTo(7.1f, 5f)
                horizontalLineToRelative(9.8f)
                curveToRelative(0.07f, 0.32f, 0.1f, 0.66f, 0.1f, 1f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
                curveToRelative(0f, -0.34f, 0.04f, -0.68f, 0.1f, -1f)
                close()
                moveTo(16.5f, 14f)
                lineTo(7.5f, 14f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -1.53f, 1.0f, -2.83f, 2.38f, -3.3f)
                lineToRelative(3.05f, 4.44f)
                lineToRelative(2.54f, -3.05f)
                lineToRelative(2.53f, 3.04f)
                lineToRelative(3.12f, -4.44f)
                curveToRelative(1.38f, 0.47f, 2.38f, 1.76f, 2.38f, 3.3f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(14.43f, 18.0f)
                lineToRelative(-2.47f, -2.96f)
                lineToRelative(-2.46f, 2.95f)
                lineToRelative(-2.05f, -2.98f)
                curveToRelative(0.02f, 0f, 9.07f, -0.0f, 9.08f, -0.0f)
                lineToRelative(-2.11f, 2.99f)
                close()
            }
        }.also { _UserCoach = it}
