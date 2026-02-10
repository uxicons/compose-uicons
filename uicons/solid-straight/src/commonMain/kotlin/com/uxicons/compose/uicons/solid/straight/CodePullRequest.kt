package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CodePullRequest: ImageVector? = null

val Icons.Ss.CodePullRequest: ImageVector
    get() = _CodePullRequest ?: UXIcon(name = "CodePullRequest") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 5f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveTo(0f, 2.79f, 0f, 5f)
                curveToRelative(0f, 1.86f, 1.28f, 3.41f, 3f, 3.86f)
                verticalLineToRelative(7.28f)
                curveToRelative(-1.72f, 0.45f, -3f, 2f, -3f, 3.86f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                curveToRelative(0f, -1.86f, -1.28f, -3.41f, -3f, -3.86f)
                verticalLineToRelative(-7.28f)
                curveToRelative(1.72f, -0.45f, 3f, -2f, 3f, -3.86f)
                close()
                moveTo(21f, 16.14f)
                lineTo(21f, 7f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-5.09f)
                lineToRelative(2.29f, -2.29f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-3.26f, 3.26f)
                curveToRelative(-0.77f, 0.78f, -0.78f, 2.04f, 0f, 2.81f)
                lineToRelative(3.26f, 3.26f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-2.21f, -2.2f)
                horizontalLineToRelative(5.01f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(9.14f)
                curveToRelative(-1.72f, 0.45f, -3f, 2f, -3f, 3.86f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                curveToRelative(0f, -1.86f, -1.28f, -3.41f, -3f, -3.86f)
                close()
            }
        }.also { _CodePullRequest = it}
