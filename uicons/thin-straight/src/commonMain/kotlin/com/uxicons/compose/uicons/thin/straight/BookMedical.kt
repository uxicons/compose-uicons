package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookMedical: ImageVector? = null

val Icons.Ts.BookMedical: ImageVector
    get() = _BookMedical ?: UXIcon(name = "BookMedical") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 9.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-1f)
                close()
                moveTo(22f, 1.5f)
                verticalLineToRelative(22.5f)
                lineTo(4.5f, 24f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                lineTo(2f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(16f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(20.5f, 1f)
                lineTo(7f, 1f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(14f)
                lineTo(21f, 1.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(3f, 2.5f)
                verticalLineToRelative(17.0f)
                curveToRelative(0.42f, -0.32f, 0.94f, -0.5f, 1.5f, -0.5f)
                horizontalLineToRelative(1.5f)
                lineTo(6f, 1f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(21f, 23f)
                verticalLineToRelative(-3f)
                lineTo(4.5f, 20f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(16.5f)
                close()
            }
        }.also { _BookMedical = it}
