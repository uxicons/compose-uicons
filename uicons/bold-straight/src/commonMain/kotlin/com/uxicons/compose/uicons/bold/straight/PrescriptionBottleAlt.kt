package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PrescriptionBottleAlt: ImageVector? = null

val Icons.Bs.PrescriptionBottleAlt: ImageVector
    get() = _PrescriptionBottleAlt ?: UXIcon(name = "PrescriptionBottleAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.5f, 14.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2.5f)
                close()
                moveTo(23f, 5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(15.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(6.5f, 24f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(3f, 5f)
                lineTo(1f, 5f)
                verticalLineToRelative(-2f)
                curveTo(1f, 1.34f, 2.34f, 0f, 4f, 0f)
                horizontalLineToRelative(16f)
                curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                verticalLineToRelative(2f)
                close()
                moveTo(18f, 5f)
                lineTo(6f, 5f)
                verticalLineToRelative(15.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(11f)
                curveToRelative(0.28f, 0f, 0.5f, -0.23f, 0.5f, -0.5f)
                lineTo(18f, 5f)
                close()
            }
        }.also { _PrescriptionBottleAlt = it}
