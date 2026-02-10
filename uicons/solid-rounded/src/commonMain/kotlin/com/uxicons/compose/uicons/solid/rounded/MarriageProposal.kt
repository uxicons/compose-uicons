package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MarriageProposal: ImageVector? = null

val Icons.Sr.MarriageProposal: ImageVector
    get() = _MarriageProposal ?: UXIcon(name = "MarriageProposal") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.5f, 6.5f)
                moveToRelative(-2.5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 22f)
                horizontalLineToRelative(-2f)
                verticalLineTo(13f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-5.72f)
                lineToRelative(-4.41f, -2.68f)
                curveToRelative(-0.96f, -0.64f, -2.11f, -1.33f, -3.39f, -1.32f)
                curveToRelative(-1.67f, 0.02f, -3.06f, 1.28f, -3.23f, 2.88f)
                lineTo(0.02f, 16.15f)
                curveToRelative(-0.2f, 1.47f, 1.05f, 2.88f, 2.54f, 2.85f)
                horizontalLineToRelative(0.45f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(1.5f)
                curveToRelative(1.51f, 0.02f, 2.75f, -1.38f, 2.53f, -2.91f)
                lineToRelative(-1.12f, -6.41f)
                lineToRelative(3.34f, 2.03f)
                curveToRelative(0.31f, 0.19f, 0.67f, 0.29f, 1.04f, 0.29f)
                horizontalLineToRelative(3.72f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.5f, 2.5f)
                moveToRelative(-2.5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5f, 0f)
            }
        }.also { _MarriageProposal = it}
