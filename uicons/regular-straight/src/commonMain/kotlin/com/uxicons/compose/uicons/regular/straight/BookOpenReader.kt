package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookOpenReader: ImageVector? = null

val Icons.Rs.BookOpenReader: ImageVector
    get() = _BookOpenReader ?: UXIcon(name = "BookOpenReader") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.92f, 9.69f)
                curveToRelative(-0.68f, -0.57f, -1.58f, -0.81f, -2.46f, -0.65f)
                lineToRelative(-6.18f, 1.12f)
                curveToRelative(-0.91f, 0.17f, -1.71f, 0.63f, -2.28f, 1.29f)
                curveToRelative(-0.58f, -0.66f, -1.37f, -1.12f, -2.29f, -1.29f)
                lineToRelative(-6.18f, -1.12f)
                curveToRelative(-0.88f, -0.16f, -1.77f, 0.08f, -2.46f, 0.65f)
                reflectiveCurveToRelative(-1.08f, 1.41f, -1.08f, 2.3f)
                verticalLineToRelative(9.83f)
                lineToRelative(12f, 2.18f)
                lineToRelative(12f, -2.18f)
                lineTo(24.0f, 11.99f)
                curveToRelative(0f, -0.89f, -0.39f, -1.73f, -1.08f, -2.3f)
                close()
                moveTo(11f, 21.79f)
                lineToRelative(-9f, -1.64f)
                lineTo(2f, 11.99f)
                curveToRelative(0f, -0.41f, 0.23f, -0.66f, 0.36f, -0.77f)
                curveToRelative(0.13f, -0.11f, 0.42f, -0.29f, 0.82f, -0.22f)
                lineToRelative(6.18f, 1.12f)
                curveToRelative(0.95f, 0.17f, 1.64f, 1f, 1.64f, 1.97f)
                verticalLineToRelative(7.69f)
                close()
                moveTo(22f, 20.16f)
                lineToRelative(-9f, 1.64f)
                verticalLineToRelative(-7.69f)
                curveToRelative(0f, -0.97f, 0.69f, -1.79f, 1.64f, -1.97f)
                lineToRelative(6.18f, -1.12f)
                curveToRelative(0.41f, -0.07f, 0.69f, 0.1f, 0.82f, 0.22f)
                reflectiveCurveToRelative(0.36f, 0.36f, 0.36f, 0.77f)
                verticalLineToRelative(8.16f)
                close()
                moveTo(12f, 9f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                reflectiveCurveTo(14.48f, 0f, 12f, 0f)
                reflectiveCurveTo(7.5f, 2.02f, 7.5f, 4.5f)
                reflectiveCurveToRelative(2.02f, 4.5f, 4.5f, 4.5f)
                close()
                moveTo(12f, 2f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                close()
            }
        }.also { _BookOpenReader = it}
