package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmileyCommentAlt: ImageVector? = null

val Icons.Sr.SmileyCommentAlt: ImageVector
    get() = _SmileyCommentAlt ?: UXIcon(name = "SmileyCommentAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 0f)
                lineTo(4f, 0f)
                curveTo(1.79f, 0f, 0f, 1.79f, 0f, 4f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(2.92f)
                lineToRelative(3.75f, 3.16f)
                curveToRelative(0.38f, 0.34f, 0.86f, 0.51f, 1.34f, 0.51f)
                reflectiveCurveToRelative(0.93f, -0.16f, 1.29f, -0.49f)
                lineToRelative(3.85f, -3.18f)
                horizontalLineToRelative(2.85f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                lineTo(24f, 4f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
                moveTo(15.5f, 6f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(8.5f, 6f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(17.67f, 12.75f)
                curveToRelative(-0.1f, 0.09f, -2.56f, 2.25f, -5.67f, 2.25f)
                reflectiveCurveToRelative(-5.56f, -2.16f, -5.67f, -2.25f)
                curveToRelative(-0.41f, -0.37f, -0.45f, -1f, -0.08f, -1.41f)
                curveToRelative(0.37f, -0.41f, 1f, -0.45f, 1.41f, -0.08f)
                curveToRelative(0.02f, 0.02f, 2f, 1.75f, 4.33f, 1.75f)
                reflectiveCurveToRelative(4.32f, -1.73f, 4.34f, -1.75f)
                curveToRelative(0.41f, -0.37f, 1.05f, -0.33f, 1.41f, 0.08f)
                curveToRelative(0.37f, 0.41f, 0.33f, 1.04f, -0.08f, 1.41f)
                close()
            }
        }.also { _SmileyCommentAlt = it}
