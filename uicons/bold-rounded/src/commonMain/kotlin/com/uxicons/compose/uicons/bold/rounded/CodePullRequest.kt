package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CodePullRequest: ImageVector? = null

val Icons.Br.CodePullRequest: ImageVector
    get() = _CodePullRequest ?: UXIcon(name = "CodePullRequest") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 7.66f)
            verticalLineToRelative(9.67f)
            curveToRelative(1.18f, 0.56f, 2f, 1.77f, 2f, 3.16f)
            curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
            reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
            curveToRelative(0f, -1.4f, 0.82f, -2.6f, 2f, -3.16f)
            lineTo(2f, 7.66f)
            curveToRelative(-1.18f, -0.56f, -2f, -1.77f, -2f, -3.16f)
            curveTo(0f, 2.57f, 1.57f, 1f, 3.5f, 1f)
            reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
            curveToRelative(0f, 1.4f, -0.82f, 2.6f, -2f, 3.16f)
            close()
            moveTo(22f, 17.34f)
            lineTo(22f, 8.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            horizontalLineToRelative(-1.5f)
            lineTo(15f, 0.81f)
            curveToRelative(0f, -0.72f, -0.86f, -1.08f, -1.37f, -0.57f)
            lineToRelative(-3.13f, 3.09f)
            curveToRelative(-0.25f, 0.25f, -0.49f, 0.68f, -0.49f, 1.18f)
            reflectiveCurveToRelative(0.24f, 0.93f, 0.49f, 1.18f)
            lineToRelative(3.13f, 3.09f)
            curveToRelative(0.51f, 0.5f, 1.37f, 0.14f, 1.37f, -0.57f)
            verticalLineToRelative(-2.19f)
            horizontalLineToRelative(1.5f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(8.84f)
            curveToRelative(-1.18f, 0.56f, -2f, 1.77f, -2f, 3.16f)
            curveToRelative(0f, 1.93f, 1.53f, 3.5f, 3.46f, 3.5f)
            reflectiveCurveToRelative(3.54f, -1.57f, 3.54f, -3.5f)
            curveToRelative(0f, -1.4f, -0.82f, -2.6f, -2f, -3.16f)
            close()
        }
    }.also { _CodePullRequest = it }
