package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cabin: ImageVector? = null

val Icons.Sr.Cabin: ImageVector
    get() = _Cabin ?: UXIcon(name = "Cabin") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 13f)
                horizontalLineToRelative(7f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5.58f)
                curveToRelative(-0.77f, 1.76f, -2.53f, 3f, -4.58f, 3f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                lineTo(16f, 13f)
                close()
                moveTo(0f, 15f)
                lineTo(6f, 15f)
                verticalLineToRelative(2f)
                lineTo(0f, 17f)
                verticalLineToRelative(2f)
                lineTo(6f, 19f)
                verticalLineToRelative(2f)
                lineTo(0.42f, 21f)
                curveToRelative(0.77f, 1.76f, 2.53f, 3f, 4.58f, 3f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                lineTo(8f, 13f)
                lineTo(0f, 13f)
                verticalLineToRelative(2f)
                close()
                moveTo(24f, 9.72f)
                verticalLineToRelative(0.28f)
                reflectiveCurveToRelative(0f, 1f, -1f, 1f)
                lineTo(1f, 11f)
                curveToRelative(-1f, 0f, -1f, -1f, -1f, -1f)
                verticalLineToRelative(-0.28f)
                curveToRelative(0f, -1.66f, 0.83f, -3.22f, 2.2f, -4.14f)
                lineTo(9.2f, 0.85f)
                curveToRelative(1.69f, -1.14f, 3.9f, -1.14f, 5.59f, 0f)
                lineToRelative(5.2f, 3.51f)
                lineTo(20f, 2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3.72f)
                curveToRelative(1.26f, 0.94f, 2f, 2.42f, 2f, 4f)
                close()
                moveTo(13.5f, 6.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }.also { _Cabin = it}
