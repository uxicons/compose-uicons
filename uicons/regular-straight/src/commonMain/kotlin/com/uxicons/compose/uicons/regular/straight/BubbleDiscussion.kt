package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BubbleDiscussion: ImageVector? = null

val Icons.Rs.BubbleDiscussion: ImageVector
    get() = _BubbleDiscussion ?: UXIcon(name = "BubbleDiscussion") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 16f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-8f)
                curveToRelative(-2.96f, 0f, -5.54f, -1.61f, -6.92f, -4.0f)
                curveToRelative(0.77f, -0.01f, 1.52f, -0.09f, 2.24f, -0.25f)
                curveToRelative(1.1f, 1.37f, 2.79f, 2.25f, 4.68f, 2.25f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.89f, -0.88f, -3.58f, -2.25f, -4.68f)
                curveToRelative(0.16f, -0.72f, 0.24f, -1.47f, 0.25f, -2.24f)
                curveToRelative(2.39f, 1.39f, 4.0f, 3.96f, 4.0f, 6.92f)
                close()
                moveTo(9f, 18f)
                lineTo(0f, 18f)
                lineTo(0f, 9f)
                curveTo(0f, 4.04f, 4.04f, 0f, 9f, 0f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                reflectiveCurveToRelative(-4.04f, 9f, -9f, 9f)
                close()
                moveTo(16f, 9f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                reflectiveCurveTo(2f, 5.14f, 2f, 9f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7f)
                curveToRelative(3.86f, 0f, 7f, -3.14f, 7f, -7f)
                close()
                moveTo(9f, 7.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(5f, 7.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(13f, 7.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _BubbleDiscussion = it}
