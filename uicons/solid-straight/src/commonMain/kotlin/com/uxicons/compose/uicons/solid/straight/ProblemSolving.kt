package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ProblemSolving: ImageVector? = null

val Icons.Ss.ProblemSolving: ImageVector
    get() = _ProblemSolving ?: UXIcon(name = "ProblemSolving") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.96f, 22.55f)
                lineToRelative(-2.79f, -2.79f)
                curveToRelative(0.52f, -0.79f, 0.83f, -1.74f, 0.83f, -2.75f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                curveToRelative(1.02f, 0f, 1.96f, -0.31f, 2.75f, -0.83f)
                lineToRelative(2.79f, 2.79f)
                lineToRelative(1.41f, -1.41f)
                close()
                moveTo(10f, 17f)
                curveToRelative(0f, -1.07f, 0.25f, -2.09f, 0.68f, -3f)
                horizontalLineToRelative(-1.68f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1.41f)
                curveToRelative(1.22f, -2.04f, 3.45f, -3.41f, 6f, -3.41f)
                curveToRelative(0.18f, 0f, 0.36f, 0.01f, 0.54f, 0.03f)
                lineTo(12.62f, 1.53f)
                curveTo(12.06f, 0.57f, 11.07f, 0f, 9.96f, 0f)
                curveToRelative(-1.11f, 0f, -2.1f, 0.57f, -2.66f, 1.53f)
                lineTo(0.42f, 13.38f)
                curveToRelative(-0.56f, 0.96f, -0.56f, 2.11f, -0.01f, 3.08f)
                curveToRelative(0.56f, 0.96f, 1.55f, 1.54f, 2.66f, 1.54f)
                horizontalLineToRelative(7.0f)
                curveToRelative(-0.05f, -0.33f, -0.08f, -0.66f, -0.08f, -1f)
                close()
                moveTo(9f, 5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5f)
                close()
            }
        }.also { _ProblemSolving = it}
