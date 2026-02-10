package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmileyCommentAlt: ImageVector? = null

val Icons.Ts.SmileyCommentAlt: ImageVector
    get() = _SmileyCommentAlt ?: UXIcon(name = "SmileyCommentAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                lineTo(0f, 20f)
                lineTo(7.11f, 20f)
                lineToRelative(3.9f, 3.28f)
                curveToRelative(0.29f, 0.25f, 0.64f, 0.38f, 1f, 0.38f)
                reflectiveCurveToRelative(0.7f, -0.12f, 0.98f, -0.37f)
                lineToRelative(3.99f, -3.3f)
                horizontalLineToRelative(7.03f)
                lineTo(24.01f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 19f)
                horizontalLineToRelative(-6.39f)
                lineToRelative(-4.28f, 3.54f)
                curveToRelative(-0.19f, 0.17f, -0.47f, 0.17f, -0.67f, 0f)
                lineToRelative(-4.19f, -3.53f)
                lineTo(1f, 19.01f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(21.5f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                lineTo(23f, 19f)
                close()
                moveTo(17.33f, 12.87f)
                lineToRelative(-0.67f, -0.75f)
                reflectiveCurveToRelative(-2.14f, 1.87f, -4.67f, 1.87f)
                reflectiveCurveToRelative(-4.65f, -1.85f, -4.67f, -1.87f)
                lineToRelative(-0.67f, 0.75f)
                curveToRelative(0.1f, 0.09f, 2.41f, 2.13f, 5.33f, 2.13f)
                reflectiveCurveToRelative(5.24f, -2.04f, 5.33f, -2.13f)
                close()
                moveTo(8.75f, 6f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(15.25f, 6f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _SmileyCommentAlt = it}
