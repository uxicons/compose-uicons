package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Referee: ImageVector? = null

val Icons.Rr.Referee: ImageVector
    get() = _Referee ?: UXIcon(name = "Referee") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(12f, 2f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                close()
                moveTo(21f, 21f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.82f, -0.77f, -3.82f, -1.87f, -4.85f)
                curveToRelative(-0.04f, -0.04f, -0.09f, -0.05f, -0.13f, -0.07f)
                verticalLineToRelative(6.92f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-5.16f)
                lineToRelative(-2f, 2.51f)
                verticalLineToRelative(2.65f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2.65f)
                lineToRelative(-2f, -2.52f)
                verticalLineToRelative(5.17f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-6.93f)
                curveToRelative(-0.04f, 0.02f, -0.08f, 0.03f, -0.12f, 0.07f)
                curveToRelative(-1.1f, 1.03f, -1.88f, 3.03f, -1.88f, 4.86f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -2.41f, 0.99f, -4.89f, 2.51f, -6.32f)
                curveToRelative(0.51f, -0.47f, 1.17f, -0.72f, 1.86f, -0.68f)
                curveToRelative(0.7f, 0.03f, 1.37f, 0.35f, 1.83f, 0.88f)
                lineToRelative(2.79f, 3.52f)
                lineToRelative(2.77f, -3.47f)
                curveToRelative(0.5f, -0.56f, 1.17f, -0.88f, 1.87f, -0.92f)
                curveToRelative(0.69f, -0.03f, 1.35f, 0.21f, 1.86f, 0.68f)
                curveToRelative(1.52f, 1.42f, 2.5f, 3.9f, 2.5f, 6.31f)
                close()
            }
        }.also { _Referee = it}
