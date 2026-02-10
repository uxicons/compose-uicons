package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowProgressAlt: ImageVector? = null

val Icons.Bs.ArrowProgressAlt: ImageVector
    get() = _ArrowProgressAlt ?: UXIcon(name = "ArrowProgressAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 17f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(5f)
                lineTo(0f, 22f)
                verticalLineToRelative(-5f)
                close()
                moveTo(13f, 14.95f)
                verticalLineToRelative(3.07f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2.93f)
                lineToRelative(4.11f, -3.76f)
                curveToRelative(0.44f, -0.39f, 0.44f, -1.08f, 0f, -1.48f)
                lineToRelative(-4.11f, -3.76f)
                close()
                moveTo(19f, 17f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-5f)
                close()
                moveTo(20f, 15f)
                horizontalLineToRelative(3f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                lineTo(5f, 10f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(3f)
                lineToRelative(4.11f, -3.76f)
                curveToRelative(0.44f, -0.39f, 0.44f, -1.08f, 0f, -1.48f)
                lineToRelative(-4.11f, -3.76f)
                verticalLineToRelative(3f)
                lineTo(5f, 3.0f)
                curveTo(2.24f, 3f, 0f, 5.24f, 0f, 8f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(13f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
            }
        }.also { _ArrowProgressAlt = it}
