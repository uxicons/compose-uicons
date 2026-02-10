package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PrescriptionBottleAlt: ImageVector? = null

val Icons.Ss.PrescriptionBottleAlt: ImageVector
    get() = _PrescriptionBottleAlt ?: UXIcon(name = "PrescriptionBottleAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 21f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(12f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                lineTo(21f, 7f)
                lineTo(3f, 7f)
                verticalLineToRelative(14f)
                close()
                moveTo(8f, 14f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                close()
                moveTo(23f, 3f)
                verticalLineToRelative(2f)
                lineTo(1f, 5f)
                verticalLineToRelative(-2f)
                curveTo(1f, 1.35f, 2.35f, 0f, 4f, 0f)
                horizontalLineToRelative(16f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
            }
        }.also { _PrescriptionBottleAlt = it}
