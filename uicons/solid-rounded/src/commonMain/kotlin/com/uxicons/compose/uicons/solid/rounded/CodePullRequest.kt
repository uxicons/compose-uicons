package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CodePullRequest: ImageVector? = null

val Icons.Sr.CodePullRequest: ImageVector
    get() = _CodePullRequest ?: UXIcon(name = "CodePullRequest") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 5f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveTo(0f, 2.79f, 0f, 5f)
                curveToRelative(0f, 1.86f, 1.28f, 3.43f, 3f, 3.87f)
                verticalLineToRelative(7.25f)
                curveToRelative(-1.72f, 0.45f, -3f, 2.01f, -3f, 3.87f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                curveToRelative(0f, -1.86f, -1.28f, -3.43f, -3f, -3.87f)
                verticalLineToRelative(-7.25f)
                curveToRelative(1.72f, -0.45f, 3f, -2.01f, 3f, -3.87f)
                close()
                moveTo(21f, 16.13f)
                verticalLineToRelative(-7.13f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                horizontalLineToRelative(-3.47f)
                lineToRelative(2.2f, -2.31f)
                curveToRelative(0.38f, -0.4f, 0.36f, -1.03f, -0.04f, -1.41f)
                curveToRelative(-0.4f, -0.38f, -1.03f, -0.36f, -1.41f, 0.04f)
                lineToRelative(-2.4f, 2.52f)
                curveToRelative(-1.17f, 1.17f, -1.17f, 3.07f, -0.03f, 4.21f)
                lineToRelative(2.42f, 2.63f)
                curveToRelative(0.2f, 0.21f, 0.47f, 0.32f, 0.74f, 0.32f)
                curveToRelative(0.24f, 0f, 0.48f, -0.09f, 0.68f, -0.26f)
                curveToRelative(0.41f, -0.37f, 0.43f, -1.01f, 0.06f, -1.41f)
                lineToRelative(-2.13f, -2.32f)
                horizontalLineToRelative(3.4f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(7.13f)
                curveToRelative(-1.72f, 0.45f, -3f, 2.01f, -3f, 3.87f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                curveToRelative(0f, -1.86f, -1.28f, -3.43f, -3f, -3.87f)
                close()
            }
        }.also { _CodePullRequest = it}
