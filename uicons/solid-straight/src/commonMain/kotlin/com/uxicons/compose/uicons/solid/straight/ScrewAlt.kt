package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ScrewAlt: ImageVector? = null

val Icons.Ss.ScrewAlt: ImageVector
    get() = _ScrewAlt ?: UXIcon(name = "ScrewAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 13.67f)
                lineToRelative(6f, -5.51f)
                verticalLineToRelative(2.4f)
                lineToRelative(-6f, 5.51f)
                verticalLineToRelative(-2.4f)
                close()
                moveTo(3f, 20.97f)
                lineToRelative(0.09f, 0.09f)
                lineToRelative(5.91f, -5.43f)
                verticalLineToRelative(-2.35f)
                lineToRelative(-6f, 5.51f)
                verticalLineToRelative(2.19f)
                close()
                moveTo(6.22f, 8f)
                horizontalLineToRelative(-3.22f)
                verticalLineToRelative(2.95f)
                lineToRelative(3.22f, -2.95f)
                close()
                moveTo(4.4f, 22.37f)
                lineToRelative(1.6f, 1.6f)
                lineToRelative(3f, -3f)
                verticalLineToRelative(-2.83f)
                lineToRelative(-4.6f, 4.23f)
                close()
                moveTo(12f, 3f)
                lineTo(12f, 0f)
                lineTo(0f, 0f)
                verticalLineToRelative(3f)
                lineToRelative(3f, 3f)
                horizontalLineToRelative(6f)
                lineToRelative(3f, -3f)
                close()
                moveTo(23.77f, 19f)
                lineToRelative(-2.89f, 5f)
                horizontalLineToRelative(-5.77f)
                lineToRelative(-2.89f, -5f)
                lineToRelative(2.89f, -5f)
                horizontalLineToRelative(5.77f)
                lineToRelative(2.89f, 5f)
                close()
                moveTo(20f, 19f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                close()
            }
        }.also { _ScrewAlt = it}
