package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlugCircleCheck: ImageVector? = null

val Icons.Rs.PlugCircleCheck: ImageVector
    get() = _PlugCircleCheck ?: UXIcon(name = "PlugCircleCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 16f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-6f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                verticalLineToRelative(-4f)
                lineTo(0f, 8f)
                verticalLineToRelative(-2f)
                lineTo(4f, 6f)
                lineTo(4f, 0f)
                horizontalLineToRelative(2f)
                lineTo(6f, 6f)
                horizontalLineToRelative(5f)
                lineTo(11f, 0f)
                horizontalLineToRelative(2f)
                lineTo(13f, 6f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                lineTo(3f, 8f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                close()
                moveTo(24f, 17f)
                curveToRelative(0f, 3.86f, -3.14f, 7f, -7f, 7f)
                reflectiveCurveToRelative(-7f, -3.14f, -7f, -7f)
                reflectiveCurveToRelative(3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                close()
                moveTo(22f, 17f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                close()
                moveTo(19.59f, 14.69f)
                lineToRelative(-3.23f, 3.17f)
                lineToRelative(-1.63f, -1.58f)
                lineToRelative(-1.39f, 1.44f)
                lineToRelative(1.85f, 1.79f)
                curveToRelative(0.32f, 0.32f, 0.73f, 0.49f, 1.18f, 0.49f)
                reflectiveCurveToRelative(0.86f, -0.17f, 1.17f, -0.48f)
                lineToRelative(3.46f, -3.4f)
                lineToRelative(-1.4f, -1.43f)
                close()
            }
        }.also { _PlugCircleCheck = it}
