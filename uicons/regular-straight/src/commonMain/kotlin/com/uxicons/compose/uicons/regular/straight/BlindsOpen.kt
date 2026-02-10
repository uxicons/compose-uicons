package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BlindsOpen: ImageVector? = null

val Icons.Rs.BlindsOpen: ImageVector
    get() = _BlindsOpen ?: UXIcon(name = "BlindsOpen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 7f)
                lineTo(0f, 7f)
                verticalLineToRelative(-2f)
                lineTo(18f, 5f)
                verticalLineToRelative(2f)
                close()
                moveTo(18f, 10f)
                lineTo(0f, 10f)
                verticalLineToRelative(2f)
                lineTo(18f, 12f)
                verticalLineToRelative(-2f)
                close()
                moveTo(18f, 15f)
                lineTo(0f, 15f)
                verticalLineToRelative(2f)
                lineTo(18f, 17f)
                verticalLineToRelative(-2f)
                close()
                moveTo(0f, 22f)
                lineTo(16f, 22f)
                verticalLineToRelative(-2f)
                lineTo(0f, 20f)
                verticalLineToRelative(2f)
                close()
                moveTo(24f, 21f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                curveToRelative(0f, -1.3f, 0.84f, -2.42f, 2f, -2.83f)
                lineTo(20f, 3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(0f, 2f)
                lineTo(0f, 0f)
                lineTo(19f, 0f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(15.17f)
                curveToRelative(1.16f, 0.41f, 2f, 1.52f, 2f, 2.83f)
                close()
                moveTo(22f, 21f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _BlindsOpen = it}
