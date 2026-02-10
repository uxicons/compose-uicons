package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Procedures: ImageVector? = null

val Icons.Ss.Procedures: ImageVector
    get() = _Procedures ?: UXIcon(name = "Procedures") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4.03f)
                lineToRelative(-3.26f, 3.91f)
                lineToRelative(-2.42f, -5.8f)
                lineToRelative(-1.26f, 1.89f)
                horizontalLineToRelative(-7.04f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5.96f)
                lineTo(14.7f, -0.11f)
                lineToRelative(2.58f, 6.2f)
                lineToRelative(1.74f, -2.09f)
                horizontalLineToRelative(4.97f)
                close()
                moveTo(5.5f, 14f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(2f, 4f)
                lineTo(0f, 4f)
                verticalLineToRelative(20f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-8f)
                lineTo(2f, 16f)
                lineTo(2f, 4f)
                close()
                moveTo(21f, 8f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(-3.33f, 4f)
                horizontalLineToRelative(-2.15f)
                lineToRelative(-1.67f, -4f)
                horizontalLineToRelative(-1.75f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                close()
            }
        }.also { _Procedures = it}
