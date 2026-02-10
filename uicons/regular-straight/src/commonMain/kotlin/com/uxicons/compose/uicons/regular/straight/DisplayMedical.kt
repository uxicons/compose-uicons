package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DisplayMedical: ImageVector? = null

val Icons.Rs.DisplayMedical: ImageVector
    get() = _DisplayMedical ?: UXIcon(name = "DisplayMedical") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24.02f, 19f)
                lineTo(24.02f, 6f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(3.02f, 3f)
                curveTo(1.37f, 3f, 0.02f, 4.35f, 0.02f, 6f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(11f)
                close()
                moveTo(2.02f, 6f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(18f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(11f)
                lineTo(2.02f, 17f)
                lineTo(2.02f, 6f)
                close()
                moveTo(13.02f, 10f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _DisplayMedical = it}
