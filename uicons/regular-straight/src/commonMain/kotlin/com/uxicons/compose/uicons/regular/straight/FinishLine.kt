package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FinishLine: ImageVector? = null

val Icons.Rs.FinishLine: ImageVector
    get() = _FinishLine ?: UXIcon(name = "FinishLine") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(7.83f, 20f)
                horizontalLineToRelative(-4.83f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6.17f)
                lineToRelative(1.14f, -2.8f)
                lineToRelative(-1.73f, -1.04f)
                close()
                moveTo(24f, 9.94f)
                verticalLineToRelative(6.08f)
                curveToRelative(-2.87f, 0.4f, -6.16f, 0.76f, -9.59f, 0.91f)
                lineToRelative(1.59f, 0.98f)
                verticalLineToRelative(6.08f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4.92f)
                lineToRelative(-3.52f, -2.11f)
                curveToRelative(-3.65f, -0.12f, -7.38f, -0.52f, -10.47f, -0.95f)
                verticalLineToRelative(-6.08f)
                curveToRelative(2.21f, 0.31f, 4.1f, 0.6f, 8.05f, 0.9f)
                lineToRelative(1.17f, -2.84f)
                horizontalLineToRelative(-3.96f)
                lineToRelative(-1.71f, -5.71f)
                lineToRelative(1.92f, -0.57f)
                lineToRelative(1.29f, 4.29f)
                horizontalLineToRelative(12.01f)
                lineToRelative(1.29f, -4.29f)
                lineToRelative(1.92f, 0.57f)
                lineToRelative(-1.71f, 5.71f)
                horizontalLineToRelative(-4.37f)
                lineToRelative(-1.22f, 2.92f)
                curveToRelative(4.45f, -0.27f, 6.96f, -0.65f, 9.35f, -0.98f)
                close()
                moveTo(10.16f, 10.96f)
                curveToRelative(0.79f, 0.03f, 1.53f, 0.05f, 2.29f, 0.04f)
                lineToRelative(1.25f, -3.0f)
                horizontalLineToRelative(-2.33f)
                lineToRelative(-1.21f, 2.96f)
                close()
                moveTo(22f, 12.24f)
                curveToRelative(-2.23f, 0.29f, -6.46f, 0.76f, -10f, 0.76f)
                reflectiveCurveToRelative(-7.77f, -0.47f, -10f, -0.76f)
                verticalLineToRelative(2.04f)
                curveToRelative(2.95f, 0.37f, 6.9f, 0.73f, 10f, 0.73f)
                reflectiveCurveToRelative(7.05f, -0.36f, 10f, -0.73f)
                close()
            }
        }.also { _FinishLine = it}
