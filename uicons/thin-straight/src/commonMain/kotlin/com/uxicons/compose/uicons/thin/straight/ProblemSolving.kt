package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ProblemSolving: ImageVector? = null

val Icons.Ts.ProblemSolving: ImageVector
    get() = _ProblemSolving ?: UXIcon(name = "ProblemSolving") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.5f, 12.0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(7f)
                close()
                moveTo(10.0f, 13.0f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(22.9f, 23.6f)
                lineToRelative(-3.6f, -3.6f)
                curveToRelative(-0.77f, 0.62f, -1.73f, 1f, -2.79f, 1f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                reflectiveCurveToRelative(2.02f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 2.02f, 4.5f, 4.5f)
                curveToRelative(0f, 1.06f, -0.38f, 2.02f, -1f, 2.79f)
                lineToRelative(3.6f, 3.6f)
                lineToRelative(-0.71f, 0.71f)
                close()
                moveTo(20f, 16.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                close()
                moveTo(16.5f, 10.0f)
                curveToRelative(0.3f, 0f, 0.59f, 0.03f, 0.88f, 0.07f)
                lineTo(12.32f, 1.34f)
                curveToRelative(-0.48f, -0.83f, -1.35f, -1.33f, -2.32f, -1.34f)
                curveToRelative(-0.96f, 0.01f, -1.83f, 0.51f, -2.31f, 1.34f)
                lineTo(0.37f, 13.93f)
                curveToRelative(-0.49f, 0.85f, -0.5f, 1.86f, -0.01f, 2.71f)
                curveToRelative(0.49f, 0.85f, 1.36f, 1.35f, 2.34f, 1.35f)
                horizontalLineToRelative(7.47f)
                curveToRelative(-0.08f, -0.33f, -0.13f, -0.66f, -0.16f, -1f)
                lineTo(2.71f, 17.0f)
                curveToRelative(-0.62f, 0f, -1.17f, -0.32f, -1.48f, -0.85f)
                curveToRelative(-0.31f, -0.54f, -0.31f, -1.17f, 0.01f, -1.71f)
                lineTo(8.54f, 1.85f)
                curveToRelative(0.31f, -0.52f, 0.85f, -0.84f, 1.45f, -0.85f)
                curveToRelative(0.61f, 0.01f, 1.15f, 0.32f, 1.46f, 0.85f)
                lineToRelative(4.74f, 8.17f)
                curveToRelative(0.1f, -0.01f, 0.2f, -0.01f, 0.3f, -0.01f)
                close()
            }
        }.also { _ProblemSolving = it}
