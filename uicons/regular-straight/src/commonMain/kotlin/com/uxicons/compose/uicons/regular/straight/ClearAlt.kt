package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClearAlt: ImageVector? = null

val Icons.Rs.ClearAlt: ImageVector
    get() = _ClearAlt ?: UXIcon(name = "ClearAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 0f)
                curveToRelative(-3.86f, 0f, -7f, 3.14f, -7f, 7f)
                reflectiveCurveToRelative(3.14f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -3.14f, 7f, -7f)
                reflectiveCurveTo(20.86f, 0f, 17f, 0f)
                close()
                moveTo(17f, 12f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
                moveTo(19.96f, 5.46f)
                lineToRelative(-1.54f, 1.54f)
                lineToRelative(1.54f, 1.54f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-1.54f, -1.54f)
                lineToRelative(-1.54f, 1.54f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(1.54f, -1.54f)
                lineToRelative(-1.54f, -1.54f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(1.54f, 1.54f)
                lineToRelative(1.54f, -1.54f)
                lineToRelative(1.41f, 1.41f)
                close()
                moveTo(12f, 14.48f)
                curveToRelative(0.62f, 0.41f, 1.29f, 0.74f, 2f, 0.99f)
                verticalLineToRelative(8.52f)
                lineToRelative(-6f, -4.5f)
                verticalLineToRelative(-5.12f)
                lineTo(0f, 5.38f)
                verticalLineToRelative(-2.38f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                horizontalLineToRelative(8.35f)
                curveToRelative(-0.71f, 0.57f, -1.32f, 1.24f, -1.83f, 2f)
                lineTo(3f, 2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1.62f)
                lineToRelative(8f, 9f)
                verticalLineToRelative(4.88f)
                lineToRelative(2f, 1.5f)
                verticalLineToRelative(-5.52f)
                close()
            }
        }.also { _ClearAlt = it}
