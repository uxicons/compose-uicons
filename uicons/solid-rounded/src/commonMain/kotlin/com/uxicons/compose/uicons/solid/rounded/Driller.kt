package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Driller: ImageVector? = null

val Icons.Sr.Driller: ImageVector
    get() = _Driller ?: UXIcon(name = "Driller") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 22f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-9f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(9f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(23f, 5f)
                horizontalLineToRelative(-3f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                horizontalLineToRelative(3f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(14.53f, 1.39f)
                lineTo(15f, 1.78f)
                verticalLineToRelative(8.44f)
                lineToRelative(-0.47f, 0.39f)
                curveToRelative(-1.08f, 0.9f, -2.44f, 1.39f, -3.84f, 1.39f)
                horizontalLineToRelative(-0.81f)
                lineToRelative(-0.75f, 6f)
                horizontalLineToRelative(-6.4f)
                lineToRelative(0.67f, -6.08f)
                curveToRelative(-1.92f, -0.29f, -3.4f, -1.94f, -3.4f, -3.94f)
                verticalLineToRelative(-3.98f)
                curveToRelative(0f, -2.21f, 1.79f, -4.0f, 4f, -4.0f)
                horizontalLineToRelative(6.69f)
                curveToRelative(1.4f, 0f, 2.76f, 0.49f, 3.84f, 1.39f)
                close()
                moveTo(11f, 8f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(5f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
                moveTo(11f, 4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(5f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _Driller = it}
