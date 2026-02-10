package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BubbleDiscussion: ImageVector? = null

val Icons.Bs.BubbleDiscussion: ImageVector
    get() = _BubbleDiscussion ?: UXIcon(name = "BubbleDiscussion") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 9f)
                curveTo(18f, 4.04f, 13.96f, 0f, 9f, 0f)
                reflectiveCurveTo(0f, 4.04f, 0f, 9f)
                verticalLineToRelative(9f)
                lineTo(9f, 18f)
                curveToRelative(4.96f, 0f, 9f, -4.04f, 9f, -9f)
                close()
                moveTo(9f, 15f)
                lineTo(3f, 15f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
                moveTo(24f, 16f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-8f)
                curveToRelative(-2.96f, 0f, -5.54f, -1.61f, -6.92f, -4.0f)
                curveToRelative(1.16f, -0.01f, 2.27f, -0.2f, 3.32f, -0.54f)
                curveToRelative(0.91f, 0.95f, 2.18f, 1.54f, 3.6f, 1.54f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.42f, -0.6f, -2.69f, -1.54f, -3.6f)
                curveToRelative(0.34f, -1.05f, 0.53f, -2.16f, 0.54f, -3.32f)
                curveToRelative(2.39f, 1.39f, 4.0f, 3.96f, 4.0f, 6.92f)
                close()
                moveTo(10.5f, 9f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(6.5f, 9f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(13f, 7.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
            }
        }.also { _BubbleDiscussion = it}
