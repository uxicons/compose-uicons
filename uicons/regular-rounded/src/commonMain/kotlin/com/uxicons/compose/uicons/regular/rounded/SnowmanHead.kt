package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SnowmanHead: ImageVector? = null

val Icons.Rr.SnowmanHead: ImageVector
    get() = _SnowmanHead ?: UXIcon(name = "SnowmanHead") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 9f)
                horizontalLineToRelative(-2f)
                lineTo(19f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                horizontalLineToRelative(-4f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(4f)
                lineTo(3f, 9f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(0.95f)
                curveToRelative(-0.61f, 1.24f, -0.95f, 2.61f, -0.95f, 4f)
                curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                curveToRelative(0f, -1.39f, -0.33f, -2.76f, -0.95f, -4f)
                horizontalLineToRelative(0.95f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(7f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(4f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(4f)
                lineTo(7f, 9f)
                lineTo(7f, 5f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-3.86f, 0f, -7f, -3.14f, -7f, -7f)
                curveToRelative(0f, -1.46f, 0.46f, -2.82f, 1.28f, -4f)
                horizontalLineToRelative(11.43f)
                curveToRelative(0.83f, 1.18f, 1.28f, 2.54f, 1.28f, 4f)
                curveToRelative(0f, 3.86f, -3.14f, 7f, -7f, 7f)
                close()
                moveTo(10f, 14.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(17f, 14.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(13.5f, 17.5f)
                curveToRelative(0f, 0.4f, -0.35f, 1.69f, -0.71f, 2.91f)
                curveToRelative(-0.23f, 0.79f, -1.35f, 0.79f, -1.58f, 0f)
                curveToRelative(-0.36f, -1.23f, -0.71f, -2.52f, -0.71f, -2.91f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _SnowmanHead = it}
