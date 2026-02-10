package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BubbleDiscussion: ImageVector? = null

val Icons.Ss.BubbleDiscussion: ImageVector
    get() = _BubbleDiscussion ?: UXIcon(name = "BubbleDiscussion") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 0f)
                curveTo(4.04f, 0f, 0f, 4.04f, 0f, 9f)
                verticalLineToRelative(9f)
                lineTo(9f, 18f)
                curveToRelative(4.96f, 0f, 9f, -4.04f, 9f, -9f)
                reflectiveCurveTo(13.96f, 0f, 9f, 0f)
                close()
                moveTo(4.5f, 10.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(9f, 10.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(13.5f, 10.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(24f, 16f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-8f)
                curveToRelative(-2.96f, 0f, -5.54f, -1.61f, -6.92f, -4.0f)
                horizontalLineToRelative(0f)
                curveToRelative(6.0f, -0.04f, 10.87f, -4.92f, 10.92f, -10.92f)
                horizontalLineToRelative(0f)
                curveToRelative(2.39f, 1.39f, 4.0f, 3.96f, 4.0f, 6.92f)
                close()
            }
        }.also { _BubbleDiscussion = it}
