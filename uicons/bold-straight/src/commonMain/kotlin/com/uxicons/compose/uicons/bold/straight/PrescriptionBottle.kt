package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PrescriptionBottle: ImageVector? = null

val Icons.Bs.PrescriptionBottle: ImageVector
    get() = _PrescriptionBottle ?: UXIcon(name = "PrescriptionBottle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 3f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                lineTo(4f, 0f)
                curveTo(2.34f, 0f, 1f, 1.34f, 1f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(15.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(11f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                lineTo(21f, 5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(18f, 20.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(6.5f, 21f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.5f, -0.5f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(15.5f)
                close()
            }
        }.also { _PrescriptionBottle = it}
