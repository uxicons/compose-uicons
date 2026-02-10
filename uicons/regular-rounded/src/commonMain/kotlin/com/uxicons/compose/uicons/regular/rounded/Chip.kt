package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Chip: ImageVector? = null

val Icons.Rr.Chip: ImageVector
    get() = _Chip ?: UXIcon(name = "Chip") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.37f, 0f, 0f, 5.37f, 0f, 12f)
                reflectiveCurveToRelative(5.37f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.37f, 12f, -12f)
                reflectiveCurveTo(18.63f, 0f, 12f, 0f)
                close()
                moveTo(13f, 2.05f)
                curveToRelative(2.88f, 0.29f, 5.39f, 1.8f, 7.02f, 4.01f)
                lineToRelative(-2.59f, 1.54f)
                curveToRelative(-1.08f, -1.34f, -2.65f, -2.26f, -4.43f, -2.52f)
                lineTo(13f, 2.05f)
                close()
                moveTo(11f, 2.05f)
                verticalLineToRelative(3.03f)
                curveToRelative(-1.78f, 0.26f, -3.35f, 1.18f, -4.43f, 2.52f)
                lineToRelative(-2.59f, -1.54f)
                curveToRelative(1.64f, -2.2f, 4.15f, -3.72f, 7.02f, -4.01f)
                close()
                moveTo(2.95f, 16.23f)
                curveToRelative(-0.6f, -1.29f, -0.95f, -2.71f, -0.95f, -4.23f)
                reflectiveCurveToRelative(0.35f, -2.94f, 0.95f, -4.23f)
                lineToRelative(2.59f, 1.54f)
                curveToRelative(-0.34f, 0.83f, -0.54f, 1.73f, -0.54f, 2.69f)
                reflectiveCurveToRelative(0.19f, 1.86f, 0.54f, 2.69f)
                lineToRelative(-2.59f, 1.54f)
                close()
                moveTo(11f, 21.95f)
                curveToRelative(-2.88f, -0.29f, -5.39f, -1.8f, -7.02f, -4.01f)
                lineToRelative(2.59f, -1.54f)
                curveToRelative(1.08f, 1.34f, 2.65f, 2.26f, 4.43f, 2.52f)
                verticalLineToRelative(3.03f)
                close()
                moveTo(7f, 12f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
                close()
                moveTo(13f, 21.95f)
                verticalLineToRelative(-3.03f)
                curveToRelative(1.78f, -0.26f, 3.35f, -1.18f, 4.43f, -2.52f)
                lineToRelative(2.59f, 1.54f)
                curveToRelative(-1.64f, 2.2f, -4.15f, 3.72f, -7.02f, 4.01f)
                close()
                moveTo(18.46f, 14.69f)
                curveToRelative(0.34f, -0.83f, 0.54f, -1.73f, 0.54f, -2.69f)
                reflectiveCurveToRelative(-0.19f, -1.86f, -0.54f, -2.69f)
                lineToRelative(2.59f, -1.54f)
                curveToRelative(0.6f, 1.29f, 0.95f, 2.71f, 0.95f, 4.23f)
                reflectiveCurveToRelative(-0.35f, 2.94f, -0.95f, 4.23f)
                lineToRelative(-2.59f, -1.54f)
                close()
            }
        }.also { _Chip = it}
