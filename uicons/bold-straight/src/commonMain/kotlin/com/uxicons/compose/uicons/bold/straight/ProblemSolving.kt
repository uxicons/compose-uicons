package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ProblemSolving: ImageVector? = null

val Icons.Bs.ProblemSolving: ImageVector
    get() = _ProblemSolving ?: UXIcon(name = "ProblemSolving") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.95f, 21.79f)
                lineToRelative(-2.49f, -2.49f)
                curveToRelative(0.36f, -0.69f, 0.58f, -1.46f, 0.58f, -2.29f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                curveToRelative(0.83f, 0f, 1.6f, -0.22f, 2.29f, -0.58f)
                lineToRelative(2.49f, 2.49f)
                lineToRelative(2.12f, -2.12f)
                close()
                moveTo(17.04f, 19f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveTo(9f, 12f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(9.04f, 6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5f)
                close()
                moveTo(10.34f, 15f)
                curveToRelative(-0.19f, 0.63f, -0.29f, 1.3f, -0.29f, 2f)
                curveToRelative(0f, 0.34f, 0.03f, 0.67f, 0.08f, 1f)
                lineTo(3.12f, 18f)
                curveToRelative(-1.11f, 0f, -2.11f, -0.58f, -2.66f, -1.54f)
                reflectiveCurveToRelative(-0.55f, -2.12f, 0.01f, -3.08f)
                lineTo(7.34f, 1.53f)
                curveTo(7.9f, 0.57f, 8.89f, 0f, 10f, 0f)
                horizontalLineToRelative(0f)
                curveToRelative(1.11f, 0f, 2.1f, 0.57f, 2.66f, 1.53f)
                lineToRelative(4.93f, 8.5f)
                curveToRelative(-0.18f, -0.01f, -0.36f, -0.03f, -0.55f, -0.03f)
                curveToRelative(-0.93f, 0f, -1.82f, 0.19f, -2.63f, 0.52f)
                lineToRelative(-4.34f, -7.48f)
                horizontalLineToRelative(-0.13f)
                lineTo(3.05f, 14.89f)
                lineToRelative(0.06f, 0.11f)
                horizontalLineToRelative(7.22f)
                close()
            }
        }.also { _ProblemSolving = it}
