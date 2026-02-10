package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MarriageProposal: ImageVector? = null

val Icons.Br.MarriageProposal: ImageVector
    get() = _MarriageProposal ?: UXIcon(name = "MarriageProposal") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.5f, 6.5f)
            moveToRelative(-2.5f, 0f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, 0f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5f, 0f)
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.5f, 21f)
            horizontalLineToRelative(-1.5f)
            verticalLineTo(13f)
            curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
            horizontalLineToRelative(-5.58f)
            reflectiveCurveToRelative(-5.63f, -3.44f, -5.86f, -3.49f)
            curveToRelative(-0.64f, -0.3f, -1.34f, -0.51f, -2.1f, -0.51f)
            curveToRelative(-1.79f, 0f, -3.28f, 1.34f, -3.47f, 3.04f)
            lineTo(0.02f, 14.95f)
            curveToRelative(-0.21f, 1.58f, 1.14f, 3.09f, 2.73f, 3.05f)
            horizontalLineToRelative(0.25f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-4.5f)
            horizontalLineToRelative(0.25f)
            curveToRelative(1.57f, 0.03f, 2.92f, -1.44f, 2.74f, -3.01f)
            curveToRelative(-0.0f, -0.04f, -0.72f, -3.99f, -0.72f, -3.99f)
            lineToRelative(2.96f, 1.78f)
            curveToRelative(0.23f, 0.14f, 0.5f, 0.21f, 0.77f, 0.21f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(-2f)
            curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-2.5f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(3.05f, 15f)
            lineToRelative(0.91f, -5.55f)
            curveToRelative(0.03f, -0.25f, 0.24f, -0.45f, 0.5f, -0.45f)
            curveToRelative(0.13f, 0f, 0.27f, 0.02f, 0.41f, 0.06f)
            lineToRelative(1.08f, 5.94f)
            horizontalLineTo(3.05f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 2.5f)
            moveToRelative(-2.5f, 0f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, 0f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5f, 0f)
        }
    }.also { _MarriageProposal = it }
