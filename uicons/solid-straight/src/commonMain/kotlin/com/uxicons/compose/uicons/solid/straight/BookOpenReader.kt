package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookOpenReader: ImageVector? = null

val Icons.Ss.BookOpenReader: ImageVector
    get() = _BookOpenReader ?: UXIcon(name = "BookOpenReader") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 9f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                reflectiveCurveTo(9.52f, 0f, 12f, 0f)
                reflectiveCurveToRelative(4.5f, 2.02f, 4.5f, 4.5f)
                reflectiveCurveToRelative(-2.02f, 4.5f, -4.5f, 4.5f)
                close()
                moveTo(22.92f, 9.68f)
                curveToRelative(-0.69f, -0.57f, -1.58f, -0.81f, -2.52f, -0.64f)
                lineToRelative(-4.12f, 1.0f)
                curveToRelative(-1.9f, 0.35f, -3.28f, 2.0f, -3.28f, 3.94f)
                verticalLineToRelative(7.8f)
                lineToRelative(-1f, 0.18f)
                lineToRelative(-1f, -0.18f)
                verticalLineToRelative(-7.8f)
                curveToRelative(0f, -1.94f, -1.38f, -3.59f, -3.23f, -3.92f)
                lineToRelative(-4.24f, -1.03f)
                curveToRelative(-0.88f, -0.16f, -1.77f, 0.08f, -2.46f, 0.65f)
                curveToRelative(-0.69f, 0.57f, -1.08f, 1.41f, -1.08f, 2.3f)
                verticalLineToRelative(9.83f)
                lineToRelative(12f, 2.18f)
                lineToRelative(12f, -2.18f)
                lineTo(24f, 11.98f)
                curveToRelative(0f, -0.89f, -0.39f, -1.73f, -1.08f, -2.3f)
                close()
            }
        }.also { _BookOpenReader = it}
