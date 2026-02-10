package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Referee: ImageVector? = null

val Icons.Sr.Referee: ImageVector
    get() = _Referee ?: UXIcon(name = "Referee") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 12f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
                moveTo(12f, 12f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
                moveTo(3f, 23f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-7.77f)
                curveToRelative(-1.23f, 1.46f, -2f, 3.64f, -2f, 5.77f)
                close()
                moveTo(16.64f, 14.01f)
                curveToRelative(-0.7f, 0.03f, -1.37f, 0.35f, -1.87f, 0.92f)
                lineToRelative(-2.77f, 3.47f)
                lineToRelative(-2.79f, -3.52f)
                curveToRelative(-0.46f, -0.52f, -1.13f, -0.84f, -1.83f, -0.88f)
                curveToRelative(-0.13f, -0.01f, -0.25f, 0.01f, -0.37f, 0.02f)
                verticalLineToRelative(8.98f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-5.17f)
                lineToRelative(2f, 2.52f)
                verticalLineToRelative(2.65f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2.65f)
                lineToRelative(2f, -2.51f)
                verticalLineToRelative(5.16f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-8.97f)
                curveToRelative(-0.12f, -0.01f, -0.24f, -0.03f, -0.36f, -0.02f)
                close()
                moveTo(19f, 15.23f)
                verticalLineToRelative(7.77f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -2.13f, -0.77f, -4.31f, -2f, -5.77f)
                close()
            }
        }.also { _Referee = it}
