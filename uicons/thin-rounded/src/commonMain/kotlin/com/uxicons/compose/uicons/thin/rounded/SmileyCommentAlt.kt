package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmileyCommentAlt: ImageVector? = null

val Icons.Tr.SmileyCommentAlt: ImageVector
    get() = _SmileyCommentAlt ?: UXIcon(name = "SmileyCommentAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 23.66f)
                curveToRelative(-0.36f, 0f, -0.72f, -0.13f, -1f, -0.38f)
                lineToRelative(-3.9f, -3.28f)
                lineTo(3.5f, 20f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(0f, 3.5f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                lineTo(20.5f, 0f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-3.53f)
                lineToRelative(-3.99f, 3.29f)
                curveToRelative(-0.28f, 0.25f, -0.63f, 0.37f, -0.98f, 0.37f)
                close()
                moveTo(3.5f, 1f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(3.79f)
                curveToRelative(0.12f, 0f, 0.23f, 0.04f, 0.32f, 0.12f)
                lineToRelative(4.05f, 3.41f)
                curveToRelative(0.2f, 0.18f, 0.48f, 0.18f, 0.67f, 0f)
                lineToRelative(4.14f, -3.42f)
                curveToRelative(0.09f, -0.07f, 0.2f, -0.11f, 0.32f, -0.11f)
                horizontalLineToRelative(3.71f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                lineTo(23f, 3.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(3.5f, 1f)
                close()
                moveTo(17.82f, 12.89f)
                curveToRelative(0.21f, -0.17f, 0.25f, -0.49f, 0.07f, -0.7f)
                curveToRelative(-0.17f, -0.21f, -0.49f, -0.25f, -0.7f, -0.07f)
                curveToRelative(-0.02f, 0.02f, -2.37f, 1.89f, -5.19f, 1.89f)
                reflectiveCurveToRelative(-5.16f, -1.87f, -5.19f, -1.89f)
                curveToRelative(-0.21f, -0.17f, -0.53f, -0.14f, -0.7f, 0.07f)
                curveToRelative(-0.17f, 0.21f, -0.14f, 0.53f, 0.07f, 0.7f)
                curveToRelative(0.11f, 0.09f, 2.64f, 2.11f, 5.82f, 2.11f)
                reflectiveCurveToRelative(5.71f, -2.03f, 5.82f, -2.11f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.75f, 7f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.25f, 7f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
            }
        }.also { _SmileyCommentAlt = it}
