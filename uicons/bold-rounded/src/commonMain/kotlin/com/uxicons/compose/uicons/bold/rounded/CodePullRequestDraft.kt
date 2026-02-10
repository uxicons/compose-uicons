package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CodePullRequestDraft: ImageVector? = null

val Icons.Br.CodePullRequestDraft: ImageVector
    get() = _CodePullRequestDraft ?: UXIcon(name = "CodePullRequestDraft") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 6.66f)
            verticalLineToRelative(10.67f)
            curveToRelative(1.18f, 0.56f, 2f, 1.77f, 2f, 3.16f)
            curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
            reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
            curveToRelative(0f, -1.4f, 0.82f, -2.6f, 2f, -3.16f)
            lineTo(2f, 6.66f)
            curveTo(0.82f, 6.1f, 0f, 4.9f, 0f, 3.5f)
            curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
            reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
            curveToRelative(0f, 1.4f, -0.82f, 2.6f, -2f, 3.16f)
            close()
            moveTo(20.5f, 17f)
            curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
            reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
            reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
            reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
            close()
            moveTo(18f, 4.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
            close()
            moveTo(18f, 11.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
            close()
        }
    }.also { _CodePullRequestDraft = it }
