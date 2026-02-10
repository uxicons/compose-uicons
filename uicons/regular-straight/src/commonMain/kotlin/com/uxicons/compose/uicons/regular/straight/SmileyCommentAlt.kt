package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmileyCommentAlt: ImageVector? = null

val Icons.Rs.SmileyCommentAlt: ImageVector
    get() = _SmileyCommentAlt ?: UXIcon(name = "SmileyCommentAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.01f, 23.67f)
                curveToRelative(-0.48f, 0f, -0.96f, -0.17f, -1.34f, -0.51f)
                lineToRelative(-3.75f, -3.16f)
                lineTo(0f, 20f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                lineTo(21f, 0f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                lineTo(24f, 20f)
                horizontalLineToRelative(-6.85f)
                lineToRelative(-3.85f, 3.18f)
                curveToRelative(-0.36f, 0.32f, -0.83f, 0.49f, -1.29f, 0.49f)
                close()
                moveTo(2f, 18f)
                lineTo(7.65f, 18f)
                lineToRelative(4.33f, 3.64f)
                lineToRelative(4.45f, -3.64f)
                horizontalLineToRelative(5.57f)
                lineTo(22f, 3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(3f, 2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(15f)
                close()
                moveTo(17.67f, 12.75f)
                lineToRelative(-1.33f, -1.49f)
                reflectiveCurveToRelative(-2f, 1.75f, -4.34f, 1.75f)
                reflectiveCurveToRelative(-4.32f, -1.73f, -4.33f, -1.75f)
                lineToRelative(-1.33f, 1.49f)
                curveToRelative(0.1f, 0.09f, 2.56f, 2.25f, 5.67f, 2.25f)
                reflectiveCurveToRelative(5.56f, -2.16f, 5.67f, -2.25f)
                close()
                moveTo(8.5f, 6f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(15.5f, 6f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _SmileyCommentAlt = it}
