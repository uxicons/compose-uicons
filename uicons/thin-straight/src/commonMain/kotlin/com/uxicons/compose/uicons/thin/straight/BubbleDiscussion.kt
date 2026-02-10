package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BubbleDiscussion: ImageVector? = null

val Icons.Ts.BubbleDiscussion: ImageVector
    get() = _BubbleDiscussion ?: UXIcon(name = "BubbleDiscussion") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 16f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-8f)
                curveToRelative(-2.96f, 0f, -5.54f, -1.61f, -6.92f, -4.0f)
                curveToRelative(0.38f, -0.0f, 0.76f, -0.03f, 1.13f, -0.07f)
                curveToRelative(1.26f, 1.85f, 3.38f, 3.07f, 5.79f, 3.07f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -2.4f, -1.22f, -4.53f, -3.07f, -5.79f)
                curveToRelative(0.04f, -0.37f, 0.06f, -0.75f, 0.07f, -1.13f)
                curveToRelative(2.39f, 1.39f, 4.0f, 3.96f, 4.0f, 6.92f)
                close()
                moveTo(9f, 18f)
                lineTo(0f, 18f)
                lineTo(0f, 9f)
                curveTo(0f, 4.04f, 4.04f, 0f, 9f, 0f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                reflectiveCurveToRelative(-4.04f, 9f, -9f, 9f)
                close()
                moveTo(17f, 9f)
                curveToRelative(0f, -4.41f, -3.59f, -8f, -8f, -8f)
                reflectiveCurveTo(1f, 4.59f, 1f, 9f)
                verticalLineToRelative(8f)
                lineTo(9f, 17f)
                curveToRelative(4.41f, 0f, 8f, -3.59f, 8f, -8f)
                close()
                moveTo(9f, 8f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(5f, 8f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(13f, 8f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _BubbleDiscussion = it}
