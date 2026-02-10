package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Trademark: ImageVector? = null

val Icons.Rs.Trademark: ImageVector
    get() = _Trademark ?: UXIcon(name = "Trademark") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 5f)
                lineTo(10f, 5f)
                verticalLineToRelative(2f)
                lineTo(6f, 7f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-2f)
                lineTo(4f, 7f)
                lineTo(0f, 7f)
                verticalLineToRelative(-2f)
                close()
                moveTo(22.79f, 5.07f)
                curveToRelative(-0.73f, -0.22f, -1.5f, 0.08f, -1.95f, 0.76f)
                lineToRelative(-3.33f, 5.45f)
                lineToRelative(-3.35f, -5.48f)
                curveToRelative(-0.43f, -0.66f, -1.21f, -0.95f, -1.94f, -0.74f)
                curveToRelative(-0.74f, 0.22f, -1.21f, 0.9f, -1.21f, 1.72f)
                verticalLineToRelative(12.21f)
                horizontalLineToRelative(2f)
                lineTo(13.01f, 7.76f)
                reflectiveCurveToRelative(4.5f, 7.36f, 4.5f, 7.36f)
                lineToRelative(4.5f, -7.37f)
                verticalLineToRelative(11.24f)
                horizontalLineToRelative(2f)
                lineTo(24.01f, 6.79f)
                curveToRelative(0f, -0.83f, -0.48f, -1.5f, -1.21f, -1.72f)
                close()
            }
        }.also { _Trademark = it}
