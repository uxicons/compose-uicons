package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserInjured: ImageVector? = null

val Icons.Rr.UserInjured: ImageVector
    get() = _UserInjured ?: UXIcon(name = "UserInjured") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 6f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                curveToRelative(1.21f, 0f, 2.34f, 0.36f, 3.28f, 0.98f)
                lineToRelative(-7.28f, 5.02f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                horizontalLineToRelative(-4.63f)
                lineToRelative(5.4f, -3.64f)
                curveToRelative(0.77f, 1.01f, 1.24f, 2.27f, 1.24f, 3.64f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                close()
                moveTo(20f, 22f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                curveToRelative(-0.24f, 0f, -0.48f, 0.02f, -0.71f, 0.05f)
                lineToRelative(1.49f, 5.95f)
                horizontalLineToRelative(2.22f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                lineTo(6f, 24f)
                curveToRelative(-1.3f, 0f, -2f, -1.03f, -2f, -2f)
                curveToRelative(0f, -4.41f, 3.59f, -8f, 8f, -8f)
                reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                close()
                moveTo(9.37f, 16.61f)
                curveToRelative(-1.99f, 0.98f, -3.37f, 3.02f, -3.37f, 5.39f)
                horizontalLineToRelative(4.72f)
                lineToRelative(-1.35f, -5.39f)
                close()
            }
        }.also { _UserInjured = it}
